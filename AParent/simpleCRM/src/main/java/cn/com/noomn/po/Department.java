package cn.com.noomn.po;

public class Department {
    private String departmentId;

    private String departmentName;

    private Integer departmentInit;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getDepartmentInit() {
        return departmentInit;
    }

    public void setDepartmentInit(Integer departmentInit) {
        this.departmentInit = departmentInit;
    }
}