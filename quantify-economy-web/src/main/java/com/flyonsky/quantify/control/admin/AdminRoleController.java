/**
 * 
 */
package com.flyonsky.quantify.control.admin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.entity.AdminRole;
import com.flyonsky.quantify.entity.VAdminRoleAllUrl;
import com.flyonsky.quantify.entity.VAdminRoleAllUser;
import com.flyonsky.quantify.model.CTree;
import com.flyonsky.quantify.model.CTree.LoadHandle;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.ResponseCode;
import com.flyonsky.quantify.model.QueryInfo;
import com.flyonsky.quantify.service.AdminService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 管理-后台角色权限
 * @author luowg
 * @date 2017年7月26日
 */
@Controller
@RequestMapping(AdminRoleController.PATH)
public class AdminRoleController extends AbstractAdminController{
	
	public final static String PATH = "admin/role";
	
	@Autowired
	private AdminService admin;
	
	/**
	 * 角色列表视图
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String execute(Model model){
		return PATH + "/index";
	}
	
	/**
	 * 角色列表视图
	 * @param model
	 * @param role 
	 * @param query 
	 * @return
	 */
	@RequestMapping("query")
	@ResponseBody
	public GridData<AdminRole> query(Model model, QueryInfo query){
		GridData<AdminRole> grid=admin.queryAdminRoles(query);
		return grid;
	}
	
	/**
	 * 角色信息管理视图
	 * @param model
	 * @param role 
	 * @return
	 */
	@RequestMapping("info")
	public String info(Model model, Long roleid){	
		AdminRole role=new AdminRole();
		List<VAdminRoleAllUrl> urls=admin.queryAdminRoleAllUrls(1l);
		List<VAdminRoleAllUser> users=admin.queryAdminRoleAllUsers(1l);
		CTree<Long, VAdminRoleAllUrl> utree=new CTree<Long, VAdminRoleAllUrl>();
		if(roleid!=null){
			role = admin.findAdminRole(roleid);
			urls=admin.queryAdminRoleAllUrls(roleid);
			users=admin.queryAdminRoleAllUsers(roleid);
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
		
		model.addAttribute("item", role);
		model.addAttribute("urls", urls);
		model.addAttribute("utree", utree);
		try {
			String nodes=map.writeValueAsString(utree.getChildrens());
			nodes=nodes.replace("\"name\"", "\"text\"")
					.replace("\"childrens\"", "\"nodes\"")
					.replaceAll(",\"ruid\":\\d+}", "},\"state\":{\"checked\":true}")
					.replace(",\"nodes\":[]", "");
			model.addAttribute("btree", nodes);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("users", users);
		return PATH + "/info";
	}
	
	/**
	 * 保存角色和及其用户列表，资源列表
	 * @param model
	 * @param roleId
	 * @return
	 */
	@RequestMapping("save")
	@ResponseBody
	public ResponseCode save(Model model, AdminRole role,
			@RequestParam(value="adminid",required=false) Long[] adminid,
			@RequestParam(value="uid",required=false) Long[] uid){	
		ResponseCode res=new ResponseCode();
		try{
			admin.saveRole(role);
			List<Long> adminids=adminid!=null?Arrays.asList(adminid) :new ArrayList<Long>();
			List<Long> uids=uid!=null?Arrays.asList(uid) :new ArrayList<Long>();
			
			admin.saveRoleUser(role.getRoleid(), adminids);
			admin.saveRoleUrl(role.getRoleid(), uids);
		}catch(Exception e){
			LOG.error(e.getMessage());
			res.set(1, e.getMessage());
		}
		
		return res;
	}
	

}
