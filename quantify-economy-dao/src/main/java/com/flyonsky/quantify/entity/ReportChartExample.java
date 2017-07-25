package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.List;

public class ReportChartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String customWhere;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ReportChartExample() {
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

        public Criteria andChartnameIsNull() {
            addCriterion("chartname is null");
            return (Criteria) this;
        }

        public Criteria andChartnameIsNotNull() {
            addCriterion("chartname is not null");
            return (Criteria) this;
        }

        public Criteria andChartnameEqualTo(String value) {
            addCriterion("chartname =", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameNotEqualTo(String value) {
            addCriterion("chartname <>", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameGreaterThan(String value) {
            addCriterion("chartname >", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameGreaterThanOrEqualTo(String value) {
            addCriterion("chartname >=", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameLessThan(String value) {
            addCriterion("chartname <", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameLessThanOrEqualTo(String value) {
            addCriterion("chartname <=", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameLike(String value) {
            addCriterion("chartname like", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameNotLike(String value) {
            addCriterion("chartname not like", value, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameIn(List<String> values) {
            addCriterion("chartname in", values, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameNotIn(List<String> values) {
            addCriterion("chartname not in", values, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameBetween(String value1, String value2) {
            addCriterion("chartname between", value1, value2, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartnameNotBetween(String value1, String value2) {
            addCriterion("chartname not between", value1, value2, "chartname");
            return (Criteria) this;
        }

        public Criteria andChartdescIsNull() {
            addCriterion("chartdesc is null");
            return (Criteria) this;
        }

        public Criteria andChartdescIsNotNull() {
            addCriterion("chartdesc is not null");
            return (Criteria) this;
        }

        public Criteria andChartdescEqualTo(String value) {
            addCriterion("chartdesc =", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescNotEqualTo(String value) {
            addCriterion("chartdesc <>", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescGreaterThan(String value) {
            addCriterion("chartdesc >", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescGreaterThanOrEqualTo(String value) {
            addCriterion("chartdesc >=", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescLessThan(String value) {
            addCriterion("chartdesc <", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescLessThanOrEqualTo(String value) {
            addCriterion("chartdesc <=", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescLike(String value) {
            addCriterion("chartdesc like", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescNotLike(String value) {
            addCriterion("chartdesc not like", value, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescIn(List<String> values) {
            addCriterion("chartdesc in", values, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescNotIn(List<String> values) {
            addCriterion("chartdesc not in", values, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescBetween(String value1, String value2) {
            addCriterion("chartdesc between", value1, value2, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andChartdescNotBetween(String value1, String value2) {
            addCriterion("chartdesc not between", value1, value2, "chartdesc");
            return (Criteria) this;
        }

        public Criteria andCharttypeIsNull() {
            addCriterion("charttype is null");
            return (Criteria) this;
        }

        public Criteria andCharttypeIsNotNull() {
            addCriterion("charttype is not null");
            return (Criteria) this;
        }

        public Criteria andCharttypeEqualTo(String value) {
            addCriterion("charttype =", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeNotEqualTo(String value) {
            addCriterion("charttype <>", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeGreaterThan(String value) {
            addCriterion("charttype >", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeGreaterThanOrEqualTo(String value) {
            addCriterion("charttype >=", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeLessThan(String value) {
            addCriterion("charttype <", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeLessThanOrEqualTo(String value) {
            addCriterion("charttype <=", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeLike(String value) {
            addCriterion("charttype like", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeNotLike(String value) {
            addCriterion("charttype not like", value, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeIn(List<String> values) {
            addCriterion("charttype in", values, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeNotIn(List<String> values) {
            addCriterion("charttype not in", values, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeBetween(String value1, String value2) {
            addCriterion("charttype between", value1, value2, "charttype");
            return (Criteria) this;
        }

        public Criteria andCharttypeNotBetween(String value1, String value2) {
            addCriterion("charttype not between", value1, value2, "charttype");
            return (Criteria) this;
        }

        public Criteria andChartsqlIsNull() {
            addCriterion("chartsql is null");
            return (Criteria) this;
        }

        public Criteria andChartsqlIsNotNull() {
            addCriterion("chartsql is not null");
            return (Criteria) this;
        }

        public Criteria andChartsqlEqualTo(String value) {
            addCriterion("chartsql =", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlNotEqualTo(String value) {
            addCriterion("chartsql <>", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlGreaterThan(String value) {
            addCriterion("chartsql >", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlGreaterThanOrEqualTo(String value) {
            addCriterion("chartsql >=", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlLessThan(String value) {
            addCriterion("chartsql <", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlLessThanOrEqualTo(String value) {
            addCriterion("chartsql <=", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlLike(String value) {
            addCriterion("chartsql like", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlNotLike(String value) {
            addCriterion("chartsql not like", value, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlIn(List<String> values) {
            addCriterion("chartsql in", values, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlNotIn(List<String> values) {
            addCriterion("chartsql not in", values, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlBetween(String value1, String value2) {
            addCriterion("chartsql between", value1, value2, "chartsql");
            return (Criteria) this;
        }

        public Criteria andChartsqlNotBetween(String value1, String value2) {
            addCriterion("chartsql not between", value1, value2, "chartsql");
            return (Criteria) this;
        }

        public Criteria andNitemsIsNull() {
            addCriterion("nitems is null");
            return (Criteria) this;
        }

        public Criteria andNitemsIsNotNull() {
            addCriterion("nitems is not null");
            return (Criteria) this;
        }

        public Criteria andNitemsEqualTo(String value) {
            addCriterion("nitems =", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsNotEqualTo(String value) {
            addCriterion("nitems <>", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsGreaterThan(String value) {
            addCriterion("nitems >", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsGreaterThanOrEqualTo(String value) {
            addCriterion("nitems >=", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsLessThan(String value) {
            addCriterion("nitems <", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsLessThanOrEqualTo(String value) {
            addCriterion("nitems <=", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsLike(String value) {
            addCriterion("nitems like", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsNotLike(String value) {
            addCriterion("nitems not like", value, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsIn(List<String> values) {
            addCriterion("nitems in", values, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsNotIn(List<String> values) {
            addCriterion("nitems not in", values, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsBetween(String value1, String value2) {
            addCriterion("nitems between", value1, value2, "nitems");
            return (Criteria) this;
        }

        public Criteria andNitemsNotBetween(String value1, String value2) {
            addCriterion("nitems not between", value1, value2, "nitems");
            return (Criteria) this;
        }

        public Criteria andVitemsIsNull() {
            addCriterion("vitems is null");
            return (Criteria) this;
        }

        public Criteria andVitemsIsNotNull() {
            addCriterion("vitems is not null");
            return (Criteria) this;
        }

        public Criteria andVitemsEqualTo(String value) {
            addCriterion("vitems =", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsNotEqualTo(String value) {
            addCriterion("vitems <>", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsGreaterThan(String value) {
            addCriterion("vitems >", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsGreaterThanOrEqualTo(String value) {
            addCriterion("vitems >=", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsLessThan(String value) {
            addCriterion("vitems <", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsLessThanOrEqualTo(String value) {
            addCriterion("vitems <=", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsLike(String value) {
            addCriterion("vitems like", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsNotLike(String value) {
            addCriterion("vitems not like", value, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsIn(List<String> values) {
            addCriterion("vitems in", values, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsNotIn(List<String> values) {
            addCriterion("vitems not in", values, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsBetween(String value1, String value2) {
            addCriterion("vitems between", value1, value2, "vitems");
            return (Criteria) this;
        }

        public Criteria andVitemsNotBetween(String value1, String value2) {
            addCriterion("vitems not between", value1, value2, "vitems");
            return (Criteria) this;
        }

        public Criteria andYitemsIsNull() {
            addCriterion("yitems is null");
            return (Criteria) this;
        }

        public Criteria andYitemsIsNotNull() {
            addCriterion("yitems is not null");
            return (Criteria) this;
        }

        public Criteria andYitemsEqualTo(String value) {
            addCriterion("yitems =", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsNotEqualTo(String value) {
            addCriterion("yitems <>", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsGreaterThan(String value) {
            addCriterion("yitems >", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsGreaterThanOrEqualTo(String value) {
            addCriterion("yitems >=", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsLessThan(String value) {
            addCriterion("yitems <", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsLessThanOrEqualTo(String value) {
            addCriterion("yitems <=", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsLike(String value) {
            addCriterion("yitems like", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsNotLike(String value) {
            addCriterion("yitems not like", value, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsIn(List<String> values) {
            addCriterion("yitems in", values, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsNotIn(List<String> values) {
            addCriterion("yitems not in", values, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsBetween(String value1, String value2) {
            addCriterion("yitems between", value1, value2, "yitems");
            return (Criteria) this;
        }

        public Criteria andYitemsNotBetween(String value1, String value2) {
            addCriterion("yitems not between", value1, value2, "yitems");
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