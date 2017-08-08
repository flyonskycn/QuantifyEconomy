package com.flyonsky.quantify.model.chart;

import com.flyonsky.quantify.model.Description;

/**
 * 指标类型
 * @author Administrator
 *
 */
public enum EnumKpiType {
	/**
	 * 营业收入
	 */
	@Description("营业收入")
	revenue,
	/**
	 * 营业收入(同比)
	 */
	@Description("营业收入(同比)")
	revenuewith,
	/**
	 * 营业利润
	 */
	@Description("营业利润")
	operprofit,
	/**
	 * 营业利润(同比)
	 */
	@Description("营业利润(同比)")
	operprofitwith,
	/**
	 * 利润总额
	 */
	@Description("利润总额")
	totalprofit,
	/**
	 * 利润总额(同比)
	 */
	@Description("利润总额(同比)")
	totalprofitwith,
	/**
	 * 净利润
	 */
	@Description("净利润")
	netprofit,
	/**
	 * 净利润(同比)
	 */
	@Description("净利润(同比)")
	netprofitwith,
	/**
	 * 归属股东净利润
	 */
	@Description("归属股东净利润")
	shnetprofit,
	/**
	 * 归属股东净利润(同比)
	 */
	@Description("归属股东净利润(同比)")
	shnetprofitwith,
	/**
	 * 归属股东净利润(扣非)
	 */
	@Description("归属股东净利润(扣非)")
	deshnetprofit,
	/**
	 * 扣非股东净利润(同比)
	 */
	@Description("扣非股东净利润(同比)")
	deshnetprofitwith,
	/**
	 * 经营活动现金流量净额
	 */
	@Description("现金流量净额")
	netcashflow,
	/**
	 * 经营活动现金流量净额(同比)
	 */
	@Description("现金流量净额(同比)")
	netcashflowwith,
	/**
	 * 总资产
	 */
	@Description("总资产")
	totalassets,
	/**
	 * 总资产(同比)
	 */
	@Description("总资产(同比)")
	totalassetswith,
	/**
	 * 总负债
	 */
	@Description("总负债")
	totalliability,
	/**
	 * 总负债(同比)
	 */
	@Description("总负债(同比)")
	totalliabilitywith,
	/**
	 * 股东权益
	 */
	@Description("股东权益")
	shequity,
	/**
	 * 股东权益(同比)
	 */
	@Description("股东权益(同比)")
	shequitywith,
	/**
	 * 股份总数
	 */
	@Description("股份总数")
	totalshares,
	/**
	 * 股份总数(同比)
	 */
	@Description("股份总数(同比)")
	totalshareswith,
	/**
	 * 每股收益
	 */
	@Description("每股收益")
	pershare,
	/**
	 * 每股收益(同比)
	 */
	@Description("每股收益(同比)")
	persharewith,
	/**
	 * 资产周转率
	 */
	@Description("资产周转率")
	assetturnover,
	/**
	 * 毛利率
	 */
	@Description("毛利率")
	grossmargin,
	/**
	 * 净利率
	 */
	@Description("净利率")
	netinterestrate,
	/**
	 * 主营业务利润占比
	 */
	@Description("主营业务利润占比")
	mainprofitrate,
	/**
	 * 负债率
	 */
	@Description("负债率")
	debtratio,
	/**
	 * 每股净资产
	 */
	@Description("每股净资产")
	netassetspershare,
	/**
	 * 总资产收益率
	 */
	@Description("总资产收益率")
	totalassetsprofitrate,
	/**
	 * 净资产收益率
	 */
	@Description("净资产收益率")
	netAssetsProfitRate,
	/**
	 * 每股现金净额
	 */
	@Description("每股现金净额")
	persharecash
}
