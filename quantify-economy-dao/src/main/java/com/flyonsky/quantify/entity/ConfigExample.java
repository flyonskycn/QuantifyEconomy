package com.flyonsky.quantify.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String customWhere;

    protected Integer limitStart;

    protected Integer limitEnd;

    public ConfigExample() {
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

        public Criteria andCfgkeyIsNull() {
            addCriterion("cfgkey is null");
            return (Criteria) this;
        }

        public Criteria andCfgkeyIsNotNull() {
            addCriterion("cfgkey is not null");
            return (Criteria) this;
        }

        public Criteria andCfgkeyEqualTo(String value) {
            addCriterion("cfgkey =", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyNotEqualTo(String value) {
            addCriterion("cfgkey <>", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyGreaterThan(String value) {
            addCriterion("cfgkey >", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyGreaterThanOrEqualTo(String value) {
            addCriterion("cfgkey >=", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyLessThan(String value) {
            addCriterion("cfgkey <", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyLessThanOrEqualTo(String value) {
            addCriterion("cfgkey <=", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyLike(String value) {
            addCriterion("cfgkey like", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyNotLike(String value) {
            addCriterion("cfgkey not like", value, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyIn(List<String> values) {
            addCriterion("cfgkey in", values, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyNotIn(List<String> values) {
            addCriterion("cfgkey not in", values, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyBetween(String value1, String value2) {
            addCriterion("cfgkey between", value1, value2, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgkeyNotBetween(String value1, String value2) {
            addCriterion("cfgkey not between", value1, value2, "cfgkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyIsNull() {
            addCriterion("cfgpkey is null");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyIsNotNull() {
            addCriterion("cfgpkey is not null");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyEqualTo(String value) {
            addCriterion("cfgpkey =", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyNotEqualTo(String value) {
            addCriterion("cfgpkey <>", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyGreaterThan(String value) {
            addCriterion("cfgpkey >", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyGreaterThanOrEqualTo(String value) {
            addCriterion("cfgpkey >=", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyLessThan(String value) {
            addCriterion("cfgpkey <", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyLessThanOrEqualTo(String value) {
            addCriterion("cfgpkey <=", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyLike(String value) {
            addCriterion("cfgpkey like", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyNotLike(String value) {
            addCriterion("cfgpkey not like", value, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyIn(List<String> values) {
            addCriterion("cfgpkey in", values, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyNotIn(List<String> values) {
            addCriterion("cfgpkey not in", values, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyBetween(String value1, String value2) {
            addCriterion("cfgpkey between", value1, value2, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgpkeyNotBetween(String value1, String value2) {
            addCriterion("cfgpkey not between", value1, value2, "cfgpkey");
            return (Criteria) this;
        }

        public Criteria andCfgnameIsNull() {
            addCriterion("cfgname is null");
            return (Criteria) this;
        }

        public Criteria andCfgnameIsNotNull() {
            addCriterion("cfgname is not null");
            return (Criteria) this;
        }

        public Criteria andCfgnameEqualTo(String value) {
            addCriterion("cfgname =", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameNotEqualTo(String value) {
            addCriterion("cfgname <>", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameGreaterThan(String value) {
            addCriterion("cfgname >", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameGreaterThanOrEqualTo(String value) {
            addCriterion("cfgname >=", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameLessThan(String value) {
            addCriterion("cfgname <", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameLessThanOrEqualTo(String value) {
            addCriterion("cfgname <=", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameLike(String value) {
            addCriterion("cfgname like", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameNotLike(String value) {
            addCriterion("cfgname not like", value, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameIn(List<String> values) {
            addCriterion("cfgname in", values, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameNotIn(List<String> values) {
            addCriterion("cfgname not in", values, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameBetween(String value1, String value2) {
            addCriterion("cfgname between", value1, value2, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgnameNotBetween(String value1, String value2) {
            addCriterion("cfgname not between", value1, value2, "cfgname");
            return (Criteria) this;
        }

        public Criteria andCfgvalueIsNull() {
            addCriterion("cfgvalue is null");
            return (Criteria) this;
        }

        public Criteria andCfgvalueIsNotNull() {
            addCriterion("cfgvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCfgvalueEqualTo(String value) {
            addCriterion("cfgvalue =", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueNotEqualTo(String value) {
            addCriterion("cfgvalue <>", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueGreaterThan(String value) {
            addCriterion("cfgvalue >", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueGreaterThanOrEqualTo(String value) {
            addCriterion("cfgvalue >=", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueLessThan(String value) {
            addCriterion("cfgvalue <", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueLessThanOrEqualTo(String value) {
            addCriterion("cfgvalue <=", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueLike(String value) {
            addCriterion("cfgvalue like", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueNotLike(String value) {
            addCriterion("cfgvalue not like", value, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueIn(List<String> values) {
            addCriterion("cfgvalue in", values, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueNotIn(List<String> values) {
            addCriterion("cfgvalue not in", values, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueBetween(String value1, String value2) {
            addCriterion("cfgvalue between", value1, value2, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgvalueNotBetween(String value1, String value2) {
            addCriterion("cfgvalue not between", value1, value2, "cfgvalue");
            return (Criteria) this;
        }

        public Criteria andCfgtypeIsNull() {
            addCriterion("cfgtype is null");
            return (Criteria) this;
        }

        public Criteria andCfgtypeIsNotNull() {
            addCriterion("cfgtype is not null");
            return (Criteria) this;
        }

        public Criteria andCfgtypeEqualTo(String value) {
            addCriterion("cfgtype =", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeNotEqualTo(String value) {
            addCriterion("cfgtype <>", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeGreaterThan(String value) {
            addCriterion("cfgtype >", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cfgtype >=", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeLessThan(String value) {
            addCriterion("cfgtype <", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeLessThanOrEqualTo(String value) {
            addCriterion("cfgtype <=", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeLike(String value) {
            addCriterion("cfgtype like", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeNotLike(String value) {
            addCriterion("cfgtype not like", value, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeIn(List<String> values) {
            addCriterion("cfgtype in", values, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeNotIn(List<String> values) {
            addCriterion("cfgtype not in", values, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeBetween(String value1, String value2) {
            addCriterion("cfgtype between", value1, value2, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgtypeNotBetween(String value1, String value2) {
            addCriterion("cfgtype not between", value1, value2, "cfgtype");
            return (Criteria) this;
        }

        public Criteria andCfgdescIsNull() {
            addCriterion("cfgdesc is null");
            return (Criteria) this;
        }

        public Criteria andCfgdescIsNotNull() {
            addCriterion("cfgdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCfgdescEqualTo(String value) {
            addCriterion("cfgdesc =", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescNotEqualTo(String value) {
            addCriterion("cfgdesc <>", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescGreaterThan(String value) {
            addCriterion("cfgdesc >", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescGreaterThanOrEqualTo(String value) {
            addCriterion("cfgdesc >=", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescLessThan(String value) {
            addCriterion("cfgdesc <", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescLessThanOrEqualTo(String value) {
            addCriterion("cfgdesc <=", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescLike(String value) {
            addCriterion("cfgdesc like", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescNotLike(String value) {
            addCriterion("cfgdesc not like", value, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescIn(List<String> values) {
            addCriterion("cfgdesc in", values, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescNotIn(List<String> values) {
            addCriterion("cfgdesc not in", values, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescBetween(String value1, String value2) {
            addCriterion("cfgdesc between", value1, value2, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgdescNotBetween(String value1, String value2) {
            addCriterion("cfgdesc not between", value1, value2, "cfgdesc");
            return (Criteria) this;
        }

        public Criteria andCfgregexIsNull() {
            addCriterion("cfgregex is null");
            return (Criteria) this;
        }

        public Criteria andCfgregexIsNotNull() {
            addCriterion("cfgregex is not null");
            return (Criteria) this;
        }

        public Criteria andCfgregexEqualTo(String value) {
            addCriterion("cfgregex =", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexNotEqualTo(String value) {
            addCriterion("cfgregex <>", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexGreaterThan(String value) {
            addCriterion("cfgregex >", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexGreaterThanOrEqualTo(String value) {
            addCriterion("cfgregex >=", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexLessThan(String value) {
            addCriterion("cfgregex <", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexLessThanOrEqualTo(String value) {
            addCriterion("cfgregex <=", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexLike(String value) {
            addCriterion("cfgregex like", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexNotLike(String value) {
            addCriterion("cfgregex not like", value, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexIn(List<String> values) {
            addCriterion("cfgregex in", values, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexNotIn(List<String> values) {
            addCriterion("cfgregex not in", values, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexBetween(String value1, String value2) {
            addCriterion("cfgregex between", value1, value2, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfgregexNotBetween(String value1, String value2) {
            addCriterion("cfgregex not between", value1, value2, "cfgregex");
            return (Criteria) this;
        }

        public Criteria andCfglistIsNull() {
            addCriterion("cfglist is null");
            return (Criteria) this;
        }

        public Criteria andCfglistIsNotNull() {
            addCriterion("cfglist is not null");
            return (Criteria) this;
        }

        public Criteria andCfglistEqualTo(String value) {
            addCriterion("cfglist =", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistNotEqualTo(String value) {
            addCriterion("cfglist <>", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistGreaterThan(String value) {
            addCriterion("cfglist >", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistGreaterThanOrEqualTo(String value) {
            addCriterion("cfglist >=", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistLessThan(String value) {
            addCriterion("cfglist <", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistLessThanOrEqualTo(String value) {
            addCriterion("cfglist <=", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistLike(String value) {
            addCriterion("cfglist like", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistNotLike(String value) {
            addCriterion("cfglist not like", value, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistIn(List<String> values) {
            addCriterion("cfglist in", values, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistNotIn(List<String> values) {
            addCriterion("cfglist not in", values, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistBetween(String value1, String value2) {
            addCriterion("cfglist between", value1, value2, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfglistNotBetween(String value1, String value2) {
            addCriterion("cfglist not between", value1, value2, "cfglist");
            return (Criteria) this;
        }

        public Criteria andCfgsortIsNull() {
            addCriterion("cfgsort is null");
            return (Criteria) this;
        }

        public Criteria andCfgsortIsNotNull() {
            addCriterion("cfgsort is not null");
            return (Criteria) this;
        }

        public Criteria andCfgsortEqualTo(Integer value) {
            addCriterion("cfgsort =", value, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortNotEqualTo(Integer value) {
            addCriterion("cfgsort <>", value, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortGreaterThan(Integer value) {
            addCriterion("cfgsort >", value, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortGreaterThanOrEqualTo(Integer value) {
            addCriterion("cfgsort >=", value, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortLessThan(Integer value) {
            addCriterion("cfgsort <", value, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortLessThanOrEqualTo(Integer value) {
            addCriterion("cfgsort <=", value, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortIn(List<Integer> values) {
            addCriterion("cfgsort in", values, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortNotIn(List<Integer> values) {
            addCriterion("cfgsort not in", values, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortBetween(Integer value1, Integer value2) {
            addCriterion("cfgsort between", value1, value2, "cfgsort");
            return (Criteria) this;
        }

        public Criteria andCfgsortNotBetween(Integer value1, Integer value2) {
            addCriterion("cfgsort not between", value1, value2, "cfgsort");
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