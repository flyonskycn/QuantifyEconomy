package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.List;

public class ReportPageChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ReportPageChartExample() {
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

        public Criteria andPcidIsNull() {
            addCriterion("pcid is null");
            return (Criteria) this;
        }

        public Criteria andPcidIsNotNull() {
            addCriterion("pcid is not null");
            return (Criteria) this;
        }

        public Criteria andPcidEqualTo(Long value) {
            addCriterion("pcid =", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotEqualTo(Long value) {
            addCriterion("pcid <>", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThan(Long value) {
            addCriterion("pcid >", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidGreaterThanOrEqualTo(Long value) {
            addCriterion("pcid >=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThan(Long value) {
            addCriterion("pcid <", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidLessThanOrEqualTo(Long value) {
            addCriterion("pcid <=", value, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidIn(List<Long> values) {
            addCriterion("pcid in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotIn(List<Long> values) {
            addCriterion("pcid not in", values, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidBetween(Long value1, Long value2) {
            addCriterion("pcid between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andPcidNotBetween(Long value1, Long value2) {
            addCriterion("pcid not between", value1, value2, "pcid");
            return (Criteria) this;
        }

        public Criteria andChartidIsNull() {
            addCriterion("chartid is null");
            return (Criteria) this;
        }

        public Criteria andChartidIsNotNull() {
            addCriterion("chartid is not null");
            return (Criteria) this;
        }

        public Criteria andChartidEqualTo(Integer value) {
            addCriterion("chartid =", value, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidNotEqualTo(Integer value) {
            addCriterion("chartid <>", value, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidGreaterThan(Integer value) {
            addCriterion("chartid >", value, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chartid >=", value, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidLessThan(Integer value) {
            addCriterion("chartid <", value, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidLessThanOrEqualTo(Integer value) {
            addCriterion("chartid <=", value, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidIn(List<Integer> values) {
            addCriterion("chartid in", values, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidNotIn(List<Integer> values) {
            addCriterion("chartid not in", values, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidBetween(Integer value1, Integer value2) {
            addCriterion("chartid between", value1, value2, "chartid");
            return (Criteria) this;
        }

        public Criteria andChartidNotBetween(Integer value1, Integer value2) {
            addCriterion("chartid not between", value1, value2, "chartid");
            return (Criteria) this;
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

        public Criteria andSortidIsNull() {
            addCriterion("sortid is null");
            return (Criteria) this;
        }

        public Criteria andSortidIsNotNull() {
            addCriterion("sortid is not null");
            return (Criteria) this;
        }

        public Criteria andSortidEqualTo(Integer value) {
            addCriterion("sortid =", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotEqualTo(Integer value) {
            addCriterion("sortid <>", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThan(Integer value) {
            addCriterion("sortid >", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortid >=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThan(Integer value) {
            addCriterion("sortid <", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidLessThanOrEqualTo(Integer value) {
            addCriterion("sortid <=", value, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidIn(List<Integer> values) {
            addCriterion("sortid in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotIn(List<Integer> values) {
            addCriterion("sortid not in", values, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidBetween(Integer value1, Integer value2) {
            addCriterion("sortid between", value1, value2, "sortid");
            return (Criteria) this;
        }

        public Criteria andSortidNotBetween(Integer value1, Integer value2) {
            addCriterion("sortid not between", value1, value2, "sortid");
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