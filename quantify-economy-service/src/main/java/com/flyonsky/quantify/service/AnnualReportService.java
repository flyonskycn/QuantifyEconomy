package com.flyonsky.quantify.service;

import com.flyonsky.quantify.entity.AnnualReport;

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
}
