package cn.com.noomn.vo;

import cn.com.noomn.po.Employee;

public class EmployeeVo extends Employee {
	private String employeeRSAPassword;
	
	private UserroleVo userroleVo;

	private DepartmentVo departmentVo;
	
	private String employeeImg;
	
	private String employeeImgPath;
	
	
	public String getEmployeeImgPath() {
		return employeeImgPath;
	}

	public void setEmployeeImgPath(String employeeImgPath) {
		this.employeeImgPath = employeeImgPath;
	}

	public String getEmployeeImg() {
		return employeeImg;
	}

	public void setEmployeeImg(String employeeImg) {
		this.employeeImg = employeeImg;
	}

	public UserroleVo getUserroleVo() {
		return userroleVo;
	}

	public void setUserroleVo(UserroleVo userroleVo) {
		this.userroleVo = userroleVo;
	}

	public DepartmentVo getDepartmentVo() {
		return departmentVo;
	}

	public void setDepartmentVo(DepartmentVo departmentVo) {
		this.departmentVo = departmentVo;
	}


	public String getEmployeeRSAPassword() {
		return employeeRSAPassword;
	}

	public void setEmployeeRSAPassword(String employeeRSAPassword) {
		this.employeeRSAPassword = employeeRSAPassword;
	}

	@Override
	public String toString() {
		return "EmployeeVo [employeeRSAPassword=" + employeeRSAPassword
				+ ", userroleVo=" + userroleVo + ", departmentVo="
				+ departmentVo + ", employeeImg=" + employeeImg
				+ ", employeeImgPath=" + employeeImgPath + "]";
	}
	
}
