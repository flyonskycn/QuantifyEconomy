package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 证券同比数据
 * @author luowg
 *
 */
public class SalesRateChartData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4484311324608885683L;
	
	// 证券名称
	private String securitiesName;
	
	// 条目
	private List<Integer> category = new ArrayList<Integer>();
	
	// 营业收入同比增长率
	private List<Double> revenuerateMap = new ArrayList<Double>();
	
	// 营业利润同比增长率
	private List<Double> operprofitrateMap = new ArrayList<Double>();
	
	// 总利润同比增长率
	private List<Double> totalprofitrateMap = new ArrayList<Double>();
	
	// 净利润同比增长率
	private List<Double> netprofitrateMap = new ArrayList<Double>();
	
	public String getSecuritiesName() {
		return securitiesName;
	}

	public void setSecuritiesName(String securitiesName) {
		this.securitiesName = securitiesName;
	}

	public List<Double> getRevenuerateMap() {
		return revenuerateMap;
	}

	public void setRevenuerateMap(List<Double> revenuerateMap) {
		this.revenuerateMap = revenuerateMap;
	}
	
	public void addRevenuerate(Double revenuerate) {
		this.revenuerateMap.add(revenuerate);
	}

	public List<Double> getOperprofitrateMap() {
		return operprofitrateMap;
	}

	public void setOperprofitrateMap(List<Double> operprofitrateMap) {
		this.operprofitrateMap = operprofitrateMap;
	}
	
	public void addOperprofitrate(Double operprofitrate) {
		this.operprofitrateMap.add(operprofitrate);
	}

	public List<Double> getTotalprofitrateMap() {
		return totalprofitrateMap;
	}

	public void setTotalprofitrateMap(List<Double> totalprofitrateMap) {
		this.totalprofitrateMap = totalprofitrateMap;
	}
	
	public void addTotalprofitrate(Double totalprofitrate) {
		this.totalprofitrateMap.add(totalprofitrate);
	}

	public List<Double> getNetprofitrateMap() {
		return netprofitrateMap;
	}

	public void setNetprofitrateMap(List<Double> netprofitrateMap) {
		this.netprofitrateMap = netprofitrateMap;
	}
	
	public void addNetprofitrate(Double netprofitrate) {
		this.netprofitrateMap.add(netprofitrate);
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
}
