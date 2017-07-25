package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.List;

public class ReportPageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String customWhere;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ReportPageExample() {
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

    public void setCustomWhere(String customWhere) {
        this.customWhere=customWhere;
    }

    public String getCustomWhere() {
        return customWhere;
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

        public Criteria andPageidIsNull() {
            addCriterion("pageid is null");
            return (Criteria) this;
        }

        public Criteria andPageidIsNotNull() {
            addCriterion("pageid is not null");
            return (Criteria) this;
        }

        public Criteria andPageidEqualTo(Integer value) {
            addCriterion("pageid =", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotEqualTo(Integer value) {
            addCriterion("pageid <>", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThan(Integer value) {
            addCriterion("pageid >", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageid >=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThan(Integer value) {
            addCriterion("pageid <", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidLessThanOrEqualTo(Integer value) {
            addCriterion("pageid <=", value, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidIn(List<Integer> values) {
            addCriterion("pageid in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotIn(List<Integer> values) {
            addCriterion("pageid not in", values, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidBetween(Integer value1, Integer value2) {
            addCriterion("pageid between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPageidNotBetween(Integer value1, Integer value2) {
            addCriterion("pageid not between", value1, value2, "pageid");
            return (Criteria) this;
        }

        public Criteria andPagetitleIsNull() {
            addCriterion("pagetitle is null");
            return (Criteria) this;
        }

        public Criteria andPagetitleIsNotNull() {
            addCriterion("pagetitle is not null");
            return (Criteria) this;
        }

        public Criteria andPagetitleEqualTo(String value) {
            addCriterion("pagetitle =", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotEqualTo(String value) {
            addCriterion("pagetitle <>", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleGreaterThan(String value) {
            addCriterion("pagetitle >", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleGreaterThanOrEqualTo(String value) {
            addCriterion("pagetitle >=", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLessThan(String value) {
            addCriterion("pagetitle <", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLessThanOrEqualTo(String value) {
            addCriterion("pagetitle <=", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleLike(String value) {
            addCriterion("pagetitle like", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotLike(String value) {
            addCriterion("pagetitle not like", value, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleIn(List<String> values) {
            addCriterion("pagetitle in", values, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotIn(List<String> values) {
            addCriterion("pagetitle not in", values, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleBetween(String value1, String value2) {
            addCriterion("pagetitle between", value1, value2, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagetitleNotBetween(String value1, String value2) {
            addCriterion("pagetitle not between", value1, value2, "pagetitle");
            return (Criteria) this;
        }

        public Criteria andPagedescIsNull() {
            addCriterion("pagedesc is null");
            return (Criteria) this;
        }

        public Criteria andPagedescIsNotNull() {
            addCriterion("pagedesc is not null");
            return (Criteria) this;
        }

        public Criteria andPagedescEqualTo(String value) {
            addCriterion("pagedesc =", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescNotEqualTo(String value) {
            addCriterion("pagedesc <>", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescGreaterThan(String value) {
            addCriterion("pagedesc >", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescGreaterThanOrEqualTo(String value) {
            addCriterion("pagedesc >=", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescLessThan(String value) {
            addCriterion("pagedesc <", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescLessThanOrEqualTo(String value) {
            addCriterion("pagedesc <=", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescLike(String value) {
            addCriterion("pagedesc like", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescNotLike(String value) {
            addCriterion("pagedesc not like", value, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescIn(List<String> values) {
            addCriterion("pagedesc in", values, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescNotIn(List<String> values) {
            addCriterion("pagedesc not in", values, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescBetween(String value1, String value2) {
            addCriterion("pagedesc between", value1, value2, "pagedesc");
            return (Criteria) this;
        }

        public Criteria andPagedescNotBetween(String value1, String value2) {
            addCriterion("pagedesc not between", value1, value2, "pagedesc");
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