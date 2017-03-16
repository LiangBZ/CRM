package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class TaskMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskMemberExample() {
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

        public Criteria andTaskMemberIdIsNull() {
            addCriterion("TASK_MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdIsNotNull() {
            addCriterion("TASK_MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdEqualTo(String value) {
            addCriterion("TASK_MEMBER_ID =", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdNotEqualTo(String value) {
            addCriterion("TASK_MEMBER_ID <>", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdGreaterThan(String value) {
            addCriterion("TASK_MEMBER_ID >", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_MEMBER_ID >=", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdLessThan(String value) {
            addCriterion("TASK_MEMBER_ID <", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_MEMBER_ID <=", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdLike(String value) {
            addCriterion("TASK_MEMBER_ID like", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdNotLike(String value) {
            addCriterion("TASK_MEMBER_ID not like", value, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdIn(List<String> values) {
            addCriterion("TASK_MEMBER_ID in", values, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdNotIn(List<String> values) {
            addCriterion("TASK_MEMBER_ID not in", values, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdBetween(String value1, String value2) {
            addCriterion("TASK_MEMBER_ID between", value1, value2, "taskMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskMemberIdNotBetween(String value1, String value2) {
            addCriterion("TASK_MEMBER_ID not between", value1, value2, "taskMemberId");
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

        public Criteria andMemberIdTaskIsNull() {
            addCriterion("MEMBER_ID_TASK is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskIsNotNull() {
            addCriterion("MEMBER_ID_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskEqualTo(String value) {
            addCriterion("MEMBER_ID_TASK =", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskNotEqualTo(String value) {
            addCriterion("MEMBER_ID_TASK <>", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskGreaterThan(String value) {
            addCriterion("MEMBER_ID_TASK >", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID_TASK >=", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskLessThan(String value) {
            addCriterion("MEMBER_ID_TASK <", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID_TASK <=", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskLike(String value) {
            addCriterion("MEMBER_ID_TASK like", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskNotLike(String value) {
            addCriterion("MEMBER_ID_TASK not like", value, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskIn(List<String> values) {
            addCriterion("MEMBER_ID_TASK in", values, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskNotIn(List<String> values) {
            addCriterion("MEMBER_ID_TASK not in", values, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskBetween(String value1, String value2) {
            addCriterion("MEMBER_ID_TASK between", value1, value2, "memberIdTask");
            return (Criteria) this;
        }

        public Criteria andMemberIdTaskNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID_TASK not between", value1, value2, "memberIdTask");
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