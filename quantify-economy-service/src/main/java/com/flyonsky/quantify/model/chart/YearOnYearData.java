package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 证券同比数据
 * @author luowg
 *
 */
public class YearOnYearData implements Serializable{

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
	
	// 归属股东净利润同比增长率
	private List<Double> shnetprofitrateMap = new ArrayList<Double>();
	
	// 扣非后归属股东净利润同比增长率
	private List<Double> deshnetprofitrateMap = new ArrayList<Double>();
	
	// 经营活动产生现金净额同比增长率
	private List<Double> netcashflowrateMap = new ArrayList<Double>();
	
	// 总资长同比增长率
	private List<Double> totalassetsrateMap = new ArrayList<Double>();
	
	// 总负债同比增长率
	private List<Double> totalliabilityrateMap = new ArrayList<Double>();
	
	// 归属股东权益同比增长率
	private List<Double> shequityrateMap = new ArrayList<Double>();
	
	// 每股收益同比增长率
	private List<Double> persharerateMap = new ArrayList<Double>();

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

	public List<Double> getShnetprofitrateMap() {
		return shnetprofitrateMap;
	}

	public void setShnetprofitrateMap(List<Double> shnetprofitrateMap) {
		this.shnetprofitrateMap = shnetprofitrateMap;
	}
	
	public void addShnetprofitrate(Double shnetprofitrate) {
		this.shnetprofitrateMap.add(shnetprofitrate);
	}

	public List<Double> getDeshnetprofitrateMap() {
		return deshnetprofitrateMap;
	}

	public void setDeshnetprofitrateMap(List<Double> deshnetprofitrateMap) {
		this.deshnetprofitrateMap = deshnetprofitrateMap;
	}
	
	public void addDeshnetprofitrate(Double deshnetprofitrate) {
		this.deshnetprofitrateMap.add(deshnetprofitrate);
	}

	public List<Double> getNetcashflowrateMap() {
		return netcashflowrateMap;
	}

	public void setNetcashflowrateMap(List<Double> netcashflowrateMap) {
		this.netcashflowrateMap = netcashflowrateMap;
	}
	
	public void addNetcashflowrate(Double netcashflowrate) {
		this.netcashflowrateMap.add(netcashflowrate);
	}

	public List<Double> getTotalassetsrateMap() {
		return totalassetsrateMap;
	}

	public void setTotalassetsrateMap(List<Double> totalassetsrateMap) {
		this.totalassetsrateMap = totalassetsrateMap;
	}
	
	public void addTotalassetsrate(Double totalassetsrate) {
		this.totalassetsrateMap.add(totalassetsrate);
	}

	public List<Double> getTotalliabilityrateMap() {
		return totalliabilityrateMap;
	}

	public void setTotalliabilityrateMap(List<Double> totalliabilityrateMap) {
		this.totalliabilityrateMap = totalliabilityrateMap;
	}
	
	public void addTotalliabilityrate(Double totalliabilityrate) {
		this.totalliabilityrateMap.add(totalliabilityrate);
	}

	public List<Double> getShequityrateMap() {
		return shequityrateMap;
	}

	public void setShequityrateMap(List<Double> shequityrateMap) {
		this.shequityrateMap = shequityrateMap;
	}
	
	public void addShequityrateMap(Double shequityrate) {
		this.shequityrateMap.add(shequityrate);
	}

	public List<Double> getPersharerateMap() {
		return persharerateMap;
	}

	public void setPersharerateMap(List<Double> persharerateMap) {
		this.persharerateMap = persharerateMap;
	}
	
	public void addPersharerate(Double persharerate) {
		this.persharerateMap.add(persharerate);
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
