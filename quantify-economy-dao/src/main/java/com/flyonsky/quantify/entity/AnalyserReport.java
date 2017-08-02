package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class AnalyserReport implements Serializable{

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
    private double shnetprofitrate;
    private double deshnetprofitrate;
    private double netcashflowrate;
    private double totalassetsrate;
    private double totalliabilityrate;
    private double shequityrate;
    private double persharerate;
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
	public double getShnetprofitrate() {
		return shnetprofitrate;
	}
	public void setShnetprofitrate(double shnetprofitrate) {
		this.shnetprofitrate = shnetprofitrate;
	}
	public double getDeshnetprofitrate() {
		return deshnetprofitrate;
	}
	public void setDeshnetprofitrate(double deshnetprofitrate) {
		this.deshnetprofitrate = deshnetprofitrate;
	}
	public double getNetcashflowrate() {
		return netcashflowrate;
	}
	public void setNetcashflowrate(double netcashflowrate) {
		this.netcashflowrate = netcashflowrate;
	}
	public double getTotalassetsrate() {
		return totalassetsrate;
	}
	public void setTotalassetsrate(double totalassetsrate) {
		this.totalassetsrate = totalassetsrate;
	}
	public double getTotalliabilityrate() {
		return totalliabilityrate;
	}
	public void setTotalliabilityrate(double totalliabilityrate) {
		this.totalliabilityrate = totalliabilityrate;
	}
	public double getShequityrate() {
		return shequityrate;
	}
	public void setShequityrate(double shequityrate) {
		this.shequityrate = shequityrate;
	}
	public double getPersharerate() {
		return persharerate;
	}
	public void setPersharerate(double persharerate) {
		this.persharerate = persharerate;
	}
    
}
