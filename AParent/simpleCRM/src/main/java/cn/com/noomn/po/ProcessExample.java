package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessExample() {
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

        public Criteria andProcessIdIsNull() {
            addCriterion("PROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("PROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("PROCESS_ID =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("PROCESS_ID <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("PROCESS_ID >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("PROCESS_ID <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("PROCESS_ID like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("PROCESS_ID not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("PROCESS_ID in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("PROCESS_ID not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("PROCESS_ID between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_ID not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessIsNull() {
            addCriterion("TASK_ID_PROCESS is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessIsNotNull() {
            addCriterion("TASK_ID_PROCESS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessEqualTo(String value) {
            addCriterion("TASK_ID_PROCESS =", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessNotEqualTo(String value) {
            addCriterion("TASK_ID_PROCESS <>", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessGreaterThan(String value) {
            addCriterion("TASK_ID_PROCESS >", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID_PROCESS >=", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessLessThan(String value) {
            addCriterion("TASK_ID_PROCESS <", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID_PROCESS <=", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessLike(String value) {
            addCriterion("TASK_ID_PROCESS like", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessNotLike(String value) {
            addCriterion("TASK_ID_PROCESS not like", value, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessIn(List<String> values) {
            addCriterion("TASK_ID_PROCESS in", values, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessNotIn(List<String> values) {
            addCriterion("TASK_ID_PROCESS not in", values, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessBetween(String value1, String value2) {
            addCriterion("TASK_ID_PROCESS between", value1, value2, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andTaskIdProcessNotBetween(String value1, String value2) {
            addCriterion("TASK_ID_PROCESS not between", value1, value2, "taskIdProcess");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdIsNull() {
            addCriterion("PROCESS_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdIsNotNull() {
            addCriterion("PROCESS_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID =", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID <>", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdGreaterThan(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID >", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID >=", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdLessThan(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID <", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID <=", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdLike(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID like", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotLike(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID not like", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdIn(List<String> values) {
            addCriterion("PROCESS_EMPLOYEE_ID in", values, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotIn(List<String> values) {
            addCriterion("PROCESS_EMPLOYEE_ID not in", values, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdBetween(String value1, String value2) {
            addCriterion("PROCESS_EMPLOYEE_ID between", value1, value2, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_EMPLOYEE_ID not between", value1, value2, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessApproverIsNull() {
            addCriterion("PROCESS_APPROVER is null");
            return (Criteria) this;
        }

        public Criteria andProcessApproverIsNotNull() {
            addCriterion("PROCESS_APPROVER is not null");
            return (Criteria) this;
        }

        public Criteria andProcessApproverEqualTo(String value) {
            addCriterion("PROCESS_APPROVER =", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverNotEqualTo(String value) {
            addCriterion("PROCESS_APPROVER <>", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverGreaterThan(String value) {
            addCriterion("PROCESS_APPROVER >", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_APPROVER >=", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverLessThan(String value) {
            addCriterion("PROCESS_APPROVER <", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_APPROVER <=", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverLike(String value) {
            addCriterion("PROCESS_APPROVER like", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverNotLike(String value) {
            addCriterion("PROCESS_APPROVER not like", value, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverIn(List<String> values) {
            addCriterion("PROCESS_APPROVER in", values, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverNotIn(List<String> values) {
            addCriterion("PROCESS_APPROVER not in", values, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverBetween(String value1, String value2) {
            addCriterion("PROCESS_APPROVER between", value1, value2, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessApproverNotBetween(String value1, String value2) {
            addCriterion("PROCESS_APPROVER not between", value1, value2, "processApprover");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNull() {
            addCriterion("PROCESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNotNull() {
            addCriterion("PROCESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDateEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE =", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE <>", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThan(Timestamp value) {
            addCriterion("PROCESS_DATE >", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE >=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThan(Timestamp value) {
            addCriterion("PROCESS_DATE <", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE <=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateIn(List<Timestamp> values) {
            addCriterion("PROCESS_DATE in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotIn(List<Timestamp> values) {
            addCriterion("PROCESS_DATE not in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_DATE between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_DATE not between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessTitleIsNull() {
            addCriterion("PROCESS_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andProcessTitleIsNotNull() {
            addCriterion("PROCESS_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTitleEqualTo(String value) {
            addCriterion("PROCESS_TITLE =", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleNotEqualTo(String value) {
            addCriterion("PROCESS_TITLE <>", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleGreaterThan(String value) {
            addCriterion("PROCESS_TITLE >", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_TITLE >=", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleLessThan(String value) {
            addCriterion("PROCESS_TITLE <", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_TITLE <=", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleLike(String value) {
            addCriterion("PROCESS_TITLE like", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleNotLike(String value) {
            addCriterion("PROCESS_TITLE not like", value, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleIn(List<String> values) {
            addCriterion("PROCESS_TITLE in", values, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleNotIn(List<String> values) {
            addCriterion("PROCESS_TITLE not in", values, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleBetween(String value1, String value2) {
            addCriterion("PROCESS_TITLE between", value1, value2, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessTitleNotBetween(String value1, String value2) {
            addCriterion("PROCESS_TITLE not between", value1, value2, "processTitle");
            return (Criteria) this;
        }

        public Criteria andProcessContentIsNull() {
            addCriterion("PROCESS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andProcessContentIsNotNull() {
            addCriterion("PROCESS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andProcessContentEqualTo(String value) {
            addCriterion("PROCESS_CONTENT =", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotEqualTo(String value) {
            addCriterion("PROCESS_CONTENT <>", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentGreaterThan(String value) {
            addCriterion("PROCESS_CONTENT >", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_CONTENT >=", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLessThan(String value) {
            addCriterion("PROCESS_CONTENT <", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_CONTENT <=", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLike(String value) {
            addCriterion("PROCESS_CONTENT like", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotLike(String value) {
            addCriterion("PROCESS_CONTENT not like", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentIn(List<String> values) {
            addCriterion("PROCESS_CONTENT in", values, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotIn(List<String> values) {
            addCriterion("PROCESS_CONTENT not in", values, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentBetween(String value1, String value2) {
            addCriterion("PROCESS_CONTENT between", value1, value2, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotBetween(String value1, String value2) {
            addCriterion("PROCESS_CONTENT not between", value1, value2, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessStateIsNull() {
            addCriterion("PROCESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessStateIsNotNull() {
            addCriterion("PROCESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStateEqualTo(Integer value) {
            addCriterion("PROCESS_STATE =", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotEqualTo(Integer value) {
            addCriterion("PROCESS_STATE <>", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateGreaterThan(Integer value) {
            addCriterion("PROCESS_STATE >", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROCESS_STATE >=", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLessThan(Integer value) {
            addCriterion("PROCESS_STATE <", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLessThanOrEqualTo(Integer value) {
            addCriterion("PROCESS_STATE <=", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateIn(List<Integer> values) {
            addCriterion("PROCESS_STATE in", values, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotIn(List<Integer> values) {
            addCriterion("PROCESS_STATE not in", values, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateBetween(Integer value1, Integer value2) {
            addCriterion("PROCESS_STATE between", value1, value2, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotBetween(Integer value1, Integer value2) {
            addCriterion("PROCESS_STATE not between", value1, value2, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineIsNull() {
            addCriterion("PROCESS_APPROVAL_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineIsNotNull() {
            addCriterion("PROCESS_APPROVAL_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineEqualTo(Timestamp value) {
            addCriterion("PROCESS_APPROVAL_DEADLINE =", value, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineNotEqualTo(Timestamp value) {
            addCriterion("PROCESS_APPROVAL_DEADLINE <>", value, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineGreaterThan(Timestamp value) {
            addCriterion("PROCESS_APPROVAL_DEADLINE >", value, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_APPROVAL_DEADLINE >=", value, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineLessThan(Timestamp value) {
            addCriterion("PROCESS_APPROVAL_DEADLINE <", value, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineLessThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_APPROVAL_DEADLINE <=", value, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineIn(List<Timestamp> values) {
            addCriterion("PROCESS_APPROVAL_DEADLINE in", values, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineNotIn(List<Timestamp> values) {
            addCriterion("PROCESS_APPROVAL_DEADLINE not in", values, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_APPROVAL_DEADLINE between", value1, value2, "processApprovalDeadline");
            return (Criteria) this;
        }

        public Criteria andProcessApprovalDeadlineNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_APPROVAL_DEADLINE not between", value1, value2, "processApprovalDeadline");
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