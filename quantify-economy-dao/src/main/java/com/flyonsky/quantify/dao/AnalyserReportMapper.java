package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.AnalyserReport;

public interface AnalyserReportMapper {

	List<AnalyserReport> query(String code);
}
