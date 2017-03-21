package cn.com.noomn.vo;

import java.util.List;

import cn.com.noomn.po.Custom;

public class CustomVo extends Custom {
	private CustomRankVo customRankVo;
	private CustomStateVo customStateVo;
	private DepartmentVo departmentVo;
	//跟进人
	private EmployeeVo receiver;
	
	public EmployeeVo getReceiver() {
		return receiver;
	}
	public void setReceiver(EmployeeVo receiver) {
		this.receiver = receiver;
	}
	private List<BusinessOpportunityVo> businessOpportunityVoList;
	
	public CustomRankVo getCustomRankVo() {
		return customRankVo;
	}
	public void setCustomRankVo(CustomRankVo customRankVo) {
		this.customRankVo = customRankVo;
	}
	public CustomStateVo getCustomStateVo() {
		return customStateVo;
	}
	public void setCustomStateVo(CustomStateVo customStateVo) {
		this.customStateVo = customStateVo;
	}
	public List<BusinessOpportunityVo> getBusinessOpportunityVoList() {
		return businessOpportunityVoList;
	}
	public void setBusinessOpportunityVoList(
			List<BusinessOpportunityVo> businessOpportunityVoList) {
		this.businessOpportunityVoList = businessOpportunityVoList;
	}
	public DepartmentVo getDepartmentVo() {
		return departmentVo;
	}
	public void setDepartmentVo(DepartmentVo departmentVo) {
		this.departmentVo = departmentVo;
	}
	@Override
	public String toString() {
		return "CustomVo [customRankVo=" + customRankVo + ", customStateVo="
				+ customStateVo + ", departmentVo=" + departmentVo
				+ ", receiver=" + receiver + ", businessOpportunityVoList="
				+ businessOpportunityVoList + "]";
	}
}
