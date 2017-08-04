package com.flyonsky.quantify.service;

import com.flyonsky.quantify.model.chart.MultiLineChartData;
import com.flyonsky.quantify.model.chart.SalesChartData;
import com.flyonsky.quantify.model.chart.SalesRateChartData;
import com.flyonsky.quantify.model.chart.SecuritiesChartsData;
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
	MultiLineChartData queryLine(String code);
	
	/**
	 * 查询销售曲线数据
	 * @param code 股票代码
	 * @return
	 */
	SalesChartData querySales(String code);
	
	/**
	 * 查询销售同比曲线数据
	 * @param code 股票代码
	 * @return
	 */
	SalesRateChartData queryRateSales(String code);
	
	/**
	 * 查询证券的主要财务指标
	 * @param code 股票代码
	 * @return
	 */
	SecuritiesChartsData querySecurities(String code);
}
