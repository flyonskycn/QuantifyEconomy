/**
 * 
 */
package com.flyonsky.quantify.control.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.entity.AdminLog;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;
import com.flyonsky.quantify.service.AdminService;

/**
 * 管理-后台日志查询
 * @author luowg
 * @date 2017年7月26日
 */
@Controller
@RequestMapping(AdminLogController.PATH)
public class AdminLogController extends AbstractAdminController{
	
	public final static String PATH = "admin/log";
	
	@Autowired
	private AdminService admin;
	
	/**
	 * 用户列表视图
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String execute(Model model){	
		return PATH + "/index";
	}
	
	/**
	 * 用户列表数据
	 * @param model
	 * @param role 
	 * @param query 
	 * @return
	 */
	@RequestMapping("query")
	@ResponseBody
	public GridData<AdminLog> query(Model model, AdminLog log, QueryInfo query){
		GridData<AdminLog> grid = admin.getAdminLogs(log, query);
		return grid;
	}
}
