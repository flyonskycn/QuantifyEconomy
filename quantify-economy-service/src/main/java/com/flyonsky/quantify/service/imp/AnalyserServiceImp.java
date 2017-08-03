package com.flyonsky.quantify.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.dao.AnalyserReportMapper;
import com.flyonsky.quantify.entity.AnalyserReport;
import com.flyonsky.quantify.entity.SecuritiesLineData;
import com.flyonsky.quantify.model.chart.LineChartData;
import com.flyonsky.quantify.model.chart.YearOnYearData;
import com.flyonsky.quantify.service.AbstractService;
import com.flyonsky.quantify.service.AnalyserService;

@Service
public class AnalyserServiceImp extends AbstractService implements AnalyserService{
	
	@Autowired
	private AnalyserReportMapper analyserMapper;

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
	public LineChartData queryLine(String code) {
		List<SecuritiesLineData> list = this.getAnalyserMapper().queryLine(code);
		LineChartData data = new LineChartData();
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

	public AnalyserReportMapper getAnalyserMapper() {
		return analyserMapper;
	}

	public void setAnalyserMapper(AnalyserReportMapper analyserMapper) {
		this.analyserMapper = analyserMapper;
	}

}
