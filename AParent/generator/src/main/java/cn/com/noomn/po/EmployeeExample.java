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

        public Criteria andDepartmentIdEmployeeIsNull() {
            addCriterion("DEPARTMENT_ID_EMPLOYEE is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeIsNotNull() {
            addCriterion("DEPARTMENT_ID_EMPLOYEE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeEqualTo(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE =", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE <>", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE >", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE >=", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeLessThan(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE <", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE <=", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeLike(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE like", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeNotLike(String value) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE not like", value, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeIn(List<String> values) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE in", values, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE not in", values, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE between", value1, value2, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEmployeeNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID_EMPLOYEE not between", value1, value2, "departmentIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeIsNull() {
            addCriterion("USERROLE_ID_EMPLOYEE is null");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeIsNotNull() {
            addCriterion("USERROLE_ID_EMPLOYEE is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeEqualTo(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE =", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeNotEqualTo(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE <>", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeGreaterThan(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE >", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeGreaterThanOrEqualTo(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE >=", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeLessThan(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE <", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeLessThanOrEqualTo(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE <=", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeLike(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE like", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeNotLike(String value) {
            addCriterion("USERROLE_ID_EMPLOYEE not like", value, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeIn(List<String> values) {
            addCriterion("USERROLE_ID_EMPLOYEE in", values, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeNotIn(List<String> values) {
            addCriterion("USERROLE_ID_EMPLOYEE not in", values, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeBetween(String value1, String value2) {
            addCriterion("USERROLE_ID_EMPLOYEE between", value1, value2, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andUserroleIdEmployeeNotBetween(String value1, String value2) {
            addCriterion("USERROLE_ID_EMPLOYEE not between", value1, value2, "userroleIdEmployee");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameIsNull() {
            addCriterion("EMPLOYEE_USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameIsNotNull() {
            addCriterion("EMPLOYEE_USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameEqualTo(String value) {
            addCriterion("EMPLOYEE_USERNAME =", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_USERNAME <>", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameGreaterThan(String value) {
            addCriterion("EMPLOYEE_USERNAME >", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_USERNAME >=", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameLessThan(String value) {
            addCriterion("EMPLOYEE_USERNAME <", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_USERNAME <=", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameLike(String value) {
            addCriterion("EMPLOYEE_USERNAME like", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameNotLike(String value) {
            addCriterion("EMPLOYEE_USERNAME not like", value, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameIn(List<String> values) {
            addCriterion("EMPLOYEE_USERNAME in", values, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_USERNAME not in", values, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_USERNAME between", value1, value2, "employeeUsername");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsernameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_USERNAME not between", value1, value2, "employeeUsername");
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

        public Criteria andEmployeeRealNameIsNull() {
            addCriterion("EMPLOYEE_REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameIsNotNull() {
            addCriterion("EMPLOYEE_REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameEqualTo(String value) {
            addCriterion("EMPLOYEE_REAL_NAME =", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_REAL_NAME <>", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_REAL_NAME >", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_REAL_NAME >=", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameLessThan(String value) {
            addCriterion("EMPLOYEE_REAL_NAME <", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_REAL_NAME <=", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameLike(String value) {
            addCriterion("EMPLOYEE_REAL_NAME like", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameNotLike(String value) {
            addCriterion("EMPLOYEE_REAL_NAME not like", value, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameIn(List<String> values) {
            addCriterion("EMPLOYEE_REAL_NAME in", values, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_REAL_NAME not in", values, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_REAL_NAME between", value1, value2, "employeeRealName");
            return (Criteria) this;
        }

        public Criteria andEmployeeRealNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_REAL_NAME not between", value1, value2, "employeeRealName");
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

        public Criteria andEmployeeInitIsNull() {
            addCriterion("EMPLOYEE_INIT is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitIsNotNull() {
            addCriterion("EMPLOYEE_INIT is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitEqualTo(Integer value) {
            addCriterion("EMPLOYEE_INIT =", value, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitNotEqualTo(Integer value) {
            addCriterion("EMPLOYEE_INIT <>", value, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitGreaterThan(Integer value) {
            addCriterion("EMPLOYEE_INIT >", value, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_INIT >=", value, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitLessThan(Integer value) {
            addCriterion("EMPLOYEE_INIT <", value, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitLessThanOrEqualTo(Integer value) {
            addCriterion("EMPLOYEE_INIT <=", value, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitIn(List<Integer> values) {
            addCriterion("EMPLOYEE_INIT in", values, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitNotIn(List<Integer> values) {
            addCriterion("EMPLOYEE_INIT not in", values, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_INIT between", value1, value2, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInitNotBetween(Integer value1, Integer value2) {
            addCriterion("EMPLOYEE_INIT not between", value1, value2, "employeeInit");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructIsNull() {
            addCriterion("EMPLOYEE_INSTRUCT is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructIsNotNull() {
            addCriterion("EMPLOYEE_INSTRUCT is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructEqualTo(String value) {
            addCriterion("EMPLOYEE_INSTRUCT =", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructNotEqualTo(String value) {
            addCriterion("EMPLOYEE_INSTRUCT <>", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructGreaterThan(String value) {
            addCriterion("EMPLOYEE_INSTRUCT >", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_INSTRUCT >=", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructLessThan(String value) {
            addCriterion("EMPLOYEE_INSTRUCT <", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_INSTRUCT <=", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructLike(String value) {
            addCriterion("EMPLOYEE_INSTRUCT like", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructNotLike(String value) {
            addCriterion("EMPLOYEE_INSTRUCT not like", value, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructIn(List<String> values) {
            addCriterion("EMPLOYEE_INSTRUCT in", values, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructNotIn(List<String> values) {
            addCriterion("EMPLOYEE_INSTRUCT not in", values, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_INSTRUCT between", value1, value2, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeInstructNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_INSTRUCT not between", value1, value2, "employeeInstruct");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeIsNull() {
            addCriterion("EMPLOYEE_USEFUL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeIsNotNull() {
            addCriterion("EMPLOYEE_USEFUL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeEqualTo(Date value) {
            addCriterion("EMPLOYEE_USEFUL_TIME =", value, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeNotEqualTo(Date value) {
            addCriterion("EMPLOYEE_USEFUL_TIME <>", value, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeGreaterThan(Date value) {
            addCriterion("EMPLOYEE_USEFUL_TIME >", value, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EMPLOYEE_USEFUL_TIME >=", value, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeLessThan(Date value) {
            addCriterion("EMPLOYEE_USEFUL_TIME <", value, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeLessThanOrEqualTo(Date value) {
            addCriterion("EMPLOYEE_USEFUL_TIME <=", value, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeIn(List<Date> values) {
            addCriterion("EMPLOYEE_USEFUL_TIME in", values, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeNotIn(List<Date> values) {
            addCriterion("EMPLOYEE_USEFUL_TIME not in", values, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeBetween(Date value1, Date value2) {
            addCriterion("EMPLOYEE_USEFUL_TIME between", value1, value2, "employeeUsefulTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeUsefulTimeNotBetween(Date value1, Date value2) {
            addCriterion("EMPLOYEE_USEFUL_TIME not between", value1, value2, "employeeUsefulTime");
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