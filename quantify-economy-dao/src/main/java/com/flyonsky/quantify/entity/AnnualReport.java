package com.flyonsky.quantify.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class AnnualReport implements Serializable {
    private Integer id;

    private String code;

    private Integer year;

    private BigDecimal revenue;

    private BigDecimal operprofit;

    private BigDecimal totalprofit;

    private BigDecimal netprofit;

    private BigDecimal shnetprofit;

    private BigDecimal deshnetprofit;

    private BigDecimal netcashflow;

    private BigDecimal totalassets;

    private BigDecimal totalliability;

    private BigDecimal shequity;

    private Long totalshares;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getRevenue() {
        return revenue;
    }

    public void setRevenue(BigDecimal revenue) {
        this.revenue = revenue;
    }

    public BigDecimal getOperprofit() {
        return operprofit;
    }

    public void setOperprofit(BigDecimal operprofit) {
        this.operprofit = operprofit;
    }

    public BigDecimal getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(BigDecimal totalprofit) {
        this.totalprofit = totalprofit;
    }

    public BigDecimal getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(BigDecimal netprofit) {
        this.netprofit = netprofit;
    }

    public BigDecimal getShnetprofit() {
        return shnetprofit;
    }

    public void setShnetprofit(BigDecimal shnetprofit) {
        this.shnetprofit = shnetprofit;
    }

    public BigDecimal getDeshnetprofit() {
        return deshnetprofit;
    }

    public void setDeshnetprofit(BigDecimal deshnetprofit) {
        this.deshnetprofit = deshnetprofit;
    }

    public BigDecimal getNetcashflow() {
        return netcashflow;
    }

    public void setNetcashflow(BigDecimal netcashflow) {
        this.netcashflow = netcashflow;
    }

    public BigDecimal getTotalassets() {
        return totalassets;
    }

    public void setTotalassets(BigDecimal totalassets) {
        this.totalassets = totalassets;
    }

    public BigDecimal getTotalliability() {
        return totalliability;
    }

    public void setTotalliability(BigDecimal totalliability) {
        this.totalliability = totalliability;
    }

    public BigDecimal getShequity() {
        return shequity;
    }

    public void setShequity(BigDecimal shequity) {
        this.shequity = shequity;
    }

    public Long getTotalshares() {
        return totalshares;
    }

    public void setTotalshares(Long totalshares) {
        this.totalshares = totalshares;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}