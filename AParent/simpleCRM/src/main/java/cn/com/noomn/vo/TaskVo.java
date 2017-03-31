package cn.com.noomn.vo;

import java.util.List;

import cn.com.noomn.po.Task;

public class TaskVo extends Task {

	private BusinessOpportunityVo businessOpportunityVo;
	
	private EmployeeVo spEmployee;	//任务发起者
	
	private EmployeeVo reEmployee;	//任务发起者
	
	private List<FeedbackVo> feedbackVo;	//反馈信息 

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

	
	public List<FeedbackVo> getFeedbackVo() {
		return feedbackVo;
	}

	public void setFeedbackVo(List<FeedbackVo> feedbackVo) {
		this.feedbackVo = feedbackVo;
	}

	@Override
	public String toString() {
		return "TaskVo [businessOpportunityVo=" + businessOpportunityVo
				+ ", spEmployee=" + spEmployee + ", reEmployee=" + reEmployee
				+ ", feedbackVo=" + feedbackVo + "]";
	}
	
}
