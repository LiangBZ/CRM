package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.List;

public class LinkmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinkmanExample() {
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

        public Criteria andLinkmanIdIsNull() {
            addCriterion("LINKMAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIsNotNull() {
            addCriterion("LINKMAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdEqualTo(String value) {
            addCriterion("LINKMAN_ID =", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotEqualTo(String value) {
            addCriterion("LINKMAN_ID <>", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThan(String value) {
            addCriterion("LINKMAN_ID >", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_ID >=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThan(String value) {
            addCriterion("LINKMAN_ID <", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_ID <=", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdLike(String value) {
            addCriterion("LINKMAN_ID like", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotLike(String value) {
            addCriterion("LINKMAN_ID not like", value, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdIn(List<String> values) {
            addCriterion("LINKMAN_ID in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotIn(List<String> values) {
            addCriterion("LINKMAN_ID not in", values, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdBetween(String value1, String value2) {
            addCriterion("LINKMAN_ID between", value1, value2, "linkmanId");
            return (Criteria) this;
        }

        public Criteria andLinkmanIdNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_ID not between", value1, value2, "linkmanId");
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

        public Criteria andLinkmanNameIsNull() {
            addCriterion("LINKMAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNotNull() {
            addCriterion("LINKMAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameEqualTo(String value) {
            addCriterion("LINKMAN_NAME =", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotEqualTo(String value) {
            addCriterion("LINKMAN_NAME <>", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThan(String value) {
            addCriterion("LINKMAN_NAME >", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME >=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThan(String value) {
            addCriterion("LINKMAN_NAME <", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME <=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLike(String value) {
            addCriterion("LINKMAN_NAME like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotLike(String value) {
            addCriterion("LINKMAN_NAME not like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIn(List<String> values) {
            addCriterion("LINKMAN_NAME in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotIn(List<String> values) {
            addCriterion("LINKMAN_NAME not in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME not between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNull() {
            addCriterion("LINKMAN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNotNull() {
            addCriterion("LINKMAN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneEqualTo(String value) {
            addCriterion("LINKMAN_PHONE =", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotEqualTo(String value) {
            addCriterion("LINKMAN_PHONE <>", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThan(String value) {
            addCriterion("LINKMAN_PHONE >", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE >=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThan(String value) {
            addCriterion("LINKMAN_PHONE <", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE <=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLike(String value) {
            addCriterion("LINKMAN_PHONE like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotLike(String value) {
            addCriterion("LINKMAN_PHONE not like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIn(List<String> values) {
            addCriterion("LINKMAN_PHONE in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotIn(List<String> values) {
            addCriterion("LINKMAN_PHONE not in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE not between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNull() {
            addCriterion("LINKMAN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNotNull() {
            addCriterion("LINKMAN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelEqualTo(String value) {
            addCriterion("LINKMAN_TEL =", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotEqualTo(String value) {
            addCriterion("LINKMAN_TEL <>", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThan(String value) {
            addCriterion("LINKMAN_TEL >", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_TEL >=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThan(String value) {
            addCriterion("LINKMAN_TEL <", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_TEL <=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLike(String value) {
            addCriterion("LINKMAN_TEL like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotLike(String value) {
            addCriterion("LINKMAN_TEL not like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIn(List<String> values) {
            addCriterion("LINKMAN_TEL in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotIn(List<String> values) {
            addCriterion("LINKMAN_TEL not in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelBetween(String value1, String value2) {
            addCriterion("LINKMAN_TEL between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_TEL not between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostIsNull() {
            addCriterion("LINKMAN_POST is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostIsNotNull() {
            addCriterion("LINKMAN_POST is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostEqualTo(String value) {
            addCriterion("LINKMAN_POST =", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostNotEqualTo(String value) {
            addCriterion("LINKMAN_POST <>", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostGreaterThan(String value) {
            addCriterion("LINKMAN_POST >", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_POST >=", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostLessThan(String value) {
            addCriterion("LINKMAN_POST <", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_POST <=", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostLike(String value) {
            addCriterion("LINKMAN_POST like", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostNotLike(String value) {
            addCriterion("LINKMAN_POST not like", value, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostIn(List<String> values) {
            addCriterion("LINKMAN_POST in", values, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostNotIn(List<String> values) {
            addCriterion("LINKMAN_POST not in", values, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostBetween(String value1, String value2) {
            addCriterion("LINKMAN_POST between", value1, value2, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanPostNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_POST not between", value1, value2, "linkmanPost");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNull() {
            addCriterion("LINKMAN_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNotNull() {
            addCriterion("LINKMAN_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL =", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL <>", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThan(String value) {
            addCriterion("LINKMAN_EMAIL >", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL >=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThan(String value) {
            addCriterion("LINKMAN_EMAIL <", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_EMAIL <=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLike(String value) {
            addCriterion("LINKMAN_EMAIL like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotLike(String value) {
            addCriterion("LINKMAN_EMAIL not like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotIn(List<String> values) {
            addCriterion("LINKMAN_EMAIL not in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_EMAIL not between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexIsNull() {
            addCriterion("LINKMAN_SEX is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexIsNotNull() {
            addCriterion("LINKMAN_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexEqualTo(String value) {
            addCriterion("LINKMAN_SEX =", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotEqualTo(String value) {
            addCriterion("LINKMAN_SEX <>", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexGreaterThan(String value) {
            addCriterion("LINKMAN_SEX >", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_SEX >=", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexLessThan(String value) {
            addCriterion("LINKMAN_SEX <", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_SEX <=", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexLike(String value) {
            addCriterion("LINKMAN_SEX like", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotLike(String value) {
            addCriterion("LINKMAN_SEX not like", value, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexIn(List<String> values) {
            addCriterion("LINKMAN_SEX in", values, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotIn(List<String> values) {
            addCriterion("LINKMAN_SEX not in", values, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexBetween(String value1, String value2) {
            addCriterion("LINKMAN_SEX between", value1, value2, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanSexNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_SEX not between", value1, value2, "linkmanSex");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkIsNull() {
            addCriterion("LINKMAN_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkIsNotNull() {
            addCriterion("LINKMAN_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkEqualTo(String value) {
            addCriterion("LINKMAN_REMARK =", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkNotEqualTo(String value) {
            addCriterion("LINKMAN_REMARK <>", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkGreaterThan(String value) {
            addCriterion("LINKMAN_REMARK >", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_REMARK >=", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkLessThan(String value) {
            addCriterion("LINKMAN_REMARK <", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_REMARK <=", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkLike(String value) {
            addCriterion("LINKMAN_REMARK like", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkNotLike(String value) {
            addCriterion("LINKMAN_REMARK not like", value, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkIn(List<String> values) {
            addCriterion("LINKMAN_REMARK in", values, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkNotIn(List<String> values) {
            addCriterion("LINKMAN_REMARK not in", values, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkBetween(String value1, String value2) {
            addCriterion("LINKMAN_REMARK between", value1, value2, "linkmanRemark");
            return (Criteria) this;
        }

        public Criteria andLinkmanRemarkNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_REMARK not between", value1, value2, "linkmanRemark");
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