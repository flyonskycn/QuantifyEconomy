package com.flyonsky.quantify.service;

import com.flyonsky.quantify.model.chart.LineChartData;
import com.flyonsky.quantify.model.chart.YearOnYearData;

public interface AnalyserService {

	/**
	 * 查询分析数据
	 * @param code 股票代码
	 * @return
	 */
	YearOnYearData query(String code);
	
	/**
	 * 查询年报的典线图数据
	 * @param code 股票代码
	 * @return
	 */
	LineChartData queryLine(String code);
}
