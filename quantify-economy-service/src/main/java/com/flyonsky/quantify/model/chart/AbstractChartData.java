package com.flyonsky.quantify.model.chart;

public abstract class AbstractChartData {

	public String kpiName(EnumKpiType kpiType){
		String kpiName = null;
		switch(kpiType){
		case revenue:
			kpiName = "营业收入";
			break;
		case operprofit:
			kpiName = "营业利润";
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
		case totalshares:
			kpiName="股份总数";
			break;
		case pershare:
			kpiName="每股收益";
			break;
		case assetturnover:
			kpiName="资产周转率";
			break;
		case grossmargin:
			kpiName="毛利率";
			break;
		case netinterestrate:
			kpiName="净利率";
			break;
		case mainprofitrate:
			kpiName="主营业务利润占比";
			break;
		case debtratio:
			kpiName="负债率";
			break;
		case netassetspershare:
			kpiName="每股净资产";
			break;
		case totalassetsprofitrate:
			kpiName="总资产收益率";
			break;
		case netAssetsProfitRate:
			kpiName="净资产收益率";
			break;
		}
		return kpiName;
	}
}
