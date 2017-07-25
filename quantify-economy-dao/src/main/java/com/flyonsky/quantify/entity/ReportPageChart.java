package com.flyonsky.quantify.entity;

public class ReportPageChart {
    private Long pcid;

    private Integer chartid;

    private Integer pageid;

    private Integer sortid;

    public Long getPcid() {
        return pcid;
    }

    public void setPcid(Long pcid) {
        this.pcid = pcid;
    }

    public Integer getChartid() {
        return chartid;
    }

    public void setChartid(Integer chartid) {
        this.chartid = chartid;
    }

    public Integer getPageid() {
        return pageid;
    }

    public void setPageid(Integer pageid) {
        this.pageid = pageid;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }
}