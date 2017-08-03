package com.flyonsky.quantify.model;

import java.io.Serializable;
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
	private List<Integer> category;
	
	// 营业收入同比增长率
	private List<Double> revenuerateMap;
	
	// 营业利润同比增长率
	private List<Double> operprofitrateMap;
	
	// 总利润同比增长率
	private List<Double> totalprofitrateMap;
	
	// 净利润同比增长率
	private List<Double> netprofitrateMap;
	
	// 归属股东净利润同比增长率
	private List<Double> shnetprofitrateMap;
	
	// 扣非后归属股东净利润同比增长率
	private List<Double> deshnetprofitrateMap;
	
	// 经营活动产生现金净额同比增长率
	private List<Double> netcashflowrateMap;
	
	// 总资长同比增长率
	private List<Double> totalassetsrateMap;
	
	// 总负债同比增长率
	private List<Double> totalliabilityrateMap;
	
	// 归属股东权益同比增长率
	private List<Double> shequityrateMap;
	
	// 每股收益同比增长率
	private List<Double> persharerateMap;

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

	public List<Double> getOperprofitrateMap() {
		return operprofitrateMap;
	}

	public void setOperprofitrateMap(List<Double> operprofitrateMap) {
		this.operprofitrateMap = operprofitrateMap;
	}

	public List<Double> getTotalprofitrateMap() {
		return totalprofitrateMap;
	}

	public void setTotalprofitrateMap(List<Double> totalprofitrateMap) {
		this.totalprofitrateMap = totalprofitrateMap;
	}

	public List<Double> getNetprofitrateMap() {
		return netprofitrateMap;
	}

	public void setNetprofitrateMap(List<Double> netprofitrateMap) {
		this.netprofitrateMap = netprofitrateMap;
	}

	public List<Double> getShnetprofitrateMap() {
		return shnetprofitrateMap;
	}

	public void setShnetprofitrateMap(List<Double> shnetprofitrateMap) {
		this.shnetprofitrateMap = shnetprofitrateMap;
	}

	public List<Double> getDeshnetprofitrateMap() {
		return deshnetprofitrateMap;
	}

	public void setDeshnetprofitrateMap(List<Double> deshnetprofitrateMap) {
		this.deshnetprofitrateMap = deshnetprofitrateMap;
	}

	public List<Double> getNetcashflowrateMap() {
		return netcashflowrateMap;
	}

	public void setNetcashflowrateMap(List<Double> netcashflowrateMap) {
		this.netcashflowrateMap = netcashflowrateMap;
	}

	public List<Double> getTotalassetsrateMap() {
		return totalassetsrateMap;
	}

	public void setTotalassetsrateMap(List<Double> totalassetsrateMap) {
		this.totalassetsrateMap = totalassetsrateMap;
	}

	public List<Double> getTotalliabilityrateMap() {
		return totalliabilityrateMap;
	}

	public void setTotalliabilityrateMap(List<Double> totalliabilityrateMap) {
		this.totalliabilityrateMap = totalliabilityrateMap;
	}

	public List<Double> getShequityrateMap() {
		return shequityrateMap;
	}

	public void setShequityrateMap(List<Double> shequityrateMap) {
		this.shequityrateMap = shequityrateMap;
	}

	public List<Double> getPersharerateMap() {
		return persharerateMap;
	}

	public void setPersharerateMap(List<Double> persharerateMap) {
		this.persharerateMap = persharerateMap;
	}

	public List<Integer> getCategory() {
		return category;
	}

	public void setCategory(List<Integer> category) {
		this.category = category;
	}
}
