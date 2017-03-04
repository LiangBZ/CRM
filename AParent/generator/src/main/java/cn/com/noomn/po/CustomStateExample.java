package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class CustomStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomStateExample() {
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

        public Criteria andCustomStateIdIsNull() {
            addCriterion("CUSTOM_STATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdIsNotNull() {
            addCriterion("CUSTOM_STATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdEqualTo(String value) {
            addCriterion("CUSTOM_STATE_ID =", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdNotEqualTo(String value) {
            addCriterion("CUSTOM_STATE_ID <>", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdGreaterThan(String value) {
            addCriterion("CUSTOM_STATE_ID >", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_STATE_ID >=", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdLessThan(String value) {
            addCriterion("CUSTOM_STATE_ID <", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_STATE_ID <=", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdLike(String value) {
            addCriterion("CUSTOM_STATE_ID like", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdNotLike(String value) {
            addCriterion("CUSTOM_STATE_ID not like", value, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdIn(List<String> values) {
            addCriterion("CUSTOM_STATE_ID in", values, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdNotIn(List<String> values) {
            addCriterion("CUSTOM_STATE_ID not in", values, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdBetween(String value1, String value2) {
            addCriterion("CUSTOM_STATE_ID between", value1, value2, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_STATE_ID not between", value1, value2, "customStateId");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameIsNull() {
            addCriterion("CUSTOM_STATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameIsNotNull() {
            addCriterion("CUSTOM_STATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameEqualTo(String value) {
            addCriterion("CUSTOM_STATE_NAME =", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameNotEqualTo(String value) {
            addCriterion("CUSTOM_STATE_NAME <>", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameGreaterThan(String value) {
            addCriterion("CUSTOM_STATE_NAME >", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_STATE_NAME >=", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameLessThan(String value) {
            addCriterion("CUSTOM_STATE_NAME <", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_STATE_NAME <=", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameLike(String value) {
            addCriterion("CUSTOM_STATE_NAME like", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameNotLike(String value) {
            addCriterion("CUSTOM_STATE_NAME not like", value, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameIn(List<String> values) {
            addCriterion("CUSTOM_STATE_NAME in", values, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameNotIn(List<String> values) {
            addCriterion("CUSTOM_STATE_NAME not in", values, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameBetween(String value1, String value2) {
            addCriterion("CUSTOM_STATE_NAME between", value1, value2, "customStateName");
            return (Criteria) this;
        }

        public Criteria andCustomStateNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_STATE_NAME not between", value1, value2, "customStateName");
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