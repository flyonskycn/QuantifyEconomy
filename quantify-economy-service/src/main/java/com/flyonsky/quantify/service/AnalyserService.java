package com.flyonsky.quantify.service;

import java.util.List;

import com.flyonsky.quantify.model.chart.MultiLineChartData;
import com.flyonsky.quantify.model.chart.SalesChartData;
import com.flyonsky.quantify.model.chart.SalesWithChartData;
import com.flyonsky.quantify.model.chart.SecuritiesChartsData;
import com.flyonsky.quantify.model.chart.SecuritiesRateChartsData;

public interface AnalyserService {

	/**
	 * 查询分析数据
	 * @param code 股票代码
	 * @return
	 */
	SecuritiesRateChartsData query(String code);
	
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
	SalesWithChartData queryRateSales(String code);
	
	/**
	 * 查询证券的主要财务指标
	 * @param code 股票代码
	 * @return
	 */
	SecuritiesChartsData querySecurities(List<String> codes);
}
