package com.flyonsky.quantify.service;

import java.util.List;
import java.util.Set;

public interface FileService {

	/**
	 * 下载上交所年报PDF文件
	 * @param url 年报PDF文件ＵＲＬ
	 * @param targetDir 目标ＤＩＲ
	 * @return
	 */
	boolean downLoadN(String url, String targetDir);
	
	/**
	 * 下载深交所年报PDF文件
	 * @param url 年报PDF文件ＵＲＬ
	 * @param code 证券代码
	 * @param targetDir 目标DIR
	 * @return
	 */
	boolean downLoadSzN(String url,String code,String targetDir);
	
	/**
	 * 获取指定目录下的满足条件文件的URL
	 * @param isAnnualReport 是否为年报
	 * @param dir 目录
	 * @return
	 */
	List<String> recursive(boolean isAnnualReport, String dir);
	
	/**
	 * 下载指定股票代码的年报
	 * @param code 证券代码
	 * @param targetDir 目标ＤＩＲ
	 * @return
	 */
	boolean downloadByCode(String code, String targetDir);
	
	/**
	 * 包含文件的证券列表
	 * @param dir 目标目录
	 * @return 证券代码列表
	 */
	Set<String> pdfCode(String dir);
}
