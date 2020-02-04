package com.njxzc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HomevisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public HomevisitExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andHomevisitidIsNull() {
            addCriterion("homevisitid is null");
            return (Criteria) this;
        }

        public Criteria andHomevisitidIsNotNull() {
            addCriterion("homevisitid is not null");
            return (Criteria) this;
        }

        public Criteria andHomevisitidEqualTo(Integer value) {
            addCriterion("homevisitid =", value, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidNotEqualTo(Integer value) {
            addCriterion("homevisitid <>", value, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidGreaterThan(Integer value) {
            addCriterion("homevisitid >", value, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("homevisitid >=", value, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidLessThan(Integer value) {
            addCriterion("homevisitid <", value, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidLessThanOrEqualTo(Integer value) {
            addCriterion("homevisitid <=", value, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidIn(List<Integer> values) {
            addCriterion("homevisitid in", values, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidNotIn(List<Integer> values) {
            addCriterion("homevisitid not in", values, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidBetween(Integer value1, Integer value2) {
            addCriterion("homevisitid between", value1, value2, "homevisitid");
            return (Criteria) this;
        }

        public Criteria andHomevisitidNotBetween(Integer value1, Integer value2) {
            addCriterion("homevisitid not between", value1, value2, "homevisitid");
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

        public Criteria andVisitdateIsNull() {
            addCriterion("visitdate is null");
            return (Criteria) this;
        }

        public Criteria andVisitdateIsNotNull() {
            addCriterion("visitdate is not null");
            return (Criteria) this;
        }

        public Criteria andVisitdateEqualTo(Date value) {
            addCriterionForJDBCDate("visitdate =", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("visitdate <>", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("visitdate >", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visitdate >=", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateLessThan(Date value) {
            addCriterionForJDBCDate("visitdate <", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("visitdate <=", value, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateIn(List<Date> values) {
            addCriterionForJDBCDate("visitdate in", values, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("visitdate not in", values, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visitdate between", value1, value2, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVisitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("visitdate not between", value1, value2, "visitdate");
            return (Criteria) this;
        }

        public Criteria andVcontentIsNull() {
            addCriterion("vcontent is null");
            return (Criteria) this;
        }

        public Criteria andVcontentIsNotNull() {
            addCriterion("vcontent is not null");
            return (Criteria) this;
        }

        public Criteria andVcontentEqualTo(String value) {
            addCriterion("vcontent =", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentNotEqualTo(String value) {
            addCriterion("vcontent <>", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentGreaterThan(String value) {
            addCriterion("vcontent >", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentGreaterThanOrEqualTo(String value) {
            addCriterion("vcontent >=", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentLessThan(String value) {
            addCriterion("vcontent <", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentLessThanOrEqualTo(String value) {
            addCriterion("vcontent <=", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentLike(String value) {
            addCriterion("vcontent like", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentNotLike(String value) {
            addCriterion("vcontent not like", value, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentIn(List<String> values) {
            addCriterion("vcontent in", values, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentNotIn(List<String> values) {
            addCriterion("vcontent not in", values, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentBetween(String value1, String value2) {
            addCriterion("vcontent between", value1, value2, "vcontent");
            return (Criteria) this;
        }

        public Criteria andVcontentNotBetween(String value1, String value2) {
            addCriterion("vcontent not between", value1, value2, "vcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNull() {
            addCriterion("feedback is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIsNotNull() {
            addCriterion("feedback is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackEqualTo(String value) {
            addCriterion("feedback =", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotEqualTo(String value) {
            addCriterion("feedback <>", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThan(String value) {
            addCriterion("feedback >", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("feedback >=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThan(String value) {
            addCriterion("feedback <", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLessThanOrEqualTo(String value) {
            addCriterion("feedback <=", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackLike(String value) {
            addCriterion("feedback like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotLike(String value) {
            addCriterion("feedback not like", value, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackIn(List<String> values) {
            addCriterion("feedback in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotIn(List<String> values) {
            addCriterion("feedback not in", values, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackBetween(String value1, String value2) {
            addCriterion("feedback between", value1, value2, "feedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackNotBetween(String value1, String value2) {
            addCriterion("feedback not between", value1, value2, "feedback");
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