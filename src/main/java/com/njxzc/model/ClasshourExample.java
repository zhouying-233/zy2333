package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class ClasshourExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public ClasshourExample() {
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

        public Criteria andClasshouridIsNull() {
            addCriterion("classhourid is null");
            return (Criteria) this;
        }

        public Criteria andClasshouridIsNotNull() {
            addCriterion("classhourid is not null");
            return (Criteria) this;
        }

        public Criteria andClasshouridEqualTo(Integer value) {
            addCriterion("classhourid =", value, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridNotEqualTo(Integer value) {
            addCriterion("classhourid <>", value, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridGreaterThan(Integer value) {
            addCriterion("classhourid >", value, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridGreaterThanOrEqualTo(Integer value) {
            addCriterion("classhourid >=", value, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridLessThan(Integer value) {
            addCriterion("classhourid <", value, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridLessThanOrEqualTo(Integer value) {
            addCriterion("classhourid <=", value, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridIn(List<Integer> values) {
            addCriterion("classhourid in", values, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridNotIn(List<Integer> values) {
            addCriterion("classhourid not in", values, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridBetween(Integer value1, Integer value2) {
            addCriterion("classhourid between", value1, value2, "classhourid");
            return (Criteria) this;
        }

        public Criteria andClasshouridNotBetween(Integer value1, Integer value2) {
            addCriterion("classhourid not between", value1, value2, "classhourid");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andCompleteIsNull() {
            addCriterion("complete is null");
            return (Criteria) this;
        }

        public Criteria andCompleteIsNotNull() {
            addCriterion("complete is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteEqualTo(Integer value) {
            addCriterion("complete =", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotEqualTo(Integer value) {
            addCriterion("complete <>", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThan(Integer value) {
            addCriterion("complete >", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("complete >=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThan(Integer value) {
            addCriterion("complete <", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("complete <=", value, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteIn(List<Integer> values) {
            addCriterion("complete in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotIn(List<Integer> values) {
            addCriterion("complete not in", values, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteBetween(Integer value1, Integer value2) {
            addCriterion("complete between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("complete not between", value1, value2, "complete");
            return (Criteria) this;
        }

        public Criteria andIncompelteIsNull() {
            addCriterion("incompelte is null");
            return (Criteria) this;
        }

        public Criteria andIncompelteIsNotNull() {
            addCriterion("incompelte is not null");
            return (Criteria) this;
        }

        public Criteria andIncompelteEqualTo(Integer value) {
            addCriterion("incompelte =", value, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteNotEqualTo(Integer value) {
            addCriterion("incompelte <>", value, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteGreaterThan(Integer value) {
            addCriterion("incompelte >", value, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteGreaterThanOrEqualTo(Integer value) {
            addCriterion("incompelte >=", value, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteLessThan(Integer value) {
            addCriterion("incompelte <", value, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteLessThanOrEqualTo(Integer value) {
            addCriterion("incompelte <=", value, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteIn(List<Integer> values) {
            addCriterion("incompelte in", values, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteNotIn(List<Integer> values) {
            addCriterion("incompelte not in", values, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteBetween(Integer value1, Integer value2) {
            addCriterion("incompelte between", value1, value2, "incompelte");
            return (Criteria) this;
        }

        public Criteria andIncompelteNotBetween(Integer value1, Integer value2) {
            addCriterion("incompelte not between", value1, value2, "incompelte");
            return (Criteria) this;
        }

        public Criteria andSumhourIsNull() {
            addCriterion("sumhour is null");
            return (Criteria) this;
        }

        public Criteria andSumhourIsNotNull() {
            addCriterion("sumhour is not null");
            return (Criteria) this;
        }

        public Criteria andSumhourEqualTo(Integer value) {
            addCriterion("sumhour =", value, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourNotEqualTo(Integer value) {
            addCriterion("sumhour <>", value, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourGreaterThan(Integer value) {
            addCriterion("sumhour >", value, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumhour >=", value, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourLessThan(Integer value) {
            addCriterion("sumhour <", value, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourLessThanOrEqualTo(Integer value) {
            addCriterion("sumhour <=", value, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourIn(List<Integer> values) {
            addCriterion("sumhour in", values, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourNotIn(List<Integer> values) {
            addCriterion("sumhour not in", values, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourBetween(Integer value1, Integer value2) {
            addCriterion("sumhour between", value1, value2, "sumhour");
            return (Criteria) this;
        }

        public Criteria andSumhourNotBetween(Integer value1, Integer value2) {
            addCriterion("sumhour not between", value1, value2, "sumhour");
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