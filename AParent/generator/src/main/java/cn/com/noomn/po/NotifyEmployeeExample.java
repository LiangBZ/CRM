package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class NotifyEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotifyEmployeeExample() {
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

        public Criteria andNotifyEmployeeIdIsNull() {
            addCriterion("NOTIFY_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdIsNotNull() {
            addCriterion("NOTIFY_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdEqualTo(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID =", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdNotEqualTo(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID <>", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdGreaterThan(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID >", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID >=", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdLessThan(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID <", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID <=", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdLike(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID like", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdNotLike(String value) {
            addCriterion("NOTIFY_EMPLOYEE_ID not like", value, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdIn(List<String> values) {
            addCriterion("NOTIFY_EMPLOYEE_ID in", values, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdNotIn(List<String> values) {
            addCriterion("NOTIFY_EMPLOYEE_ID not in", values, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdBetween(String value1, String value2) {
            addCriterion("NOTIFY_EMPLOYEE_ID between", value1, value2, "notifyEmployeeId");
            return (Criteria) this;
        }

        public Criteria andNotifyEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_EMPLOYEE_ID not between", value1, value2, "notifyEmployeeId");
            return (Criteria) this;
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

        public Criteria andReplyDateIsNull() {
            addCriterion("REPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNotNull() {
            addCriterion("REPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDateEqualTo(Timestamp value) {
            addCriterion("REPLY_DATE =", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotEqualTo(Timestamp value) {
            addCriterion("REPLY_DATE <>", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThan(Timestamp value) {
            addCriterion("REPLY_DATE >", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("REPLY_DATE >=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThan(Timestamp value) {
            addCriterion("REPLY_DATE <", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("REPLY_DATE <=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateIn(List<Timestamp> values) {
            addCriterion("REPLY_DATE in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotIn(List<Timestamp> values) {
            addCriterion("REPLY_DATE not in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REPLY_DATE between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REPLY_DATE not between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("REPLY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("REPLY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("REPLY_CONTENT =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("REPLY_CONTENT <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("REPLY_CONTENT >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_CONTENT >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("REPLY_CONTENT <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("REPLY_CONTENT <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("REPLY_CONTENT like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("REPLY_CONTENT not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("REPLY_CONTENT in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("REPLY_CONTENT not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("REPLY_CONTENT between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("REPLY_CONTENT not between", value1, value2, "replyContent");
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