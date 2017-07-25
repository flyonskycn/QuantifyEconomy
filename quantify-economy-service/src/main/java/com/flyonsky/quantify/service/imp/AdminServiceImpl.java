/**
 * 
 */
package com.flyonsky.quantify.service.imp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.dao.AdminLogMapper;
import com.flyonsky.quantify.dao.AdminRoleMapper;
import com.flyonsky.quantify.dao.AdminRoleUrlMapper;
import com.flyonsky.quantify.dao.AdminRoleUserMapper;
import com.flyonsky.quantify.dao.AdminUrlMapper;
import com.flyonsky.quantify.dao.AdminUserMapper;
import com.flyonsky.quantify.dao.VAdminRoleAllUrlMapper;
import com.flyonsky.quantify.dao.VAdminRoleAllUserMapper;
import com.flyonsky.quantify.dao.VAdminRoleUserMapper;
import com.flyonsky.quantify.dao.VAdminUserMapper;
import com.flyonsky.quantify.dao.VAdminUserUrlMapper;
import com.flyonsky.quantify.entity.AdminLog;
import com.flyonsky.quantify.entity.AdminLogExample;
import com.flyonsky.quantify.entity.AdminRole;
import com.flyonsky.quantify.entity.AdminRoleExample;
import com.flyonsky.quantify.entity.AdminRoleUrl;
import com.flyonsky.quantify.entity.AdminRoleUrlExample;
import com.flyonsky.quantify.entity.AdminRoleUser;
import com.flyonsky.quantify.entity.AdminRoleUserExample;
import com.flyonsky.quantify.entity.AdminUrl;
import com.flyonsky.quantify.entity.AdminUrlExample;
import com.flyonsky.quantify.entity.AdminUser;
import com.flyonsky.quantify.entity.AdminUserExample;
import com.flyonsky.quantify.entity.AdminUserExample.Criteria;
import com.flyonsky.quantify.entity.VAdminRoleAllUrl;
import com.flyonsky.quantify.entity.VAdminRoleAllUrlExample;
import com.flyonsky.quantify.entity.VAdminRoleAllUser;
import com.flyonsky.quantify.entity.VAdminRoleAllUserExample;
import com.flyonsky.quantify.entity.VAdminRoleUser;
import com.flyonsky.quantify.entity.VAdminRoleUserExample;
import com.flyonsky.quantify.entity.VAdminUser;
import com.flyonsky.quantify.entity.VAdminUserExample;
import com.flyonsky.quantify.entity.VAdminUserUrl;
import com.flyonsky.quantify.entity.VAdminUserUrlExample;
import com.flyonsky.quantify.model.ServiceException;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;
import com.flyonsky.quantify.service.AbstractService;
import com.flyonsky.quantify.service.AdminService;
import com.flyonsky.quantify.util.EntityIdGenerator;
import com.flyonsky.quantify.util.MDEncode;

import net.sf.json.JSONObject;

/**
 * @author andy
 * @date 2016年5月25日
 */
@Service
public class AdminServiceImpl extends AbstractService implements AdminService {
	
	@Autowired
	private VAdminUserMapper vauMapper;
	
	@Autowired
	private VAdminUserUrlMapper vauuMapper;
	
	@Autowired
	private VAdminRoleUserMapper varuMapper;

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	private VAdminRoleAllUserMapper alluserMapper;
	
	@Autowired
	private VAdminRoleAllUrlMapper allurlMapper;
	
	@Autowired
	private AdminRoleMapper arMapper;
	
	@Autowired
	private AdminUrlMapper auMapper;

	@Autowired
	private AdminUserMapper adminMapper;
	
	@Autowired
	private AdminRoleUserMapper aruserMapper;
	
	@Autowired
	private AdminRoleUrlMapper arurlMapper;
	
