package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class SecuritiesLineData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2520581333669695633L;

	// 证券代码
	private String code;
	
	// 年
	private int year;
	
	// 营业收入
	private Double revenue;
	
	// 营业利润
	private Double operprofit;
	
	// 总利润
	private Double totalprofit;
	
	// 净利润
	private Double netprofit;
	
	// 归属股东净利润
	private Double shnetprofit;
	
	// 扣非后归属股东净利润
	private Double deshnetprofit;
	
	// 经营活动产生现金净额
	private Double netcashflow;
	
	// 总资产
	private Double totalassets;
	
	// 总负债
	private Double totalliability;
	
	// 归属股东权益
	private Double shequity;
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private Double pershare;
	
	// 资产周转率:销售收入/总资产
	private Double assetTurnover;
	
	// 毛利率:营业利润/营业收入
	private Double grossMargin;
	
	// 主营业务利润占比:营业利润/总利润
	private Double mainProfitRate;
	
	// 负债率:总负债/总资产
	private Double debtRatio;
	
	// 每股净资产:归属股东权益/总股份数
	private Double netAssetsPershare;
	
	// 总资产收益率:扣非后归属股东净利润/总资产
	private Double totalAssetsProfitRate;
	
	// 净资产收益率:扣非后归属股东净利润/归属股东权益
	private Double netAssetsProfitRate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public Double getOperprofit() {
		return operprofit;
	}

	public void setOperprofit(Double operprofit) {
		this.operprofit = operprofit;
	}

	public Double getTotalprofit() {
		return totalprofit;
	}

	public void setTotalprofit(Double totalprofit) {
		this.totalprofit = totalprofit;
	}

	public Double getNetprofit() {
		return netprofit;
	}

	public void setNetprofit(Double netprofit) {
		this.netprofit = netprofit;
	}

	public Double getShnetprofit() {
		return shnetprofit;
	}

	public void setShnetprofit(Double shnetprofit) {
		this.shnetprofit = shnetprofit;
	}

	public Double getDeshnetprofit() {
		return deshnetprofit;
	}

	public void setDeshnetprofit(Double deshnetprofit) {
		this.deshnetprofit = deshnetprofit;
	}

	public Double getNetcashflow() {
		return netcashflow;
	}

	public void setNetcashflow(Double netcashflow) {
		this.netcashflow = netcashflow;
	}

	public Double getTotalassets() {
		return totalassets;
	}

	public void setTotalassets(Double totalassets) {
		this.totalassets = totalassets;
	}

	public Double getTotalliability() {
		return totalliability;
	}

	public void setTotalliability(Double totalliability) {
		this.totalliability = totalliability;
	}

	public Double getShequity() {
		return shequity;
	}

	public void setShequity(Double shequity) {
		this.shequity = shequity;
	}

	public Double getPershare() {
		return pershare;
	}

	public void setPershare(Double pershare) {
		this.pershare = pershare;
	}

	public Double getAssetTurnover() {
		return assetTurnover;
	}

	public void setAssetTurnover(Double assetTurnover) {
		this.assetTurnover = assetTurnover;
	}

	public Double getGrossMargin() {
		return grossMargin;
	}

	public void setGrossMargin(Double grossMargin) {
		this.grossMargin = grossMargin;
	}

	public Double getMainProfitRate() {
		return mainProfitRate;
	}

	public void setMainProfitRate(Double mainProfitRate) {
		this.mainProfitRate = mainProfitRate;
	}

	public Double getDebtRatio() {
		return debtRatio;
	}

	public void setDebtRatio(Double debtRatio) {
		this.debtRatio = debtRatio;
	}

	public Double getNetAssetsPershare() {
		return netAssetsPershare;
	}

	public void setNetAssetsPershare(Double netAssetsPershare) {
		this.netAssetsPershare = netAssetsPershare;
	}

	public Double getTotalAssetsProfitRate() {
		return totalAssetsProfitRate;
	}

	public void setTotalAssetsProfitRate(Double totalAssetsProfitRate) {
		this.totalAssetsProfitRate = totalAssetsProfitRate;
	}

	public Double getNetAssetsProfitRate() {
		return netAssetsProfitRate;
	}

	public void setNetAssetsProfitRate(Double netAssetsProfitRate) {
		this.netAssetsProfitRate = netAssetsProfitRate;
	}
}
