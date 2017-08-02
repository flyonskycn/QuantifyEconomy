package com.flyonsky.quantify.service;

import java.util.List;

import com.flyonsky.quantify.entity.AnalyserReport;

public interface AnalyserService {

	/**
	 * 查询分析数据
	 * @param code 股票代码
	 * @return
	 */
	List<AnalyserReport> query(String code);
}
