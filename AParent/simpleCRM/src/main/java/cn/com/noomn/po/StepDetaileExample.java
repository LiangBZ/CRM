package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class StepDetaileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StepDetaileExample() {
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

        public Criteria andStepDetaileIdIsNull() {
            addCriterion("STEP_DETAILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdIsNotNull() {
            addCriterion("STEP_DETAILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID =", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID <>", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdGreaterThan(String value) {
            addCriterion("STEP_DETAILE_ID >", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID >=", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdLessThan(String value) {
            addCriterion("STEP_DETAILE_ID <", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdLessThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID <=", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdLike(String value) {
            addCriterion("STEP_DETAILE_ID like", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotLike(String value) {
            addCriterion("STEP_DETAILE_ID not like", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdIn(List<String> values) {
            addCriterion("STEP_DETAILE_ID in", values, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotIn(List<String> values) {
            addCriterion("STEP_DETAILE_ID not in", values, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_ID between", value1, value2, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_ID not between", value1, value2, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNull() {
            addCriterion("STEP_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("STEP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(String value) {
            addCriterion("STEP_ID =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(String value) {
            addCriterion("STEP_ID <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(String value) {
            addCriterion("STEP_ID >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_ID >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(String value) {
            addCriterion("STEP_ID <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(String value) {
            addCriterion("STEP_ID <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLike(String value) {
            addCriterion("STEP_ID like", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotLike(String value) {
            addCriterion("STEP_ID not like", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<String> values) {
            addCriterion("STEP_ID in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<String> values) {
            addCriterion("STEP_ID not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(String value1, String value2) {
            addCriterion("STEP_ID between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(String value1, String value2) {
            addCriterion("STEP_ID not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdIsNull() {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdIsNotNull() {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdEqualTo(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID =", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdNotEqualTo(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID <>", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdGreaterThan(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID >", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID >=", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdLessThan(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID <", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID <=", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdLike(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID like", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdNotLike(String value) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID not like", value, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdIn(List<String> values) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID in", values, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdNotIn(List<String> values) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID not in", values, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID between", value1, value2, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_EMPLOYEE_ID not between", value1, value2, "stepDetaileEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateIsNull() {
            addCriterion("STEP_DETAILE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateIsNotNull() {
            addCriterion("STEP_DETAILE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateEqualTo(String value) {
            addCriterion("STEP_DETAILE_STATE =", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateNotEqualTo(String value) {
            addCriterion("STEP_DETAILE_STATE <>", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateGreaterThan(String value) {
            addCriterion("STEP_DETAILE_STATE >", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_STATE >=", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateLessThan(String value) {
            addCriterion("STEP_DETAILE_STATE <", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateLessThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_STATE <=", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateLike(String value) {
            addCriterion("STEP_DETAILE_STATE like", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateNotLike(String value) {
            addCriterion("STEP_DETAILE_STATE not like", value, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateIn(List<String> values) {
            addCriterion("STEP_DETAILE_STATE in", values, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateNotIn(List<String> values) {
            addCriterion("STEP_DETAILE_STATE not in", values, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_STATE between", value1, value2, "stepDetaileState");
            return (Criteria) this;
        }

        public Criteria andStepDetaileStateNotBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_STATE not between", value1, value2, "stepDetaileState");
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