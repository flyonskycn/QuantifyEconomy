package com.flyonsky.quantify.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.dao.AnalyserReportMapper;
import com.flyonsky.quantify.dao.SalesMapper;
import com.flyonsky.quantify.dao.SecuritiesChartsMapper;
import com.flyonsky.quantify.entity.AnalyserReport;
import com.flyonsky.quantify.entity.SalesCharts;
import com.flyonsky.quantify.entity.SalesRateCharts;
import com.flyonsky.quantify.entity.SecuritiesCharts;
import com.flyonsky.quantify.entity.SecuritiesLineData;
import com.flyonsky.quantify.model.chart.MultiLineChartData;
import com.flyonsky.quantify.model.chart.SalesChartData;
import com.flyonsky.quantify.model.chart.SalesRateChartData;
import com.flyonsky.quantify.model.chart.SecuritiesChartsData;
import com.flyonsky.quantify.model.chart.YearOnYearData;
import com.flyonsky.quantify.service.AbstractService;
import com.flyonsky.quantify.service.AnalyserService;

@Service
public class AnalyserServiceImp extends AbstractService implements AnalyserService{
	
	@Autowired
	private AnalyserReportMapper analyserMapper;
	
	@Autowired
	private SalesMapper salesMapper;
	
	@Autowired
	private SecuritiesChartsMapper securitiesMapper;

	@Override
	public YearOnYearData query(String code) {
		List<AnalyserReport> list = this.getAnalyserMapper().query(code);
		YearOnYearData data = new YearOnYearData();
		data.setSecuritiesName(code);
		for(AnalyserReport report : list){
			data.addCategory(report.getYear());
			data.addRevenuerate(report.getRevenuerate());
			
			data.addOperprofitrate(report.getOperprofitrate());
			data.addTotalprofitrate(report.getTotalprofitrate());
			data.addNetprofitrate(report.getNetprofitrate());
			
			data.addShnetprofitrate(report.getShnetprofitrate());
			
			data.addDeshnetprofitrate(report.getDeshnetprofitrate());
			
			data.addNetcashflowrate(report.getNetcashflowrate());
			
			data.addTotalassetsrate(report.getTotalassetsrate());
			
			data.addTotalliabilityrate(report.getTotalliabilityrate());
			
			data.addShequityrateMap(report.getShequityrate());
			
			data.addPersharerate(report.getPersharerate());
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
			data.addAssetTurnover(line.getAssetTurnover());
			data.addDebtRatio(line.getDebtRatio());
			data.addDeshnetprofit(line.getDeshnetprofit());
			data.addGrossMargin(line.getGrossMargin());
			data.addMainProfitRate(line.getMainProfitRate());
			data.addNetAssetsPershare(line.getNetAssetsPershare());
			data.addNetAssetsProfitRate(line.getNetAssetsProfitRate());
			data.addNetcashflow(line.getNetcashflow());
			data.addNetprofit(line.getNetprofit());
			data.addOperprofit(line.getOperprofit());
			data.addPershare(line.getPershare());
			data.addRevenue(line.getRevenue());
			data.addShequity(line.getShequity());
			data.addShnetprofit(line.getShnetprofit());
			data.addTotalassets(line.getTotalassets());
			data.addTotalAssetsProfitRate(line.getTotalAssetsProfitRate());
			data.addTotalliability(line.getTotalliability());
			data.addTotalprofit(line.getTotalprofit());
		}
		return data;
	}

	@Override
	public SalesChartData querySales(String code) {
		List<SalesCharts> list = this.getSalesMapper().querySales(code);
		SalesChartData data = new SalesChartData();
		data.setSecuritiesName(code);
		for(SalesCharts line : list){
			data.addCategory(line.getYear());
			data.addAssetturnoverList(line.getAssetturnover());
			data.addGrossmarginList(line.getGrossmargin());
			data.addMainprofitrateList(line.getMainprofitrate());
			data.addNetinterestrateList(line.getNetinterestrate());
			data.addNetprofit(line.getNetprofit());
			data.addOperprofit(line.getOperprofit());
			data.addRevenue(line.getRevenue());
			data.addTotalprofit(line.getTotalprofit());
		}
		return data;
	}

	@Override
	public SalesRateChartData queryRateSales(String code) {
		List<SalesRateCharts> list = this.getSalesMapper().queryRateSales(code);
		SalesRateChartData data = new SalesRateChartData();
		data.setSecuritiesName(code);
		for(SalesRateCharts line : list){
			data.addCategory(line.getYear());
			data.addNetprofitrate(line.getNetprofitrate());
			data.addOperprofitrate(line.getOperprofitrate());
			data.addRevenuerate(line.getRevenuerate());
			data.addTotalprofitrate(line.getTotalprofitrate());
		}
		return data;
	}

	@Override
	public SecuritiesChartsData querySecurities(String code) {
		List<SecuritiesCharts> list = this.getSecuritiesMapper().querySecurity(code);
		SecuritiesChartsData data = new SecuritiesChartsData();
		data.setSecuritiesName(code);
		for(SecuritiesCharts line : list){
			data.addCategory(line.getYear());
			data.addDebtratio(line.getDebtratio());
			data.addNetassetspershare(line.getNetassetspershare());
			data.addNetassetsprofit(line.getNetassetsprofit());
			data.addPershare(line.getPersharecash());
			data.addPersharecash(line.getPersharecash());
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

	public SecuritiesChartsMapper getSecuritiesMapper() {
		return securitiesMapper;
	}

	public void setSecuritiesMapper(SecuritiesChartsMapper securitiesMapper) {
		this.securitiesMapper = securitiesMapper;
	}
}
