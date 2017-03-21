package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andBusinessOpportunityIdTaskIsNull() {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK is null");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskIsNotNull() {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK =", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskNotEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK <>", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskGreaterThan(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK >", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK >=", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskLessThan(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK <", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK <=", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskLike(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK like", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskNotLike(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK not like", value, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskIn(List<String> values) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK in", values, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskNotIn(List<String> values) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK not in", values, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskBetween(String value1, String value2) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK between", value1, value2, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdTaskNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_OPPORTUNITY_ID_TASK not between", value1, value2, "businessOpportunityIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskIsNull() {
            addCriterion("SPONSOR_ID_TASK is null");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskIsNotNull() {
            addCriterion("SPONSOR_ID_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskEqualTo(String value) {
            addCriterion("SPONSOR_ID_TASK =", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskNotEqualTo(String value) {
            addCriterion("SPONSOR_ID_TASK <>", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskGreaterThan(String value) {
            addCriterion("SPONSOR_ID_TASK >", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskGreaterThanOrEqualTo(String value) {
            addCriterion("SPONSOR_ID_TASK >=", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskLessThan(String value) {
            addCriterion("SPONSOR_ID_TASK <", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskLessThanOrEqualTo(String value) {
            addCriterion("SPONSOR_ID_TASK <=", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskLike(String value) {
            addCriterion("SPONSOR_ID_TASK like", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskNotLike(String value) {
            addCriterion("SPONSOR_ID_TASK not like", value, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskIn(List<String> values) {
            addCriterion("SPONSOR_ID_TASK in", values, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskNotIn(List<String> values) {
            addCriterion("SPONSOR_ID_TASK not in", values, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskBetween(String value1, String value2) {
            addCriterion("SPONSOR_ID_TASK between", value1, value2, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andSponsorIdTaskNotBetween(String value1, String value2) {
            addCriterion("SPONSOR_ID_TASK not between", value1, value2, "sponsorIdTask");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNull() {
            addCriterion("TASK_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andTaskContentIsNotNull() {
            addCriterion("TASK_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andTaskContentEqualTo(String value) {
            addCriterion("TASK_CONTENT =", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotEqualTo(String value) {
            addCriterion("TASK_CONTENT <>", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThan(String value) {
            addCriterion("TASK_CONTENT >", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_CONTENT >=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThan(String value) {
            addCriterion("TASK_CONTENT <", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLessThanOrEqualTo(String value) {
            addCriterion("TASK_CONTENT <=", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentLike(String value) {
            addCriterion("TASK_CONTENT like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotLike(String value) {
            addCriterion("TASK_CONTENT not like", value, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentIn(List<String> values) {
            addCriterion("TASK_CONTENT in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotIn(List<String> values) {
            addCriterion("TASK_CONTENT not in", values, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentBetween(String value1, String value2) {
            addCriterion("TASK_CONTENT between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskContentNotBetween(String value1, String value2) {
            addCriterion("TASK_CONTENT not between", value1, value2, "taskContent");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateIsNull() {
            addCriterion("TASK_REPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateIsNotNull() {
            addCriterion("TASK_REPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateEqualTo(Timestamp value) {
            addCriterion("TASK_REPORT_DATE =", value, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateNotEqualTo(Timestamp value) {
            addCriterion("TASK_REPORT_DATE <>", value, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateGreaterThan(Timestamp value) {
            addCriterion("TASK_REPORT_DATE >", value, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("TASK_REPORT_DATE >=", value, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateLessThan(Timestamp value) {
            addCriterion("TASK_REPORT_DATE <", value, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("TASK_REPORT_DATE <=", value, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateIn(List<Timestamp> values) {
            addCriterion("TASK_REPORT_DATE in", values, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateNotIn(List<Timestamp> values) {
            addCriterion("TASK_REPORT_DATE not in", values, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASK_REPORT_DATE between", value1, value2, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskReportDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASK_REPORT_DATE not between", value1, value2, "taskReportDate");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNull() {
            addCriterion("TASK_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNotNull() {
            addCriterion("TASK_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeEqualTo(Timestamp value) {
            addCriterion("TASK_START_TIME =", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotEqualTo(Timestamp value) {
            addCriterion("TASK_START_TIME <>", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThan(Timestamp value) {
            addCriterion("TASK_START_TIME >", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("TASK_START_TIME >=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThan(Timestamp value) {
            addCriterion("TASK_START_TIME <", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("TASK_START_TIME <=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIn(List<Timestamp> values) {
            addCriterion("TASK_START_TIME in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotIn(List<Timestamp> values) {
            addCriterion("TASK_START_TIME not in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASK_START_TIME between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASK_START_TIME not between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIsNull() {
            addCriterion("TASK_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIsNotNull() {
            addCriterion("TASK_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeEqualTo(Timestamp value) {
            addCriterion("TASK_END_TIME =", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotEqualTo(Timestamp value) {
            addCriterion("TASK_END_TIME <>", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeGreaterThan(Timestamp value) {
            addCriterion("TASK_END_TIME >", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("TASK_END_TIME >=", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLessThan(Timestamp value) {
            addCriterion("TASK_END_TIME <", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("TASK_END_TIME <=", value, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeIn(List<Timestamp> values) {
            addCriterion("TASK_END_TIME in", values, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotIn(List<Timestamp> values) {
            addCriterion("TASK_END_TIME not in", values, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASK_END_TIME between", value1, value2, "taskEndTime");
            return (Criteria) this;
        }

        public Criteria andTaskEndTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("TASK_END_TIME not between", value1, value2, "taskEndTime");
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