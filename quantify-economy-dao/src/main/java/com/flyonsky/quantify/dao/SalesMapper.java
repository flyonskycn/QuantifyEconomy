package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.SalesCharts;
import com.flyonsky.quantify.entity.SalesRateCharts;

public interface SalesMapper {

	List<SalesCharts> querySales(String code);
	
	List<SalesRateCharts> queryRateSales(String code);
}
