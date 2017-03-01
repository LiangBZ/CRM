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

        public Criteria andTaskSponsorIdIsNull() {
            addCriterion("TASK_SPONSOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdIsNotNull() {
            addCriterion("TASK_SPONSOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdEqualTo(String value) {
            addCriterion("TASK_SPONSOR_ID =", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdNotEqualTo(String value) {
            addCriterion("TASK_SPONSOR_ID <>", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdGreaterThan(String value) {
            addCriterion("TASK_SPONSOR_ID >", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_SPONSOR_ID >=", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdLessThan(String value) {
            addCriterion("TASK_SPONSOR_ID <", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_SPONSOR_ID <=", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdLike(String value) {
            addCriterion("TASK_SPONSOR_ID like", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdNotLike(String value) {
            addCriterion("TASK_SPONSOR_ID not like", value, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdIn(List<String> values) {
            addCriterion("TASK_SPONSOR_ID in", values, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdNotIn(List<String> values) {
            addCriterion("TASK_SPONSOR_ID not in", values, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdBetween(String value1, String value2) {
            addCriterion("TASK_SPONSOR_ID between", value1, value2, "taskSponsorId");
            return (Criteria) this;
        }

        public Criteria andTaskSponsorIdNotBetween(String value1, String value2) {
            addCriterion("TASK_SPONSOR_ID not between", value1, value2, "taskSponsorId");
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

        public Criteria andTaskPhotoIsNull() {
            addCriterion("TASK_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoIsNotNull() {
            addCriterion("TASK_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoEqualTo(String value) {
            addCriterion("TASK_PHOTO =", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoNotEqualTo(String value) {
            addCriterion("TASK_PHOTO <>", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoGreaterThan(String value) {
            addCriterion("TASK_PHOTO >", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_PHOTO >=", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoLessThan(String value) {
            addCriterion("TASK_PHOTO <", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoLessThanOrEqualTo(String value) {
            addCriterion("TASK_PHOTO <=", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoLike(String value) {
            addCriterion("TASK_PHOTO like", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoNotLike(String value) {
            addCriterion("TASK_PHOTO not like", value, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoIn(List<String> values) {
            addCriterion("TASK_PHOTO in", values, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoNotIn(List<String> values) {
            addCriterion("TASK_PHOTO not in", values, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoBetween(String value1, String value2) {
            addCriterion("TASK_PHOTO between", value1, value2, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskPhotoNotBetween(String value1, String value2) {
            addCriterion("TASK_PHOTO not between", value1, value2, "taskPhoto");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureIsNull() {
            addCriterion("TASK_ENCLOSURE is null");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureIsNotNull() {
            addCriterion("TASK_ENCLOSURE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureEqualTo(String value) {
            addCriterion("TASK_ENCLOSURE =", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureNotEqualTo(String value) {
            addCriterion("TASK_ENCLOSURE <>", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureGreaterThan(String value) {
            addCriterion("TASK_ENCLOSURE >", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ENCLOSURE >=", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureLessThan(String value) {
            addCriterion("TASK_ENCLOSURE <", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureLessThanOrEqualTo(String value) {
            addCriterion("TASK_ENCLOSURE <=", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureLike(String value) {
            addCriterion("TASK_ENCLOSURE like", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureNotLike(String value) {
            addCriterion("TASK_ENCLOSURE not like", value, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureIn(List<String> values) {
            addCriterion("TASK_ENCLOSURE in", values, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureNotIn(List<String> values) {
            addCriterion("TASK_ENCLOSURE not in", values, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureBetween(String value1, String value2) {
            addCriterion("TASK_ENCLOSURE between", value1, value2, "taskEnclosure");
            return (Criteria) this;
        }

        public Criteria andTaskEnclosureNotBetween(String value1, String value2) {
            addCriterion("TASK_ENCLOSURE not between", value1, value2, "taskEnclosure");
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