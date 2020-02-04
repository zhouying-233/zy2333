package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class PatriarchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PatriarchExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPphotoIsNull() {
            addCriterion("pphoto is null");
            return (Criteria) this;
        }

        public Criteria andPphotoIsNotNull() {
            addCriterion("pphoto is not null");
            return (Criteria) this;
        }

        public Criteria andPphotoEqualTo(String value) {
            addCriterion("pphoto =", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoNotEqualTo(String value) {
            addCriterion("pphoto <>", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoGreaterThan(String value) {
            addCriterion("pphoto >", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoGreaterThanOrEqualTo(String value) {
            addCriterion("pphoto >=", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoLessThan(String value) {
            addCriterion("pphoto <", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoLessThanOrEqualTo(String value) {
            addCriterion("pphoto <=", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoLike(String value) {
            addCriterion("pphoto like", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoNotLike(String value) {
            addCriterion("pphoto not like", value, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoIn(List<String> values) {
            addCriterion("pphoto in", values, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoNotIn(List<String> values) {
            addCriterion("pphoto not in", values, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoBetween(String value1, String value2) {
            addCriterion("pphoto between", value1, value2, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPphotoNotBetween(String value1, String value2) {
            addCriterion("pphoto not between", value1, value2, "pphoto");
            return (Criteria) this;
        }

        public Criteria andPpwdIsNull() {
            addCriterion("ppwd is null");
            return (Criteria) this;
        }

        public Criteria andPpwdIsNotNull() {
            addCriterion("ppwd is not null");
            return (Criteria) this;
        }

        public Criteria andPpwdEqualTo(String value) {
            addCriterion("ppwd =", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdNotEqualTo(String value) {
            addCriterion("ppwd <>", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdGreaterThan(String value) {
            addCriterion("ppwd >", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdGreaterThanOrEqualTo(String value) {
            addCriterion("ppwd >=", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdLessThan(String value) {
            addCriterion("ppwd <", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdLessThanOrEqualTo(String value) {
            addCriterion("ppwd <=", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdLike(String value) {
            addCriterion("ppwd like", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdNotLike(String value) {
            addCriterion("ppwd not like", value, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdIn(List<String> values) {
            addCriterion("ppwd in", values, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdNotIn(List<String> values) {
            addCriterion("ppwd not in", values, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdBetween(String value1, String value2) {
            addCriterion("ppwd between", value1, value2, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPpwdNotBetween(String value1, String value2) {
            addCriterion("ppwd not between", value1, value2, "ppwd");
            return (Criteria) this;
        }

        public Criteria andPtelIsNull() {
            addCriterion("ptel is null");
            return (Criteria) this;
        }

        public Criteria andPtelIsNotNull() {
            addCriterion("ptel is not null");
            return (Criteria) this;
        }

        public Criteria andPtelEqualTo(Integer value) {
            addCriterion("ptel =", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotEqualTo(Integer value) {
            addCriterion("ptel <>", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelGreaterThan(Integer value) {
            addCriterion("ptel >", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptel >=", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLessThan(Integer value) {
            addCriterion("ptel <", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelLessThanOrEqualTo(Integer value) {
            addCriterion("ptel <=", value, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelIn(List<Integer> values) {
            addCriterion("ptel in", values, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotIn(List<Integer> values) {
            addCriterion("ptel not in", values, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelBetween(Integer value1, Integer value2) {
            addCriterion("ptel between", value1, value2, "ptel");
            return (Criteria) this;
        }

        public Criteria andPtelNotBetween(Integer value1, Integer value2) {
            addCriterion("ptel not between", value1, value2, "ptel");
            return (Criteria) this;
        }

        public Criteria andPaddressIsNull() {
            addCriterion("paddress is null");
            return (Criteria) this;
        }

        public Criteria andPaddressIsNotNull() {
            addCriterion("paddress is not null");
            return (Criteria) this;
        }

        public Criteria andPaddressEqualTo(String value) {
            addCriterion("paddress =", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotEqualTo(String value) {
            addCriterion("paddress <>", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressGreaterThan(String value) {
            addCriterion("paddress >", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressGreaterThanOrEqualTo(String value) {
            addCriterion("paddress >=", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLessThan(String value) {
            addCriterion("paddress <", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLessThanOrEqualTo(String value) {
            addCriterion("paddress <=", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressLike(String value) {
            addCriterion("paddress like", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotLike(String value) {
            addCriterion("paddress not like", value, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressIn(List<String> values) {
            addCriterion("paddress in", values, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotIn(List<String> values) {
            addCriterion("paddress not in", values, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressBetween(String value1, String value2) {
            addCriterion("paddress between", value1, value2, "paddress");
            return (Criteria) this;
        }

        public Criteria andPaddressNotBetween(String value1, String value2) {
            addCriterion("paddress not between", value1, value2, "paddress");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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