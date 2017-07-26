/**
 * 
 */
package com.flyonsky.quantify.control.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.entity.AdminRole;
import com.flyonsky.quantify.entity.AdminUser;
import com.flyonsky.quantify.entity.VAdminRoleAllUrl;
import com.flyonsky.quantify.entity.VAdminRoleUser;
import com.flyonsky.quantify.entity.VAdminUser;
import com.flyonsky.quantify.model.ServiceException;
import com.flyonsky.quantify.model.CTree;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.ResponseCode;
import com.flyonsky.quantify.model.CTree.LoadHandle;
import com.flyonsky.quantify.model.QueryInfo;
import com.flyonsky.quantify.service.AdminService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 后台用户管理
 * @author luowg
 * @date 2017年7月26日
 */
@Controller
@RequestMapping(AdminUserController.PATH)
public class AdminUserController extends AbstractAdminController {
	
	public final static String PATH = "admin/user";
	
	@Autowired
	private AdminService admin;
	
	/**
	 * 用户管理页
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String execute(Model model){
		return PATH + "/index";
	}
	
	/**
	 * 用户列表数据查询
	 * @param model
	 * @param role 
	 * @param query 
	 * @return
	 */
	@RequestMapping("query")
	@ResponseBody
	public GridData<VAdminUser> query(Model model, VAdminUser user, QueryInfo query){
		GridData<VAdminUser> grid=admin.getAdminUsers(user, query);
		return grid;
	}
	
	/**
	 * 用户信息管理视图
	 * @param model
	 * @param adminId 
	 * @return
	 */
	@RequestMapping("info")
	public String info(Model model, Long adminid,AdminRole role,QueryInfo query){	
		VAdminUser item=new VAdminUser();
		//查询出所有角色
		GridData<AdminRole> grid=admin.getAdminRoles(role, query);
		List<AdminRole> ar=grid.getPageData();
		List<VAdminRoleUser> vr=null;
		if(adminid!=null){
			item=admin.getAdminUser(adminid);
			//查询出当前admin所拥有的角色
			vr=admin.getAdminRolesByAdminid(adminid);
		}
		
		model.addAttribute("item", item);
		model.addAttribute("ar", ar);
		model.addAttribute("vr", vr);
		return PATH + "/info";
	}
	
	/**
	 * 保存角色和及其用户列表，资源列表
	 * @param model
	 * @param user
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public ResponseCode save(Model model, AdminUser user, String roles){	
		ResponseCode res=new ResponseCode();
		try{
			admin.saveUser(user);
			List<Long> list=null;
			if(roles !=null && !roles.equals("")){
				String[] arr=roles.split(",");
				list=new ArrayList<Long>();
				for(String s:arr){
					list.add(Long.valueOf(s));
				}
			}
			admin.saveUserRole(user.getAdminid(),list);
		}catch(ServiceException e){
			LOG.error(e.getMessage());
			res.set(e.getErrorCode(), e.getMessage());
		}catch(Exception e){
			LOG.error(e.getMessage());
			res.set(1, "服务异常");
		}
		return res;
	}
	
	@RequestMapping("getUrls")
	@ResponseBody
	public String urls(String roles,Model model){
		boolean flag=false;
		List<VAdminRoleAllUrl> urls=admin.getAdminRoleAllUrls(1l);
		CTree<Long, VAdminRoleAllUrl> utree=new CTree<Long, VAdminRoleAllUrl>();
		if(roles !=null && !roles.equals("")){
			urls=admin.getAdminRolesAllUrls(roles);
			flag=true;
		}
		LoadHandle<Long, VAdminRoleAllUrl> handle=new LoadHandle<Long, VAdminRoleAllUrl>() {
			@Override
			public Long getId(VAdminRoleAllUrl item) {
				return item.getUid();
			}

			@Override
			public String getName(VAdminRoleAllUrl item) {
				return item.getUtitle();
			}

			@Override
			public Long getParentId(VAdminRoleAllUrl item) {
				return item.getUparentid();
			}
		};
		
		utree.loadList(urls, handle, 0l);
		ObjectMapper map=new ObjectMapper();
		try {
			String nodes=map.writeValueAsString(utree.getChildrens());
			nodes=nodes.replace("\"name\"", "\"text\"")
					.replace("\"childrens\"", "\"nodes\"")
					.replaceAll(",\"ruid\":\\d+}", "},\"state\":{\"checked\":"+flag+"}")
					.replace(",\"nodes\":[]", "");
			return nodes;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
