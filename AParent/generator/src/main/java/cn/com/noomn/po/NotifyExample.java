package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class NotifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotifyExample() {
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

        public Criteria andNotifyIdIsNull() {
            addCriterion("NOTIFY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIsNotNull() {
            addCriterion("NOTIFY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyIdEqualTo(String value) {
            addCriterion("NOTIFY_ID =", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotEqualTo(String value) {
            addCriterion("NOTIFY_ID <>", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdGreaterThan(String value) {
            addCriterion("NOTIFY_ID >", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_ID >=", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLessThan(String value) {
            addCriterion("NOTIFY_ID <", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_ID <=", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdLike(String value) {
            addCriterion("NOTIFY_ID like", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotLike(String value) {
            addCriterion("NOTIFY_ID not like", value, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdIn(List<String> values) {
            addCriterion("NOTIFY_ID in", values, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotIn(List<String> values) {
            addCriterion("NOTIFY_ID not in", values, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdBetween(String value1, String value2) {
            addCriterion("NOTIFY_ID between", value1, value2, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifyIdNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_ID not between", value1, value2, "notifyId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdIsNull() {
            addCriterion("NOTIFY_SEND_ID is null");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdIsNotNull() {
            addCriterion("NOTIFY_SEND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdEqualTo(String value) {
            addCriterion("NOTIFY_SEND_ID =", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdNotEqualTo(String value) {
            addCriterion("NOTIFY_SEND_ID <>", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdGreaterThan(String value) {
            addCriterion("NOTIFY_SEND_ID >", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_SEND_ID >=", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdLessThan(String value) {
            addCriterion("NOTIFY_SEND_ID <", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_SEND_ID <=", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdLike(String value) {
            addCriterion("NOTIFY_SEND_ID like", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdNotLike(String value) {
            addCriterion("NOTIFY_SEND_ID not like", value, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdIn(List<String> values) {
            addCriterion("NOTIFY_SEND_ID in", values, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdNotIn(List<String> values) {
            addCriterion("NOTIFY_SEND_ID not in", values, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdBetween(String value1, String value2) {
            addCriterion("NOTIFY_SEND_ID between", value1, value2, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifySendIdNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_SEND_ID not between", value1, value2, "notifySendId");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateIsNull() {
            addCriterion("NOTIFY_REPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateIsNotNull() {
            addCriterion("NOTIFY_REPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateEqualTo(Timestamp value) {
            addCriterion("NOTIFY_REPORT_DATE =", value, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateNotEqualTo(Timestamp value) {
            addCriterion("NOTIFY_REPORT_DATE <>", value, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateGreaterThan(Timestamp value) {
            addCriterion("NOTIFY_REPORT_DATE >", value, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("NOTIFY_REPORT_DATE >=", value, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateLessThan(Timestamp value) {
            addCriterion("NOTIFY_REPORT_DATE <", value, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("NOTIFY_REPORT_DATE <=", value, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateIn(List<Timestamp> values) {
            addCriterion("NOTIFY_REPORT_DATE in", values, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateNotIn(List<Timestamp> values) {
            addCriterion("NOTIFY_REPORT_DATE not in", values, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("NOTIFY_REPORT_DATE between", value1, value2, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyReportDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("NOTIFY_REPORT_DATE not between", value1, value2, "notifyReportDate");
            return (Criteria) this;
        }

        public Criteria andNotifyContentIsNull() {
            addCriterion("NOTIFY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andNotifyContentIsNotNull() {
            addCriterion("NOTIFY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyContentEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT =", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentNotEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT <>", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentGreaterThan(String value) {
            addCriterion("NOTIFY_CONTENT >", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT >=", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentLessThan(String value) {
            addCriterion("NOTIFY_CONTENT <", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_CONTENT <=", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentLike(String value) {
            addCriterion("NOTIFY_CONTENT like", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentNotLike(String value) {
            addCriterion("NOTIFY_CONTENT not like", value, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentIn(List<String> values) {
            addCriterion("NOTIFY_CONTENT in", values, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentNotIn(List<String> values) {
            addCriterion("NOTIFY_CONTENT not in", values, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentBetween(String value1, String value2) {
            addCriterion("NOTIFY_CONTENT between", value1, value2, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyContentNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_CONTENT not between", value1, value2, "notifyContent");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleIsNull() {
            addCriterion("NOTIFY_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleIsNotNull() {
            addCriterion("NOTIFY_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleEqualTo(String value) {
            addCriterion("NOTIFY_TITLE =", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleNotEqualTo(String value) {
            addCriterion("NOTIFY_TITLE <>", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleGreaterThan(String value) {
            addCriterion("NOTIFY_TITLE >", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_TITLE >=", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleLessThan(String value) {
            addCriterion("NOTIFY_TITLE <", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_TITLE <=", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleLike(String value) {
            addCriterion("NOTIFY_TITLE like", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleNotLike(String value) {
            addCriterion("NOTIFY_TITLE not like", value, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleIn(List<String> values) {
            addCriterion("NOTIFY_TITLE in", values, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleNotIn(List<String> values) {
            addCriterion("NOTIFY_TITLE not in", values, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleBetween(String value1, String value2) {
            addCriterion("NOTIFY_TITLE between", value1, value2, "notifyTitle");
            return (Criteria) this;
        }

        public Criteria andNotifyTitleNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_TITLE not between", value1, value2, "notifyTitle");
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