	@Autowired
	private AdminLogMapper logMapper;
	

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminUser(java.lang.Long)
	 */
	@Override
	public VAdminUser getAdminUser(Long adminId) {
		VAdminUserExample example=new VAdminUserExample();
		example.createCriteria().andAdminidEqualTo(adminId);		
		List<VAdminUser> list=vauMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminUserByUserid(java.lang.Long)
	 */
	@Override
	public VAdminUser getAdminUserByUserid(Long userid) {
		VAdminUserExample example=new VAdminUserExample();
		example.createCriteria().andUseridEqualTo(userid);
		List<VAdminUser> list=vauMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}
	

	@Override
	public VAdminUser getAdminUser(String adminName) {
		VAdminUserExample example=new VAdminUserExample();
		example.createCriteria().andAdminnameEqualTo(adminName);
		List<VAdminUser> list=vauMapper.selectByExample(example);
		return list.size()>0?list.get(0):null;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminUserUrls(java.lang.Long)
	 */
	@Override
	public List<VAdminUserUrl> getAdminUserUrls(Long adminId) {
		VAdminUserUrlExample example=new VAdminUserUrlExample();
		example.createCriteria().andAdminidEqualTo(adminId);
		example.setOrderByClause("uParentId,uId");
		return vauuMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminRoleUsers(java.lang.Long)
	 */
	@Override
	public List<VAdminRoleUser> getAdminRoleUsers(Long roleId) {
		VAdminRoleUserExample example=new VAdminRoleUserExample();
		example.createCriteria().andRoleidEqualTo(roleId);
		return varuMapper.selectByExample(example);
	}
	
	@Override
	public List<VAdminRoleUser> getAdminRolesByAdminid(Long adminid) {
		VAdminRoleUserExample example=new VAdminRoleUserExample();
		example.createCriteria().andAdminidEqualTo(adminid);
		return varuMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminRoleUrls(java.lang.Long)
	 */
	@Override
	public List<AdminRoleUrl> getAdminRoleUrls(Long roleId) {
		AdminRoleUrlExample example=new AdminRoleUrlExample();
		example.createCriteria().andRoleidEqualTo(roleId);
		return arurlMapper.selectByExample(example);
	}
	

	@Override
	public List<VAdminRoleAllUser> getAdminRoleAllUsers(Long roleId) {
		VAdminRoleAllUserExample example=new VAdminRoleAllUserExample();
		example.createCriteria().andRoleidEqualTo(roleId);
		return alluserMapper.selectByExample(example);
	}

	@Override
	public List<VAdminRoleAllUrl> getAdminRoleAllUrls(Long roleId) {
		VAdminRoleAllUrlExample example=new VAdminRoleAllUrlExample();
		example.createCriteria().andRoleidEqualTo(roleId);
		return allurlMapper.selectByExample(example);
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminUsers(com.flyonsky.quantify.entity.VAdminUser, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<VAdminUser> getAdminUsers(VAdminUser user, QueryInfo query) {
		GridData<VAdminUser> grid=new GridData<VAdminUser>();
		VAdminUserExample example=new VAdminUserExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(vauMapper.countByExample(example));
		
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(vauMapper.selectByExample(example));
		return grid;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminRoles(com.flyonsky.quantify.entity.AdminRole, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<AdminRole> getAdminRoles(AdminRole role, QueryInfo query) {
		GridData<AdminRole> grid=new GridData<AdminRole>();
		AdminRoleExample example=new AdminRoleExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(arMapper.countByExample(example));
		
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(arMapper.selectByExample(example));
		return grid;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminUrls(com.flyonsky.quantify.entity.AdminUrl, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<AdminUrl> getAdminUrls(AdminUrl url, QueryInfo query) {
		GridData<AdminUrl> grid=new GridData<AdminUrl>();
		AdminUrlExample example=new AdminUrlExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(auMapper.countByExample(example));
		
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(auMapper.selectByExample(example));
		return grid;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminRoleUsers(com.flyonsky.quantify.entity.VAdminRoleUser, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<VAdminRoleUser> getAdminRoleUsers(VAdminRoleUser roleUser, QueryInfo query) {
		GridData<VAdminRoleUser> grid=new GridData<VAdminRoleUser>();
		VAdminRoleUserExample example=new VAdminRoleUserExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(varuMapper.countByExample(example));
		
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(varuMapper.selectByExample(example));
		return grid;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminRoleUrls(com.flyonsky.quantify.entity.AdminRoleUrl, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<AdminRoleUrl> getAdminRoleUrls(AdminRoleUrl roleUrl, QueryInfo query) {
		GridData<AdminRoleUrl> grid=new GridData<AdminRoleUrl>();
		AdminRoleUrlExample example=new AdminRoleUrlExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(arurlMapper.countByExample(example));
		
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(arurlMapper.selectByExample(example));
		return grid;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminUserUrls(com.flyonsky.quantify.entity.VAdminUserUrl, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<VAdminUserUrl> getAdminUserUrls(VAdminUserUrl userUrl, QueryInfo query) {
		GridData<VAdminUserUrl> grid=new GridData<VAdminUserUrl>();
		VAdminUserUrlExample example=new VAdminUserUrlExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(vauuMapper.countByExample(example));
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(vauuMapper.selectByExample(example));
		return grid;
	}

	@Override
	public AdminRole getAdminRole(Long roleid) {
		return arMapper.selectByPrimaryKey(roleid);
	}

	@Override
	public void saveUser(AdminUser user) {
		if(user.getAdminname()==null 
				|| user.getAdminname().isEmpty()){
			throw new ServiceException(90, "管理用户名不能为空");
		}
		
		if(user.getUserid()!=null && userMapper.selectByPrimaryKey(user.getUserid())==null){
			throw new ServiceException(98, "前端用户ID不存在");
		}
		
		AdminUserExample example=new AdminUserExample();
		Criteria Criteria=example.createCriteria().andAdminnameEqualTo(user.getAdminname());
		if(user.getAdminid()==null){
			Date join=new Date();//时间圆整到秒数。mysql表会丢毫秒
			join=new Date(join.getTime()- (join.getTime() % 1000));
			user.setAdminjoin(join);
			user.setAdminid(EntityIdGenerator.getInstance().generateLongId());
			if(user.getAdminpwd()==null 
					|| user.getAdminpwd().isEmpty()){
				throw new ServiceException(99, "密码不能为空");
			}
			
			if(adminMapper.selectByExample(example).size()>0){
				throw new ServiceException(100, "管理用户名已经存在");
			}
			
			// 加密存储密码
			String pwd=user.getAdminjoin().getTime()+"\n"+user.getAdminpwd();
			pwd=MDEncode.md5Encode(pwd);
			user.setAdminpwd(pwd);
			adminMapper.insert(user);
		}else{
			Criteria.andAdminidNotEqualTo(user.getAdminid());
			if(adminMapper.selectByExample(example).size()>0){
				throw new ServiceException(100, "管理用户名已经存在");
			}
			
			AdminUser old=adminMapper.selectByPrimaryKey(user.getAdminid());
			if(old==null){
				throw new ServiceException(1000, "管理用户不存在");
			}
			old.setAdminname(user.getAdminname());
			old.setAdminemail(user.getAdminemail());
			old.setUserid(user.getUserid());
			if(user.getAdminpwd()!=null 
					&& !user.getAdminpwd().isEmpty()){
				// 加密存储密码
				String pwd=old.getAdminjoin().getTime()+"\n"+user.getAdminpwd();
				pwd=MDEncode.md5Encode(pwd);
				old.setAdminpwd(pwd);
			}
			adminMapper.updateByPrimaryKeySelective(old);
		}
		
	}

	@Override
	public void saveRole(AdminRole role) {
		if(StringUtils.isEmpty(role.getRolename())){
			throw new ServiceException(1, "角色名称不能为空");
		}
		
		AdminRoleExample example=new AdminRoleExample();
		AdminRoleExample.Criteria criteria = example.createCriteria().andRolenameEqualTo(role.getRolename());
		if(role.getRoleid()!=null){
			criteria.andRoleidNotEqualTo(role.getRoleid());
		}
		if(arMapper.countByExample(example)>0){
			throw new ServiceException(2, "角色名称已经存在");
		}
		
		if(role.getRoleid()==null){
			arMapper.insert(role);
			List<AdminRole> ls=arMapper.selectByExample(example);
			role.setRoleid(ls.get(0).getRoleid());
		}else{
			arMapper.updateByPrimaryKeySelective(role);
		}
		
	}

	@Override
	public void saveRoleUser(Long roleid, List<Long> adminIds) {
		AdminRoleUserExample example=new AdminRoleUserExample();
		example.createCriteria().andRoleidEqualTo(roleid);
		aruserMapper.deleteByExample(example);
		
		AdminRoleUser record;
		for(Long adminid : adminIds){
			record=new AdminRoleUser();
			record.setAdminid(adminid);
			record.setRoleid(roleid);
			aruserMapper.insert(record);
		}
		
	}

	@Override
	public void saveRoleUrl(Long roleid, List<Long> urlIds) {
		AdminRoleUrlExample example=new AdminRoleUrlExample();
		example.createCriteria().andRoleidEqualTo(roleid);
		arurlMapper.deleteByExample(example);
		
		AdminRoleUrl record;
		for(Long uid : urlIds){
			record=new AdminRoleUrl();
			record.setUid(uid);
			record.setRoleid(roleid);
			arurlMapper.insert(record);
		}
		
		
	}

	@Override
	public void saveUserRole(Long adminid, List<Long> roleids) {
		AdminRoleUserExample example=new AdminRoleUserExample();
		example.createCriteria().andAdminidEqualTo(adminid);
		aruserMapper.deleteByExample(example);
		
		AdminRoleUser record;
		for(Long roleid : roleids){
			record=new AdminRoleUser();
			record.setAdminid(adminid);
			record.setRoleid(roleid);
			aruserMapper.insert(record);
		}
		
	}

	@Override
	public void saveUrlRole(Long uid, List<Long> roleids) {
		AdminRoleUrlExample example=new AdminRoleUrlExample();
		example.createCriteria().andUidEqualTo(uid);
		arurlMapper.deleteByExample(example);
		
		AdminRoleUrl record;
		for(Long roleid : roleids){
			record=new AdminRoleUrl();
			record.setUid(uid);
			record.setRoleid(roleid);
			arurlMapper.insert(record);
		}
		
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#getAdminLogs(com.flyonsky.quantify.entity.AdminLog, com.flyonsky.quantify.query.QueryInfo)
	 */
	@Override
	public GridData<AdminLog> getAdminLogs(AdminLog adminLog, QueryInfo query) {
		
		GridData<AdminLog> grid=new GridData<AdminLog>();
		AdminLogExample example=new AdminLogExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotal_rows(logMapper.countByExample(example));
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPage_data(logMapper.selectByExample(example));
		return grid;
	}

	/* (non-Javadoc)
	 * @see com.flyonsky.quantify.service.AdminService#saveLog(com.flyonsky.quantify.entity.AdminLog)
	 */
	@Override
	public void saveLog(AdminLog log) {
		logMapper.insert(log);		
	}

	@Override
	public List<VAdminRoleAllUrl> getAdminRolesAllUrls(String roles) {
		String[] arr=roles.split(",");
		List<Long> list=new ArrayList<Long>();
		for(String s:arr){
			list.add(Long.valueOf(s));
		}
		String sql = "select sum(ruid) ruid,uid, url, uname, utitle, uparentId, utype, ucsscls, roleid, rolename from (select uId, url, uName, uTitle, uParentId, uType, uCsscls, roleId, roleName, ruId from v_admin_role_allurl where roleId in(:roles)) u group by uTitle";

		Map<String,Object> map = new HashMap<String, Object>();
		map.put("roles", list);
		return jdbcTemplate.query(sql, map, BeanPropertyRowMapper.newInstance(VAdminRoleAllUrl.class));
	}

	@Override
	public void updateUserLogin(VAdminUser user, String ip) {
		AdminUser adminUser=adminMapper.selectByPrimaryKey(user.getAdminid());
		adminUser.setLogintime(new Date());
		
		adminUser.setLocation(ip);
		adminMapper.updateByPrimaryKey(adminUser);
		updateLoc(adminUser, ip);
	}
	
	@Async
	public void updateLoc(AdminUser adminUser, String ip) {
		//通过Ip地址获取地址信息
		String json=request("http://apis.baidu.com/bdyunfenxi/intelligence/ip","ip="+ip);
		JSONObject jsonObject=null;
		String location=ip;
		
		try {
			if(json!=null && json.contains("Status")){
				jsonObject = JSONObject.fromObject(json);
			}
			//String location=(String) jsonObject.get("retData");
			
			if(jsonObject!=null && jsonObject.getInt("Status")==0){
				JSONObject jsonObject1 = jsonObject.getJSONObject("Base_info");
				location=jsonObject1.getString("province")+jsonObject1.getString("city");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		adminUser.setLocation(location);
		adminMapper.updateByPrimaryKey(adminUser);
	}
	
	//IP地址查询
	public String request(String httpUrl, String httpArg) {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    httpUrl = httpUrl + "?" + httpArg;
	    
	    try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
	        // 填入apikey到HTTP header
	        connection.setRequestProperty("apikey",  "6e1fc8cd6303010f5784ac71d8c20650");
	        connection.connect();
	        InputStream is = connection.getInputStream();
	        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        String strRead = null;
	        while ((strRead = reader.readLine()) != null) {
	            sbf.append(strRead);
	            sbf.append("\r\n");
	        }
	        reader.close();
	        result = sbf.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}

	@Override
	public void checkPwd(VAdminUser user) {
		VAdminUserExample example=new VAdminUserExample();
		VAdminUserExample.Criteria ct=example.createCriteria();
		ct.andAdminidEqualTo(user.getAdminid());
		ct.andAdminpwdEqualTo(user.getAdminpwd());
		List<VAdminUser> list=vauMapper.selectByExample(example);
		if(list.size()<=0){
			throw new ServiceException(1, "旧密码错误");
		}
	}

	@Override
	public void save(VAdminUser user) {
		AdminUser admin=adminMapper.selectByPrimaryKey(user.getAdminid());
		admin.setAdminpwd(user.getAdminpwd());
		adminMapper.updateByPrimaryKey(admin);
	}
}
