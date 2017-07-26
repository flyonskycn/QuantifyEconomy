package com.flyonsky.quantify.interceptor;

import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.flyonsky.quantify.control.admin.AbstractAdminController;
import com.flyonsky.quantify.entity.AdminLog;
import com.flyonsky.quantify.entity.VAdminUser;
import com.flyonsky.quantify.entity.VAdminUserUrl;
import com.flyonsky.quantify.model.CTree;
import com.flyonsky.quantify.model.CTree.CTreeNode;
import com.flyonsky.quantify.service.AdminService;

/**
 * 管理后台拦截器
 * @author Administrator
 *
 */
public class AdminInterceptor implements HandlerInterceptor{

	private static final String root="admin";
	
	private static final String logkey="admin_log_key";
	
	@Autowired
	private AdminService service;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		boolean flag = false;
		AdminLog log=new AdminLog();
		String requestUrl = request.getRequestURI();
		if(request.getQueryString()!=null && !request.getQueryString().isEmpty()){//如果有参数加上参数
			requestUrl+="?"+request.getQueryString();
		}
		if(request.getSession().getAttribute(AbstractAdminController.ADMINKEY) == null){
			response.sendRedirect("/admin/login.co?url="+URLEncoder.encode(requestUrl, "utf-8"));
			response.setStatus(HttpServletResponse.SC_FOUND);
			return flag;
		}
		VAdminUser user=(VAdminUser)request.getSession().getAttribute(AbstractAdminController.ADMINKEY);
		@SuppressWarnings("unchecked")
		CTree<Long, VAdminUserUrl> tree=(CTree<Long, VAdminUserUrl>)request.getSession().getAttribute(AbstractAdminController.ADMINURLKEY);
		
		if(requestUrl.equals("/admin/main.co") || requestUrl.equals("/report/admin/show.co?pageid=2")
			||requestUrl.equals("/admin/content.co") || requestUrl.equals("/admin/save.co") || requestUrl.equals("/admin/updatePwd.co") || requestUrl.equals("/admin/save.co") || requestUrl.equals("/admin/checkPwd.co") || requestUrl.equals("/delivery/admin/wlist.co") || requestUrl.equals("/delivery/admin/wlistdata.co")){
			return true;
		}

		// 检查各级url资源是否有权限
		if(tree!=null ){
			VAdminUserUrl userUrl=checkUrl(requestUrl,tree.getChildrens());		
			if(userUrl!=null){
				log.setAdminid(user.getAdminid());
				log.setAdminname(user.getAdminname());
				log.setOpstart(new Date());
				log.setUid(userUrl.getUid());
				log.setUtitle(userUrl.getUtitle());
				request.setAttribute(logkey, log);
				return true;
			}
		}
		if(user.getAdminname().equals(root)){// 超级管理员不用配置权限
			
			return true;
		}
		
		
		response.sendRedirect("/admin/invalid.co?url="+URLEncoder.encode(requestUrl, "utf-8"));
		response.setStatus(HttpServletResponse.SC_FOUND);
		return flag;
	}
	
	
	private VAdminUserUrl checkUrl(String requestUrl,List<CTreeNode<Long, VAdminUserUrl>> nodes){	
		if(!requestUrl.contains("?")){
			requestUrl+="?";
		}
		VAdminUserUrl userUrl=null;
		for(CTreeNode<Long, VAdminUserUrl> node:nodes){
			if(node.getValue().getUrl()!=null 
					&& requestUrl.contains(node.getValue().getUrl())){
				return node.getValue();
			}
			if(!node.getChildrens().isEmpty()) {
				userUrl=checkUrl(requestUrl,node.getChildrens());
				if(userUrl!=null){
					return userUrl;
				}
			}
		}
		return userUrl;
	}


	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}



	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		AdminLog log=(AdminLog)request.getAttribute(logkey);
		if(log!=null){
			log.setOptime((int) (new Date().getTime()-log.getOpstart().getTime()));
			if(log.getOpstatus()==null && ex!=null){ // 如果controller里面没有处理日志内容，则最后补充状态信息
				log.setOpstatus(ex.getClass().getName());
			}
			service.saveLog(log);
		}
	}

	

}
