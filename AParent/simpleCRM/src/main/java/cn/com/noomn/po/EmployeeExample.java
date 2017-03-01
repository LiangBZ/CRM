package cn.com.noomn.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("DEPARTMENT_ID like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("DEPARTMENT_ID not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
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

        public Criteria andNextDepDepartmentIdIsNull() {
            addCriterion("NEXT_DEP_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdIsNotNull() {
            addCriterion("NEXT_DEP_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdEqualTo(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID =", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdNotEqualTo(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID <>", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdGreaterThan(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID >", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID >=", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdLessThan(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID <", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID <=", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdLike(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID like", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdNotLike(String value) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID not like", value, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdIn(List<String> values) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID in", values, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdNotIn(List<String> values) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID not in", values, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdBetween(String value1, String value2) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID between", value1, value2, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andNextDepDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("NEXT_DEP_DEPARTMENT_ID not between", value1, value2, "nextDepDepartmentId");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNull() {
            addCriterion("EMPLOYEE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIsNotNull() {
            addCriterion("EMPLOYEE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER =", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <>", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThan(String value) {
            addCriterion("EMPLOYEE_NUMBER >", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER >=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThan(String value) {
            addCriterion("EMPLOYEE_NUMBER <", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NUMBER <=", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberLike(String value) {
            addCriterion("EMPLOYEE_NUMBER like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotLike(String value) {
            addCriterion("EMPLOYEE_NUMBER not like", value, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NUMBER not in", values, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NUMBER not between", value1, value2, "employeeNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIsNull() {
            addCriterion("EMPLOYEE_SEX is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIsNotNull() {
            addCriterion("EMPLOYEE_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexEqualTo(String value) {
            addCriterion("EMPLOYEE_SEX =", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotEqualTo(String value) {
            addCriterion("EMPLOYEE_SEX <>", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexGreaterThan(String value) {
            addCriterion("EMPLOYEE_SEX >", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_SEX >=", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLessThan(String value) {
            addCriterion("EMPLOYEE_SEX <", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_SEX <=", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexLike(String value) {
            addCriterion("EMPLOYEE_SEX like", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotLike(String value) {
            addCriterion("EMPLOYEE_SEX not like", value, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexIn(List<String> values) {
            addCriterion("EMPLOYEE_SEX in", values, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotIn(List<String> values) {
            addCriterion("EMPLOYEE_SEX not in", values, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_SEX between", value1, value2, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeSexNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_SEX not between", value1, value2, "employeeSex");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNull() {
            addCriterion("EMPLOYEE_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIsNotNull() {
            addCriterion("EMPLOYEE_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailEqualTo(String value) {
            addCriterion("EMPLOYEE_EMAIL =", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotEqualTo(String value) {
            addCriterion("EMPLOYEE_EMAIL <>", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThan(String value) {
            addCriterion("EMPLOYEE_EMAIL >", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_EMAIL >=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThan(String value) {
            addCriterion("EMPLOYEE_EMAIL <", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_EMAIL <=", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailLike(String value) {
            addCriterion("EMPLOYEE_EMAIL like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotLike(String value) {
            addCriterion("EMPLOYEE_EMAIL not like", value, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailIn(List<String> values) {
            addCriterion("EMPLOYEE_EMAIL in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotIn(List<String> values) {
            addCriterion("EMPLOYEE_EMAIL not in", values, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_EMAIL between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeeEmailNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_EMAIL not between", value1, value2, "employeeEmail");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNull() {
            addCriterion("EMPLOYEE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIsNotNull() {
            addCriterion("EMPLOYEE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE =", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE <>", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThan(String value) {
            addCriterion("EMPLOYEE_PHONE >", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE >=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThan(String value) {
            addCriterion("EMPLOYEE_PHONE <", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_PHONE <=", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneLike(String value) {
            addCriterion("EMPLOYEE_PHONE like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotLike(String value) {
            addCriterion("EMPLOYEE_PHONE not like", value, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneIn(List<String> values) {
            addCriterion("EMPLOYEE_PHONE in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotIn(List<String> values) {
            addCriterion("EMPLOYEE_PHONE not in", values, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_PHONE between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeePhoneNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_PHONE not between", value1, value2, "employeePhone");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIsNull() {
            addCriterion("EMPLOYEE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIsNotNull() {
            addCriterion("EMPLOYEE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressEqualTo(String value) {
            addCriterion("EMPLOYEE_ADDRESS =", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ADDRESS <>", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressGreaterThan(String value) {
            addCriterion("EMPLOYEE_ADDRESS >", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ADDRESS >=", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLessThan(String value) {
            addCriterion("EMPLOYEE_ADDRESS <", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ADDRESS <=", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressLike(String value) {
            addCriterion("EMPLOYEE_ADDRESS like", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotLike(String value) {
            addCriterion("EMPLOYEE_ADDRESS not like", value, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressIn(List<String> values) {
            addCriterion("EMPLOYEE_ADDRESS in", values, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ADDRESS not in", values, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ADDRESS between", value1, value2, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeAddressNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ADDRESS not between", value1, value2, "employeeAddress");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayIsNull() {
            addCriterion("EMPLOYEE_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayIsNotNull() {
            addCriterion("EMPLOYEE_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayEqualTo(Date value) {
            addCriterion("EMPLOYEE_BIRTHDAY =", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayNotEqualTo(Date value) {
            addCriterion("EMPLOYEE_BIRTHDAY <>", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayGreaterThan(Date value) {
            addCriterion("EMPLOYEE_BIRTHDAY >", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("EMPLOYEE_BIRTHDAY >=", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayLessThan(Date value) {
            addCriterion("EMPLOYEE_BIRTHDAY <", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("EMPLOYEE_BIRTHDAY <=", value, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayIn(List<Date> values) {
            addCriterion("EMPLOYEE_BIRTHDAY in", values, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayNotIn(List<Date> values) {
            addCriterion("EMPLOYEE_BIRTHDAY not in", values, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayBetween(Date value1, Date value2) {
            addCriterion("EMPLOYEE_BIRTHDAY between", value1, value2, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("EMPLOYEE_BIRTHDAY not between", value1, value2, "employeeBirthday");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberIsNull() {
            addCriterion("EMPLOYEE_IDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberIsNotNull() {
            addCriterion("EMPLOYEE_IDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberEqualTo(String value) {
            addCriterion("EMPLOYEE_IDNUMBER =", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberNotEqualTo(String value) {
            addCriterion("EMPLOYEE_IDNUMBER <>", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberGreaterThan(String value) {
            addCriterion("EMPLOYEE_IDNUMBER >", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_IDNUMBER >=", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberLessThan(String value) {
            addCriterion("EMPLOYEE_IDNUMBER <", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_IDNUMBER <=", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberLike(String value) {
            addCriterion("EMPLOYEE_IDNUMBER like", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberNotLike(String value) {
            addCriterion("EMPLOYEE_IDNUMBER not like", value, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberIn(List<String> values) {
            addCriterion("EMPLOYEE_IDNUMBER in", values, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberNotIn(List<String> values) {
            addCriterion("EMPLOYEE_IDNUMBER not in", values, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_IDNUMBER between", value1, value2, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdnumberNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_IDNUMBER not between", value1, value2, "employeeIdnumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateIsNull() {
            addCriterion("EMPLOYEE_ENTRYDATE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateIsNotNull() {
            addCriterion("EMPLOYEE_ENTRYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateEqualTo(Date value) {
            addCriterion("EMPLOYEE_ENTRYDATE =", value, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateNotEqualTo(Date value) {
            addCriterion("EMPLOYEE_ENTRYDATE <>", value, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateGreaterThan(Date value) {
            addCriterion("EMPLOYEE_ENTRYDATE >", value, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateGreaterThanOrEqualTo(Date value) {
            addCriterion("EMPLOYEE_ENTRYDATE >=", value, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateLessThan(Date value) {
            addCriterion("EMPLOYEE_ENTRYDATE <", value, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateLessThanOrEqualTo(Date value) {
            addCriterion("EMPLOYEE_ENTRYDATE <=", value, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateIn(List<Date> values) {
            addCriterion("EMPLOYEE_ENTRYDATE in", values, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateNotIn(List<Date> values) {
            addCriterion("EMPLOYEE_ENTRYDATE not in", values, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateBetween(Date value1, Date value2) {
            addCriterion("EMPLOYEE_ENTRYDATE between", value1, value2, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeEntrydateNotBetween(Date value1, Date value2) {
            addCriterion("EMPLOYEE_ENTRYDATE not between", value1, value2, "employeeEntrydate");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIsNull() {
            addCriterion("EMPLOYEE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIsNotNull() {
            addCriterion("EMPLOYEE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateEqualTo(String value) {
            addCriterion("EMPLOYEE_STATE =", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotEqualTo(String value) {
            addCriterion("EMPLOYEE_STATE <>", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateGreaterThan(String value) {
            addCriterion("EMPLOYEE_STATE >", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_STATE >=", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLessThan(String value) {
            addCriterion("EMPLOYEE_STATE <", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_STATE <=", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateLike(String value) {
            addCriterion("EMPLOYEE_STATE like", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotLike(String value) {
            addCriterion("EMPLOYEE_STATE not like", value, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateIn(List<String> values) {
            addCriterion("EMPLOYEE_STATE in", values, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotIn(List<String> values) {
            addCriterion("EMPLOYEE_STATE not in", values, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_STATE between", value1, value2, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeeStateNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_STATE not between", value1, value2, "employeeState");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNull() {
            addCriterion("EMPLOYEE_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIsNotNull() {
            addCriterion("EMPLOYEE_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordEqualTo(String value) {
            addCriterion("EMPLOYEE_PASSWORD =", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotEqualTo(String value) {
            addCriterion("EMPLOYEE_PASSWORD <>", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThan(String value) {
            addCriterion("EMPLOYEE_PASSWORD >", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_PASSWORD >=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThan(String value) {
            addCriterion("EMPLOYEE_PASSWORD <", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_PASSWORD <=", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordLike(String value) {
            addCriterion("EMPLOYEE_PASSWORD like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotLike(String value) {
            addCriterion("EMPLOYEE_PASSWORD not like", value, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordIn(List<String> values) {
            addCriterion("EMPLOYEE_PASSWORD in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotIn(List<String> values) {
            addCriterion("EMPLOYEE_PASSWORD not in", values, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_PASSWORD between", value1, value2, "employeePassword");
            return (Criteria) this;
        }

        public Criteria andEmployeePasswordNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_PASSWORD not between", value1, value2, "employeePassword");
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