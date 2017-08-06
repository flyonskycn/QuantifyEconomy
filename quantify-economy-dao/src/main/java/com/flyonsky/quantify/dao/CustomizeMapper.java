package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.AnnualKey;

public interface CustomizeMapper {

	/**
	 * 查询年报键值
	 * @return
	 */
	List<AnnualKey> queryAnnualKey();
}
