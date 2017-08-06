package com.flyonsky.quantify.service;

import java.util.List;

import com.flyonsky.quantify.entity.AnnualKey;
import com.flyonsky.quantify.entity.AnnualReport;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;

/**
 * 年报数据服务接口
 * @author luowg
 *
 */
public interface AnnualReportService {
	
	/**
	 * 查看对应的年报
	 * @param code 股票代码
	 * @param year 年
	 * @return
	 */
	AnnualReport queryAnnualReport(String code,int year);
	
	/**
	 * 查看对应的年报
	 * @param id 
	 * @return
	 */
	AnnualReport queryAnnualReport(int id);
	
	/**
	 * 分页查询年报数据
	 * @param query 查询信息
	 * @return
	 */
	GridData<AnnualReport> queryAnnualReport(QueryInfo query);
	
	/**
	 * 新建年报
	 * @param annualReport
	 * @return
	 */
	boolean createAnnualReport(AnnualReport annualReport);
	
	/**
	 * 修改年报
	 * @param annualReport
	 * @return
	 */
	boolean modifyAnnualReport(AnnualReport annualReport);
	
	/**
	 * 查询年报键值
	 * @return
	 */
	List<String> queryAnnualKey();
}
