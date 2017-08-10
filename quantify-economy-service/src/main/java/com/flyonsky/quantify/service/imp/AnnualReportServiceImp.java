package com.flyonsky.quantify.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.dao.AnnualReportMapper;
import com.flyonsky.quantify.dao.CustomizeMapper;
import com.flyonsky.quantify.dao.VAnnualReportMapper;
import com.flyonsky.quantify.entity.AnnualKey;
import com.flyonsky.quantify.entity.AnnualReport;
import com.flyonsky.quantify.entity.AnnualReportExample;
import com.flyonsky.quantify.entity.VAnnualReport;
import com.flyonsky.quantify.entity.VAnnualReportExample;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;
import com.flyonsky.quantify.service.AbstractService;
import com.flyonsky.quantify.service.AnnualReportService;

@Service
public class AnnualReportServiceImp extends AbstractService implements AnnualReportService{
	
	@Autowired
	private AnnualReportMapper annualMapper;
	
	@Autowired
	private VAnnualReportMapper vannualMapper;
	
	@Autowired
	private CustomizeMapper cusMapper;

	@Override
	public AnnualReport queryAnnualReport(String code, int year) {
		AnnualReportExample ae = new AnnualReportExample();
		ae.createCriteria().andCodeEqualTo(code).andYearEqualTo(year);
		List<AnnualReport> list = this.getAnnualMapper().selectByExample(ae);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public AnnualReport queryAnnualReport(int id) {
		AnnualReport data = this.getAnnualMapper().selectByPrimaryKey(id);
		return data;
	}

	@Override
	public GridData<VAnnualReport> queryAnnualReport(QueryInfo query) {
		GridData<VAnnualReport> grid=new GridData<VAnnualReport>();
		VAnnualReportExample example=new VAnnualReportExample();
		example.setOrderByClause(query.getOrderByClause());
		example.setCustomWhere(query.getQueryFilter());
		grid.setTotalRows(this.getVannualMapper().countByExample(example));
		
		example.setLimitStart(query.getPage()*query.getPageSize());
		example.setLimitEnd(query.getPageSize());
		grid.setPageData(this.getVannualMapper().selectByExample(example));
		return grid;
	}

	@Override
	public boolean createAnnualReport(AnnualReport annualReport) {
		int count = this.getAnnualMapper().insert(annualReport);
		return count > 0?true:false;
	}

	@Override
	public boolean modifyAnnualReport(AnnualReport annualReport) {
		int count = this.getAnnualMapper().updateByPrimaryKey(annualReport);
		return count > 0?true:false;
	}

	@Override
	public List<String> queryAnnualKey() {
		List<AnnualKey> list = this.getCusMapper().queryAnnualKey();
		List<String> annulList = new ArrayList<String>();
		for(AnnualKey key : list){
			annulList.add(key.getAnnualkey());
		}
		return annulList;
	}

	public AnnualReportMapper getAnnualMapper() {
		return annualMapper;
	}

	public void setAnnualMapper(AnnualReportMapper annualMapper) {
		this.annualMapper = annualMapper;
	}

	public CustomizeMapper getCusMapper() {
		return cusMapper;
	}

	public void setCusMapper(CustomizeMapper cusMapper) {
		this.cusMapper = cusMapper;
	}

	public VAnnualReportMapper getVannualMapper() {
		return vannualMapper;
	}

	public void setVannualMapper(VAnnualReportMapper vannualMapper) {
		this.vannualMapper = vannualMapper;
	}

}
