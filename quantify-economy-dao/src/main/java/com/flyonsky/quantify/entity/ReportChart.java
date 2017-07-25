package com.flyonsky.quantify.entity;

public class ReportChart {
    private Integer chartid;

    private String chartname;

    private String chartdesc;

    private String charttype;

    private String chartsql;

    private String nitems;

    private String vitems;

    private String yitems;

    public Integer getChartid() {
        return chartid;
    }

    public void setChartid(Integer chartid) {
        this.chartid = chartid;
    }

    public String getChartname() {
        return chartname;
    }

    public void setChartname(String chartname) {
        this.chartname = chartname == null ? null : chartname.trim();
    }

    public String getChartdesc() {
        return chartdesc;
    }

    public void setChartdesc(String chartdesc) {
        this.chartdesc = chartdesc == null ? null : chartdesc.trim();
    }

    public String getCharttype() {
        return charttype;
    }

    public void setCharttype(String charttype) {
        this.charttype = charttype == null ? null : charttype.trim();
    }

    public String getChartsql() {
        return chartsql;
    }

    public void setChartsql(String chartsql) {
        this.chartsql = chartsql == null ? null : chartsql.trim();
    }

    public String getNitems() {
        return nitems;
    }

    public void setNitems(String nitems) {
        this.nitems = nitems == null ? null : nitems.trim();
    }

    public String getVitems() {
        return vitems;
    }

    public void setVitems(String vitems) {
        this.vitems = vitems == null ? null : vitems.trim();
    }

    public String getYitems() {
        return yitems;
    }

    public void setYitems(String yitems) {
        this.yitems = yitems == null ? null : yitems.trim();
    }
}