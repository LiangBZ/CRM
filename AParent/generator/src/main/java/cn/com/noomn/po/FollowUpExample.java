package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class FollowUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowUpExample() {
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

        public Criteria andFollowUpIdIsNull() {
            addCriterion("FOLLOW_UP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdIsNotNull() {
            addCriterion("FOLLOW_UP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdEqualTo(String value) {
            addCriterion("FOLLOW_UP_ID =", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotEqualTo(String value) {
            addCriterion("FOLLOW_UP_ID <>", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdGreaterThan(String value) {
            addCriterion("FOLLOW_UP_ID >", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_UP_ID >=", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdLessThan(String value) {
            addCriterion("FOLLOW_UP_ID <", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_UP_ID <=", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdLike(String value) {
            addCriterion("FOLLOW_UP_ID like", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotLike(String value) {
            addCriterion("FOLLOW_UP_ID not like", value, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdIn(List<String> values) {
            addCriterion("FOLLOW_UP_ID in", values, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotIn(List<String> values) {
            addCriterion("FOLLOW_UP_ID not in", values, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdBetween(String value1, String value2) {
            addCriterion("FOLLOW_UP_ID between", value1, value2, "followUpId");
            return (Criteria) this;
        }

        public Criteria andFollowUpIdNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_UP_ID not between", value1, value2, "followUpId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNull() {
            addCriterion("CUSTOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("CUSTOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(String value) {
            addCriterion("CUSTOM_ID =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(String value) {
            addCriterion("CUSTOM_ID <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(String value) {
            addCriterion("CUSTOM_ID >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(String value) {
            addCriterion("CUSTOM_ID <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLike(String value) {
            addCriterion("CUSTOM_ID like", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotLike(String value) {
            addCriterion("CUSTOM_ID not like", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<String> values) {
            addCriterion("CUSTOM_ID in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<String> values) {
            addCriterion("CUSTOM_ID not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdIsNull() {
            addCriterion("FOLLOW_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdIsNotNull() {
            addCriterion("FOLLOW_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID =", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID <>", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdGreaterThan(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID >", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID >=", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdLessThan(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID <", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID <=", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdLike(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID like", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotLike(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID not like", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdIn(List<String> values) {
            addCriterion("FOLLOW_EMPLOYEE_ID in", values, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotIn(List<String> values) {
            addCriterion("FOLLOW_EMPLOYEE_ID not in", values, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdBetween(String value1, String value2) {
            addCriterion("FOLLOW_EMPLOYEE_ID between", value1, value2, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_EMPLOYEE_ID not between", value1, value2, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryIsNull() {
            addCriterion("IS_FUNCTIONARY is null");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryIsNotNull() {
            addCriterion("IS_FUNCTIONARY is not null");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryEqualTo(Boolean value) {
            addCriterion("IS_FUNCTIONARY =", value, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryNotEqualTo(Boolean value) {
            addCriterion("IS_FUNCTIONARY <>", value, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryGreaterThan(Boolean value) {
            addCriterion("IS_FUNCTIONARY >", value, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_FUNCTIONARY >=", value, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryLessThan(Boolean value) {
            addCriterion("IS_FUNCTIONARY <", value, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_FUNCTIONARY <=", value, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryIn(List<Boolean> values) {
            addCriterion("IS_FUNCTIONARY in", values, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryNotIn(List<Boolean> values) {
            addCriterion("IS_FUNCTIONARY not in", values, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FUNCTIONARY between", value1, value2, "isFunctionary");
            return (Criteria) this;
        }

        public Criteria andIsFunctionaryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FUNCTIONARY not between", value1, value2, "isFunctionary");
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