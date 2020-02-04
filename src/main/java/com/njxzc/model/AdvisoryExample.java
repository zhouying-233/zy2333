package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class AdvisoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdvisoryExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNull() {
            addCriterion("adname is null");
            return (Criteria) this;
        }

        public Criteria andAdnameIsNotNull() {
            addCriterion("adname is not null");
            return (Criteria) this;
        }

        public Criteria andAdnameEqualTo(String value) {
            addCriterion("adname =", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotEqualTo(String value) {
            addCriterion("adname <>", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThan(String value) {
            addCriterion("adname >", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameGreaterThanOrEqualTo(String value) {
            addCriterion("adname >=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThan(String value) {
            addCriterion("adname <", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLessThanOrEqualTo(String value) {
            addCriterion("adname <=", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameLike(String value) {
            addCriterion("adname like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotLike(String value) {
            addCriterion("adname not like", value, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameIn(List<String> values) {
            addCriterion("adname in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotIn(List<String> values) {
            addCriterion("adname not in", values, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameBetween(String value1, String value2) {
            addCriterion("adname between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdnameNotBetween(String value1, String value2) {
            addCriterion("adname not between", value1, value2, "adname");
            return (Criteria) this;
        }

        public Criteria andAdcontentIsNull() {
            addCriterion("adcontent is null");
            return (Criteria) this;
        }

        public Criteria andAdcontentIsNotNull() {
            addCriterion("adcontent is not null");
            return (Criteria) this;
        }

        public Criteria andAdcontentEqualTo(String value) {
            addCriterion("adcontent =", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotEqualTo(String value) {
            addCriterion("adcontent <>", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentGreaterThan(String value) {
            addCriterion("adcontent >", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentGreaterThanOrEqualTo(String value) {
            addCriterion("adcontent >=", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentLessThan(String value) {
            addCriterion("adcontent <", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentLessThanOrEqualTo(String value) {
            addCriterion("adcontent <=", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentLike(String value) {
            addCriterion("adcontent like", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotLike(String value) {
            addCriterion("adcontent not like", value, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentIn(List<String> values) {
            addCriterion("adcontent in", values, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotIn(List<String> values) {
            addCriterion("adcontent not in", values, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentBetween(String value1, String value2) {
            addCriterion("adcontent between", value1, value2, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdcontentNotBetween(String value1, String value2) {
            addCriterion("adcontent not between", value1, value2, "adcontent");
            return (Criteria) this;
        }

        public Criteria andAdtelIsNull() {
            addCriterion("adtel is null");
            return (Criteria) this;
        }

        public Criteria andAdtelIsNotNull() {
            addCriterion("adtel is not null");
            return (Criteria) this;
        }

        public Criteria andAdtelEqualTo(Integer value) {
            addCriterion("adtel =", value, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelNotEqualTo(Integer value) {
            addCriterion("adtel <>", value, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelGreaterThan(Integer value) {
            addCriterion("adtel >", value, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("adtel >=", value, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelLessThan(Integer value) {
            addCriterion("adtel <", value, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelLessThanOrEqualTo(Integer value) {
            addCriterion("adtel <=", value, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelIn(List<Integer> values) {
            addCriterion("adtel in", values, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelNotIn(List<Integer> values) {
            addCriterion("adtel not in", values, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelBetween(Integer value1, Integer value2) {
            addCriterion("adtel between", value1, value2, "adtel");
            return (Criteria) this;
        }

        public Criteria andAdtelNotBetween(Integer value1, Integer value2) {
            addCriterion("adtel not between", value1, value2, "adtel");
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