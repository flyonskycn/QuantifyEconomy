package com.flyonsky.quantify.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.dao.AnalyserReportMapper;
import com.flyonsky.quantify.dao.SalesMapper;
import com.flyonsky.quantify.dao.SecuritiesMapper;
import com.flyonsky.quantify.entity.AnalyserReport;
import com.flyonsky.quantify.entity.SalesCharts;
import com.flyonsky.quantify.entity.SalesRateCharts;
import com.flyonsky.quantify.entity.SecuritiesCharts;
import com.flyonsky.quantify.entity.SecuritiesLineData;
import com.flyonsky.quantify.model.chart.EnumKpiType;
import com.flyonsky.quantify.model.chart.MultiLineChartData;
import com.flyonsky.quantify.model.chart.SalesChartData;
import com.flyonsky.quantify.model.chart.SalesWithChartData;
import com.flyonsky.quantify.model.chart.SecuritiesChartsData;
import com.flyonsky.quantify.model.chart.SecuritiesRateChartsData;
import com.flyonsky.quantify.service.AbstractService;
import com.flyonsky.quantify.service.AnalyserService;

@Service
public class AnalyserServiceImp extends AbstractService implements AnalyserService{
	
	@Autowired
	private AnalyserReportMapper analyserMapper;
	
	@Autowired
	private SalesMapper salesMapper;
	
	@Autowired
	private SecuritiesMapper securitiesMapper;

	@Override
	public SecuritiesRateChartsData query(String code) {
		List<AnalyserReport> list = this.getAnalyserMapper().query(code);
		SecuritiesRateChartsData data = new SecuritiesRateChartsData();
		data.setSecuritiesName(code);
		for(AnalyserReport report : list){
			data.addCategory(report.getYear());
			data.addRevenuerate(report.getYear(),report.getRevenuerate());
			
			data.addOperprofitrate(report.getYear(),report.getOperprofitrate());
			data.addTotalprofitrate(report.getYear(),report.getTotalprofitrate());
			data.addNetprofitrate(report.getYear(),report.getNetprofitrate());
			
			data.addShnetprofitrate(report.getYear(),report.getShnetprofitrate());
			
			data.addDeshnetprofitrate(report.getYear(),report.getDeshnetprofitrate());
			
			data.addNetcashflowrate(report.getYear(),report.getNetcashflowrate());
			
			data.addTotalassetsrate(report.getYear(),report.getTotalassetsrate());
			
			data.addTotalliabilityrate(report.getYear(),report.getTotalliabilityrate());
			
			data.addShequityrateMap(report.getYear(),report.getShequityrate());
			
			data.addPersharerate(report.getYear(),report.getPersharerate());
		}
		return data;
	}

	@Override
	public MultiLineChartData queryLine(String code) {
		List<SecuritiesLineData> list = this.getAnalyserMapper().queryLine(code);
		MultiLineChartData data = new MultiLineChartData();
		data.setSecuritiesName(code);
		for(SecuritiesLineData line : list){
			data.addCategory(line.getYear());
			data.addAssetTurnover(line.getYear(), line.getAssetTurnover());
			data.addDebtRatio(line.getYear(), line.getDebtRatio());
			data.addDeshnetprofit(line.getYear(), line.getDeshnetprofit());
			data.addGrossMargin(line.getYear(), line.getGrossMargin());
			data.addMainProfitRate(line.getYear(), line.getMainProfitRate());
			data.addNetAssetsPershare(line.getYear(), line.getNetAssetsPershare());
			data.addNetAssetsProfitRate(line.getYear(), line.getNetAssetsProfitRate());
			data.addNetcashflow(line.getYear(), line.getNetcashflow());
			data.addNetprofit(line.getYear(), line.getNetprofit());
			data.addOperprofit(line.getYear(), line.getOperprofit());
			data.addPershare(line.getYear(), line.getPershare());
			data.addRevenue(line.getYear(), line.getRevenue());
			data.addShequity(line.getYear(), line.getShequity());
			data.addShnetprofit(line.getYear(), line.getShnetprofit());
			data.addTotalassets(line.getYear(), line.getTotalassets());
			data.addTotalAssetsProfitRate(line.getYear(), line.getTotalAssetsProfitRate());
			data.addTotalliability(line.getYear(), line.getTotalliability());
			data.addTotalprofit(line.getYear(), line.getTotalprofit());
		}
		return data;
	}

