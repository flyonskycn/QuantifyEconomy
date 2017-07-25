/**
 * 
 */
package com.flyonsky.quantify.control.admin;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.flyonsky.quantify.entity.AdminLog;
import com.flyonsky.quantify.entity.VAdminUser;
import com.flyonsky.quantify.entity.VAdminUserUrl;
import com.flyonsky.quantify.model.ServiceException;
import com.flyonsky.quantify.model.CTree;
import com.flyonsky.quantify.model.CTree.LoadHandle;
import com.flyonsky.quantify.model.ResponseCode;
import com.flyonsky.quantify.service.AdminService;
import com.flyonsky.quantify.util.MDEncode;

/**
 * 管理框架
 * @author andy
 * @date 2016年5月25日
 */
@Controller
@RequestMapping(AdminController.path)
@SessionAttributes({AdminController.adminKey,AdminController.adminUrlKey})
public class AdminController {
	public final static String path="admin";
	
	public final static String adminKey="adminUser";
	public final static String adminUrlKey="adminUrl";
	
	@Autowired
	private AdminService admin;
	
	private static final String[] HEADERS_TO_TRY = { 
	        "X-Forwarded-For",
	        "Proxy-Client-IP",
	        "WL-Proxy-Client-IP",
	        "HTTP_X_FORWARDED_FOR",
	        "HTTP_X_FORWARDED",
	        "HTTP_X_CLUSTER_CLIENT_IP",
	        "HTTP_CLIENT_IP",
	        "HTTP_FORWARDED_FOR",
	        "HTTP_FORWARDED",
	        "HTTP_VIA",
	        "REMOTE_ADDR",
	        "X-Real-IP"
	 };
	/**
	 * 登录页面
	 * @param model
	 * @return
	 */
	@RequestMapping("login")
	public String login(Model model,HttpSession session,HttpServletRequest request,
			String url,
			@CookieValue(value="remember",required=false) String remember){	
		VAdminUser user=(VAdminUser) session.getAttribute(adminKey);
		if(user!=null){
			
			return "redirect:main.co";
		}
		if(remember!=null && remember.contains(":")){
			String[] arr=remember.split(":");
			Long adminId=Long.parseLong(arr[0]);
			//String encode=arr[1];
			user=admin.getAdminUser(adminId);
			if(user!=null){
				String encode=MDEncode.md5Encode(user.getAdminjoin().getTime() +"\n"+ user.getAdminpwd());
				if(encode.equals(arr[1])){
					model.addAttribute(adminKey, user);
					String ip=getClientIpAddress(request);
					admin.updateUserLogin(user,ip);
					adminLog(user,"自动登录","成功");
					
					List<VAdminUserUrl> urls=admin.getAdminUserUrls(user.getAdminid());					
					CTree<Long, VAdminUserUrl> tree = loadTree(urls);
					model.addAttribute(adminUrlKey, tree);
					if(url!=null && !url.isEmpty()){
						try {
							return "redirect:"+URLDecoder.decode(url, "utf-8");
						} catch (UnsupportedEncodingException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return "redirect:main.co";
				}
			}
		}
		
		return path+"/login";
	}
	
	/**
	 * 获取客户端Ip地址
	 * @param request
	 * @return
	 */
	public String getClientIpAddress(HttpServletRequest request) {
        for (String header : HEADERS_TO_TRY) {
            String ip = request.getHeader(header);
            if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
                return ip;
            }
        }
        return request.getRemoteAddr();
    }
	
	/**
	 * 通过list获取树
	 * @param urls
	 * @return
	 */
	private CTree<Long, VAdminUserUrl> loadTree(List<VAdminUserUrl> urls){
		CTree<Long, VAdminUserUrl> tree=new CTree<Long, VAdminUserUrl>();
		LoadHandle<Long, VAdminUserUrl> handle=new LoadHandle<Long, VAdminUserUrl>() {
			@Override
			public Long getId(VAdminUserUrl item) {
				return item.getUid();
			}

			@Override
			public String getName(VAdminUserUrl item) {
	
				return item.getUtitle();
			}

			@Override
			public Long getParentId(VAdminUserUrl item) {
				return item.getUparentid();
			}
		};
		tree.loadList(urls, handle, 0l);
		return tree;
	}
	
	/**
	 * 权限不足
	 * @param model
	 * @return
	 */
	@RequestMapping("invalid")
	public String invalid(Model model){	
		
		return path+"/invalid";
	}
	
	/**
	 * 检查登录
	 * @param model
	 * @param adminName
	 * @param adminPwd
	 * @return
	 */
	@RequestMapping("chklogin")
	@ResponseBody
	public ResponseCode chklogin(Model model,String adminName,String adminPwd,Boolean remember,
			HttpServletResponse	 response, HttpServletRequest request){	

		ResponseCode res=new ResponseCode();
		if(adminName==null||adminName.trim().isEmpty()){
			res.setErroCode(-1);
			res.setMessage("管理用户名不能为空");
			return res;
		}
		
		if(adminPwd==null||adminPwd.trim().isEmpty()){
			res.setErroCode(-2);
			res.setMessage("管理密码不能为空");
			return res;
		}
		
		VAdminUser user=admin.getAdminUser(adminName);
		if(user==null){
			res.setErroCode(1);
			res.setMessage("管理用户不存在");
		}else{
			
			adminPwd=MDEncode.md5Encode(user.getAdminjoin().getTime() +"\n"+ adminPwd);
			if(!adminPwd.equals(user.getAdminpwd())){
				res.setErroCode(2);
				res.setMessage("管理用户或密码错误");
			}else{
				
				if(remember!=null&&remember){					
					String encode=MDEncode.md5Encode(user.getAdminjoin().getTime() +"\n"+ adminPwd);
					encode=user.getAdminid() +":"+encode;
					Cookie cookie=new Cookie("remember", encode);
					cookie.setHttpOnly(true);
					cookie.setMaxAge(3600*24*30);//记住一个月
					response.addCookie(cookie);
				}
				model.addAttribute(adminKey, user);
				
				List<VAdminUserUrl> urls=admin.getAdminUserUrls(user.getAdminid());					
				CTree<Long, VAdminUserUrl> tree = loadTree(urls);
				model.addAttribute(adminUrlKey, tree);
				
				String ip=getClientIpAddress(request);
				admin.updateUserLogin(user,ip);
				adminLog(user,"登录","成功");
			}
		}
		
		return res;
	}
	
	/**
	 * 登录登出日志
	 * @param user 用户信息
	 * @param utitle 标题
	 * @param opstatus 状态
	 */
	private void adminLog(VAdminUser user,String utitle,String opstatus){
		try{
			AdminLog log=new AdminLog();
			log.setAdminid(user.getAdminid());
			log.setAdminname(user.getAdminname());
			log.setOpstart(new Date());
			log.setUid(null);
			log.setUtitle(utitle);
			log.setOpstatus(opstatus);
			admin.saveLog(log);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	@RequestMapping("logout")
	public String logout(Model model,HttpServletResponse response,
			HttpSession session,SessionStatus status){
		VAdminUser user=(VAdminUser) session.getAttribute(adminKey);
		if(user!=null){
			adminLog(user,"登出","成功");
		}
		Cookie cookie=new Cookie("remember", "");
		cookie.setHttpOnly(true);
		cookie.setMaxAge(0);//记住一个月
		response.addCookie(cookie);
		status.setComplete();
		//session.setMaxInactiveInterval(1);
		return "redirect:login.co";
	}
	

	/**
	 * 管理框架主页
	 * @param model
	 * @param adminId
	 * @return
	 */
	@RequestMapping("main")
	public String main(Model model,@ModelAttribute(adminKey) VAdminUser user, HttpServletRequest request){
		model.addAttribute("user", user);
		//model.addAttribute("urls", urls);
		
		List<VAdminUserUrl> urls=admin.getAdminUserUrls(user.getAdminid());
		CTree<Long, VAdminUserUrl> tree = loadTree(urls);
		model.addAttribute(adminUrlKey, tree);

		model.addAttribute("tree", tree);
		model.addAttribute("uname", "");
		model.addAttribute("page", "index");
		
		model.addAttribute("delCount",0);
		return path+"/main";
	}
	
	/**
	 * 修改密码操作
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("updatePwd")
	public String updatePwd(Model model,@ModelAttribute(adminKey) VAdminUser user){
		model.addAttribute("user", user);
		return path+"/updatePwd";
	}
	
	/**
	 * 检查旧密码是否正确
	 * @param request
	 * @param oldPwd
	 * @return
	 */
	@RequestMapping("checkPwd")
	@ResponseBody
	public ResponseCode checkPwd(HttpServletRequest request, String adminName, String adminPwd){
		ResponseCode res=new ResponseCode();
		if(adminPwd==null||adminPwd.trim().isEmpty()){
			res.setErroCode(-2);
			res.setMessage("请输入您的旧密码");
			return res;
		}
		VAdminUser user=admin.getAdminUser(adminName);
		adminPwd=MDEncode.md5Encode(user.getAdminjoin().getTime() +"\n"+ adminPwd);
		user.setAdminpwd(adminPwd);
		try {
			admin.checkPwd(user);
		} catch (ServiceException e) {
			res.set(e.getErrorCode(), e.getMessage());
		}
		return res;
	}
	
	/**
	 * 保存密码
	 * @param request
	 * @param user
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public ResponseCode save(HttpServletRequest request, VAdminUser user, HttpServletResponse response, SessionStatus status){
		ResponseCode res=new ResponseCode();
		VAdminUser vu=admin.getAdminUser(user.getAdminname());
		vu.setAdminpwd(MDEncode.md5Encode(vu.getAdminjoin().getTime() +"\n"+ user.getAdminpwd()));
		try {
			admin.save(vu);
			Cookie cookie=new Cookie("remember", "");
			cookie.setHttpOnly(true);
			cookie.setMaxAge(0);//记住一个月
			response.addCookie(cookie);
			status.setComplete();
		} catch (Exception e) {
			res.set(1, "保存出错，请稍后重试...");
		}
		return res;
	}
}
