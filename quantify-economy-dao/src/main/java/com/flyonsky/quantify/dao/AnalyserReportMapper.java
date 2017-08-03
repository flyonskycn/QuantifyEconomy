package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.AnalyserReport;
import com.flyonsky.quantify.entity.SecuritiesLineData;

public interface AnalyserReportMapper {

	List<AnalyserReport> query(String code);
	
	List<SecuritiesLineData> queryLine(String code);
}
