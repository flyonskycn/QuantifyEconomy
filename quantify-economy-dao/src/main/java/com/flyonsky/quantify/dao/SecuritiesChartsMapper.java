package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.SecuritiesCharts;

public interface SecuritiesChartsMapper {

	List<SecuritiesCharts> querySecurity(String code);
}
