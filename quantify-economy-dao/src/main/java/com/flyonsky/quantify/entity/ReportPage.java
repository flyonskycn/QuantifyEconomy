package com.flyonsky.quantify.entity;

public class ReportPage {
    private Integer pageid;

    private String pagetitle;

    private String pagedesc;

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