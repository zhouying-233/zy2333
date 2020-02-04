package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class TuitiondetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TuitiondetailsExample() {
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

        public Criteria andTdidIsNull() {
            addCriterion("tdid is null");
            return (Criteria) this;
        }

        public Criteria andTdidIsNotNull() {
            addCriterion("tdid is not null");
            return (Criteria) this;
        }

        public Criteria andTdidEqualTo(Integer value) {
            addCriterion("tdid =", value, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidNotEqualTo(Integer value) {
            addCriterion("tdid <>", value, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidGreaterThan(Integer value) {
            addCriterion("tdid >", value, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tdid >=", value, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidLessThan(Integer value) {
            addCriterion("tdid <", value, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidLessThanOrEqualTo(Integer value) {
            addCriterion("tdid <=", value, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidIn(List<Integer> values) {
            addCriterion("tdid in", values, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidNotIn(List<Integer> values) {
            addCriterion("tdid not in", values, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidBetween(Integer value1, Integer value2) {
            addCriterion("tdid between", value1, value2, "tdid");
            return (Criteria) this;
        }

        public Criteria andTdidNotBetween(Integer value1, Integer value2) {
            addCriterion("tdid not between", value1, value2, "tdid");
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

        public Criteria andBookfeeIsNull() {
            addCriterion("bookfee is null");
            return (Criteria) this;
        }

        public Criteria andBookfeeIsNotNull() {
            addCriterion("bookfee is not null");
            return (Criteria) this;
        }

        public Criteria andBookfeeEqualTo(Double value) {
            addCriterion("bookfee =", value, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeNotEqualTo(Double value) {
            addCriterion("bookfee <>", value, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeGreaterThan(Double value) {
            addCriterion("bookfee >", value, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("bookfee >=", value, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeLessThan(Double value) {
            addCriterion("bookfee <", value, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeLessThanOrEqualTo(Double value) {
            addCriterion("bookfee <=", value, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeIn(List<Double> values) {
            addCriterion("bookfee in", values, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeNotIn(List<Double> values) {
            addCriterion("bookfee not in", values, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeBetween(Double value1, Double value2) {
            addCriterion("bookfee between", value1, value2, "bookfee");
            return (Criteria) this;
        }

        public Criteria andBookfeeNotBetween(Double value1, Double value2) {
            addCriterion("bookfee not between", value1, value2, "bookfee");
            return (Criteria) this;
        }

        public Criteria andDatafeeIsNull() {
            addCriterion("datafee is null");
            return (Criteria) this;
        }

        public Criteria andDatafeeIsNotNull() {
            addCriterion("datafee is not null");
            return (Criteria) this;
        }

        public Criteria andDatafeeEqualTo(Double value) {
            addCriterion("datafee =", value, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeNotEqualTo(Double value) {
            addCriterion("datafee <>", value, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeGreaterThan(Double value) {
            addCriterion("datafee >", value, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeGreaterThanOrEqualTo(Double value) {
            addCriterion("datafee >=", value, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeLessThan(Double value) {
            addCriterion("datafee <", value, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeLessThanOrEqualTo(Double value) {
            addCriterion("datafee <=", value, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeIn(List<Double> values) {
            addCriterion("datafee in", values, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeNotIn(List<Double> values) {
            addCriterion("datafee not in", values, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeBetween(Double value1, Double value2) {
            addCriterion("datafee between", value1, value2, "datafee");
            return (Criteria) this;
        }

        public Criteria andDatafeeNotBetween(Double value1, Double value2) {
            addCriterion("datafee not between", value1, value2, "datafee");
            return (Criteria) this;
        }

        public Criteria andMealsIsNull() {
            addCriterion("meals is null");
            return (Criteria) this;
        }

        public Criteria andMealsIsNotNull() {
            addCriterion("meals is not null");
            return (Criteria) this;
        }

        public Criteria andMealsEqualTo(Double value) {
            addCriterion("meals =", value, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsNotEqualTo(Double value) {
            addCriterion("meals <>", value, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsGreaterThan(Double value) {
            addCriterion("meals >", value, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsGreaterThanOrEqualTo(Double value) {
            addCriterion("meals >=", value, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsLessThan(Double value) {
            addCriterion("meals <", value, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsLessThanOrEqualTo(Double value) {
            addCriterion("meals <=", value, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsIn(List<Double> values) {
            addCriterion("meals in", values, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsNotIn(List<Double> values) {
            addCriterion("meals not in", values, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsBetween(Double value1, Double value2) {
            addCriterion("meals between", value1, value2, "meals");
            return (Criteria) this;
        }

        public Criteria andMealsNotBetween(Double value1, Double value2) {
            addCriterion("meals not between", value1, value2, "meals");
            return (Criteria) this;
        }

        public Criteria andCouponIsNull() {
            addCriterion("coupon is null");
            return (Criteria) this;
        }

        public Criteria andCouponIsNotNull() {
            addCriterion("coupon is not null");
            return (Criteria) this;
        }

        public Criteria andCouponEqualTo(String value) {
            addCriterion("coupon =", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotEqualTo(String value) {
            addCriterion("coupon <>", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThan(String value) {
            addCriterion("coupon >", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponGreaterThanOrEqualTo(String value) {
            addCriterion("coupon >=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThan(String value) {
            addCriterion("coupon <", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLessThanOrEqualTo(String value) {
            addCriterion("coupon <=", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponLike(String value) {
            addCriterion("coupon like", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotLike(String value) {
            addCriterion("coupon not like", value, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponIn(List<String> values) {
            addCriterion("coupon in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotIn(List<String> values) {
            addCriterion("coupon not in", values, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponBetween(String value1, String value2) {
            addCriterion("coupon between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andCouponNotBetween(String value1, String value2) {
            addCriterion("coupon not between", value1, value2, "coupon");
            return (Criteria) this;
        }

        public Criteria andTuitionIsNull() {
            addCriterion("tuition is null");
            return (Criteria) this;
        }

        public Criteria andTuitionIsNotNull() {
            addCriterion("tuition is not null");
            return (Criteria) this;
        }

        public Criteria andTuitionEqualTo(Double value) {
            addCriterion("tuition =", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionNotEqualTo(Double value) {
            addCriterion("tuition <>", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionGreaterThan(Double value) {
            addCriterion("tuition >", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionGreaterThanOrEqualTo(Double value) {
            addCriterion("tuition >=", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionLessThan(Double value) {
            addCriterion("tuition <", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionLessThanOrEqualTo(Double value) {
            addCriterion("tuition <=", value, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionIn(List<Double> values) {
            addCriterion("tuition in", values, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionNotIn(List<Double> values) {
            addCriterion("tuition not in", values, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionBetween(Double value1, Double value2) {
            addCriterion("tuition between", value1, value2, "tuition");
            return (Criteria) this;
        }

        public Criteria andTuitionNotBetween(Double value1, Double value2) {
            addCriterion("tuition not between", value1, value2, "tuition");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNull() {
            addCriterion("paymentmethod is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIsNotNull() {
            addCriterion("paymentmethod is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodEqualTo(Integer value) {
            addCriterion("paymentmethod =", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotEqualTo(Integer value) {
            addCriterion("paymentmethod <>", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThan(Integer value) {
            addCriterion("paymentmethod >", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentmethod >=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThan(Integer value) {
            addCriterion("paymentmethod <", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodLessThanOrEqualTo(Integer value) {
            addCriterion("paymentmethod <=", value, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodIn(List<Integer> values) {
            addCriterion("paymentmethod in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotIn(List<Integer> values) {
            addCriterion("paymentmethod not in", values, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodBetween(Integer value1, Integer value2) {
            addCriterion("paymentmethod between", value1, value2, "paymentmethod");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentmethod not between", value1, value2, "paymentmethod");
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