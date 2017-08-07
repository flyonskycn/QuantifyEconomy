package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 销售同比数据
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
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 营业收入同比增长率
	private LineChartData revenuerateLine = new LineChartData();
	
	// 营业利润同比增长率
	private LineChartData operprofitrateLine = new LineChartData();
	
	// 总利润同比增长率
	private LineChartData totalprofitrateLine = new LineChartData();
	
	// 净利润同比增长率
	private LineChartData netprofitrateLine = new LineChartData();
	
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

	public SortedSet<Integer> getCategory() {
		return category;
	}

	public void setCategory(SortedSet<Integer> category) {
		this.category = category;
	}
	
	public void addCategory(Integer category) {
		this.category.add(category);
	}

	public LineChartData getRevenuerateLine() {
		return revenuerateLine;
	}

	public void setRevenuerateLine(LineChartData revenuerateLine) {
		this.revenuerateLine = revenuerateLine;
	}

	public LineChartData getOperprofitrateLine() {
		return operprofitrateLine;
	}

	public void setOperprofitrateLine(LineChartData operprofitrateLine) {
		this.operprofitrateLine = operprofitrateLine;
	}

	public LineChartData getTotalprofitrateLine() {
		return totalprofitrateLine;
	}

	public void setTotalprofitrateLine(LineChartData totalprofitrateLine) {
		this.totalprofitrateLine = totalprofitrateLine;
	}

	public LineChartData getNetprofitrateLine() {
		return netprofitrateLine;
	}

	public void setNetprofitrateLine(LineChartData netprofitrateLine) {
		this.netprofitrateLine = netprofitrateLine;
	}
}
