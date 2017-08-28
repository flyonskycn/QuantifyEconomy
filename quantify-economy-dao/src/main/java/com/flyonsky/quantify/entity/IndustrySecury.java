package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class IndustrySecury implements Serializable {
    private Integer id;

    private Integer industryid;

    private String code;

    private String remart;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIndustryid() {
        return industryid;
    }

    public void setIndustryid(Integer industryid) {
        this.industryid = industryid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getRemart() {
        return remart;
    }

    public void setRemart(String remart) {
        this.remart = remart == null ? null : remart.trim();
    }
}