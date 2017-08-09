package com.flyonsky.quantify.dao;

import java.util.List;

import com.flyonsky.quantify.entity.SecuritiesCharts;

public interface DataMapper {

	List<SecuritiesCharts> querySecurity(List<String> codes);
}
