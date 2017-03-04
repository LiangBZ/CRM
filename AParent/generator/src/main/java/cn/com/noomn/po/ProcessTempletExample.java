package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class ProcessTempletExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessTempletExample() {
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

        public Criteria andProcessTempletIdIsNull() {
            addCriterion("PROCESS_TEMPLET_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdIsNotNull() {
            addCriterion("PROCESS_TEMPLET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID =", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID <>", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdGreaterThan(String value) {
            addCriterion("PROCESS_TEMPLET_ID >", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID >=", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdLessThan(String value) {
            addCriterion("PROCESS_TEMPLET_ID <", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID <=", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdLike(String value) {
            addCriterion("PROCESS_TEMPLET_ID like", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotLike(String value) {
            addCriterion("PROCESS_TEMPLET_ID not like", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdIn(List<String> values) {
            addCriterion("PROCESS_TEMPLET_ID in", values, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotIn(List<String> values) {
            addCriterion("PROCESS_TEMPLET_ID not in", values, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdBetween(String value1, String value2) {
            addCriterion("PROCESS_TEMPLET_ID between", value1, value2, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_TEMPLET_ID not between", value1, value2, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdIsNull() {
            addCriterion("TEMPLET_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdIsNotNull() {
            addCriterion("TEMPLET_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID =", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID <>", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdGreaterThan(String value) {
            addCriterion("TEMPLET_TYPE_ID >", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID >=", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdLessThan(String value) {
            addCriterion("TEMPLET_TYPE_ID <", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID <=", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdLike(String value) {
            addCriterion("TEMPLET_TYPE_ID like", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotLike(String value) {
            addCriterion("TEMPLET_TYPE_ID not like", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdIn(List<String> values) {
            addCriterion("TEMPLET_TYPE_ID in", values, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotIn(List<String> values) {
            addCriterion("TEMPLET_TYPE_ID not in", values, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdBetween(String value1, String value2) {
            addCriterion("TEMPLET_TYPE_ID between", value1, value2, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_TYPE_ID not between", value1, value2, "templetTypeId");
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

        public Criteria andStepNumberIsNull() {
            addCriterion("STEP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andStepNumberIsNotNull() {
            addCriterion("STEP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andStepNumberEqualTo(Short value) {
            addCriterion("STEP_NUMBER =", value, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberNotEqualTo(Short value) {
            addCriterion("STEP_NUMBER <>", value, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberGreaterThan(Short value) {
            addCriterion("STEP_NUMBER >", value, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("STEP_NUMBER >=", value, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberLessThan(Short value) {
            addCriterion("STEP_NUMBER <", value, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberLessThanOrEqualTo(Short value) {
            addCriterion("STEP_NUMBER <=", value, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberIn(List<Short> values) {
            addCriterion("STEP_NUMBER in", values, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberNotIn(List<Short> values) {
            addCriterion("STEP_NUMBER not in", values, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberBetween(Short value1, Short value2) {
            addCriterion("STEP_NUMBER between", value1, value2, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andStepNumberNotBetween(Short value1, Short value2) {
            addCriterion("STEP_NUMBER not between", value1, value2, "stepNumber");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleIsNull() {
            addCriterion("PROCESS_TEMPLET_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleIsNotNull() {
            addCriterion("PROCESS_TEMPLET_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE =", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleNotEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE <>", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleGreaterThan(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE >", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE >=", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleLessThan(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE <", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE <=", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleLike(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE like", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleNotLike(String value) {
            addCriterion("PROCESS_TEMPLET_TITLE not like", value, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleIn(List<String> values) {
            addCriterion("PROCESS_TEMPLET_TITLE in", values, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleNotIn(List<String> values) {
            addCriterion("PROCESS_TEMPLET_TITLE not in", values, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleBetween(String value1, String value2) {
            addCriterion("PROCESS_TEMPLET_TITLE between", value1, value2, "processTempletTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTempletTitleNotBetween(String value1, String value2) {
            addCriterion("PROCESS_TEMPLET_TITLE not between", value1, value2, "processTempletTitle");
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