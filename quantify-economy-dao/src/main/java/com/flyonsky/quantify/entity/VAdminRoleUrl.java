package com.flyonsky.quantify.entity;

public class VAdminRoleUrl {
    private Long uid;

    private String url;

    private String uname;

    private String utitle;

    private Long uparentid;

    private Integer utype;

    private String ucsscls;

    private Long roleid;

    private String rolename;

    private Long ruid;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUtitle() {
        return utitle;
    }

    public void setUtitle(String utitle) {
        this.utitle = utitle == null ? null : utitle.trim();
    }

    public Long getUparentid() {
        return uparentid;
    }

    public void setUparentid(Long uparentid) {
        this.uparentid = uparentid;
    }

    public Integer getUtype() {
        return utype;
    }

    public void setUtype(Integer utype) {
        this.utype = utype;
    }

    public String getUcsscls() {
        return ucsscls;
    }

    public void setUcsscls(String ucsscls) {
        this.ucsscls = ucsscls == null ? null : ucsscls.trim();
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Long getRuid() {
        return ruid;
    }

    public void setRuid(Long ruid) {
        this.ruid = ruid;
    }
}