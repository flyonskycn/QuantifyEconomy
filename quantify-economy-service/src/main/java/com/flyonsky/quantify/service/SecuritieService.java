package com.flyonsky.quantify.service;

import java.util.List;

import com.flyonsky.quantify.entity.Securities;
import com.flyonsky.quantify.entity.VIndustrySecury;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;

/**
 * 证券操作
 * @author Administrator
 *
 */
public interface SecuritieService {

	/**
	 * 新建证券
	 * @param sec
	 */
	boolean createSecuritie(Securities sec);
	
	/**
	 * 修改证券
	 * @param sec
	 * @return
	 */
	boolean modifySecuritie(Securities sec);
	
	/**
	 * 分页查询证券列表
	 * @param query 查询信息
	 * @return
	 */
	GridData<Securities> querySecurities(QueryInfo query);
	
	/**
	 * 查看对应的年报
	 * @param id 
	 * @return
	 */
	Securities querySecurities(int id);
	
	/**
	 * 查看对应的证券信息
	 * @param code 证券代码
	 * @return
	 */
	Securities querySecurities(String code);
	
	/**
	 * 所有的证券代码
	 * @return
	 */
	List<String> querySecurities();
	
	/**
	 * 分页查询证券和分类列表
	 * @param query 查询信息
	 * @return
	 */
	GridData<VIndustrySecury> queryIndustrySecury(QueryInfo query);
}
