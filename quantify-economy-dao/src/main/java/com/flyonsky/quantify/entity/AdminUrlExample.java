package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AdminUrlExample() {
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uName is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uName is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uName =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uName <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uName >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uName >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uName <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uName <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uName like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uName not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uName in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uName not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uName between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uName not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUtitleIsNull() {
            addCriterion("uTitle is null");
            return (Criteria) this;
        }

        public Criteria andUtitleIsNotNull() {
            addCriterion("uTitle is not null");
            return (Criteria) this;
        }

        public Criteria andUtitleEqualTo(String value) {
            addCriterion("uTitle =", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotEqualTo(String value) {
            addCriterion("uTitle <>", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleGreaterThan(String value) {
            addCriterion("uTitle >", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleGreaterThanOrEqualTo(String value) {
            addCriterion("uTitle >=", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleLessThan(String value) {
            addCriterion("uTitle <", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleLessThanOrEqualTo(String value) {
            addCriterion("uTitle <=", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleLike(String value) {
            addCriterion("uTitle like", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotLike(String value) {
            addCriterion("uTitle not like", value, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleIn(List<String> values) {
            addCriterion("uTitle in", values, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotIn(List<String> values) {
            addCriterion("uTitle not in", values, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleBetween(String value1, String value2) {
            addCriterion("uTitle between", value1, value2, "utitle");
            return (Criteria) this;
        }

        public Criteria andUtitleNotBetween(String value1, String value2) {
            addCriterion("uTitle not between", value1, value2, "utitle");
            return (Criteria) this;
        }

        public Criteria andUparentidIsNull() {
            addCriterion("uParentId is null");
            return (Criteria) this;
        }

        public Criteria andUparentidIsNotNull() {
            addCriterion("uParentId is not null");
            return (Criteria) this;
        }

        public Criteria andUparentidEqualTo(Long value) {
            addCriterion("uParentId =", value, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidNotEqualTo(Long value) {
            addCriterion("uParentId <>", value, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidGreaterThan(Long value) {
            addCriterion("uParentId >", value, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidGreaterThanOrEqualTo(Long value) {
            addCriterion("uParentId >=", value, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidLessThan(Long value) {
            addCriterion("uParentId <", value, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidLessThanOrEqualTo(Long value) {
            addCriterion("uParentId <=", value, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidIn(List<Long> values) {
            addCriterion("uParentId in", values, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidNotIn(List<Long> values) {
            addCriterion("uParentId not in", values, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidBetween(Long value1, Long value2) {
            addCriterion("uParentId between", value1, value2, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUparentidNotBetween(Long value1, Long value2) {
            addCriterion("uParentId not between", value1, value2, "uparentid");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNull() {
            addCriterion("uType is null");
            return (Criteria) this;
        }

        public Criteria andUtypeIsNotNull() {
            addCriterion("uType is not null");
            return (Criteria) this;
        }

        public Criteria andUtypeEqualTo(Integer value) {
            addCriterion("uType =", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotEqualTo(Integer value) {
            addCriterion("uType <>", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThan(Integer value) {
            addCriterion("uType >", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uType >=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThan(Integer value) {
            addCriterion("uType <", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeLessThanOrEqualTo(Integer value) {
            addCriterion("uType <=", value, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeIn(List<Integer> values) {
            addCriterion("uType in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotIn(List<Integer> values) {
            addCriterion("uType not in", values, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeBetween(Integer value1, Integer value2) {
            addCriterion("uType between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("uType not between", value1, value2, "utype");
            return (Criteria) this;
        }

        public Criteria andUcssclsIsNull() {
            addCriterion("uCsscls is null");
            return (Criteria) this;
        }

        public Criteria andUcssclsIsNotNull() {
            addCriterion("uCsscls is not null");
            return (Criteria) this;
        }

        public Criteria andUcssclsEqualTo(String value) {
            addCriterion("uCsscls =", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsNotEqualTo(String value) {
            addCriterion("uCsscls <>", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsGreaterThan(String value) {
            addCriterion("uCsscls >", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsGreaterThanOrEqualTo(String value) {
            addCriterion("uCsscls >=", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsLessThan(String value) {
            addCriterion("uCsscls <", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsLessThanOrEqualTo(String value) {
            addCriterion("uCsscls <=", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsLike(String value) {
            addCriterion("uCsscls like", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsNotLike(String value) {
            addCriterion("uCsscls not like", value, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsIn(List<String> values) {
            addCriterion("uCsscls in", values, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsNotIn(List<String> values) {
            addCriterion("uCsscls not in", values, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsBetween(String value1, String value2) {
            addCriterion("uCsscls between", value1, value2, "ucsscls");
            return (Criteria) this;
        }

        public Criteria andUcssclsNotBetween(String value1, String value2) {
            addCriterion("uCsscls not between", value1, value2, "ucsscls");
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