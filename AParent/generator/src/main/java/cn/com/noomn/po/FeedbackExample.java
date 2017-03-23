package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedbackExample() {
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

        public Criteria andFeedbackIdIsNull() {
            addCriterion("FEEDBACK_ID is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIsNotNull() {
            addCriterion("FEEDBACK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdEqualTo(String value) {
            addCriterion("FEEDBACK_ID =", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotEqualTo(String value) {
            addCriterion("FEEDBACK_ID <>", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThan(String value) {
            addCriterion("FEEDBACK_ID >", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_ID >=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThan(String value) {
            addCriterion("FEEDBACK_ID <", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_ID <=", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdLike(String value) {
            addCriterion("FEEDBACK_ID like", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotLike(String value) {
            addCriterion("FEEDBACK_ID not like", value, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdIn(List<String> values) {
            addCriterion("FEEDBACK_ID in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotIn(List<String> values) {
            addCriterion("FEEDBACK_ID not in", values, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdBetween(String value1, String value2) {
            addCriterion("FEEDBACK_ID between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andFeedbackIdNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_ID not between", value1, value2, "feedbackId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackIsNull() {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK is null");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackIsNotNull() {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK =", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackNotEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK <>", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackGreaterThan(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK >", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK >=", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackLessThan(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK <", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK <=", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackLike(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK like", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackNotLike(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK not like", value, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackIn(List<String> values) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK in", values, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackNotIn(List<String> values) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK not in", values, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackBetween(String value1, String value2) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK between", value1, value2, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdFeedbackNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_EMPLOYEE_ID_FEEDBACK not between", value1, value2, "followEmployeeIdFeedback");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailIsNull() {
            addCriterion("FEEDBACK_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailIsNotNull() {
            addCriterion("FEEDBACK_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailEqualTo(String value) {
            addCriterion("FEEDBACK_DETAIL =", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotEqualTo(String value) {
            addCriterion("FEEDBACK_DETAIL <>", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailGreaterThan(String value) {
            addCriterion("FEEDBACK_DETAIL >", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailGreaterThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_DETAIL >=", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailLessThan(String value) {
            addCriterion("FEEDBACK_DETAIL <", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailLessThanOrEqualTo(String value) {
            addCriterion("FEEDBACK_DETAIL <=", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailLike(String value) {
            addCriterion("FEEDBACK_DETAIL like", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotLike(String value) {
            addCriterion("FEEDBACK_DETAIL not like", value, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailIn(List<String> values) {
            addCriterion("FEEDBACK_DETAIL in", values, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotIn(List<String> values) {
            addCriterion("FEEDBACK_DETAIL not in", values, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailBetween(String value1, String value2) {
            addCriterion("FEEDBACK_DETAIL between", value1, value2, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackDetailNotBetween(String value1, String value2) {
            addCriterion("FEEDBACK_DETAIL not between", value1, value2, "feedbackDetail");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNull() {
            addCriterion("FEEDBACK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIsNotNull() {
            addCriterion("FEEDBACK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeEqualTo(Timestamp value) {
            addCriterion("FEEDBACK_TIME =", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotEqualTo(Timestamp value) {
            addCriterion("FEEDBACK_TIME <>", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThan(Timestamp value) {
            addCriterion("FEEDBACK_TIME >", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("FEEDBACK_TIME >=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThan(Timestamp value) {
            addCriterion("FEEDBACK_TIME <", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("FEEDBACK_TIME <=", value, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeIn(List<Timestamp> values) {
            addCriterion("FEEDBACK_TIME in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotIn(List<Timestamp> values) {
            addCriterion("FEEDBACK_TIME not in", values, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FEEDBACK_TIME between", value1, value2, "feedbackTime");
            return (Criteria) this;
        }

        public Criteria andFeedbackTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FEEDBACK_TIME not between", value1, value2, "feedbackTime");
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