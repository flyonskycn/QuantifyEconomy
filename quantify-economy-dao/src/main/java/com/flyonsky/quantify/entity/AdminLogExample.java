package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AdminLogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logid is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logid is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Long value) {
            addCriterion("logid =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Long value) {
            addCriterion("logid <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Long value) {
            addCriterion("logid >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Long value) {
            addCriterion("logid >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Long value) {
            addCriterion("logid <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Long value) {
            addCriterion("logid <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Long> values) {
            addCriterion("logid in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Long> values) {
            addCriterion("logid not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Long value1, Long value2) {
            addCriterion("logid between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Long value1, Long value2) {
            addCriterion("logid not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uId is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uId is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uId =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uId <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uId >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uId >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uId <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uId <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uId in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uId not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uId between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uId not between", value1, value2, "uid");
            return (Criteria) this;
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

        public Criteria andAdminnameIsNull() {
            addCriterion("adminname is null");
            return (Criteria) this;
        }

        public Criteria andAdminnameIsNotNull() {
            addCriterion("adminname is not null");
            return (Criteria) this;
        }

        public Criteria andAdminnameEqualTo(String value) {
            addCriterion("adminname =", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotEqualTo(String value) {
            addCriterion("adminname <>", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThan(String value) {
            addCriterion("adminname >", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameGreaterThanOrEqualTo(String value) {
            addCriterion("adminname >=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThan(String value) {
            addCriterion("adminname <", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLessThanOrEqualTo(String value) {
            addCriterion("adminname <=", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameLike(String value) {
            addCriterion("adminname like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotLike(String value) {
            addCriterion("adminname not like", value, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameIn(List<String> values) {
            addCriterion("adminname in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotIn(List<String> values) {
            addCriterion("adminname not in", values, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameBetween(String value1, String value2) {
            addCriterion("adminname between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andAdminnameNotBetween(String value1, String value2) {
            addCriterion("adminname not between", value1, value2, "adminname");
            return (Criteria) this;
        }

        public Criteria andOpstartIsNull() {
            addCriterion("opstart is null");
            return (Criteria) this;
        }

        public Criteria andOpstartIsNotNull() {
            addCriterion("opstart is not null");
            return (Criteria) this;
        }

        public Criteria andOpstartEqualTo(Date value) {
            addCriterion("opstart =", value, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartNotEqualTo(Date value) {
            addCriterion("opstart <>", value, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartGreaterThan(Date value) {
            addCriterion("opstart >", value, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartGreaterThanOrEqualTo(Date value) {
            addCriterion("opstart >=", value, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartLessThan(Date value) {
            addCriterion("opstart <", value, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartLessThanOrEqualTo(Date value) {
            addCriterion("opstart <=", value, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartIn(List<Date> values) {
            addCriterion("opstart in", values, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartNotIn(List<Date> values) {
            addCriterion("opstart not in", values, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartBetween(Date value1, Date value2) {
            addCriterion("opstart between", value1, value2, "opstart");
            return (Criteria) this;
        }

        public Criteria andOpstartNotBetween(Date value1, Date value2) {
            addCriterion("opstart not between", value1, value2, "opstart");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNull() {
            addCriterion("optime is null");
            return (Criteria) this;
        }

        public Criteria andOptimeIsNotNull() {
            addCriterion("optime is not null");
            return (Criteria) this;
        }

        public Criteria andOptimeEqualTo(Integer value) {
            addCriterion("optime =", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotEqualTo(Integer value) {
            addCriterion("optime <>", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThan(Integer value) {
            addCriterion("optime >", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("optime >=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThan(Integer value) {
            addCriterion("optime <", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeLessThanOrEqualTo(Integer value) {
            addCriterion("optime <=", value, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeIn(List<Integer> values) {
            addCriterion("optime in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotIn(List<Integer> values) {
            addCriterion("optime not in", values, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeBetween(Integer value1, Integer value2) {
            addCriterion("optime between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andOptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("optime not between", value1, value2, "optime");
            return (Criteria) this;
        }

        public Criteria andPutitleIsNull() {
            addCriterion("putitle is null");
            return (Criteria) this;
        }

        public Criteria andPutitleIsNotNull() {
            addCriterion("putitle is not null");
            return (Criteria) this;
        }

        public Criteria andPutitleEqualTo(String value) {
            addCriterion("putitle =", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleNotEqualTo(String value) {
            addCriterion("putitle <>", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleGreaterThan(String value) {
            addCriterion("putitle >", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleGreaterThanOrEqualTo(String value) {
            addCriterion("putitle >=", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleLessThan(String value) {
            addCriterion("putitle <", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleLessThanOrEqualTo(String value) {
            addCriterion("putitle <=", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleLike(String value) {
            addCriterion("putitle like", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleNotLike(String value) {
            addCriterion("putitle not like", value, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleIn(List<String> values) {
            addCriterion("putitle in", values, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleNotIn(List<String> values) {
            addCriterion("putitle not in", values, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleBetween(String value1, String value2) {
            addCriterion("putitle between", value1, value2, "putitle");
            return (Criteria) this;
        }

        public Criteria andPutitleNotBetween(String value1, String value2) {
            addCriterion("putitle not between", value1, value2, "putitle");
            return (Criteria) this;
        }

        public Criteria andUtitleIsNull() {
            addCriterion("utitle is null");
            return (Criteria) this;
        }

        public Criteria andUtitleIsNotNull() {
            addCriterion("utitle is not null");
            return (Criteria) this;
        }

        public Criteria andUtitleEqualTo(String value) {
            addCriterion("utitle =", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotEqualTo(String value) {
            addCriterion("utitle <>", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleGreaterThan(String value) {
            addCriterion("utitle >", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleGreaterThanOrEqualTo(String value) {
            addCriterion("utitle >=", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleLessThan(String value) {
            addCriterion("utitle <", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleLessThanOrEqualTo(String value) {
            addCriterion("utitle <=", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleLike(String value) {
            addCriterion("utitle like", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotLike(String value) {
            addCriterion("utitle not like", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleIn(List<String> values) {
            addCriterion("utitle in", values, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotIn(List<String> values) {
            addCriterion("utitle not in", values, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleBetween(String value1, String value2) {
            addCriterion("utitle between", value1, value2, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotBetween(String value1, String value2) {
            addCriterion("utitle not between", value1, value2, "utitle");
            return (Criteria) this;
        }

        public Criteria andOpcontentIsNull() {
            addCriterion("opcontent is null");
            return (Criteria) this;
        }

        public Criteria andOpcontentIsNotNull() {
            addCriterion("opcontent is not null");
            return (Criteria) this;
        }

        public Criteria andOpcontentEqualTo(String value) {
            addCriterion("opcontent =", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotEqualTo(String value) {
            addCriterion("opcontent <>", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentGreaterThan(String value) {
            addCriterion("opcontent >", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentGreaterThanOrEqualTo(String value) {
            addCriterion("opcontent >=", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentLessThan(String value) {
            addCriterion("opcontent <", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentLessThanOrEqualTo(String value) {
            addCriterion("opcontent <=", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentLike(String value) {
            addCriterion("opcontent like", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotLike(String value) {
            addCriterion("opcontent not like", value, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentIn(List<String> values) {
            addCriterion("opcontent in", values, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotIn(List<String> values) {
            addCriterion("opcontent not in", values, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentBetween(String value1, String value2) {
            addCriterion("opcontent between", value1, value2, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpcontentNotBetween(String value1, String value2) {
            addCriterion("opcontent not between", value1, value2, "opcontent");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNull() {
            addCriterion("opstatus is null");
            return (Criteria) this;
        }

        public Criteria andOpstatusIsNotNull() {
            addCriterion("opstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOpstatusEqualTo(String value) {
            addCriterion("opstatus =", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotEqualTo(String value) {
            addCriterion("opstatus <>", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThan(String value) {
            addCriterion("opstatus >", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusGreaterThanOrEqualTo(String value) {
            addCriterion("opstatus >=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThan(String value) {
            addCriterion("opstatus <", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLessThanOrEqualTo(String value) {
            addCriterion("opstatus <=", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusLike(String value) {
            addCriterion("opstatus like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotLike(String value) {
            addCriterion("opstatus not like", value, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusIn(List<String> values) {
            addCriterion("opstatus in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotIn(List<String> values) {
            addCriterion("opstatus not in", values, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusBetween(String value1, String value2) {
            addCriterion("opstatus between", value1, value2, "opstatus");
            return (Criteria) this;
        }

        public Criteria andOpstatusNotBetween(String value1, String value2) {
            addCriterion("opstatus not between", value1, value2, "opstatus");
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