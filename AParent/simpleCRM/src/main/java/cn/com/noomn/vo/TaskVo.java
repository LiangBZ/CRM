package cn.com.noomn.vo;

import cn.com.noomn.po.Task;

public class TaskVo extends Task {

	private BusinessOpportunityVo businessOpportunityVo;
	
	private EmployeeVo spEmployee;	//任务发起者
	private EmployeeVo reEmployee;	//任务发起者

	public BusinessOpportunityVo getBusinessOpportunityVo() {
		return businessOpportunityVo;
	}

	public void setBusinessOpportunityVo(BusinessOpportunityVo businessOpportunityVo) {
		this.businessOpportunityVo = businessOpportunityVo;
	}

	public EmployeeVo getSpEmployee() {
		return spEmployee;
	}

	public void setSpEmployee(EmployeeVo spEmployee) {
		this.spEmployee = spEmployee;
	}

	public EmployeeVo getReEmployee() {
		return reEmployee;
	}

	public void setReEmployee(EmployeeVo reEmployee) {
		this.reEmployee = reEmployee;
	}

	@Override
	public String toString() {
		return "TaskVo [businessOpportunityVo=" + businessOpportunityVo
				+ ", spEmployee=" + spEmployee + ", reEmployee=" + reEmployee
				+ "]";
	}
	
}
