package com.flyonsky.quantify.dao;

import java.util.List;

public interface CustomizeMapper {

	/**
	 * 查询年报键值
	 * @return
	 */
	List<String> queryAnnualKey();
	
	/**
	 * 证券代码
	 * @return
	 */
	List<String> querySecurities();
}
