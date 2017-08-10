package com.flyonsky.quantify.entity;

import java.io.Serializable;

/**
 * 销售图表实体对象
 * @author Administrator
 *
 */
public class SalesCharts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3433979621265770506L;
	
	// 证券代码
	private String code;
	
	// 年
	private int year;
	
	// 证券名称
	private String name;
	
	// 营业收入
	private double revenue;
	
	// 营业利润
	private double operprofit;
	
	// 总利润
	private double totalprofit;
	
	// 净利润
	private double netprofit;
	
	// 毛利率:营业利润/营业收入
	private double grossmargin;
	
	// 净利率:净利润/营业收入
	private double netinterestrate;
	
	// 主营业务利润占比:营业利润/总利润
	private double mainprofitrate;
	
	// 资产周转次数:销售收入/总资产
	private double assetturnover;

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

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getOperprofit() {
		return operprofit;
	}

	public void setOperprofit(double operprofit) {
		this.operprofit = operprofit;
	}

	public double getTotalprofit() {
		return totalprofit;
	}

	public void setTotalprofit(double totalprofit) {
		this.totalprofit = totalprofit;
	}

	public double getNetprofit() {
		return netprofit;
	}

	public void setNetprofit(double netprofit) {
		this.netprofit = netprofit;
	}

	public double getGrossmargin() {
		return grossmargin;
	}

	public void setGrossmargin(double grossmargin) {
		this.grossmargin = grossmargin;
	}

	public double getNetinterestrate() {
		return netinterestrate;
	}

	public void setNetinterestrate(double netinterestrate) {
		this.netinterestrate = netinterestrate;
	}

	public double getMainprofitrate() {
		return mainprofitrate;
	}

	public void setMainprofitrate(double mainprofitrate) {
		this.mainprofitrate = mainprofitrate;
	}

	public double getAssetturnover() {
		return assetturnover;
	}

	public void setAssetturnover(double assetturnover) {
		this.assetturnover = assetturnover;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
