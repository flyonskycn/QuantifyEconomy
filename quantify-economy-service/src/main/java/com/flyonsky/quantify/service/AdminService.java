/**
 * 
 */
package com.flyonsky.quantify.service;

import java.util.List;

import com.flyonsky.quantify.entity.AdminLog;
import com.flyonsky.quantify.entity.AdminRole;
import com.flyonsky.quantify.entity.AdminRoleUrl;
import com.flyonsky.quantify.entity.AdminUrl;
import com.flyonsky.quantify.entity.AdminUser;
import com.flyonsky.quantify.entity.VAdminRoleAllUrl;
import com.flyonsky.quantify.entity.VAdminRoleAllUser;
import com.flyonsky.quantify.entity.VAdminRoleUser;
import com.flyonsky.quantify.entity.VAdminUser;
import com.flyonsky.quantify.entity.VAdminUserUrl;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;

/**
 * 管理基础接口服务
 * @author andy
 * @date 2016年5月20日
 */
public interface AdminService {

	/**
	 * 通过管理员ID获取管理员用户信息
	 * @param adminId 管理员ID
	 * @return
	 */
	VAdminUser getAdminUser(Long adminId);
	
	/**
	 * 通过用户ID获取管理员用户信息
	 * @param userid 用户ID
	 * @return
	 */
	VAdminUser getAdminUserByUserid(Long userid);
	
	/**
	 * 通过管理员用户名获取管理员用户信息
	 * @param adminName 管理员用户名获
	 * @return
	 */
	VAdminUser getAdminUser(String adminName);
	
	
	/**
	 * 查询角色
	 * @param roleid 角色ID
	 * @return
	 */
	AdminRole getAdminRole(Long roleid);
	
	/**
	 * 获取管理员的用户资源列表
	 * @param adminId 管理员ID
	 * @return
	 */
	List<VAdminUserUrl> getAdminUserUrls(Long adminId);
	
	/**
	 * 获取角色用户列表
	 * @param roleId 角色ID
	 * @return
	 */
	List<VAdminRoleUser> getAdminRoleUsers(Long roleId);
	
	/**
	 * 获取角色url资源列表
	 * @param roleId 角色ID
	 * @return
	 */
	List<AdminRoleUrl> getAdminRoleUrls(Long roleId);
	
	/**
	 * 获取角色和所有用户的关系，如果没有关系urid=null
	 * @param roleId 角色ID
	 * @return
	 */
	List<VAdminRoleAllUser> getAdminRoleAllUsers(Long roleId);
	

	/**
	 * 通过adminid获取相关所有角色信息
	 * @param adminid
	 * @return
	 */
	List<VAdminRoleUser> getAdminRolesByAdminid(Long adminid);
	
	/**
	 * 获取角色和所有资源的关系，如果没有关系ruid=null
	 * @param roleId
	 * @return
	 */
	List<VAdminRoleAllUrl> getAdminRoleAllUrls(Long roleId);
	
	/**
	 * 获取多个角色与所有资源的关系
	 * @param roles
	 * @return
	 */
	List<VAdminRoleAllUrl> getAdminRolesAllUrls(String roles);
	/**
	 * 分页查询用户列表
	 * @param user
	 * @param query 查询信息
	 * @return
	 */
	GridData<VAdminUser> getAdminUsers(VAdminUser user,QueryInfo query);
	
	/**
	 * 分页查询角色列表
	 * @param role
	 * @param query 查询信息
	 * @return
	 */
	GridData<AdminRole> getAdminRoles(AdminRole role,QueryInfo query);
	
	/**
	 * 分页查询资源列表
	 * @param url
	 * @param query
	 * @return
	 */
	GridData<AdminUrl> getAdminUrls(AdminUrl url,QueryInfo query);
	
	/**
	 * 分页查询角色用户关系
	 * @param roleUser
	 * @param query
	 * @return
	 */
	GridData<VAdminRoleUser> getAdminRoleUsers(VAdminRoleUser roleUser,QueryInfo query);
	
	/**
	 * 分页查询角色资源关系
	 * @param roleUrl
	 * @param query
	 * @return
	 */
	GridData<AdminRoleUrl> getAdminRoleUrls(AdminRoleUrl roleUrl,QueryInfo query);
	
	/**
	 * 分页查询用户资源关系
	 * @param userUrl
	 * @param query
	 * @return
	 */
	GridData<VAdminUserUrl> getAdminUserUrls(VAdminUserUrl userUrl,QueryInfo query);
	
	/**
	 * 分页查询管理用户日志
	 * @param adminLog 日志资料
	 * @param query
	 * @return 分页数据
	 */
	GridData<AdminLog> getAdminLogs(AdminLog adminLog,QueryInfo query);
	
	/**
	 * 保存管理用户信息
	 * @param user 管理用户信息
	 */
	void saveUser(AdminUser user);
	
	/**
	 * 保存角色基本信息
	 * @param role
	 */
	void saveRole(AdminRole role);
	
	/**
	 * 保存角色的用户关系
	 * @param roleid 角色id
	 * @param adminIds 管理用户id列表
	 */
	void saveRoleUser(Long roleid,List<Long> adminIds);
	
	/**
	 * 保存角色的url资源关系
	 * @param roleid 角色id
	 * @param urlIds url资源列表
	 */
	void saveRoleUrl(Long roleid,List<Long> urlIds);
	
	
	/**
	 * 保存用户和其他角色关系
	 * @param adminid 角色id
	 * @param roleids 管理用户id列表
	 */
	void saveUserRole(Long adminid,List<Long> roleids);
	
	/**
	 * 保存资源和其他角色资源关系
	 * @param uid 资源ID
	 * @param roleids 角色ID列表
	 */
	void saveUrlRole(Long uid,List<Long> roleids);
	
	/**
	 * 保存日志
	 * @param log 日志
	 */
	void saveLog(AdminLog log);

	/**
	 * 修改用户登录信息
	 * @param user
	 */
	void updateUserLogin(VAdminUser user,String ip);
	
	/**
	 * 密码校验
	 * @param user
	 */
	void checkPwd(VAdminUser user);
	
	/**
	 * 保存密码
	 * @param user
	 */
	void save(VAdminUser user);
}
