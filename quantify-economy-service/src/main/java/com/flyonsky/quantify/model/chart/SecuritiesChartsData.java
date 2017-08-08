package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 证券指标曲线图
 * @author luowg
 *
 */
public class SecuritiesChartsData extends AbstractChartData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8061201981444932681L;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private SortedMap<String, LineChartData> pershares = new TreeMap<String, LineChartData>();
	
	// 负债率:总负债/总资产
	private SortedMap<String, LineChartData> debtratios = new TreeMap<String, LineChartData>();
	
	// 每股净资产:归属股东权益/总股份数
	private SortedMap<String, LineChartData> netassetspershares = new TreeMap<String, LineChartData>();
	
	// 每股现金流
	private SortedMap<String, LineChartData> persharecashs = new TreeMap<String, LineChartData>();
	
	// 净资产收益率
	private SortedMap<String, LineChartData> netassetsprofits = new TreeMap<String, LineChartData>();

	public SortedSet<Integer> getCategory() {
		return category;
	}

	public void setCategory(SortedSet<Integer> category) {
		this.category = category;
	}

	@Override
	public void addKpi(String code, Integer category, Double kpi, EnumKpiType kpiType) {
		String key = MessageFormat.format("{0}_{1}", code,this.kpiName(kpiType));
		LineChartData lineData = null;
		switch(kpiType){
		case pershare:
			if(this.getPershares().containsKey(key)){
				lineData = this.getPershares().get(key);
			}else{
				lineData = new LineChartData();
				this.getPershares().put(key, lineData);
			}
			break;
		case debtratio:
			if(this.getDebtratios().containsKey(key)){
				lineData = this.getDebtratios().get(key);
			}else{
				lineData = new LineChartData();
				this.getDebtratios().put(key, lineData);
			}
			break;
		case netassetspershare:
			if(this.getNetassetspershares().containsKey(key)){
				lineData = this.getNetassetspershares().get(key);
			}else{
				lineData = new LineChartData();
				this.getNetassetspershares().put(key, lineData);
			}
			break;
		case persharecash:
			if(this.getPersharecashs().containsKey(key)){
				lineData = this.getPersharecashs().get(key);
			}else{
				lineData = new LineChartData();
				this.getPersharecashs().put(key, lineData);
			}
			break;
		case netAssetsProfitRate:
			if(this.getNetassetsprofits().containsKey(key)){
				lineData = this.getNetassetsprofits().get(key);
			}else{
				lineData = new LineChartData();
				this.getNetassetsprofits().put(key, lineData);
			}
			break;
		default:
			break;
		}
		if(lineData != null){
			this.category.add(category);
			lineData.setLineName(code);
			lineData.addData(category, kpi);
		}
	}

	public SortedMap<String, LineChartData> getPershares() {
		return pershares;
	}

	public void setPershares(SortedMap<String, LineChartData> pershares) {
		this.pershares = pershares;
	}

	public SortedMap<String, LineChartData> getDebtratios() {
		return debtratios;
	}

	public void setDebtratios(SortedMap<String, LineChartData> debtratios) {
		this.debtratios = debtratios;
	}

	public SortedMap<String, LineChartData> getNetassetspershares() {
		return netassetspershares;
	}

	public void setNetassetspershares(SortedMap<String, LineChartData> netassetspershares) {
		this.netassetspershares = netassetspershares;
	}

	public SortedMap<String, LineChartData> getPersharecashs() {
		return persharecashs;
	}

	public void setPersharecashs(SortedMap<String, LineChartData> persharecashs) {
		this.persharecashs = persharecashs;
	}

	public SortedMap<String, LineChartData> getNetassetsprofits() {
		return netassetsprofits;
	}

	public void setNetassetsprofits(SortedMap<String, LineChartData> netassetsprofits) {
		this.netassetsprofits = netassetsprofits;
	}
}
