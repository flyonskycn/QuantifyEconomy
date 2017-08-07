package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 证券同比数据
 * @author luowg
 *
 */
public class SecuritiesRateChartsData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4484311324608885683L;
	
	// 证券名称
	private String securitiesName;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 营业收入同比增长率
	private LineChartData revenuerateLine = new LineChartData();
	
	// 营业利润同比增长率
	private LineChartData operprofitrateLine = new LineChartData();
	
	// 总利润同比增长率
	private LineChartData totalprofitrateLine = new LineChartData();
	
	// 净利润同比增长率
	private LineChartData netprofitrateLine = new LineChartData();
	
	// 归属股东净利润同比增长率
	private LineChartData shnetprofitrateLine = new LineChartData();
	
	// 扣非后归属股东净利润同比增长率
	private LineChartData deshnetprofitrateLine = new LineChartData();
	
	// 经营活动产生现金净额同比增长率
	private LineChartData netcashflowrateLine = new LineChartData();
	
	// 总资长同比增长率
	private LineChartData totalassetsrateLine = new LineChartData();
	
	// 总负债同比增长率
	private LineChartData totalliabilityrateLine = new LineChartData();
	
	// 归属股东权益同比增长率
	private LineChartData shequityrateLine = new LineChartData();
	
	// 每股收益同比增长率
	private LineChartData persharerateLine = new LineChartData();

	public String getSecuritiesName() {
		return securitiesName;
	}

	public void setSecuritiesName(String securitiesName) {
		this.securitiesName = securitiesName;
	}
	
	public void addRevenuerate(Integer category, Double revenuerate) {
		this.revenuerateLine.addData(category, revenuerate);
	}
	
	public void addOperprofitrate(Integer category, Double operprofitrate) {
		this.operprofitrateLine.addData(category, operprofitrate);
	}
	
	public void addTotalprofitrate(Integer category, Double totalprofitrate) {
		this.totalprofitrateLine.addData(category, totalprofitrate);
	}
	
	public void addNetprofitrate(Integer category, Double netprofitrate) {
		this.netprofitrateLine.addData(category, netprofitrate);
	}
	
	public void addShnetprofitrate(Integer category, Double shnetprofitrate) {
		this.shnetprofitrateLine.addData(category, shnetprofitrate);
	}
	
	public void addDeshnetprofitrate(Integer category, Double deshnetprofitrate) {
		this.deshnetprofitrateLine.addData(category, deshnetprofitrate);
	}
	
	public void addNetcashflowrate(Integer category, Double netcashflowrate) {
		this.netcashflowrateLine.addData(category, netcashflowrate);
	}
	
	public void addTotalassetsrate(Integer category, Double totalassetsrate) {
		this.totalassetsrateLine.addData(category, totalassetsrate);
	}
	
	public void addTotalliabilityrate(Integer category, Double totalliabilityrate) {
		this.totalliabilityrateLine.addData(category, totalliabilityrate);
	}
	
	public void addShequityrateMap(Integer category, Double shequityrate) {
		this.shequityrateLine.addData(category, shequityrate);
	}
	
	public void addPersharerate(Integer category, Double persharerate) {
		this.persharerateLine.addData(category, persharerate);
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
}
