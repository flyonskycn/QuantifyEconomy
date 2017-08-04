package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SecuritiesChartsData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8061201981444932681L;

	// 证券名称
	private String securitiesName;
	
	// 条目
	private List<Integer> category = new ArrayList<Integer>();
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private List<Double> pershareList = new ArrayList<Double>();
	
	// 负债率:总负债/总资产
	private List<Double> debtratioList = new ArrayList<Double>();
	
	// 每股净资产:归属股东权益/总股份数
	private List<Double> netassetspershareList = new ArrayList<Double>();
	
	// 每股现金流
	private List<Double> persharecashList = new ArrayList<Double>();
	
	// 净资产收益率
	private List<Double> netassetsprofitList = new ArrayList<Double>();

	public String getSecuritiesName() {
		return securitiesName;
	}

	public void setSecuritiesName(String securitiesName) {
		this.securitiesName = securitiesName;
	}

	public List<Integer> getCategory() {
		return category;
	}

	public void setCategory(List<Integer> category) {
		this.category = category;
	}
	
	public void addCategory(Integer category) {
		this.category.add(category);
	}

	public List<Double> getPershareList() {
		return pershareList;
	}

	public void setPershareList(List<Double> pershareList) {
		this.pershareList = pershareList;
	}
	
	public void addPershare(Double pershare) {
		this.pershareList.add(pershare);
	}

	public List<Double> getDebtratioList() {
		return debtratioList;
	}

	public void setDebtratioList(List<Double> debtratioList) {
		this.debtratioList = debtratioList;
	}
	
	public void addDebtratio(Double debtratio) {
		this.debtratioList.add(debtratio);
	}

	public List<Double> getNetassetspershareList() {
		return netassetspershareList;
	}

	public void setNetassetspershareList(List<Double> netassetspershareList) {
		this.netassetspershareList = netassetspershareList;
	}
	
	public void addNetassetspershare(Double netassetspershare) {
		this.netassetspershareList.add(netassetspershare);
	}

	public List<Double> getPersharecashList() {
		return persharecashList;
	}

	public void setPersharecashList(List<Double> persharecashList) {
		this.persharecashList = persharecashList;
	}
	
	public void addPersharecash(Double persharecash) {
		this.persharecashList.add(persharecash);
	}

	public List<Double> getNetassetsprofitList() {
		return netassetsprofitList;
	}

	public void setNetassetsprofitList(List<Double> netassetsprofitList) {
		this.netassetsprofitList = netassetsprofitList;
	}
	
	public void addNetassetsprofit(Double netassetsprofit) {
		this.netassetsprofitList.add(netassetsprofit);
	}
}
