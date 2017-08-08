package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 销售同比数据
 * @author luowg
 *
 */
public class SalesWithChartData extends AbstractChartData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4484311324608885683L;
	
	// 证券名称
	private String securitiesName;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 销售收入同比
	private SortedMap<String,LineChartData> revenues = new TreeMap<String, LineChartData>();
	// 销售利润同比
	private SortedMap<String,LineChartData> operprofits = new TreeMap<String,LineChartData>();
	// 总利润同比
	private SortedMap<String,LineChartData> totalprofits = new TreeMap<String,LineChartData>();
	// 净利润同比
	private SortedMap<String, LineChartData> netprofits = new TreeMap<String, LineChartData>();
	
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

	@Override
	public void addKpi(String code, Integer category, Double kpi, EnumKpiType kpiType) {
		String key = MessageFormat.format("{0}_{1}", code,this.kpiName(kpiType));
		LineChartData lineData = null;
		switch(kpiType){
		case revenuewith:
			if(this.getRevenues().containsKey(key)){
				lineData = this.getRevenues().get(key);
			}else{
				lineData = new LineChartData();
				this.getRevenues().put(key, lineData);
			}
			break;
		case operprofitwith:
			if(this.getOperprofits().containsKey(key)){
				lineData = this.getOperprofits().get(key);
			}else{
				lineData = new LineChartData();
				this.getOperprofits().put(key, lineData);
			}
			break;
		case totalprofitwith:
			if(this.getTotalprofits().containsKey(key)){
				lineData = this.getTotalprofits().get(key);
			}else{
				lineData = new LineChartData();
				this.getTotalprofits().put(key, lineData);
			}
			break;
		case netprofitwith:
			if(this.getNetprofits().containsKey(key)){
				lineData = this.getNetprofits().get(key);
			}else{
				lineData = new LineChartData();
				this.getNetprofits().put(key, lineData);
			}
			break;
		default:
			break;
		}
		
		if(lineData != null){
			this.category.add(category);
			lineData.setLineName(code);
			lineData.setYunit("百分比(%)");
			lineData.addData(category, kpi);
		}
	}

	public SortedMap<String, LineChartData> getRevenues() {
		return revenues;
	}

	public void setRevenues(SortedMap<String, LineChartData> revenues) {
		this.revenues = revenues;
	}

	public SortedMap<String, LineChartData> getOperprofits() {
		return operprofits;
	}

	public void setOperprofits(SortedMap<String, LineChartData> operprofits) {
		this.operprofits = operprofits;
	}

	public SortedMap<String, LineChartData> getTotalprofits() {
		return totalprofits;
	}

	public void setTotalprofits(SortedMap<String, LineChartData> totalprofits) {
		this.totalprofits = totalprofits;
	}

	public SortedMap<String, LineChartData> getNetprofits() {
		return netprofits;
	}

	public void setNetprofits(SortedMap<String, LineChartData> netprofits) {
		this.netprofits = netprofits;
	}
}
