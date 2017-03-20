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

        public Criteria andReceiveIdTaskIsNull() {
            addCriterion("RECEIVE_ID_TASK is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskIsNotNull() {
            addCriterion("RECEIVE_ID_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskEqualTo(String value) {
            addCriterion("RECEIVE_ID_TASK =", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskNotEqualTo(String value) {
            addCriterion("RECEIVE_ID_TASK <>", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskGreaterThan(String value) {
            addCriterion("RECEIVE_ID_TASK >", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ID_TASK >=", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskLessThan(String value) {
            addCriterion("RECEIVE_ID_TASK <", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ID_TASK <=", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskLike(String value) {
            addCriterion("RECEIVE_ID_TASK like", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskNotLike(String value) {
            addCriterion("RECEIVE_ID_TASK not like", value, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskIn(List<String> values) {
            addCriterion("RECEIVE_ID_TASK in", values, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskNotIn(List<String> values) {
            addCriterion("RECEIVE_ID_TASK not in", values, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskBetween(String value1, String value2) {
            addCriterion("RECEIVE_ID_TASK between", value1, value2, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andReceiveIdTaskNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_ID_TASK not between", value1, value2, "receiveIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskIsNull() {
            addCriterion("CUSTOM_ID_TASK is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskIsNotNull() {
            addCriterion("CUSTOM_ID_TASK is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskEqualTo(String value) {
            addCriterion("CUSTOM_ID_TASK =", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskNotEqualTo(String value) {
            addCriterion("CUSTOM_ID_TASK <>", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskGreaterThan(String value) {
            addCriterion("CUSTOM_ID_TASK >", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID_TASK >=", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskLessThan(String value) {
            addCriterion("CUSTOM_ID_TASK <", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID_TASK <=", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskLike(String value) {
            addCriterion("CUSTOM_ID_TASK like", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskNotLike(String value) {
            addCriterion("CUSTOM_ID_TASK not like", value, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskIn(List<String> values) {
            addCriterion("CUSTOM_ID_TASK in", values, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskNotIn(List<String> values) {
            addCriterion("CUSTOM_ID_TASK not in", values, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID_TASK between", value1, value2, "customIdTask");
            return (Criteria) this;
        }

        public Criteria andCustomIdTaskNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID_TASK not between", value1, value2, "customIdTask");
            return (Criteria) this;
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

        public Criteria andTaskIsoutsideIsNull() {
            addCriterion("TASK_ISOUTSIDE is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideIsNotNull() {
            addCriterion("TASK_ISOUTSIDE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideEqualTo(Integer value) {
            addCriterion("TASK_ISOUTSIDE =", value, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideNotEqualTo(Integer value) {
            addCriterion("TASK_ISOUTSIDE <>", value, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideGreaterThan(Integer value) {
            addCriterion("TASK_ISOUTSIDE >", value, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ISOUTSIDE >=", value, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideLessThan(Integer value) {
            addCriterion("TASK_ISOUTSIDE <", value, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ISOUTSIDE <=", value, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideIn(List<Integer> values) {
            addCriterion("TASK_ISOUTSIDE in", values, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideNotIn(List<Integer> values) {
            addCriterion("TASK_ISOUTSIDE not in", values, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ISOUTSIDE between", value1, value2, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskIsoutsideNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ISOUTSIDE not between", value1, value2, "taskIsoutside");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusIsNull() {
            addCriterion("TASK_COMPLETION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusIsNotNull() {
            addCriterion("TASK_COMPLETION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusEqualTo(Integer value) {
            addCriterion("TASK_COMPLETION_STATUS =", value, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusNotEqualTo(Integer value) {
            addCriterion("TASK_COMPLETION_STATUS <>", value, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusGreaterThan(Integer value) {
            addCriterion("TASK_COMPLETION_STATUS >", value, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_COMPLETION_STATUS >=", value, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusLessThan(Integer value) {
            addCriterion("TASK_COMPLETION_STATUS <", value, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_COMPLETION_STATUS <=", value, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusIn(List<Integer> values) {
            addCriterion("TASK_COMPLETION_STATUS in", values, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusNotIn(List<Integer> values) {
            addCriterion("TASK_COMPLETION_STATUS not in", values, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusBetween(Integer value1, Integer value2) {
            addCriterion("TASK_COMPLETION_STATUS between", value1, value2, "taskCompletionStatus");
            return (Criteria) this;
        }

        public Criteria andTaskCompletionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_COMPLETION_STATUS not between", value1, value2, "taskCompletionStatus");
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