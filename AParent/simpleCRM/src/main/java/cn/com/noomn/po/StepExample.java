package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class StepExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StepExample() {
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

        public Criteria andStepPreIdIsNull() {
            addCriterion("STEP_PRE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepPreIdIsNotNull() {
            addCriterion("STEP_PRE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepPreIdEqualTo(String value) {
            addCriterion("STEP_PRE_ID =", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdNotEqualTo(String value) {
            addCriterion("STEP_PRE_ID <>", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdGreaterThan(String value) {
            addCriterion("STEP_PRE_ID >", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_PRE_ID >=", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdLessThan(String value) {
            addCriterion("STEP_PRE_ID <", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdLessThanOrEqualTo(String value) {
            addCriterion("STEP_PRE_ID <=", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdLike(String value) {
            addCriterion("STEP_PRE_ID like", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdNotLike(String value) {
            addCriterion("STEP_PRE_ID not like", value, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdIn(List<String> values) {
            addCriterion("STEP_PRE_ID in", values, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdNotIn(List<String> values) {
            addCriterion("STEP_PRE_ID not in", values, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdBetween(String value1, String value2) {
            addCriterion("STEP_PRE_ID between", value1, value2, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andStepPreIdNotBetween(String value1, String value2) {
            addCriterion("STEP_PRE_ID not between", value1, value2, "stepPreId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdIsNull() {
            addCriterion("STE_NEXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSteNextIdIsNotNull() {
            addCriterion("STE_NEXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSteNextIdEqualTo(String value) {
            addCriterion("STE_NEXT_ID =", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdNotEqualTo(String value) {
            addCriterion("STE_NEXT_ID <>", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdGreaterThan(String value) {
            addCriterion("STE_NEXT_ID >", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdGreaterThanOrEqualTo(String value) {
            addCriterion("STE_NEXT_ID >=", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdLessThan(String value) {
            addCriterion("STE_NEXT_ID <", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdLessThanOrEqualTo(String value) {
            addCriterion("STE_NEXT_ID <=", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdLike(String value) {
            addCriterion("STE_NEXT_ID like", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdNotLike(String value) {
            addCriterion("STE_NEXT_ID not like", value, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdIn(List<String> values) {
            addCriterion("STE_NEXT_ID in", values, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdNotIn(List<String> values) {
            addCriterion("STE_NEXT_ID not in", values, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdBetween(String value1, String value2) {
            addCriterion("STE_NEXT_ID between", value1, value2, "steNextId");
            return (Criteria) this;
        }

        public Criteria andSteNextIdNotBetween(String value1, String value2) {
            addCriterion("STE_NEXT_ID not between", value1, value2, "steNextId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdIsNull() {
            addCriterion("STEP_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdIsNotNull() {
            addCriterion("STEP_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdEqualTo(String value) {
            addCriterion("STEP_EMPLOYEE_ID =", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdNotEqualTo(String value) {
            addCriterion("STEP_EMPLOYEE_ID <>", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdGreaterThan(String value) {
            addCriterion("STEP_EMPLOYEE_ID >", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_EMPLOYEE_ID >=", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdLessThan(String value) {
            addCriterion("STEP_EMPLOYEE_ID <", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("STEP_EMPLOYEE_ID <=", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdLike(String value) {
            addCriterion("STEP_EMPLOYEE_ID like", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdNotLike(String value) {
            addCriterion("STEP_EMPLOYEE_ID not like", value, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdIn(List<String> values) {
            addCriterion("STEP_EMPLOYEE_ID in", values, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdNotIn(List<String> values) {
            addCriterion("STEP_EMPLOYEE_ID not in", values, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdBetween(String value1, String value2) {
            addCriterion("STEP_EMPLOYEE_ID between", value1, value2, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("STEP_EMPLOYEE_ID not between", value1, value2, "stepEmployeeId");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNull() {
            addCriterion("STEP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStepNameIsNotNull() {
            addCriterion("STEP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStepNameEqualTo(String value) {
            addCriterion("STEP_NAME =", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotEqualTo(String value) {
            addCriterion("STEP_NAME <>", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThan(String value) {
            addCriterion("STEP_NAME >", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_NAME >=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThan(String value) {
            addCriterion("STEP_NAME <", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLessThanOrEqualTo(String value) {
            addCriterion("STEP_NAME <=", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameLike(String value) {
            addCriterion("STEP_NAME like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotLike(String value) {
            addCriterion("STEP_NAME not like", value, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameIn(List<String> values) {
            addCriterion("STEP_NAME in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotIn(List<String> values) {
            addCriterion("STEP_NAME not in", values, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameBetween(String value1, String value2) {
            addCriterion("STEP_NAME between", value1, value2, "stepName");
            return (Criteria) this;
        }

        public Criteria andStepNameNotBetween(String value1, String value2) {
            addCriterion("STEP_NAME not between", value1, value2, "stepName");
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