	@Override
	public SalesChartData querySales(List<String> codes) {
		List<SalesCharts> list = this.getSalesMapper().querySales(codes);
		SalesChartData data = new SalesChartData();
		for(SalesCharts line : list){
			data.addKpi(line.getCode(), line.getYear(), line.getAssetturnover(), EnumKpiType.assetturnover);
			data.addKpi(line.getCode(), line.getYear(), line.getGrossmargin(), EnumKpiType.grossmargin);
			data.addKpi(line.getCode(), line.getYear(), line.getMainprofitrate(), EnumKpiType.mainprofitrate);
			data.addKpi(line.getCode(), line.getYear(), line.getNetinterestrate(), EnumKpiType.netinterestrate);
			data.addKpi(line.getCode(), line.getYear(), line.getNetprofit(), EnumKpiType.netprofit);
			data.addKpi(line.getCode(), line.getYear(), line.getOperprofit(), EnumKpiType.operprofit);
			data.addKpi(line.getCode(), line.getYear(), line.getRevenue(), EnumKpiType.revenue);
			data.addKpi(line.getCode(), line.getYear(), line.getTotalprofit(), EnumKpiType.totalprofit);
		}
		return data;
	}

	@Override
	public SalesWithChartData queryRateSales(List<String> codes) {
		List<SalesRateCharts> list = this.getSalesMapper().queryRateSales(codes);
		SalesWithChartData data = new SalesWithChartData();
		for(SalesRateCharts line : list){
			data.addKpi(line.getCode(), line.getYear(), line.getNetprofitrate(), EnumKpiType.netprofitwith);
			data.addKpi(line.getCode(), line.getYear(), line.getOperprofitrate(), EnumKpiType.operprofitwith);
			data.addKpi(line.getCode(), line.getYear(), line.getRevenuerate(), EnumKpiType.revenuewith);
			data.addKpi(line.getCode(), line.getYear(), line.getTotalprofitrate(), EnumKpiType.totalprofitwith);
		}
		return data;
	}

	@Override
	public SecuritiesChartsData querySecurities(List<String> codes) {
		List<SecuritiesCharts> list = this.getSecuritiesMapper().querySecurity(codes);
		SecuritiesChartsData data = new SecuritiesChartsData();
		for(SecuritiesCharts line : list){
			data.addKpi(line.getCode(), line.getYear(), line.getDebtratio(), EnumKpiType.debtratio);
			data.addKpi(line.getCode(), line.getYear(), line.getNetassetspershare(), EnumKpiType.netassetspershare);
			data.addKpi(line.getCode(), line.getYear(), line.getNetassetsprofit(), EnumKpiType.netAssetsProfitRate);
			data.addKpi(line.getCode(), line.getYear(), line.getPershare(), EnumKpiType.pershare);
			data.addKpi(line.getCode(), line.getYear(), line.getPersharecash(), EnumKpiType.persharecash);
		}
		return data;
	}

	public AnalyserReportMapper getAnalyserMapper() {
		return analyserMapper;
	}

	public void setAnalyserMapper(AnalyserReportMapper analyserMapper) {
		this.analyserMapper = analyserMapper;
	}

	public SalesMapper getSalesMapper() {
		return salesMapper;
	}

	public void setSalesMapper(SalesMapper salesMapper) {
		this.salesMapper = salesMapper;
	}

	public SecuritiesMapper getSecuritiesMapper() {
		return securitiesMapper;
	}

	public void setSecuritiesMapper(SecuritiesMapper securitiesMapper) {
		this.securitiesMapper = securitiesMapper;
	}
}
