package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AdminUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAdminidIsNull() {
            addCriterion("adminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Long value) {
            addCriterion("adminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Long value) {
            addCriterion("adminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Long value) {
            addCriterion("adminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Long value) {
            addCriterion("adminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Long value) {
            addCriterion("adminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Long value) {
            addCriterion("adminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Long> values) {
            addCriterion("adminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Long> values) {
            addCriterion("adminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Long value1, Long value2) {
            addCriterion("adminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Long value1, Long value2) {
            addCriterion("adminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNull() {
            addCriterion("adminEmail is null");
            return (Criteria) this;
        }

        public Criteria andAdminemailIsNotNull() {
            addCriterion("adminEmail is not null");
            return (Criteria) this;
        }

        public Criteria andAdminemailEqualTo(String value) {
            addCriterion("adminEmail =", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotEqualTo(String value) {
            addCriterion("adminEmail <>", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThan(String value) {
            addCriterion("adminEmail >", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailGreaterThanOrEqualTo(String value) {
            addCriterion("adminEmail >=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThan(String value) {
            addCriterion("adminEmail <", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLessThanOrEqualTo(String value) {
            addCriterion("adminEmail <=", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailLike(String value) {
            addCriterion("adminEmail like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotLike(String value) {
            addCriterion("adminEmail not like", value, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailIn(List<String> values) {
            addCriterion("adminEmail in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotIn(List<String> values) {
            addCriterion("adminEmail not in", values, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailBetween(String value1, String value2) {
            addCriterion("adminEmail between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminemailNotBetween(String value1, String value2) {
            addCriterion("adminEmail not between", value1, value2, "adminemail");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIsNull() {
            addCriterion("adminPwd is null");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIsNotNull() {
            addCriterion("adminPwd is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpwdEqualTo(String value) {
            addCriterion("adminPwd =", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotEqualTo(String value) {
            addCriterion("adminPwd <>", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdGreaterThan(String value) {
            addCriterion("adminPwd >", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdGreaterThanOrEqualTo(String value) {
            addCriterion("adminPwd >=", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLessThan(String value) {
            addCriterion("adminPwd <", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLessThanOrEqualTo(String value) {
            addCriterion("adminPwd <=", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdLike(String value) {
            addCriterion("adminPwd like", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotLike(String value) {
            addCriterion("adminPwd not like", value, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdIn(List<String> values) {
            addCriterion("adminPwd in", values, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotIn(List<String> values) {
            addCriterion("adminPwd not in", values, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdBetween(String value1, String value2) {
            addCriterion("adminPwd between", value1, value2, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminpwdNotBetween(String value1, String value2) {
            addCriterion("adminPwd not between", value1, value2, "adminpwd");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNull() {
            addCriterion("adminName is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminName =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminName <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminName >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminName >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminName <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminName <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminName like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminName not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminName in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminName not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminName between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminName not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andHeaderpicIsNull() {
            addCriterion("headerpic is null");
            return (Criteria) this;
        }

        public Criteria andHeaderpicIsNotNull() {
            addCriterion("headerpic is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderpicEqualTo(String value) {
            addCriterion("headerpic =", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotEqualTo(String value) {
            addCriterion("headerpic <>", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicGreaterThan(String value) {
            addCriterion("headerpic >", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicGreaterThanOrEqualTo(String value) {
            addCriterion("headerpic >=", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicLessThan(String value) {
            addCriterion("headerpic <", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicLessThanOrEqualTo(String value) {
            addCriterion("headerpic <=", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicLike(String value) {
            addCriterion("headerpic like", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotLike(String value) {
            addCriterion("headerpic not like", value, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicIn(List<String> values) {
            addCriterion("headerpic in", values, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotIn(List<String> values) {
            addCriterion("headerpic not in", values, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicBetween(String value1, String value2) {
            addCriterion("headerpic between", value1, value2, "headerpic");
            return (Criteria) this;
        }

        public Criteria andHeaderpicNotBetween(String value1, String value2) {
            addCriterion("headerpic not between", value1, value2, "headerpic");
            return (Criteria) this;
        }

        public Criteria andAdmindescIsNull() {
            addCriterion("admindesc is null");
            return (Criteria) this;
        }

        public Criteria andAdmindescIsNotNull() {
            addCriterion("admindesc is not null");
            return (Criteria) this;
        }

        public Criteria andAdmindescEqualTo(String value) {
            addCriterion("admindesc =", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescNotEqualTo(String value) {
            addCriterion("admindesc <>", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescGreaterThan(String value) {
            addCriterion("admindesc >", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescGreaterThanOrEqualTo(String value) {
            addCriterion("admindesc >=", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescLessThan(String value) {
            addCriterion("admindesc <", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescLessThanOrEqualTo(String value) {
            addCriterion("admindesc <=", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescLike(String value) {
            addCriterion("admindesc like", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescNotLike(String value) {
            addCriterion("admindesc not like", value, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescIn(List<String> values) {
            addCriterion("admindesc in", values, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescNotIn(List<String> values) {
            addCriterion("admindesc not in", values, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescBetween(String value1, String value2) {
            addCriterion("admindesc between", value1, value2, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdmindescNotBetween(String value1, String value2) {
            addCriterion("admindesc not between", value1, value2, "admindesc");
            return (Criteria) this;
        }

        public Criteria andAdminjoinIsNull() {
            addCriterion("adminJoin is null");
            return (Criteria) this;
        }

        public Criteria andAdminjoinIsNotNull() {
            addCriterion("adminJoin is not null");
            return (Criteria) this;
        }

        public Criteria andAdminjoinEqualTo(Date value) {
            addCriterion("adminJoin =", value, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinNotEqualTo(Date value) {
            addCriterion("adminJoin <>", value, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinGreaterThan(Date value) {
            addCriterion("adminJoin >", value, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinGreaterThanOrEqualTo(Date value) {
            addCriterion("adminJoin >=", value, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinLessThan(Date value) {
            addCriterion("adminJoin <", value, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinLessThanOrEqualTo(Date value) {
            addCriterion("adminJoin <=", value, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinIn(List<Date> values) {
            addCriterion("adminJoin in", values, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinNotIn(List<Date> values) {
            addCriterion("adminJoin not in", values, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinBetween(Date value1, Date value2) {
            addCriterion("adminJoin between", value1, value2, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andAdminjoinNotBetween(Date value1, Date value2) {
            addCriterion("adminJoin not between", value1, value2, "adminjoin");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("loginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("loginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("loginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("loginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("loginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("loginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("loginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("loginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("loginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("loginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("loginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}