package cn.com.noomn.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportExample() {
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

        public Criteria andReportEmployeeIdIsNull() {
            addCriterion("REPORT_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdIsNotNull() {
            addCriterion("REPORT_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdEqualTo(String value) {
            addCriterion("REPORT_EMPLOYEE_ID =", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdNotEqualTo(String value) {
            addCriterion("REPORT_EMPLOYEE_ID <>", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdGreaterThan(String value) {
            addCriterion("REPORT_EMPLOYEE_ID >", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_EMPLOYEE_ID >=", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdLessThan(String value) {
            addCriterion("REPORT_EMPLOYEE_ID <", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("REPORT_EMPLOYEE_ID <=", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdLike(String value) {
            addCriterion("REPORT_EMPLOYEE_ID like", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdNotLike(String value) {
            addCriterion("REPORT_EMPLOYEE_ID not like", value, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdIn(List<String> values) {
            addCriterion("REPORT_EMPLOYEE_ID in", values, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdNotIn(List<String> values) {
            addCriterion("REPORT_EMPLOYEE_ID not in", values, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdBetween(String value1, String value2) {
            addCriterion("REPORT_EMPLOYEE_ID between", value1, value2, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("REPORT_EMPLOYEE_ID not between", value1, value2, "reportEmployeeId");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("REPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("REPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Timestamp value) {
            addCriterion("REPORT_DATE =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Timestamp value) {
            addCriterion("REPORT_DATE <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Timestamp value) {
            addCriterion("REPORT_DATE >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("REPORT_DATE >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Timestamp value) {
            addCriterion("REPORT_DATE <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("REPORT_DATE <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Timestamp> values) {
            addCriterion("REPORT_DATE in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Timestamp> values) {
            addCriterion("REPORT_DATE not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REPORT_DATE between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("REPORT_DATE not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportContentIsNull() {
            addCriterion("REPORT_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andReportContentIsNotNull() {
            addCriterion("REPORT_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andReportContentEqualTo(String value) {
            addCriterion("REPORT_CONTENT =", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotEqualTo(String value) {
            addCriterion("REPORT_CONTENT <>", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentGreaterThan(String value) {
            addCriterion("REPORT_CONTENT >", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_CONTENT >=", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLessThan(String value) {
            addCriterion("REPORT_CONTENT <", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLessThanOrEqualTo(String value) {
            addCriterion("REPORT_CONTENT <=", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentLike(String value) {
            addCriterion("REPORT_CONTENT like", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotLike(String value) {
            addCriterion("REPORT_CONTENT not like", value, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentIn(List<String> values) {
            addCriterion("REPORT_CONTENT in", values, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotIn(List<String> values) {
            addCriterion("REPORT_CONTENT not in", values, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentBetween(String value1, String value2) {
            addCriterion("REPORT_CONTENT between", value1, value2, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportContentNotBetween(String value1, String value2) {
            addCriterion("REPORT_CONTENT not between", value1, value2, "reportContent");
            return (Criteria) this;
        }

        public Criteria andReportPhotoIsNull() {
            addCriterion("REPORT_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andReportPhotoIsNotNull() {
            addCriterion("REPORT_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andReportPhotoEqualTo(String value) {
            addCriterion("REPORT_PHOTO =", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoNotEqualTo(String value) {
            addCriterion("REPORT_PHOTO <>", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoGreaterThan(String value) {
            addCriterion("REPORT_PHOTO >", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_PHOTO >=", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoLessThan(String value) {
            addCriterion("REPORT_PHOTO <", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoLessThanOrEqualTo(String value) {
            addCriterion("REPORT_PHOTO <=", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoLike(String value) {
            addCriterion("REPORT_PHOTO like", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoNotLike(String value) {
            addCriterion("REPORT_PHOTO not like", value, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoIn(List<String> values) {
            addCriterion("REPORT_PHOTO in", values, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoNotIn(List<String> values) {
            addCriterion("REPORT_PHOTO not in", values, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoBetween(String value1, String value2) {
            addCriterion("REPORT_PHOTO between", value1, value2, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportPhotoNotBetween(String value1, String value2) {
            addCriterion("REPORT_PHOTO not between", value1, value2, "reportPhoto");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureIsNull() {
            addCriterion("REPORT_ENCLOSURE is null");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureIsNotNull() {
            addCriterion("REPORT_ENCLOSURE is not null");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureEqualTo(String value) {
            addCriterion("REPORT_ENCLOSURE =", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureNotEqualTo(String value) {
            addCriterion("REPORT_ENCLOSURE <>", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureGreaterThan(String value) {
            addCriterion("REPORT_ENCLOSURE >", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_ENCLOSURE >=", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureLessThan(String value) {
            addCriterion("REPORT_ENCLOSURE <", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureLessThanOrEqualTo(String value) {
            addCriterion("REPORT_ENCLOSURE <=", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureLike(String value) {
            addCriterion("REPORT_ENCLOSURE like", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureNotLike(String value) {
            addCriterion("REPORT_ENCLOSURE not like", value, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureIn(List<String> values) {
            addCriterion("REPORT_ENCLOSURE in", values, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureNotIn(List<String> values) {
            addCriterion("REPORT_ENCLOSURE not in", values, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureBetween(String value1, String value2) {
            addCriterion("REPORT_ENCLOSURE between", value1, value2, "reportEnclosure");
            return (Criteria) this;
        }

        public Criteria andReportEnclosureNotBetween(String value1, String value2) {
            addCriterion("REPORT_ENCLOSURE not between", value1, value2, "reportEnclosure");
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