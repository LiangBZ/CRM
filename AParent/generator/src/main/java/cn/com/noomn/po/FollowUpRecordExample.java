package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FollowUpRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowUpRecordExample() {
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

        public Criteria andFollowUpRecordIdIsNull() {
            addCriterion("FOLLOW_UP_RECORD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdIsNotNull() {
            addCriterion("FOLLOW_UP_RECORD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID =", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID <>", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdGreaterThan(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID >", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID >=", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdLessThan(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID <", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID <=", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdLike(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID like", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotLike(String value) {
            addCriterion("FOLLOW_UP_RECORD_ID not like", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdIn(List<String> values) {
            addCriterion("FOLLOW_UP_RECORD_ID in", values, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotIn(List<String> values) {
            addCriterion("FOLLOW_UP_RECORD_ID not in", values, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdBetween(String value1, String value2) {
            addCriterion("FOLLOW_UP_RECORD_ID between", value1, value2, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_UP_RECORD_ID not between", value1, value2, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdIsNull() {
            addCriterion("BUSINESS_OPPORTUNITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdIsNotNull() {
            addCriterion("BUSINESS_OPPORTUNITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID =", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdNotEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID <>", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdGreaterThan(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID >", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID >=", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdLessThan(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID <", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID <=", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdLike(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID like", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdNotLike(String value) {
            addCriterion("BUSINESS_OPPORTUNITY_ID not like", value, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdIn(List<String> values) {
            addCriterion("BUSINESS_OPPORTUNITY_ID in", values, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdNotIn(List<String> values) {
            addCriterion("BUSINESS_OPPORTUNITY_ID not in", values, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdBetween(String value1, String value2) {
            addCriterion("BUSINESS_OPPORTUNITY_ID between", value1, value2, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andBusinessOpportunityIdNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_OPPORTUNITY_ID not between", value1, value2, "businessOpportunityId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateIsNull() {
            addCriterion("FOLLOW_UP_RECORD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateIsNotNull() {
            addCriterion("FOLLOW_UP_RECORD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateEqualTo(Timestamp value) {
            addCriterion("FOLLOW_UP_RECORD_DATE =", value, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateNotEqualTo(Timestamp value) {
            addCriterion("FOLLOW_UP_RECORD_DATE <>", value, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateGreaterThan(Timestamp value) {
            addCriterion("FOLLOW_UP_RECORD_DATE >", value, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("FOLLOW_UP_RECORD_DATE >=", value, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateLessThan(Timestamp value) {
            addCriterion("FOLLOW_UP_RECORD_DATE <", value, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("FOLLOW_UP_RECORD_DATE <=", value, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateIn(List<Timestamp> values) {
            addCriterion("FOLLOW_UP_RECORD_DATE in", values, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateNotIn(List<Timestamp> values) {
            addCriterion("FOLLOW_UP_RECORD_DATE not in", values, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FOLLOW_UP_RECORD_DATE between", value1, value2, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("FOLLOW_UP_RECORD_DATE not between", value1, value2, "followUpRecordDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentIsNull() {
            addCriterion("FOLLOW_UP_RECORD_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentIsNotNull() {
            addCriterion("FOLLOW_UP_RECORD_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT =", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentNotEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT <>", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentGreaterThan(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT >", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT >=", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentLessThan(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT <", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT <=", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentLike(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT like", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentNotLike(String value) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT not like", value, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentIn(List<String> values) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT in", values, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentNotIn(List<String> values) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT not in", values, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentBetween(String value1, String value2) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT between", value1, value2, "followUpRecordContent");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordContentNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_UP_RECORD_CONTENT not between", value1, value2, "followUpRecordContent");
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