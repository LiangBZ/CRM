package cn.com.noomn.vo;

import cn.com.noomn.po.Process;

public class ProcessVo extends Process {
	
	private EmployeeVo spOutEmployee;	//外勤发起者
	
	private EmployeeVo reOutEmployee;	//外勤发起者
	
	private Long nowTime;

	public EmployeeVo getSpOutEmployee() {
		return spOutEmployee;
	}

	public void setSpOutEmployee(EmployeeVo spOutEmployee) {
		this.spOutEmployee = spOutEmployee;
	}

	public EmployeeVo getReOutEmployee() {
		return reOutEmployee;
	}

	public void setReOutEmployee(EmployeeVo reOutEmployee) {
		this.reOutEmployee = reOutEmployee;
	}
	
	public Long getNowTime() {
		return nowTime;
	}

	public void setNowTime(Long nowTime) {
		this.nowTime = nowTime;
	}

	@Override
	public String toString() {
		return "ProcessVo [spOutEmployee=" + spOutEmployee + ", reOutEmployee="
				+ reOutEmployee + ", nowTime=" + nowTime + "]";
	}
	
}
