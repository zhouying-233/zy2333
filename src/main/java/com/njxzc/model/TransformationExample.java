package com.njxzc.model;

import java.util.ArrayList;
import java.util.List;

public class TransformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TransformationExample() {
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

        public Criteria andIsclasstfIsNull() {
            addCriterion("isclasstf is null");
            return (Criteria) this;
        }

        public Criteria andIsclasstfIsNotNull() {
            addCriterion("isclasstf is not null");
            return (Criteria) this;
        }

        public Criteria andIsclasstfEqualTo(Integer value) {
            addCriterion("isclasstf =", value, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfNotEqualTo(Integer value) {
            addCriterion("isclasstf <>", value, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfGreaterThan(Integer value) {
            addCriterion("isclasstf >", value, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfGreaterThanOrEqualTo(Integer value) {
            addCriterion("isclasstf >=", value, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfLessThan(Integer value) {
            addCriterion("isclasstf <", value, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfLessThanOrEqualTo(Integer value) {
            addCriterion("isclasstf <=", value, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfIn(List<Integer> values) {
            addCriterion("isclasstf in", values, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfNotIn(List<Integer> values) {
            addCriterion("isclasstf not in", values, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfBetween(Integer value1, Integer value2) {
            addCriterion("isclasstf between", value1, value2, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsclasstfNotBetween(Integer value1, Integer value2) {
            addCriterion("isclasstf not between", value1, value2, "isclasstf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfIsNull() {
            addCriterion("ismajortf is null");
            return (Criteria) this;
        }

        public Criteria andIsmajortfIsNotNull() {
            addCriterion("ismajortf is not null");
            return (Criteria) this;
        }

        public Criteria andIsmajortfEqualTo(Integer value) {
            addCriterion("ismajortf =", value, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfNotEqualTo(Integer value) {
            addCriterion("ismajortf <>", value, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfGreaterThan(Integer value) {
            addCriterion("ismajortf >", value, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismajortf >=", value, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfLessThan(Integer value) {
            addCriterion("ismajortf <", value, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfLessThanOrEqualTo(Integer value) {
            addCriterion("ismajortf <=", value, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfIn(List<Integer> values) {
            addCriterion("ismajortf in", values, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfNotIn(List<Integer> values) {
            addCriterion("ismajortf not in", values, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfBetween(Integer value1, Integer value2) {
            addCriterion("ismajortf between", value1, value2, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andIsmajortfNotBetween(Integer value1, Integer value2) {
            addCriterion("ismajortf not between", value1, value2, "ismajortf");
            return (Criteria) this;
        }

        public Criteria andClassintentionIsNull() {
            addCriterion("classintention is null");
            return (Criteria) this;
        }

        public Criteria andClassintentionIsNotNull() {
            addCriterion("classintention is not null");
            return (Criteria) this;
        }

        public Criteria andClassintentionEqualTo(String value) {
            addCriterion("classintention =", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionNotEqualTo(String value) {
            addCriterion("classintention <>", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionGreaterThan(String value) {
            addCriterion("classintention >", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionGreaterThanOrEqualTo(String value) {
            addCriterion("classintention >=", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionLessThan(String value) {
            addCriterion("classintention <", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionLessThanOrEqualTo(String value) {
            addCriterion("classintention <=", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionLike(String value) {
            addCriterion("classintention like", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionNotLike(String value) {
            addCriterion("classintention not like", value, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionIn(List<String> values) {
            addCriterion("classintention in", values, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionNotIn(List<String> values) {
            addCriterion("classintention not in", values, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionBetween(String value1, String value2) {
            addCriterion("classintention between", value1, value2, "classintention");
            return (Criteria) this;
        }

        public Criteria andClassintentionNotBetween(String value1, String value2) {
            addCriterion("classintention not between", value1, value2, "classintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionIsNull() {
            addCriterion("majorintention is null");
            return (Criteria) this;
        }

        public Criteria andMajorintentionIsNotNull() {
            addCriterion("majorintention is not null");
            return (Criteria) this;
        }

        public Criteria andMajorintentionEqualTo(String value) {
            addCriterion("majorintention =", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionNotEqualTo(String value) {
            addCriterion("majorintention <>", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionGreaterThan(String value) {
            addCriterion("majorintention >", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionGreaterThanOrEqualTo(String value) {
            addCriterion("majorintention >=", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionLessThan(String value) {
            addCriterion("majorintention <", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionLessThanOrEqualTo(String value) {
            addCriterion("majorintention <=", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionLike(String value) {
            addCriterion("majorintention like", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionNotLike(String value) {
            addCriterion("majorintention not like", value, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionIn(List<String> values) {
            addCriterion("majorintention in", values, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionNotIn(List<String> values) {
            addCriterion("majorintention not in", values, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionBetween(String value1, String value2) {
            addCriterion("majorintention between", value1, value2, "majorintention");
            return (Criteria) this;
        }

        public Criteria andMajorintentionNotBetween(String value1, String value2) {
            addCriterion("majorintention not between", value1, value2, "majorintention");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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