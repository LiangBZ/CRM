package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("REPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("REPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(String value) {
            addCriterion("REPORT_ID =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(String value) {
            addCriterion("REPORT_ID <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(String value) {
            addCriterion("REPORT_ID >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_ID >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(String value) {
            addCriterion("REPORT_ID <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(String value) {
            addCriterion("REPORT_ID <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLike(String value) {
            addCriterion("REPORT_ID like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotLike(String value) {
            addCriterion("REPORT_ID not like", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<String> values) {
            addCriterion("REPORT_ID in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<String> values) {
            addCriterion("REPORT_ID not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(String value1, String value2) {
            addCriterion("REPORT_ID between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(String value1, String value2) {
            addCriterion("REPORT_ID not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdIsNull() {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdIsNotNull() {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdEqualTo(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID =", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdNotEqualTo(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID <>", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdGreaterThan(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID >", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID >=", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdLessThan(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID <", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID <=", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdLike(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID like", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdNotLike(String value) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID not like", value, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdIn(List<String> values) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID in", values, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdNotIn(List<String> values) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID not in", values, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdBetween(String value1, String value2) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID between", value1, value2, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andBeencommentEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("BEENCOMMENT_EMPLOYEE_ID not between", value1, value2, "beencommentEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("COMMENT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("COMMENT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("COMMENT_CONTENT =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("COMMENT_CONTENT <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("COMMENT_CONTENT >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT_CONTENT >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("COMMENT_CONTENT <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("COMMENT_CONTENT <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("COMMENT_CONTENT like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("COMMENT_CONTENT not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("COMMENT_CONTENT in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("COMMENT_CONTENT not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("COMMENT_CONTENT between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("COMMENT_CONTENT not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("COMMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("COMMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Timestamp value) {
            addCriterion("COMMENT_DATE =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Timestamp value) {
            addCriterion("COMMENT_DATE <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Timestamp value) {
            addCriterion("COMMENT_DATE >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("COMMENT_DATE >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Timestamp value) {
            addCriterion("COMMENT_DATE <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("COMMENT_DATE <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Timestamp> values) {
            addCriterion("COMMENT_DATE in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Timestamp> values) {
            addCriterion("COMMENT_DATE not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("COMMENT_DATE between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("COMMENT_DATE not between", value1, value2, "commentDate");
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