package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.SalesCharts;
import com.flyonsky.quantify.entity.SalesRateCharts;

public interface SalesMapper {

	List<SalesCharts> querySales(List<String> codes);
	
	List<SalesCharts> querySalesIndustry(String code);
	
	List<SalesRateCharts> queryRateSales(List<String> codes);
	
	List<SalesRateCharts> queryRateSalesIndustry(String code);
}
