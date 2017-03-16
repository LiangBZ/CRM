package cn.com.noomn.po;

import java.util.Date;

public class Employee {
    private String employeeId;

    private String departmentIdEmployee;

    private String userroleIdEmployee;

    private String employeeUsername;

    private String employeePassword;

    private String employeeNumber;

    private String employeeRealName;

    private String employeeEmail;

    private String employeePhone;

    private Integer employeeInit;

    private String employeeInstruct;

    private Date employeeUsefulTime;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getDepartmentIdEmployee() {
        return departmentIdEmployee;
    }

    public void setDepartmentIdEmployee(String departmentIdEmployee) {
        this.departmentIdEmployee = departmentIdEmployee == null ? null : departmentIdEmployee.trim();
    }

    public String getUserroleIdEmployee() {
        return userroleIdEmployee;
    }

    public void setUserroleIdEmployee(String userroleIdEmployee) {
        this.userroleIdEmployee = userroleIdEmployee == null ? null : userroleIdEmployee.trim();
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername == null ? null : employeeUsername.trim();
    }

    public String getEmployeePassword() {
        return employeePassword;
    }

    public void setEmployeePassword(String employeePassword) {
        this.employeePassword = employeePassword == null ? null : employeePassword.trim();
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber == null ? null : employeeNumber.trim();
    }

    public String getEmployeeRealName() {
        return employeeRealName;
    }

    public void setEmployeeRealName(String employeeRealName) {
        this.employeeRealName = employeeRealName == null ? null : employeeRealName.trim();
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail == null ? null : employeeEmail.trim();
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone == null ? null : employeePhone.trim();
    }

    public Integer getEmployeeInit() {
        return employeeInit;
    }

    public void setEmployeeInit(Integer employeeInit) {
        this.employeeInit = employeeInit;
    }

    public String getEmployeeInstruct() {
        return employeeInstruct;
    }

    public void setEmployeeInstruct(String employeeInstruct) {
        this.employeeInstruct = employeeInstruct == null ? null : employeeInstruct.trim();
    }

    public Date getEmployeeUsefulTime() {
        return employeeUsefulTime;
    }

    public void setEmployeeUsefulTime(Date employeeUsefulTime) {
        this.employeeUsefulTime = employeeUsefulTime;
    }
}