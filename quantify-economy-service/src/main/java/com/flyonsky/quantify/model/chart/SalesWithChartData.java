package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
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
	
	private Map<String, LineChartData> withs = new HashMap<String, LineChartData>();
	
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
		case operprofitwith:
		case totalprofitwith:
		case netprofitwith:
			if(this.getWiths().containsKey(key)){
				lineData = this.getWiths().get(key);
			}else{
				lineData = new LineChartData();
				this.getWiths().put(key, lineData);
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

	public Map<String, LineChartData> getWiths() {
		return withs;
	}

	public void setWiths(Map<String, LineChartData> withs) {
		this.withs = withs;
	}
}
