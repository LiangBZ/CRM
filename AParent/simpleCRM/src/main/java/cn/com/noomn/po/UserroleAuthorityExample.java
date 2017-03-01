package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class UserroleAuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserroleAuthorityExample() {
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

        public Criteria andUserroleAuthorityIdIsNull() {
            addCriterion("USERROLE_AUTHORITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdIsNotNull() {
            addCriterion("USERROLE_AUTHORITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdEqualTo(String value) {
            addCriterion("USERROLE_AUTHORITY_ID =", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdNotEqualTo(String value) {
            addCriterion("USERROLE_AUTHORITY_ID <>", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdGreaterThan(String value) {
            addCriterion("USERROLE_AUTHORITY_ID >", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdGreaterThanOrEqualTo(String value) {
            addCriterion("USERROLE_AUTHORITY_ID >=", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdLessThan(String value) {
            addCriterion("USERROLE_AUTHORITY_ID <", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdLessThanOrEqualTo(String value) {
            addCriterion("USERROLE_AUTHORITY_ID <=", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdLike(String value) {
            addCriterion("USERROLE_AUTHORITY_ID like", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdNotLike(String value) {
            addCriterion("USERROLE_AUTHORITY_ID not like", value, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdIn(List<String> values) {
            addCriterion("USERROLE_AUTHORITY_ID in", values, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdNotIn(List<String> values) {
            addCriterion("USERROLE_AUTHORITY_ID not in", values, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdBetween(String value1, String value2) {
            addCriterion("USERROLE_AUTHORITY_ID between", value1, value2, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleAuthorityIdNotBetween(String value1, String value2) {
            addCriterion("USERROLE_AUTHORITY_ID not between", value1, value2, "userroleAuthorityId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdIsNull() {
            addCriterion("USERROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserroleIdIsNotNull() {
            addCriterion("USERROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEqualTo(String value) {
            addCriterion("USERROLE_ID =", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotEqualTo(String value) {
            addCriterion("USERROLE_ID <>", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdGreaterThan(String value) {
            addCriterion("USERROLE_ID >", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdGreaterThanOrEqualTo(String value) {
            addCriterion("USERROLE_ID >=", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdLessThan(String value) {
            addCriterion("USERROLE_ID <", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdLessThanOrEqualTo(String value) {
            addCriterion("USERROLE_ID <=", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdLike(String value) {
            addCriterion("USERROLE_ID like", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotLike(String value) {
            addCriterion("USERROLE_ID not like", value, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdIn(List<String> values) {
            addCriterion("USERROLE_ID in", values, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotIn(List<String> values) {
            addCriterion("USERROLE_ID not in", values, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdBetween(String value1, String value2) {
            addCriterion("USERROLE_ID between", value1, value2, "userroleId");
            return (Criteria) this;
        }

        public Criteria andUserroleIdNotBetween(String value1, String value2) {
            addCriterion("USERROLE_ID not between", value1, value2, "userroleId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNull() {
            addCriterion("AUTHORITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("AUTHORITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(String value) {
            addCriterion("AUTHORITY_ID =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(String value) {
            addCriterion("AUTHORITY_ID <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(String value) {
            addCriterion("AUTHORITY_ID >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(String value) {
            addCriterion("AUTHORITY_ID <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(String value) {
            addCriterion("AUTHORITY_ID <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLike(String value) {
            addCriterion("AUTHORITY_ID like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotLike(String value) {
            addCriterion("AUTHORITY_ID not like", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<String> values) {
            addCriterion("AUTHORITY_ID in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<String> values) {
            addCriterion("AUTHORITY_ID not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(String value1, String value2) {
            addCriterion("AUTHORITY_ID not between", value1, value2, "authorityId");
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