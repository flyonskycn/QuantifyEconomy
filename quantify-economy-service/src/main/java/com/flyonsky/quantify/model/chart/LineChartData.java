package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 证券曲线图数据
 * @author Administrator
 *
 */
public class LineChartData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4955125191773943394L;

	// 证券名称
	private String securitiesName;
	
	// 条目
	private List<Integer> category = new ArrayList<Integer>();
	
	// 营业收入
	private List<Double> revenueList = new ArrayList<Double>();
	
	// 营业利润
	private List<Double> operprofitList = new ArrayList<Double>();
	
	// 总利润
	private List<Double> totalprofitList = new ArrayList<Double>();
	
	// 净利润
	private List<Double> netprofitList = new ArrayList<Double>();
	
	// 归属股东净利润
	private List<Double> shnetprofitList = new ArrayList<Double>();
	
	// 扣非后归属股东净利润
	private List<Double> deshnetprofitList = new ArrayList<Double>();
	
	// 经营活动产生现金净额
	private List<Double> netcashflowList = new ArrayList<Double>();
	
	// 总资产
	private List<Double> totalassetsList = new ArrayList<Double>();
	
	// 总负债
	private List<Double> totalliabilityList = new ArrayList<Double>();
	
	// 归属股东权益
	private List<Double> shequityList = new ArrayList<Double>();
	
	// 每股收益:扣非后归属股东净利润/总股份数
	private List<Double> pershareList = new ArrayList<Double>();
	
	// 资产周转率:销售收入/总资产
	private List<Double> assetTurnoverList = new ArrayList<Double>();
	
	// 毛利率:营业利润/营业收入
	private List<Double> grossMarginList = new ArrayList<Double>();
	
	// 主营业务利润占比:营业利润/总利润
	private List<Double> mainProfitRateList = new ArrayList<Double>();
	
	// 负债率:总负债/总资产
	private List<Double> debtRatioList = new ArrayList<Double>();
	
	// 每股净资产:归属股东权益/总股份数
	private List<Double> netAssetsPershareList = new ArrayList<Double>();
	
	// 总资产收益率:扣非后归属股东净利润/总资产
	private List<Double> totalAssetsProfitRateList = new ArrayList<Double>();
	
	// 净资产收益率:扣非后归属股东净利润/归属股东权益
	private List<Double> netAssetsProfitRateList = new ArrayList<Double>();

	public String getSecuritiesName() {
		return securitiesName;
	}

	public void setSecuritiesName(String securitiesName) {
		this.securitiesName = securitiesName;
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

	public List<Double> getRevenueList() {
		return revenueList;
	}

	public void setRevenueList(List<Double> revenueList) {
		this.revenueList = revenueList;
	}
	
	public void addRevenue(Double revenue) {
		this.revenueList.add(revenue);
	}

	public List<Double> getOperprofitList() {
		return operprofitList;
	}

	public void setOperprofitList(List<Double> operprofitList) {
		this.operprofitList = operprofitList;
	}
	
	public void addOperprofit(Double operprofit) {
		this.operprofitList.add(operprofit);
	}

	public List<Double> getTotalprofitList() {
		return totalprofitList;
	}

	public void setTotalprofitList(List<Double> totalprofitList) {
		this.totalprofitList = totalprofitList;
	}
	
	public void addTotalprofit(Double totalprofit) {
		this.totalprofitList.add(totalprofit);
	}

	public List<Double> getNetprofitList() {
		return netprofitList;
	}

	public void setNetprofitList(List<Double> netprofitList) {
		this.netprofitList = netprofitList;
	}
	
	public void addNetprofit(Double netprofit) {
		this.netprofitList.add(netprofit);
	}

	public List<Double> getShnetprofitList() {
		return shnetprofitList;
	}

	public void setShnetprofitList(List<Double> shnetprofitList) {
		this.shnetprofitList = shnetprofitList;
	}
	
	public void addShnetprofit(Double shnetprofit) {
		this.shnetprofitList.add(shnetprofit);
	}

	public List<Double> getDeshnetprofitList() {
		return deshnetprofitList;
	}

	public void setDeshnetprofitList(List<Double> deshnetprofitList) {
		this.deshnetprofitList = deshnetprofitList;
	}
	
	public void addDeshnetprofit(Double deshnetprofit) {
		this.deshnetprofitList.add(deshnetprofit);
	}

	public List<Double> getNetcashflowList() {
		return netcashflowList;
	}

	public void setNetcashflowList(List<Double> netcashflowList) {
		this.netcashflowList = netcashflowList;
	}
	
	public void addNetcashflow(Double netcashflow) {
		this.netcashflowList.add(netcashflow);
	}

	public List<Double> getTotalassetsList() {
		return totalassetsList;
	}

	public void setTotalassetsList(List<Double> totalassetsList) {
		this.totalassetsList = totalassetsList;
	}
	
	public void addTotalassets(Double totalassets) {
		this.totalassetsList.add(totalassets);
	}

	public List<Double> getTotalliabilityList() {
		return totalliabilityList;
	}

	public void setTotalliabilityList(List<Double> totalliabilityList) {
		this.totalliabilityList = totalliabilityList;
	}
	
	public void addTotalliability(Double totalliability) {
		this.totalliabilityList.add(totalliability);
	}

	public List<Double> getShequityList() {
		return shequityList;
	}

	public void setShequityList(List<Double> shequityList) {
		this.shequityList = shequityList;
	}
	
	public void addShequity(Double shequity) {
		this.shequityList.add(shequity);
	}

	public List<Double> getPershareList() {
		return pershareList;
	}

	public void setPershareList(List<Double> pershareList) {
		this.pershareList = pershareList;
	}
	
	public void addPershare(Double pershare) {
		this.pershareList.add(pershare);
	}

	public List<Double> getAssetTurnoverList() {
		return assetTurnoverList;
	}

	public void setAssetTurnoverList(List<Double> assetTurnoverList) {
		this.assetTurnoverList = assetTurnoverList;
	}
	
	public void addAssetTurnover(Double assetTurnover) {
		this.assetTurnoverList.add(assetTurnover);
	}

	public List<Double> getGrossMarginList() {
		return grossMarginList;
	}

	public void setGrossMarginList(List<Double> grossMarginList) {
		this.grossMarginList = grossMarginList;
	}
	
	public void addGrossMargin(Double grossMargin) {
		this.grossMarginList.add(grossMargin);
	}

	public List<Double> getMainProfitRateList() {
		return mainProfitRateList;
	}

	public void setMainProfitRateList(List<Double> mainProfitRateList) {
		this.mainProfitRateList = mainProfitRateList;
	}
	
	public void addMainProfitRate(Double mainProfitRate) {
		this.mainProfitRateList.add(mainProfitRate);
	}

	public List<Double> getDebtRatioList() {
		return debtRatioList;
	}

	public void setDebtRatioList(List<Double> debtRatioList) {
		this.debtRatioList = debtRatioList;
	}
	
	public void addDebtRatio(Double debtRatio) {
		this.debtRatioList.add(debtRatio);
	}

	public List<Double> getNetAssetsPershareList() {
		return netAssetsPershareList;
	}

	public void setNetAssetsPershareList(List<Double> netAssetsPershareList) {
		this.netAssetsPershareList = netAssetsPershareList;
	}
	
	public void addNetAssetsPershare(Double netAssetsPershare) {
		this.netAssetsPershareList.add(netAssetsPershare);
	}

	public List<Double> getTotalAssetsProfitRateList() {
		return totalAssetsProfitRateList;
	}

	public void setTotalAssetsProfitRateList(List<Double> totalAssetsProfitRateList) {
		this.totalAssetsProfitRateList = totalAssetsProfitRateList;
	}
	
	public void addTotalAssetsProfitRate(Double totalAssetsProfitRate) {
		this.totalAssetsProfitRateList.add(totalAssetsProfitRate);
	}

	public List<Double> getNetAssetsProfitRateList() {
		return netAssetsProfitRateList;
	}

	public void setNetAssetsProfitRateList(List<Double> netAssetsProfitRateList) {
		this.netAssetsProfitRateList = netAssetsProfitRateList;
	}
	
	public void addNetAssetsProfitRate(Double netAssetsProfitRate) {
		this.netAssetsProfitRateList.add(netAssetsProfitRate);
	}
}
