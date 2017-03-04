package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkoutsideExample() {
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

        public Criteria andWorkoutsideIdIsNull() {
            addCriterion("WORKOUTSIDE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdIsNotNull() {
            addCriterion("WORKOUTSIDE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdEqualTo(String value) {
            addCriterion("WORKOUTSIDE_ID =", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdNotEqualTo(String value) {
            addCriterion("WORKOUTSIDE_ID <>", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdGreaterThan(String value) {
            addCriterion("WORKOUTSIDE_ID >", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdGreaterThanOrEqualTo(String value) {
            addCriterion("WORKOUTSIDE_ID >=", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdLessThan(String value) {
            addCriterion("WORKOUTSIDE_ID <", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdLessThanOrEqualTo(String value) {
            addCriterion("WORKOUTSIDE_ID <=", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdLike(String value) {
            addCriterion("WORKOUTSIDE_ID like", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdNotLike(String value) {
            addCriterion("WORKOUTSIDE_ID not like", value, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdIn(List<String> values) {
            addCriterion("WORKOUTSIDE_ID in", values, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdNotIn(List<String> values) {
            addCriterion("WORKOUTSIDE_ID not in", values, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdBetween(String value1, String value2) {
            addCriterion("WORKOUTSIDE_ID between", value1, value2, "workoutsideId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideIdNotBetween(String value1, String value2) {
            addCriterion("WORKOUTSIDE_ID not between", value1, value2, "workoutsideId");
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNull() {
            addCriterion("COMMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("COMMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(String value) {
            addCriterion("COMMENT_ID =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(String value) {
            addCriterion("COMMENT_ID <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(String value) {
            addCriterion("COMMENT_ID >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_ID >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(String value) {
            addCriterion("COMMENT_ID <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_ID <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLike(String value) {
            addCriterion("COMMENT_ID like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotLike(String value) {
            addCriterion("COMMENT_ID not like", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<String> values) {
            addCriterion("COMMENT_ID in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<String> values) {
            addCriterion("COMMENT_ID not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(String value1, String value2) {
            addCriterion("COMMENT_ID between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(String value1, String value2) {
            addCriterion("COMMENT_ID not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackIsNull() {
            addCriterion("WORKOUTSIDE_FEEDBACK is null");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackIsNotNull() {
            addCriterion("WORKOUTSIDE_FEEDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackEqualTo(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK =", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackNotEqualTo(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK <>", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackGreaterThan(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK >", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK >=", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackLessThan(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK <", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackLessThanOrEqualTo(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK <=", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackLike(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK like", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackNotLike(String value) {
            addCriterion("WORKOUTSIDE_FEEDBACK not like", value, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackIn(List<String> values) {
            addCriterion("WORKOUTSIDE_FEEDBACK in", values, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackNotIn(List<String> values) {
            addCriterion("WORKOUTSIDE_FEEDBACK not in", values, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackBetween(String value1, String value2) {
            addCriterion("WORKOUTSIDE_FEEDBACK between", value1, value2, "workoutsideFeedback");
            return (Criteria) this;
        }

        public Criteria andWorkoutsideFeedbackNotBetween(String value1, String value2) {
            addCriterion("WORKOUTSIDE_FEEDBACK not between", value1, value2, "workoutsideFeedback");
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