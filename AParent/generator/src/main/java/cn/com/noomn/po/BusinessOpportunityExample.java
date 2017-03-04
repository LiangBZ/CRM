package cn.com.noomn.po;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BusinessOpportunityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessOpportunityExample() {
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

        public Criteria andFollowEmployeeIdIsNull() {
            addCriterion("FOLLOW_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdIsNotNull() {
            addCriterion("FOLLOW_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID =", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID <>", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdGreaterThan(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID >", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID >=", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdLessThan(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID <", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID <=", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdLike(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID like", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotLike(String value) {
            addCriterion("FOLLOW_EMPLOYEE_ID not like", value, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdIn(List<String> values) {
            addCriterion("FOLLOW_EMPLOYEE_ID in", values, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotIn(List<String> values) {
            addCriterion("FOLLOW_EMPLOYEE_ID not in", values, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdBetween(String value1, String value2) {
            addCriterion("FOLLOW_EMPLOYEE_ID between", value1, value2, "followEmployeeId");
            return (Criteria) this;
        }

        public Criteria andFollowEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("FOLLOW_EMPLOYEE_ID not between", value1, value2, "followEmployeeId");
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

        public Criteria andSalesStageIdIsNull() {
            addCriterion("SALES_STAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdIsNotNull() {
            addCriterion("SALES_STAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdEqualTo(String value) {
            addCriterion("SALES_STAGE_ID =", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdNotEqualTo(String value) {
            addCriterion("SALES_STAGE_ID <>", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdGreaterThan(String value) {
            addCriterion("SALES_STAGE_ID >", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALES_STAGE_ID >=", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdLessThan(String value) {
            addCriterion("SALES_STAGE_ID <", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdLessThanOrEqualTo(String value) {
            addCriterion("SALES_STAGE_ID <=", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdLike(String value) {
            addCriterion("SALES_STAGE_ID like", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdNotLike(String value) {
            addCriterion("SALES_STAGE_ID not like", value, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdIn(List<String> values) {
            addCriterion("SALES_STAGE_ID in", values, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdNotIn(List<String> values) {
            addCriterion("SALES_STAGE_ID not in", values, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdBetween(String value1, String value2) {
            addCriterion("SALES_STAGE_ID between", value1, value2, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andSalesStageIdNotBetween(String value1, String value2) {
            addCriterion("SALES_STAGE_ID not between", value1, value2, "salesStageId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountIsNull() {
            addCriterion("PRE_SALES_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountIsNotNull() {
            addCriterion("PRE_SALES_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountEqualTo(BigDecimal value) {
            addCriterion("PRE_SALES_AMOUNT =", value, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountNotEqualTo(BigDecimal value) {
            addCriterion("PRE_SALES_AMOUNT <>", value, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountGreaterThan(BigDecimal value) {
            addCriterion("PRE_SALES_AMOUNT >", value, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_SALES_AMOUNT >=", value, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountLessThan(BigDecimal value) {
            addCriterion("PRE_SALES_AMOUNT <", value, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_SALES_AMOUNT <=", value, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountIn(List<BigDecimal> values) {
            addCriterion("PRE_SALES_AMOUNT in", values, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountNotIn(List<BigDecimal> values) {
            addCriterion("PRE_SALES_AMOUNT not in", values, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_SALES_AMOUNT between", value1, value2, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreSalesAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_SALES_AMOUNT not between", value1, value2, "preSalesAmount");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeIsNull() {
            addCriterion("PRE_DEAL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeIsNotNull() {
            addCriterion("PRE_DEAL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeEqualTo(Timestamp value) {
            addCriterion("PRE_DEAL_TIME =", value, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeNotEqualTo(Timestamp value) {
            addCriterion("PRE_DEAL_TIME <>", value, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeGreaterThan(Timestamp value) {
            addCriterion("PRE_DEAL_TIME >", value, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PRE_DEAL_TIME >=", value, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeLessThan(Timestamp value) {
            addCriterion("PRE_DEAL_TIME <", value, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PRE_DEAL_TIME <=", value, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeIn(List<Timestamp> values) {
            addCriterion("PRE_DEAL_TIME in", values, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeNotIn(List<Timestamp> values) {
            addCriterion("PRE_DEAL_TIME not in", values, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PRE_DEAL_TIME between", value1, value2, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andPreDealTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PRE_DEAL_TIME not between", value1, value2, "preDealTime");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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