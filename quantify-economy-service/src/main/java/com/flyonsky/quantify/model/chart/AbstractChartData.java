package com.flyonsky.quantify.model.chart;

public abstract class AbstractChartData {

	public String kpiName(EnumKpiType kpiType){
		String kpiName = null;
		switch(kpiType){
		case revenue:
			kpiName = "营业收入";
			break;
		case operprofit:
			kpiName = "营业收入";
			break;
		case totalprofit:
			kpiName = "利润总额";
			break;
		case netprofit:
			kpiName = "净利润";
			break;
		}
		return kpiName;
	}
}
