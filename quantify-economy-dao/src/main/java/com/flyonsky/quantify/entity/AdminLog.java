package com.flyonsky.quantify.entity;

import java.util.Date;

public class AdminLog {
    private Long logid;

    private Long uid;

    private Long adminid;

    private String adminname;

    private Date opstart;

    private Integer optime;

    private String putitle;

    private String utitle;

    private String opcontent;

    private String opstatus;

    public Long getLogid() {
        return logid;
    }

    public void setLogid(Long logid) {
        this.logid = logid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Long getAdminid() {
        return adminid;
    }

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public Date getOpstart() {
        return opstart;
    }

    public void setOpstart(Date opstart) {
        this.opstart = opstart;
    }

    public Integer getOptime() {
        return optime;
    }

    public void setOptime(Integer optime) {
        this.optime = optime;
    }

    public String getPutitle() {
        return putitle;
    }

    public void setPutitle(String putitle) {
        this.putitle = putitle == null ? null : putitle.trim();
    }

    public String getUtitle() {
        return utitle;
    }

    public void setUtitle(String utitle) {
        this.utitle = utitle == null ? null : utitle.trim();
    }

    public String getOpcontent() {
        return opcontent;
    }

    public void setOpcontent(String opcontent) {
        this.opcontent = opcontent == null ? null : opcontent.trim();
    }

    public String getOpstatus() {
        return opstatus;
    }

    public void setOpstatus(String opstatus) {
        this.opstatus = opstatus == null ? null : opstatus.trim();
    }
}