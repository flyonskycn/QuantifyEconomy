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
public class SalesChartData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4955125191773943394L;

	// 证券名称
	private String securitiesName;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 销售数据组合
	private Map<String,LineChartData> sales = new HashMap<String,LineChartData>();
	
	// 利润率组合
	private Map<String,LineChartData> profitMargins = new HashMap<String,LineChartData>();
	
	// 营业收入
	private LineChartData revenueLine = new LineChartData();
	
	// 营业利润
	private LineChartData operprofitLine = new LineChartData();
	
	// 总利润
	private LineChartData totalprofitLine = new LineChartData();
	
	// 净利润
	private LineChartData netprofitLine = new LineChartData();
	
	// 毛利率:营业利润/营业收入
	private LineChartData grossmarginLine = new LineChartData();
	
	// 净利率
	private LineChartData netinterestrateLine = new LineChartData();
	
	// 主营业务利润占比:营业利润/总利润
	private LineChartData mainprofitrateLine = new LineChartData();
	
	// 资产周转率:销售收入/总资产
	private LineChartData assetturnoverLine = new LineChartData();

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
	
	public void addCategory(Integer category) {
		this.category.add(category);
	}
	
	private void addKpi(String code, Integer category, Double kpi, EnumKpiType kpiType){
		String key = MessageFormat.format("{0}_{1}", code,category);
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
		}
	}
	
	public void addRevenue(Integer category, Double revenue) {
		this.revenueLine.addData(category,revenue);
	}
	
	public void addOperprofit(Integer category, Double operprofit) {
		this.operprofitLine.addData(category, operprofit);
	}
	
	public void addTotalprofit(Integer category, Double totalprofit) {
		this.totalprofitLine.addData(category,totalprofit);
	}
	
	public void addNetprofit(Integer category, Double netprofit) {
		this.netprofitLine.addData(category,netprofit);
	}
	
	public void addGrossmargin(Integer category, Double grossmargin) {
		this.grossmarginLine.addData(category, grossmargin);
	}
	
	public void addNetinterestrate(Integer category, Double netinterestrate) {
		this.netinterestrateLine.addData(category, netinterestrate);
	}
	
	public void addMainprofitrate(Integer category, Double mainprofitrate) {
		this.mainprofitrateLine.addData(category, mainprofitrate);
	}
	
	public void addAssetturnover(Integer category, Double assetturnover) {
		this.assetturnoverLine.addData(category, assetturnover);
	}

	public LineChartData getRevenueLine() {
		return revenueLine;
	}

	public void setRevenueLine(LineChartData revenueLine) {
		this.revenueLine = revenueLine;
	}

	public LineChartData getOperprofitLine() {
		return operprofitLine;
	}

	public void setOperprofitLine(LineChartData operprofitLine) {
		this.operprofitLine = operprofitLine;
	}

	public LineChartData getTotalprofitLine() {
		return totalprofitLine;
	}

	public void setTotalprofitLine(LineChartData totalprofitLine) {
		this.totalprofitLine = totalprofitLine;
	}

	public LineChartData getNetprofitLine() {
		return netprofitLine;
	}

	public void setNetprofitLine(LineChartData netprofitLine) {
		this.netprofitLine = netprofitLine;
	}

	public LineChartData getGrossmarginLine() {
		return grossmarginLine;
	}

	public void setGrossmarginLine(LineChartData grossmarginLine) {
		this.grossmarginLine = grossmarginLine;
	}

	public LineChartData getNetinterestrateLine() {
		return netinterestrateLine;
	}

	public void setNetinterestrateLine(LineChartData netinterestrateLine) {
		this.netinterestrateLine = netinterestrateLine;
	}

	public LineChartData getMainprofitrateLine() {
		return mainprofitrateLine;
	}

	public void setMainprofitrateLine(LineChartData mainprofitrateLine) {
		this.mainprofitrateLine = mainprofitrateLine;
	}

	public LineChartData getAssetturnoverLine() {
		return assetturnoverLine;
	}

	public void setAssetturnoverLine(LineChartData assetturnoverLine) {
		this.assetturnoverLine = assetturnoverLine;
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

}
