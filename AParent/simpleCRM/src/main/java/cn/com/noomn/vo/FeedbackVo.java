package cn.com.noomn.vo;

import cn.com.noomn.po.Feedback;

public class FeedbackVo extends Feedback {
	
	private EmployeeVo employeeVo;

	public EmployeeVo getEmployeeVo() {
		return employeeVo;
	}

	public void setEmployeeVo(EmployeeVo employeeVo) {
		this.employeeVo = employeeVo;
	}

	@Override
	public String toString() {
		return "FeedbackVo [employeeVo=" + employeeVo + "]";
	}
	
}
