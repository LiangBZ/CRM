package cn.com.noomn.po;

public class Department {
    private String departmentId;

    private String departmentName;

    private String departmentPre;

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

    public String getDepartmentPre() {
        return departmentPre;
    }

    public void setDepartmentPre(String departmentPre) {
        this.departmentPre = departmentPre == null ? null : departmentPre.trim();
    }
}