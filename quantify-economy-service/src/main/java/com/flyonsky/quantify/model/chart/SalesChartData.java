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
	
	// 营业收入
	private Map<String,LineChartData> revenues = new HashMap<String,LineChartData>();
	
	// 营业利润
	private Map<String,LineChartData> operprofits = new HashMap<String,LineChartData>();
	
	// 总利润
	private Map<String,LineChartData> totalprofits = new HashMap<String,LineChartData>();
	
	// 净利润
	private Map<String,LineChartData> netprofits = new HashMap<String,LineChartData>();
	
	// 毛利率
	private Map<String,LineChartData> grossmargins = new HashMap<String,LineChartData>();
	
	// 净利率
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
			if(this.getRevenues().containsKey(key)){
				lineData = this.getRevenues().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("金额(RMB)");
				this.getRevenues().put(key, lineData);
			}
			break;
		case operprofit:
			if(this.getOperprofits().containsKey(key)){
				lineData = this.getOperprofits().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("金额(RMB)");
				this.getOperprofits().put(key, lineData);
			}
			break;
		case totalprofit:
			if(this.getTotalprofits().containsKey(key)){
				lineData = this.getTotalprofits().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("金额(RMB)");
				this.getTotalprofits().put(key, lineData);
			}
			break;
		case netprofit:
			if(this.getNetprofits().containsKey(key)){
				lineData = this.getNetprofits().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("金额(RMB)");
				this.getNetprofits().put(key, lineData);
			}
			break;
		case grossmargin:
			if(this.getGrossmargins().containsKey(key)){
				lineData = this.getGrossmargins().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("金额(RMB)");
				this.getGrossmargins().put(key, lineData);
			}
			break;
		case netinterestrate:
			if(this.getProfitMargins().containsKey(key)){
				lineData = this.getProfitMargins().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("金额(RMB)");
				this.getProfitMargins().put(key, lineData);
			}
			break;
		case assetturnover:
			if(this.getTurnovers().containsKey(key)){
				lineData = this.getTurnovers().get(key);
			}else{
				lineData = new LineChartData();
				lineData.setYunit("次");
				this.getTurnovers().put(key, lineData);
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

	public Map<String, LineChartData> getRevenues() {
		return revenues;
	}

	public void setRevenues(Map<String, LineChartData> revenues) {
		this.revenues = revenues;
	}

	public Map<String, LineChartData> getOperprofits() {
		return operprofits;
	}

	public void setOperprofits(Map<String, LineChartData> operprofits) {
		this.operprofits = operprofits;
	}

	public Map<String, LineChartData> getTotalprofits() {
		return totalprofits;
	}

	public void setTotalprofits(Map<String, LineChartData> totalprofits) {
		this.totalprofits = totalprofits;
	}

	public Map<String, LineChartData> getNetprofits() {
		return netprofits;
	}

	public void setNetprofits(Map<String, LineChartData> netprofits) {
		this.netprofits = netprofits;
	}

	public Map<String,LineChartData> getGrossmargins() {
		return grossmargins;
	}

	public void setGrossmargins(Map<String,LineChartData> grossmargins) {
		this.grossmargins = grossmargins;
	}

}
