package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 证券指标曲线图
 * @author luowg
 *
 */
public class SecuritiesChartsData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8061201981444932681L;

	// 证券名称
	private String securitiesName;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private LineChartData pershareLine = new LineChartData();
	
	// 负债率:总负债/总资产
	private LineChartData debtratioLine = new LineChartData();
	
	// 每股净资产:归属股东权益/总股份数
	private LineChartData netassetspershareLine = new LineChartData();
	
	// 每股现金流
	private LineChartData persharecashLine = new LineChartData();
	
	// 净资产收益率
	private LineChartData netassetsprofitLine = new LineChartData();

	public String getSecuritiesName() {
		return securitiesName;
	}

	public void setSecuritiesName(String securitiesName) {
		this.securitiesName = securitiesName;
	}

	public SortedSet<Integer> getCategory() {
		return category;
	}

	public void setCategory(SortedSet<Integer> category) {
		this.category = category;
	}
	
	public void addCategory(Integer category) {
		this.category.add(category);
	}
	
	public void addPershare(Integer category,Double pershare) {
		this.pershareLine.addData(category, pershare);
	}
	
	public void addDebtratio(Integer category, Double debtratio) {
		this.debtratioLine.addData(category, debtratio);
	}
	
	public void addNetassetspershare(Integer category, Double netassetspershare) {
		this.netassetspershareLine.addData(category, netassetspershare);
	}
	
	public void addPersharecash(Integer category, Double persharecash) {
		this.persharecashLine.addData(category, persharecash);
	}
	
	public void addNetassetsprofit(Integer category, Double netassetsprofit) {
		this.netassetsprofitLine.addData(category, netassetsprofit);
	}

	public LineChartData getPershareLine() {
		return pershareLine;
	}

	public void setPershareLine(LineChartData pershareLine) {
		this.pershareLine = pershareLine;
	}

	public LineChartData getDebtratioLine() {
		return debtratioLine;
	}

	public void setDebtratioLine(LineChartData debtratioLine) {
		this.debtratioLine = debtratioLine;
	}

	public LineChartData getNetassetspershareLine() {
		return netassetspershareLine;
	}

	public void setNetassetspershareLine(LineChartData netassetspershareLine) {
		this.netassetspershareLine = netassetspershareLine;
	}

	public LineChartData getPersharecashLine() {
		return persharecashLine;
	}

	public void setPersharecashLine(LineChartData persharecashLine) {
		this.persharecashLine = persharecashLine;
	}

	public LineChartData getNetassetsprofitLine() {
		return netassetsprofitLine;
	}

	public void setNetassetsprofitLine(LineChartData netassetsprofitLine) {
		this.netassetsprofitLine = netassetsprofitLine;
	}
}
