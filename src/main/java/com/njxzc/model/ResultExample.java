package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class ResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ResultExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andResultidIsNull() {
            addCriterion("resultid is null");
            return (Criteria) this;
        }

        public Criteria andResultidIsNotNull() {
            addCriterion("resultid is not null");
            return (Criteria) this;
        }

        public Criteria andResultidEqualTo(Integer value) {
            addCriterion("resultid =", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotEqualTo(Integer value) {
            addCriterion("resultid <>", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThan(Integer value) {
            addCriterion("resultid >", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resultid >=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThan(Integer value) {
            addCriterion("resultid <", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThanOrEqualTo(Integer value) {
            addCriterion("resultid <=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidIn(List<Integer> values) {
            addCriterion("resultid in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotIn(List<Integer> values) {
            addCriterion("resultid not in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidBetween(Integer value1, Integer value2) {
            addCriterion("resultid between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotBetween(Integer value1, Integer value2) {
            addCriterion("resultid not between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andTransformidIsNull() {
            addCriterion("transformid is null");
            return (Criteria) this;
        }

        public Criteria andTransformidIsNotNull() {
            addCriterion("transformid is not null");
            return (Criteria) this;
        }

        public Criteria andTransformidEqualTo(Integer value) {
            addCriterion("transformid =", value, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidNotEqualTo(Integer value) {
            addCriterion("transformid <>", value, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidGreaterThan(Integer value) {
            addCriterion("transformid >", value, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidGreaterThanOrEqualTo(Integer value) {
            addCriterion("transformid >=", value, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidLessThan(Integer value) {
            addCriterion("transformid <", value, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidLessThanOrEqualTo(Integer value) {
            addCriterion("transformid <=", value, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidIn(List<Integer> values) {
            addCriterion("transformid in", values, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidNotIn(List<Integer> values) {
            addCriterion("transformid not in", values, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidBetween(Integer value1, Integer value2) {
            addCriterion("transformid between", value1, value2, "transformid");
            return (Criteria) this;
        }

        public Criteria andTransformidNotBetween(Integer value1, Integer value2) {
            addCriterion("transformid not between", value1, value2, "transformid");
            return (Criteria) this;
        }

        public Criteria andIspassIsNull() {
            addCriterion("ispass is null");
            return (Criteria) this;
        }

        public Criteria andIspassIsNotNull() {
            addCriterion("ispass is not null");
            return (Criteria) this;
        }

        public Criteria andIspassEqualTo(Integer value) {
            addCriterion("ispass =", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotEqualTo(Integer value) {
            addCriterion("ispass <>", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThan(Integer value) {
            addCriterion("ispass >", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispass >=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThan(Integer value) {
            addCriterion("ispass <", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassLessThanOrEqualTo(Integer value) {
            addCriterion("ispass <=", value, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassIn(List<Integer> values) {
            addCriterion("ispass in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotIn(List<Integer> values) {
            addCriterion("ispass not in", values, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassBetween(Integer value1, Integer value2) {
            addCriterion("ispass between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andIspassNotBetween(Integer value1, Integer value2) {
            addCriterion("ispass not between", value1, value2, "ispass");
            return (Criteria) this;
        }

        public Criteria andNoresonIsNull() {
            addCriterion("noreson is null");
            return (Criteria) this;
        }

        public Criteria andNoresonIsNotNull() {
            addCriterion("noreson is not null");
            return (Criteria) this;
        }

        public Criteria andNoresonEqualTo(String value) {
            addCriterion("noreson =", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonNotEqualTo(String value) {
            addCriterion("noreson <>", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonGreaterThan(String value) {
            addCriterion("noreson >", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonGreaterThanOrEqualTo(String value) {
            addCriterion("noreson >=", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonLessThan(String value) {
            addCriterion("noreson <", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonLessThanOrEqualTo(String value) {
            addCriterion("noreson <=", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonLike(String value) {
            addCriterion("noreson like", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonNotLike(String value) {
            addCriterion("noreson not like", value, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonIn(List<String> values) {
            addCriterion("noreson in", values, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonNotIn(List<String> values) {
            addCriterion("noreson not in", values, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonBetween(String value1, String value2) {
            addCriterion("noreson between", value1, value2, "noreson");
            return (Criteria) this;
        }

        public Criteria andNoresonNotBetween(String value1, String value2) {
            addCriterion("noreson not between", value1, value2, "noreson");
            return (Criteria) this;
        }
    }

    /**
     */
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