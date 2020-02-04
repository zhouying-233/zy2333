package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TeacherExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTphotoIsNull() {
            addCriterion("tphoto is null");
            return (Criteria) this;
        }

        public Criteria andTphotoIsNotNull() {
            addCriterion("tphoto is not null");
            return (Criteria) this;
        }

        public Criteria andTphotoEqualTo(String value) {
            addCriterion("tphoto =", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotEqualTo(String value) {
            addCriterion("tphoto <>", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoGreaterThan(String value) {
            addCriterion("tphoto >", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoGreaterThanOrEqualTo(String value) {
            addCriterion("tphoto >=", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLessThan(String value) {
            addCriterion("tphoto <", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLessThanOrEqualTo(String value) {
            addCriterion("tphoto <=", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoLike(String value) {
            addCriterion("tphoto like", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotLike(String value) {
            addCriterion("tphoto not like", value, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoIn(List<String> values) {
            addCriterion("tphoto in", values, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotIn(List<String> values) {
            addCriterion("tphoto not in", values, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoBetween(String value1, String value2) {
            addCriterion("tphoto between", value1, value2, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTphotoNotBetween(String value1, String value2) {
            addCriterion("tphoto not between", value1, value2, "tphoto");
            return (Criteria) this;
        }

        public Criteria andTpwdIsNull() {
            addCriterion("tpwd is null");
            return (Criteria) this;
        }

        public Criteria andTpwdIsNotNull() {
            addCriterion("tpwd is not null");
            return (Criteria) this;
        }

        public Criteria andTpwdEqualTo(String value) {
            addCriterion("tpwd =", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotEqualTo(String value) {
            addCriterion("tpwd <>", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdGreaterThan(String value) {
            addCriterion("tpwd >", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdGreaterThanOrEqualTo(String value) {
            addCriterion("tpwd >=", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLessThan(String value) {
            addCriterion("tpwd <", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLessThanOrEqualTo(String value) {
            addCriterion("tpwd <=", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdLike(String value) {
            addCriterion("tpwd like", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotLike(String value) {
            addCriterion("tpwd not like", value, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdIn(List<String> values) {
            addCriterion("tpwd in", values, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotIn(List<String> values) {
            addCriterion("tpwd not in", values, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdBetween(String value1, String value2) {
            addCriterion("tpwd between", value1, value2, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTpwdNotBetween(String value1, String value2) {
            addCriterion("tpwd not between", value1, value2, "tpwd");
            return (Criteria) this;
        }

        public Criteria andTtelIsNull() {
            addCriterion("ttel is null");
            return (Criteria) this;
        }

        public Criteria andTtelIsNotNull() {
            addCriterion("ttel is not null");
            return (Criteria) this;
        }

        public Criteria andTtelEqualTo(Integer value) {
            addCriterion("ttel =", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotEqualTo(Integer value) {
            addCriterion("ttel <>", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelGreaterThan(Integer value) {
            addCriterion("ttel >", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ttel >=", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelLessThan(Integer value) {
            addCriterion("ttel <", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelLessThanOrEqualTo(Integer value) {
            addCriterion("ttel <=", value, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelIn(List<Integer> values) {
            addCriterion("ttel in", values, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotIn(List<Integer> values) {
            addCriterion("ttel not in", values, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelBetween(Integer value1, Integer value2) {
            addCriterion("ttel between", value1, value2, "ttel");
            return (Criteria) this;
        }

        public Criteria andTtelNotBetween(Integer value1, Integer value2) {
            addCriterion("ttel not between", value1, value2, "ttel");
            return (Criteria) this;
        }

        public Criteria andTaddressIsNull() {
            addCriterion("taddress is null");
            return (Criteria) this;
        }

        public Criteria andTaddressIsNotNull() {
            addCriterion("taddress is not null");
            return (Criteria) this;
        }

        public Criteria andTaddressEqualTo(String value) {
            addCriterion("taddress =", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotEqualTo(String value) {
            addCriterion("taddress <>", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressGreaterThan(String value) {
            addCriterion("taddress >", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressGreaterThanOrEqualTo(String value) {
            addCriterion("taddress >=", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressLessThan(String value) {
            addCriterion("taddress <", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressLessThanOrEqualTo(String value) {
            addCriterion("taddress <=", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressLike(String value) {
            addCriterion("taddress like", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotLike(String value) {
            addCriterion("taddress not like", value, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressIn(List<String> values) {
            addCriterion("taddress in", values, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotIn(List<String> values) {
            addCriterion("taddress not in", values, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressBetween(String value1, String value2) {
            addCriterion("taddress between", value1, value2, "taddress");
            return (Criteria) this;
        }

        public Criteria andTaddressNotBetween(String value1, String value2) {
            addCriterion("taddress not between", value1, value2, "taddress");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNull() {
            addCriterion("ttime is null");
            return (Criteria) this;
        }

        public Criteria andTtimeIsNotNull() {
            addCriterion("ttime is not null");
            return (Criteria) this;
        }

        public Criteria andTtimeEqualTo(Integer value) {
            addCriterion("ttime =", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotEqualTo(Integer value) {
            addCriterion("ttime <>", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThan(Integer value) {
            addCriterion("ttime >", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ttime >=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThan(Integer value) {
            addCriterion("ttime <", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeLessThanOrEqualTo(Integer value) {
            addCriterion("ttime <=", value, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeIn(List<Integer> values) {
            addCriterion("ttime in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotIn(List<Integer> values) {
            addCriterion("ttime not in", values, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeBetween(Integer value1, Integer value2) {
            addCriterion("ttime between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andTtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ttime not between", value1, value2, "ttime");
            return (Criteria) this;
        }

        public Criteria andWageIsNull() {
            addCriterion("wage is null");
            return (Criteria) this;
        }

        public Criteria andWageIsNotNull() {
            addCriterion("wage is not null");
            return (Criteria) this;
        }

        public Criteria andWageEqualTo(String value) {
            addCriterion("wage =", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotEqualTo(String value) {
            addCriterion("wage <>", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThan(String value) {
            addCriterion("wage >", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageGreaterThanOrEqualTo(String value) {
            addCriterion("wage >=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThan(String value) {
            addCriterion("wage <", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLessThanOrEqualTo(String value) {
            addCriterion("wage <=", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageLike(String value) {
            addCriterion("wage like", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotLike(String value) {
            addCriterion("wage not like", value, "wage");
            return (Criteria) this;
        }

        public Criteria andWageIn(List<String> values) {
            addCriterion("wage in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotIn(List<String> values) {
            addCriterion("wage not in", values, "wage");
            return (Criteria) this;
        }

        public Criteria andWageBetween(String value1, String value2) {
            addCriterion("wage between", value1, value2, "wage");
            return (Criteria) this;
        }

        public Criteria andWageNotBetween(String value1, String value2) {
            addCriterion("wage not between", value1, value2, "wage");
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