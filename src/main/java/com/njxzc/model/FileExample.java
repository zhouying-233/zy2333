package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FileExample() {
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

        public Criteria andFileidIsNull() {
            addCriterion("fileid is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("fileid is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(Integer value) {
            addCriterion("fileid =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(Integer value) {
            addCriterion("fileid <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(Integer value) {
            addCriterion("fileid >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileid >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(Integer value) {
            addCriterion("fileid <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(Integer value) {
            addCriterion("fileid <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<Integer> values) {
            addCriterion("fileid in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<Integer> values) {
            addCriterion("fileid not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(Integer value1, Integer value2) {
            addCriterion("fileid between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("fileid not between", value1, value2, "fileid");
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

        public Criteria andSubjectnameIsNull() {
            addCriterion("subjectname is null");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIsNotNull() {
            addCriterion("subjectname is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectnameEqualTo(String value) {
            addCriterion("subjectname =", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotEqualTo(String value) {
            addCriterion("subjectname <>", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameGreaterThan(String value) {
            addCriterion("subjectname >", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("subjectname >=", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLessThan(String value) {
            addCriterion("subjectname <", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLessThanOrEqualTo(String value) {
            addCriterion("subjectname <=", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameLike(String value) {
            addCriterion("subjectname like", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotLike(String value) {
            addCriterion("subjectname not like", value, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameIn(List<String> values) {
            addCriterion("subjectname in", values, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotIn(List<String> values) {
            addCriterion("subjectname not in", values, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameBetween(String value1, String value2) {
            addCriterion("subjectname between", value1, value2, "subjectname");
            return (Criteria) this;
        }

        public Criteria andSubjectnameNotBetween(String value1, String value2) {
            addCriterion("subjectname not between", value1, value2, "subjectname");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNull() {
            addCriterion("expression is null");
            return (Criteria) this;
        }

        public Criteria andExpressionIsNotNull() {
            addCriterion("expression is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionEqualTo(String value) {
            addCriterion("expression =", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotEqualTo(String value) {
            addCriterion("expression <>", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThan(String value) {
            addCriterion("expression >", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("expression >=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThan(String value) {
            addCriterion("expression <", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLessThanOrEqualTo(String value) {
            addCriterion("expression <=", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionLike(String value) {
            addCriterion("expression like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotLike(String value) {
            addCriterion("expression not like", value, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionIn(List<String> values) {
            addCriterion("expression in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotIn(List<String> values) {
            addCriterion("expression not in", values, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionBetween(String value1, String value2) {
            addCriterion("expression between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andExpressionNotBetween(String value1, String value2) {
            addCriterion("expression not between", value1, value2, "expression");
            return (Criteria) this;
        }

        public Criteria andHomeworkIsNull() {
            addCriterion("homework is null");
            return (Criteria) this;
        }

        public Criteria andHomeworkIsNotNull() {
            addCriterion("homework is not null");
            return (Criteria) this;
        }

        public Criteria andHomeworkEqualTo(String value) {
            addCriterion("homework =", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotEqualTo(String value) {
            addCriterion("homework <>", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkGreaterThan(String value) {
            addCriterion("homework >", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkGreaterThanOrEqualTo(String value) {
            addCriterion("homework >=", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkLessThan(String value) {
            addCriterion("homework <", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkLessThanOrEqualTo(String value) {
            addCriterion("homework <=", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkLike(String value) {
            addCriterion("homework like", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotLike(String value) {
            addCriterion("homework not like", value, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkIn(List<String> values) {
            addCriterion("homework in", values, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotIn(List<String> values) {
            addCriterion("homework not in", values, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkBetween(String value1, String value2) {
            addCriterion("homework between", value1, value2, "homework");
            return (Criteria) this;
        }

        public Criteria andHomeworkNotBetween(String value1, String value2) {
            addCriterion("homework not between", value1, value2, "homework");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("activity is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("activity is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(String value) {
            addCriterion("activity =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(String value) {
            addCriterion("activity <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(String value) {
            addCriterion("activity >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(String value) {
            addCriterion("activity >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(String value) {
            addCriterion("activity <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(String value) {
            addCriterion("activity <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLike(String value) {
            addCriterion("activity like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotLike(String value) {
            addCriterion("activity not like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<String> values) {
            addCriterion("activity in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<String> values) {
            addCriterion("activity not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(String value1, String value2) {
            addCriterion("activity between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(String value1, String value2) {
            addCriterion("activity not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNull() {
            addCriterion("evaluation is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIsNotNull() {
            addCriterion("evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationEqualTo(String value) {
            addCriterion("evaluation =", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotEqualTo(String value) {
            addCriterion("evaluation <>", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThan(String value) {
            addCriterion("evaluation >", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation >=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThan(String value) {
            addCriterion("evaluation <", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLessThanOrEqualTo(String value) {
            addCriterion("evaluation <=", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationLike(String value) {
            addCriterion("evaluation like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotLike(String value) {
            addCriterion("evaluation not like", value, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationIn(List<String> values) {
            addCriterion("evaluation in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotIn(List<String> values) {
            addCriterion("evaluation not in", values, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationBetween(String value1, String value2) {
            addCriterion("evaluation between", value1, value2, "evaluation");
            return (Criteria) this;
        }

        public Criteria andEvaluationNotBetween(String value1, String value2) {
            addCriterion("evaluation not between", value1, value2, "evaluation");
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