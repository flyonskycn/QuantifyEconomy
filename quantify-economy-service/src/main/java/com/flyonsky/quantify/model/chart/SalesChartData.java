package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 销售曲线图数据
 * @author Administrator
 *
 */
public class SalesChartData extends AbstractChartData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4955125191773943394L;

	// 证券名称
	private String securitiesName;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 销售数据组合:营业收入、营业利润、总利润、净利润
	private Map<String,LineChartData> sales = new HashMap<String,LineChartData>();
	
	// 利润率组合:毛利率:营业利润/营业收入、净利率
	private Map<String,LineChartData> profitMargins = new HashMap<String,LineChartData>();
	
	// 周转率组合:资产周转率:销售收入/总资产
	private Map<String,LineChartData> turnovers = new HashMap<String,LineChartData>();

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
	
	public void addKpi(String code, Integer category, Double kpi, EnumKpiType kpiType){
		String key = MessageFormat.format("{0}_{1}", code,this.kpiName(kpiType));
		LineChartData lineData = null;
		switch(kpiType){
		case revenue:
		case operprofit:
		case totalprofit:
		case netprofit:
			if(this.getSales().containsKey(key)){
				lineData = this.getSales().get(key);
			}else{
				lineData = new LineChartData();
				this.getSales().put(key, lineData);
			}
			break;
		case grossmargin:
		case netinterestrate:
			if(this.getProfitMargins().containsKey(key)){
				lineData = this.getProfitMargins().get(key);
			}else{
				lineData = new LineChartData();
				this.getProfitMargins().put(key, lineData);
			}
			break;
		case assetturnover:
			if(this.getTurnovers().containsKey(key)){
				lineData = this.getTurnovers().get(key);
			}else{
				lineData = new LineChartData();
				this.getTurnovers().put(key, lineData);
			}
			break;
		default:
			break;
		}
		if(lineData != null){
			this.category.add(category);
			lineData.setLineName(this.kpiName(kpiType));
			lineData.addData(category, kpi);
		}
	}

	public Map<String, LineChartData> getSales() {
		return sales;
	}

	public void setSales(Map<String, LineChartData> sales) {
		this.sales = sales;
	}

	public Map<String, LineChartData> getProfitMargins() {
		return profitMargins;
	}

	public void setProfitMargins(Map<String, LineChartData> profitMargins) {
		this.profitMargins = profitMargins;
	}

	public Map<String,LineChartData> getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(Map<String,LineChartData> turnovers) {
		this.turnovers = turnovers;
	}

}
