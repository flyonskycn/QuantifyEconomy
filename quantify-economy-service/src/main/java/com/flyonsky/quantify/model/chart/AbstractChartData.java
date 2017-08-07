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
		case shnetprofit:
			kpiName = "归属股东净利润";
			break;
		case deshnetprofit:
			kpiName = "归属股东净利润(扣非)";
			break;
		case netcashflow:
			kpiName="经营活动现金流量净额";
			break;
		case totalassets:
			kpiName="总资产";
			break;
		case totalliability:
			kpiName="总负债";
			break;
		case shequity:
			kpiName="股东权益";
			break;
		}
		return kpiName;
	}
}
