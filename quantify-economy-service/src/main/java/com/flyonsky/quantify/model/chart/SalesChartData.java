package com.flyonsky.quantify.model.chart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	private List<Integer> category = new ArrayList<Integer>();
	
	// 营业收入
	private List<Double> revenueList = new ArrayList<Double>();
	
	// 营业利润
	private List<Double> operprofitList = new ArrayList<Double>();
	
	// 总利润
	private List<Double> totalprofitList = new ArrayList<Double>();
	
	// 净利润
	private List<Double> netprofitList = new ArrayList<Double>();
	
	// 毛利率:营业利润/营业收入
	private List<Double> grossmarginList = new ArrayList<Double>();
	
	// 净利率
	private List<Double> netinterestrateList = new ArrayList<Double>();
	
	// 主营业务利润占比:营业利润/总利润
	private List<Double> mainprofitrateList = new ArrayList<Double>();
	
	// 资产周转率:销售收入/总资产
	private List<Double> assetturnoverList = new ArrayList<Double>();

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

	public List<Double> getGrossmarginList() {
		return grossmarginList;
	}

	public void setGrossMarginList(List<Double> grossmarginList) {
		this.grossmarginList = grossmarginList;
	}
	
	public void addGrossmarginList(Double grossmargin) {
		this.grossmarginList.add(grossmargin);
	}

	public List<Double> getNetinterestrateList() {
		return netinterestrateList;
	}

	public void setNetinterestrateList(List<Double> netinterestrateList) {
		this.netinterestrateList = netinterestrateList;
	}
	
	public void addNetinterestrateList(Double netinterestrate) {
		this.netinterestrateList.add(netinterestrate);
	}

	public List<Double> getMainprofitrateList() {
		return mainprofitrateList;
	}

	public void setMainprofitrateList(List<Double> mainprofitrateList) {
		this.mainprofitrateList = mainprofitrateList;
	}
	
	public void addMainprofitrateList(Double mainprofitrate) {
		this.mainprofitrateList.add(mainprofitrate);
	}

	public List<Double> getAssetturnoverList() {
		return assetturnoverList;
	}

	public void setAssetturnoverList(List<Double> assetturnoverList) {
		this.assetturnoverList = assetturnoverList;
	}
	
	public void addAssetturnoverList(Double assetturnover) {
		this.assetturnoverList.add(assetturnover);
	}
}
