package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class SecuritiesCharts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3015448772303148724L;

	// 证券代码
	private String code;
	
	// 年
	private int year;
	
	// 证券名称
	private String name;
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private double pershare;
	
	// 负债率:总负债/总资产
	private double debtratio;
	
	// 每股净资产:归属股东权益/总股份数
	private double netassetspershare;
	
	// 每股现金流
	private double persharecash;
	
	// 净资产收益率
	private double netassetsprofit;

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

	public Double getPershare() {
		return pershare;
	}

	public void setPershare(Double pershare) {
		this.pershare = pershare;
	}

	public double getDebtratio() {
		return debtratio;
	}

	public void setDebtratio(double debtratio) {
		this.debtratio = debtratio;
	}

	public double getNetassetspershare() {
		return netassetspershare;
	}

	public void setNetassetspershare(double netassetspershare) {
		this.netassetspershare = netassetspershare;
	}

	public double getPersharecash() {
		return persharecash;
	}

	public void setPersharecash(double persharecash) {
		this.persharecash = persharecash;
	}

	public double getNetassetsprofit() {
		return netassetsprofit;
	}

	public void setNetassetsprofit(double netassetsprofit) {
		this.netassetsprofit = netassetsprofit;
	}

	public void setPershare(double pershare) {
		this.pershare = pershare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
