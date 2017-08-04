package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class SalesRateCharts implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String code;
    private int year;
    private double revenuerate;
    private double operprofitrate;
    private double totalprofitrate;
    private double netprofitrate;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getRevenuerate() {
		return revenuerate;
	}
	public void setRevenuerate(double revenuerate) {
		this.revenuerate = revenuerate;
	}
	public double getOperprofitrate() {
		return operprofitrate;
	}
	public void setOperprofitrate(double operprofitrate) {
		this.operprofitrate = operprofitrate;
	}
	public double getTotalprofitrate() {
		return totalprofitrate;
	}
	public void setTotalprofitrate(double totalprofitrate) {
		this.totalprofitrate = totalprofitrate;
	}
	public double getNetprofitrate() {
		return netprofitrate;
	}
	public void setNetprofitrate(double netprofitrate) {
		this.netprofitrate = netprofitrate;
	}
}
