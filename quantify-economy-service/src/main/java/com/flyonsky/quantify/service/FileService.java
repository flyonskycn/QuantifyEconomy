package com.flyonsky.quantify.service;

public interface FileService {

	/**
	 * 下载上交所年报PDF文件
	 * @param url 年报PDF文件ＵＲＬ
	 * @param targetDir 目标ＤＩＲ
	 * @return
	 */
	boolean downLoadN(String url, String targetDir);
}
