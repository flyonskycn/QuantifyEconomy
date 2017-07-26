package com.flyonsky.quantify.entity;

import java.io.Serializable;

public class ReportPage implements Serializable {
    private Integer pageid;

    private String pagetitle;

    private String pagedesc;

    private static final long serialVersionUID = 1L;

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public String getPagetitle() {
        return pagetitle;
    }

    public void setPagetitle(String pagetitle) {
        this.pagetitle = pagetitle == null ? null : pagetitle.trim();
    }

    public String getPagedesc() {
        return pagedesc;
    }

    public void setPagedesc(String pagedesc) {
        this.pagedesc = pagedesc == null ? null : pagedesc.trim();
    }
}