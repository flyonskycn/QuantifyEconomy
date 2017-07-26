package com.flyonsky.quantify.control.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 后台管理抽象
 * @author luowg
 *
 */
public abstract class AbstractAdminController {
	
	/**
	 * 管理员信息key
	 */
	public final static String ADMINKEY = "adminUser";
	
	/**
	 * 管理员有权限的菜单
	 */
	public final static String ADMINURLKEY = "adminUrl";
	
	/**
	 * 日志
	 */
	public final static Logger LOG = LoggerFactory.getLogger(AbstractAdminController.class);
	
}
