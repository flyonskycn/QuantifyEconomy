package com.flyonsky.quantify.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VAnnualReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String customWhere;

    protected Integer limitStart;

    protected Integer limitEnd;

    public VAnnualReportExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNull() {
            addCriterion("revenue is null");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNotNull() {
            addCriterion("revenue is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueEqualTo(BigDecimal value) {
            addCriterion("revenue =", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotEqualTo(BigDecimal value) {
            addCriterion("revenue <>", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThan(BigDecimal value) {
            addCriterion("revenue >", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("revenue >=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThan(BigDecimal value) {
            addCriterion("revenue <", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("revenue <=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueIn(List<BigDecimal> values) {
            addCriterion("revenue in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotIn(List<BigDecimal> values) {
            addCriterion("revenue not in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("revenue between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("revenue not between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andOperprofitIsNull() {
            addCriterion("operprofit is null");
            return (Criteria) this;
        }

        public Criteria andOperprofitIsNotNull() {
            addCriterion("operprofit is not null");
            return (Criteria) this;
        }

        public Criteria andOperprofitEqualTo(BigDecimal value) {
            addCriterion("operprofit =", value, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitNotEqualTo(BigDecimal value) {
            addCriterion("operprofit <>", value, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitGreaterThan(BigDecimal value) {
            addCriterion("operprofit >", value, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("operprofit >=", value, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitLessThan(BigDecimal value) {
            addCriterion("operprofit <", value, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("operprofit <=", value, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitIn(List<BigDecimal> values) {
            addCriterion("operprofit in", values, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitNotIn(List<BigDecimal> values) {
            addCriterion("operprofit not in", values, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operprofit between", value1, value2, "operprofit");
            return (Criteria) this;
        }

        public Criteria andOperprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("operprofit not between", value1, value2, "operprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitIsNull() {
            addCriterion("totalprofit is null");
            return (Criteria) this;
        }

        public Criteria andTotalprofitIsNotNull() {
            addCriterion("totalprofit is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprofitEqualTo(BigDecimal value) {
            addCriterion("totalprofit =", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitNotEqualTo(BigDecimal value) {
            addCriterion("totalprofit <>", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitGreaterThan(BigDecimal value) {
            addCriterion("totalprofit >", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalprofit >=", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitLessThan(BigDecimal value) {
            addCriterion("totalprofit <", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalprofit <=", value, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitIn(List<BigDecimal> values) {
            addCriterion("totalprofit in", values, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitNotIn(List<BigDecimal> values) {
            addCriterion("totalprofit not in", values, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalprofit between", value1, value2, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andTotalprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalprofit not between", value1, value2, "totalprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitIsNull() {
            addCriterion("netprofit is null");
            return (Criteria) this;
        }

        public Criteria andNetprofitIsNotNull() {
            addCriterion("netprofit is not null");
            return (Criteria) this;
        }

        public Criteria andNetprofitEqualTo(BigDecimal value) {
            addCriterion("netprofit =", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotEqualTo(BigDecimal value) {
            addCriterion("netprofit <>", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitGreaterThan(BigDecimal value) {
            addCriterion("netprofit >", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netprofit >=", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLessThan(BigDecimal value) {
            addCriterion("netprofit <", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netprofit <=", value, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitIn(List<BigDecimal> values) {
            addCriterion("netprofit in", values, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotIn(List<BigDecimal> values) {
            addCriterion("netprofit not in", values, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netprofit between", value1, value2, "netprofit");
            return (Criteria) this;
        }

        public Criteria andNetprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netprofit not between", value1, value2, "netprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitIsNull() {
            addCriterion("shnetprofit is null");
            return (Criteria) this;
        }

        public Criteria andShnetprofitIsNotNull() {
            addCriterion("shnetprofit is not null");
            return (Criteria) this;
        }

        public Criteria andShnetprofitEqualTo(BigDecimal value) {
            addCriterion("shnetprofit =", value, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitNotEqualTo(BigDecimal value) {
            addCriterion("shnetprofit <>", value, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitGreaterThan(BigDecimal value) {
            addCriterion("shnetprofit >", value, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shnetprofit >=", value, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitLessThan(BigDecimal value) {
            addCriterion("shnetprofit <", value, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shnetprofit <=", value, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitIn(List<BigDecimal> values) {
            addCriterion("shnetprofit in", values, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitNotIn(List<BigDecimal> values) {
            addCriterion("shnetprofit not in", values, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shnetprofit between", value1, value2, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andShnetprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shnetprofit not between", value1, value2, "shnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitIsNull() {
            addCriterion("deshnetprofit is null");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitIsNotNull() {
            addCriterion("deshnetprofit is not null");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitEqualTo(BigDecimal value) {
            addCriterion("deshnetprofit =", value, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitNotEqualTo(BigDecimal value) {
            addCriterion("deshnetprofit <>", value, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitGreaterThan(BigDecimal value) {
            addCriterion("deshnetprofit >", value, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deshnetprofit >=", value, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitLessThan(BigDecimal value) {
            addCriterion("deshnetprofit <", value, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deshnetprofit <=", value, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitIn(List<BigDecimal> values) {
            addCriterion("deshnetprofit in", values, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitNotIn(List<BigDecimal> values) {
            addCriterion("deshnetprofit not in", values, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deshnetprofit between", value1, value2, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andDeshnetprofitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deshnetprofit not between", value1, value2, "deshnetprofit");
            return (Criteria) this;
        }

        public Criteria andNetcashflowIsNull() {
            addCriterion("netcashflow is null");
            return (Criteria) this;
        }

        public Criteria andNetcashflowIsNotNull() {
            addCriterion("netcashflow is not null");
            return (Criteria) this;
        }

        public Criteria andNetcashflowEqualTo(BigDecimal value) {
            addCriterion("netcashflow =", value, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowNotEqualTo(BigDecimal value) {
            addCriterion("netcashflow <>", value, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowGreaterThan(BigDecimal value) {
            addCriterion("netcashflow >", value, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netcashflow >=", value, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowLessThan(BigDecimal value) {
            addCriterion("netcashflow <", value, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netcashflow <=", value, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowIn(List<BigDecimal> values) {
            addCriterion("netcashflow in", values, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowNotIn(List<BigDecimal> values) {
            addCriterion("netcashflow not in", values, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netcashflow between", value1, value2, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andNetcashflowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netcashflow not between", value1, value2, "netcashflow");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIsNull() {
            addCriterion("totalassets is null");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIsNotNull() {
            addCriterion("totalassets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalassetsEqualTo(BigDecimal value) {
            addCriterion("totalassets =", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotEqualTo(BigDecimal value) {
            addCriterion("totalassets <>", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsGreaterThan(BigDecimal value) {
            addCriterion("totalassets >", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalassets >=", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsLessThan(BigDecimal value) {
            addCriterion("totalassets <", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalassets <=", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIn(List<BigDecimal> values) {
            addCriterion("totalassets in", values, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotIn(List<BigDecimal> values) {
            addCriterion("totalassets not in", values, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalassets between", value1, value2, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalassets not between", value1, value2, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityIsNull() {
            addCriterion("totalliability is null");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityIsNotNull() {
            addCriterion("totalliability is not null");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityEqualTo(BigDecimal value) {
            addCriterion("totalliability =", value, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityNotEqualTo(BigDecimal value) {
            addCriterion("totalliability <>", value, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityGreaterThan(BigDecimal value) {
            addCriterion("totalliability >", value, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("totalliability >=", value, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityLessThan(BigDecimal value) {
            addCriterion("totalliability <", value, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("totalliability <=", value, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityIn(List<BigDecimal> values) {
            addCriterion("totalliability in", values, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityNotIn(List<BigDecimal> values) {
            addCriterion("totalliability not in", values, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalliability between", value1, value2, "totalliability");
            return (Criteria) this;
        }

        public Criteria andTotalliabilityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("totalliability not between", value1, value2, "totalliability");
            return (Criteria) this;
        }

        public Criteria andShequityIsNull() {
            addCriterion("shequity is null");
            return (Criteria) this;
        }

        public Criteria andShequityIsNotNull() {
            addCriterion("shequity is not null");
            return (Criteria) this;
        }

        public Criteria andShequityEqualTo(BigDecimal value) {
            addCriterion("shequity =", value, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityNotEqualTo(BigDecimal value) {
            addCriterion("shequity <>", value, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityGreaterThan(BigDecimal value) {
            addCriterion("shequity >", value, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shequity >=", value, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityLessThan(BigDecimal value) {
            addCriterion("shequity <", value, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shequity <=", value, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityIn(List<BigDecimal> values) {
            addCriterion("shequity in", values, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityNotIn(List<BigDecimal> values) {
            addCriterion("shequity not in", values, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shequity between", value1, value2, "shequity");
            return (Criteria) this;
        }

        public Criteria andShequityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shequity not between", value1, value2, "shequity");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIsNull() {
            addCriterion("totalshares is null");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIsNotNull() {
            addCriterion("totalshares is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsharesEqualTo(Long value) {
            addCriterion("totalshares =", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotEqualTo(Long value) {
            addCriterion("totalshares <>", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesGreaterThan(Long value) {
            addCriterion("totalshares >", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesGreaterThanOrEqualTo(Long value) {
            addCriterion("totalshares >=", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLessThan(Long value) {
            addCriterion("totalshares <", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesLessThanOrEqualTo(Long value) {
            addCriterion("totalshares <=", value, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesIn(List<Long> values) {
            addCriterion("totalshares in", values, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotIn(List<Long> values) {
            addCriterion("totalshares not in", values, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesBetween(Long value1, Long value2) {
            addCriterion("totalshares between", value1, value2, "totalshares");
            return (Criteria) this;
        }

        public Criteria andTotalsharesNotBetween(Long value1, Long value2) {
            addCriterion("totalshares not between", value1, value2, "totalshares");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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