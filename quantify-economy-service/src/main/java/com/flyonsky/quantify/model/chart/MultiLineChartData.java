package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 证券曲线图数据
 * @author Administrator
 *
 */
public class MultiLineChartData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4955125191773943394L;

	// 证券名称
	private String securitiesName;
	
	// 条目
	private SortedSet<Integer> category = new TreeSet<Integer>();
	
	// 营业收入
	private LineChartData revenueLine = new LineChartData();
	
	// 营业利润
	private LineChartData operprofitLine = new LineChartData();
	
	// 总利润
	private LineChartData totalprofitLine = new LineChartData();
	
	// 净利润
	private LineChartData netprofitLine = new LineChartData();
	
	// 归属股东净利润
	private LineChartData shnetprofitLine = new LineChartData();
	
	// 扣非后归属股东净利润
	private LineChartData deshnetprofitLine = new LineChartData();
	
	// 经营活动产生现金净额
	private LineChartData netcashflowLine = new LineChartData();
	
	// 总资产
	private LineChartData totalassetsLine = new LineChartData();
	
	// 总负债
	private LineChartData totalliabilityLine = new LineChartData();
	
	// 归属股东权益
	private LineChartData shequityLine = new LineChartData();
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private LineChartData pershareLine = new LineChartData();
	
	// 资产周转率:销售收入/总资产
	private LineChartData assetTurnoverLine = new LineChartData();
	
	// 毛利率:营业利润/营业收入
	private LineChartData grossMarginLine = new LineChartData();
	
	// 主营业务利润占比:营业利润/总利润
	private LineChartData mainProfitRateLine = new LineChartData();
	
	// 负债率:总负债/总资产
	private LineChartData debtRatioLine = new LineChartData();
	
	// 每股净资产:归属股东权益/总股份数
	private LineChartData netAssetsPershareLine = new LineChartData();
	
	// 总资产收益率:扣非后归属股东净利润/总资产
	private LineChartData totalAssetsProfitRateLine = new LineChartData();
	
	// 净资产收益率:扣非后归属股东净利润/归属股东权益
	private LineChartData netAssetsProfitRateLine = new LineChartData();

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
	
	public void addRevenue(Integer category, Double revenue) {
		this.revenueLine.addData(category, revenue);
	}
	
	public void addOperprofit(Integer category, Double operprofit) {
		this.operprofitLine.addData(category, operprofit);
	}
	
	public void addTotalprofit(Integer category, Double totalprofit) {
		this.totalprofitLine.addData(category, totalprofit);
	}
	
	public void addNetprofit(Integer category, Double netprofit) {
		this.netprofitLine.addData(category, netprofit);
	}
	
	public void addShnetprofit(Integer category, Double shnetprofit) {
		this.shnetprofitLine.addData(category, shnetprofit);
	}
	
	public void addDeshnetprofit(Integer category, Double deshnetprofit) {
		this.deshnetprofitLine.addData(category, deshnetprofit);
	}
	
	public void addNetcashflow(Integer category, Double netcashflow) {
		this.netcashflowLine.addData(category, netcashflow);
	}
	
	public void addTotalassets(Integer category, Double totalassets) {
		this.totalassetsLine.addData(category, totalassets);
	}
	
	public void addTotalliability(Integer category, Double totalliability) {
		this.totalliabilityLine.addData(category, totalliability);
	}
	
	public void addShequity(Integer category, Double shequity) {
		this.shequityLine.addData(category, shequity);
	}
	
	public void addPershare(Integer category, Double pershare) {
		this.pershareLine.addData(category, pershare);
	}
	
	public void addAssetTurnover(Integer category, Double assetTurnover) {
		this.assetTurnoverLine.addData(category, assetTurnover);
	}
	
	public void addGrossMargin(Integer category, Double grossMargin) {
		this.grossMarginLine.addData(category, grossMargin);
	}
	
	public void addMainProfitRate(Integer category, Double mainProfitRate) {
		this.mainProfitRateLine.addData(category, mainProfitRate);
	}
	
	public void addDebtRatio(Integer category, Double debtRatio) {
		this.debtRatioLine.addData(category, debtRatio);
	}
	
	public void addNetAssetsPershare(Integer category, Double netAssetsPershare) {
		this.netAssetsPershareLine.addData(category, netAssetsPershare);
	}
	
	public void addTotalAssetsProfitRate(Integer category, Double totalAssetsProfitRate) {
		this.totalAssetsProfitRateLine.addData(category, totalAssetsProfitRate);
	}
	
	public void addNetAssetsProfitRate(Integer category, Double netAssetsProfitRate) {
		this.netAssetsProfitRateLine.addData(category, netAssetsProfitRate);
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

	public LineChartData getShnetprofitLine() {
		return shnetprofitLine;
	}

	public void setShnetprofitLine(LineChartData shnetprofitLine) {
		this.shnetprofitLine = shnetprofitLine;
	}

	public LineChartData getDeshnetprofitLine() {
		return deshnetprofitLine;
	}

	public void setDeshnetprofitLine(LineChartData deshnetprofitLine) {
		this.deshnetprofitLine = deshnetprofitLine;
	}

	public LineChartData getNetcashflowLine() {
		return netcashflowLine;
	}

	public void setNetcashflowLine(LineChartData netcashflowLine) {
		this.netcashflowLine = netcashflowLine;
	}

	public LineChartData getTotalassetsLine() {
		return totalassetsLine;
	}

	public void setTotalassetsLine(LineChartData totalassetsLine) {
		this.totalassetsLine = totalassetsLine;
	}

	public LineChartData getTotalliabilityLine() {
		return totalliabilityLine;
	}

	public void setTotalliabilityLine(LineChartData totalliabilityLine) {
		this.totalliabilityLine = totalliabilityLine;
	}

	public LineChartData getShequityLine() {
		return shequityLine;
	}

	public void setShequityLine(LineChartData shequityLine) {
		this.shequityLine = shequityLine;
	}

	public LineChartData getPershareLine() {
		return pershareLine;
	}

	public void setPershareLine(LineChartData pershareLine) {
		this.pershareLine = pershareLine;
	}

	public LineChartData getAssetTurnoverLine() {
		return assetTurnoverLine;
	}

	public void setAssetTurnoverLine(LineChartData assetTurnoverLine) {
		this.assetTurnoverLine = assetTurnoverLine;
	}

	public LineChartData getGrossMarginLine() {
		return grossMarginLine;
	}

	public void setGrossMarginLine(LineChartData grossMarginLine) {
		this.grossMarginLine = grossMarginLine;
	}

	public LineChartData getMainProfitRateLine() {
		return mainProfitRateLine;
	}

	public void setMainProfitRateLine(LineChartData mainProfitRateLine) {
		this.mainProfitRateLine = mainProfitRateLine;
	}

	public LineChartData getDebtRatioLine() {
		return debtRatioLine;
	}

	public void setDebtRatioLine(LineChartData debtRatioLine) {
		this.debtRatioLine = debtRatioLine;
	}

	public LineChartData getNetAssetsPershareLine() {
		return netAssetsPershareLine;
	}

	public void setNetAssetsPershareLine(LineChartData netAssetsPershareLine) {
		this.netAssetsPershareLine = netAssetsPershareLine;
	}

	public LineChartData getTotalAssetsProfitRateLine() {
		return totalAssetsProfitRateLine;
	}

	public void setTotalAssetsProfitRateLine(LineChartData totalAssetsProfitRateLine) {
		this.totalAssetsProfitRateLine = totalAssetsProfitRateLine;
	}

	public LineChartData getNetAssetsProfitRateLine() {
		return netAssetsProfitRateLine;
	}

	public void setNetAssetsProfitRateLine(LineChartData netAssetsProfitRateLine) {
		this.netAssetsProfitRateLine = netAssetsProfitRateLine;
	}
}
