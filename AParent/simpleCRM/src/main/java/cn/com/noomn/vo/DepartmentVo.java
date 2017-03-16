package cn.com.noomn.vo;

import java.util.ArrayList;
import java.util.List;

import cn.com.noomn.po.Department;

public class DepartmentVo extends Department {
	private String id;
	private String pId;
	private String name;
	private Boolean open;
	private int elementNumber;
	private List<EmployeeVo> employeeVoList = new ArrayList<EmployeeVo>();
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	public int getElementNumber() {
		return elementNumber;
	}
	public void setElementNumber(int elementNumber) {
		this.elementNumber = elementNumber;
	}
	public List<EmployeeVo> getEmployeeVoList() {
		return employeeVoList;
	}
	public void setEmployeeVoList(List<EmployeeVo> employeeVoList) {
		this.employeeVoList = employeeVoList;
	}
	@Override
	public String toString() {
		return "DepartmentVo [id=" + id + ", pId=" + pId + ", name=" + name
				+ ", open=" + open + ", elementNumber=" + elementNumber
				+ ", employeeVoList=" + employeeVoList + "]";
	}
}
