package com.flyonsky.quantify.service;

import java.util.List;

public interface FileService {

	/**
	 * 下载上交所年报PDF文件
	 * @param url 年报PDF文件ＵＲＬ
	 * @param targetDir 目标ＤＩＲ
	 * @return
	 */
	boolean downLoadN(String url, String targetDir);
	
	/**
	 * 获取指定目录下的满足条件文件的URL
	 * @param isAnnualReport 是否为年报
	 * @param dir 目录
	 * @return
	 */
	List<String> recursive(boolean isAnnualReport, String dir);
}
