package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class TempletTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TempletTypeExample() {
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

        public Criteria andTempletTypeIdIsNull() {
            addCriterion("TEMPLET_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdIsNotNull() {
            addCriterion("TEMPLET_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID =", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID <>", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdGreaterThan(String value) {
            addCriterion("TEMPLET_TYPE_ID >", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID >=", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdLessThan(String value) {
            addCriterion("TEMPLET_TYPE_ID <", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_ID <=", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdLike(String value) {
            addCriterion("TEMPLET_TYPE_ID like", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotLike(String value) {
            addCriterion("TEMPLET_TYPE_ID not like", value, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdIn(List<String> values) {
            addCriterion("TEMPLET_TYPE_ID in", values, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotIn(List<String> values) {
            addCriterion("TEMPLET_TYPE_ID not in", values, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdBetween(String value1, String value2) {
            addCriterion("TEMPLET_TYPE_ID between", value1, value2, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_TYPE_ID not between", value1, value2, "templetTypeId");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameIsNull() {
            addCriterion("TEMPLET_TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameIsNotNull() {
            addCriterion("TEMPLET_TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_NAME =", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameNotEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_NAME <>", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameGreaterThan(String value) {
            addCriterion("TEMPLET_TYPE_NAME >", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_NAME >=", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameLessThan(String value) {
            addCriterion("TEMPLET_TYPE_NAME <", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TEMPLET_TYPE_NAME <=", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameLike(String value) {
            addCriterion("TEMPLET_TYPE_NAME like", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameNotLike(String value) {
            addCriterion("TEMPLET_TYPE_NAME not like", value, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameIn(List<String> values) {
            addCriterion("TEMPLET_TYPE_NAME in", values, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameNotIn(List<String> values) {
            addCriterion("TEMPLET_TYPE_NAME not in", values, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameBetween(String value1, String value2) {
            addCriterion("TEMPLET_TYPE_NAME between", value1, value2, "templetTypeName");
            return (Criteria) this;
        }

        public Criteria andTempletTypeNameNotBetween(String value1, String value2) {
            addCriterion("TEMPLET_TYPE_NAME not between", value1, value2, "templetTypeName");
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