package com.flyonsky.quantify.entity;

public class Config {
    private String cfgkey;

    private String cfgpkey;

    private String cfgname;

    private String cfgvalue;

    private String cfgtype;

    private String cfgdesc;

    private String cfgregex;

    private String cfglist;

    private Integer cfgsort;

    public String getCfgkey() {
        return cfgkey;
    }

    public void setCfgkey(String cfgkey) {
        this.cfgkey = cfgkey == null ? null : cfgkey.trim();
    }

    public String getCfgpkey() {
        return cfgpkey;
    }

    public void setCfgpkey(String cfgpkey) {
        this.cfgpkey = cfgpkey == null ? null : cfgpkey.trim();
    }

    public String getCfgname() {
        return cfgname;
    }

    public void setCfgname(String cfgname) {
        this.cfgname = cfgname == null ? null : cfgname.trim();
    }

    public String getCfgvalue() {
        return cfgvalue;
    }

    public void setCfgvalue(String cfgvalue) {
        this.cfgvalue = cfgvalue == null ? null : cfgvalue.trim();
    }

    public String getCfgtype() {
        return cfgtype;
    }

    public void setCfgtype(String cfgtype) {
        this.cfgtype = cfgtype == null ? null : cfgtype.trim();
    }

    public String getCfgdesc() {
        return cfgdesc;
    }

    public void setCfgdesc(String cfgdesc) {
        this.cfgdesc = cfgdesc == null ? null : cfgdesc.trim();
    }

    public String getCfgregex() {
        return cfgregex;
    }

    public void setCfgregex(String cfgregex) {
        this.cfgregex = cfgregex == null ? null : cfgregex.trim();
    }

    public String getCfglist() {
        return cfglist;
    }

    public void setCfglist(String cfglist) {
        this.cfglist = cfglist == null ? null : cfglist.trim();
    }

    public Integer getCfgsort() {
        return cfgsort;
    }

    public void setCfgsort(Integer cfgsort) {
        this.cfgsort = cfgsort;
    }
}