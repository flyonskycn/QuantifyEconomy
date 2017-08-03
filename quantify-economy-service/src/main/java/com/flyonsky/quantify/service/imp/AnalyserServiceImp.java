package com.flyonsky.quantify.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.dao.AnalyserReportMapper;
import com.flyonsky.quantify.entity.AnalyserReport;
import com.flyonsky.quantify.model.YearOnYearData;
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
		
		// 条目
		List<Integer> category = new ArrayList<Integer>();
		// 营业收入同比增长率
		List<Double> revenuerateMap = new ArrayList<Double>();
		
		// 营业利润同比增长率
		List<Double> operprofitrateMap = new ArrayList<Double>();
		
		// 总利润同比增长率
		List<Double> totalprofitrateMap = new ArrayList<Double>();
		
		// 净利润同比增长率
		List<Double> netprofitrateMap = new ArrayList<Double>();
		
		// 归属股东净利润同比增长率
		List<Double> shnetprofitrateMap = new ArrayList<Double>();
		
		// 扣非后归属股东净利润同比增长率
		List<Double> deshnetprofitrateMap = new ArrayList<Double>();
		
		// 经营活动产生现金净额同比增长率
		List<Double> netcashflowrateMap = new ArrayList<Double>();
		
		// 总资长同比增长率
		List<Double> totalassetsrateMap = new ArrayList<Double>();
		
		// 总负债同比增长率
		List<Double> totalliabilityrateMap = new ArrayList<Double>();
		
		// 归属股东权益同比增长率
		List<Double> shequityrateMap = new ArrayList<Double>();
		
		// 每股收益同比增长率
		List<Double> persharerateMap = new ArrayList<Double>();
		for(AnalyserReport report : list){
			category.add(report.getYear());
			revenuerateMap.add(report.getRevenuerate());
			
			operprofitrateMap.add(report.getOperprofitrate());
			totalprofitrateMap.add(report.getTotalprofitrate());
			netprofitrateMap.add(report.getNetprofitrate());
			
			shnetprofitrateMap.add(report.getShnetprofitrate());
			
			deshnetprofitrateMap.add(report.getDeshnetprofitrate());
			
			netcashflowrateMap.add(report.getNetcashflowrate());
			
			totalassetsrateMap.add(report.getTotalassetsrate());
			
			totalliabilityrateMap.add(report.getTotalliabilityrate());
			
			shequityrateMap.add(report.getShequityrate());
			
			persharerateMap.add(report.getPersharerate());
		}
		
		data.setCategory(category);
		
		data.setRevenuerateMap(revenuerateMap);
		data.setOperprofitrateMap(operprofitrateMap);
		data.setTotalprofitrateMap(totalprofitrateMap);
		data.setNetprofitrateMap(netprofitrateMap);
		data.setShnetprofitrateMap(shnetprofitrateMap);
		data.setDeshnetprofitrateMap(deshnetprofitrateMap);
		data.setNetcashflowrateMap(netcashflowrateMap);
		data.setTotalassetsrateMap(totalassetsrateMap);
		data.setTotalliabilityrateMap(totalliabilityrateMap);
		data.setShequityrateMap(shequityrateMap);
		data.setPersharerateMap(persharerateMap);
		return data;
	}

	public AnalyserReportMapper getAnalyserMapper() {
		return analyserMapper;
	}

	public void setAnalyserMapper(AnalyserReportMapper analyserMapper) {
		this.analyserMapper = analyserMapper;
	}

}
