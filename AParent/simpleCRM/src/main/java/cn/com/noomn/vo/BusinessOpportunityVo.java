package cn.com.noomn.vo;

import java.util.List;

import cn.com.noomn.po.BusinessOpportunity;

public class BusinessOpportunityVo extends BusinessOpportunity {
	
	//产品
	private ProductVo productVo;
	
	//销售阶段
	private SalesStageVo salesStageVo;
	
	//客户
	private CustomVo customVo;
	
	//任务
	private List<TaskVo> taskVoList;
	
	private List<FeedbackVo> feedbackVoList;
	
	public ProductVo getProductVo() {
		return productVo;
	}
	public void setProductVo(ProductVo productVo) {
		this.productVo = productVo;
	}
	public SalesStageVo getSalesStageVo() {
		return salesStageVo;
	}
	public void setSalesStageVo(SalesStageVo salesStageVo) {
		this.salesStageVo = salesStageVo;
	}
	public CustomVo getCustomVo() {
		return customVo;
	}
	public void setCustomVo(CustomVo customVo) {
		this.customVo = customVo;
	}
	public List<FeedbackVo> getFeedbackVoList() {
		return feedbackVoList;
	}
	public void setFeedbackVoList(List<FeedbackVo> feedbackVoList) {
		this.feedbackVoList = feedbackVoList;
	}
	public List<TaskVo> getTaskVoList() {
		return taskVoList;
	}
	public void setTaskVoList(List<TaskVo> taskVoList) {
		this.taskVoList = taskVoList;
	}
	@Override
	public String toString() {
		return "BusinessOpportunityVo [productVo=" + productVo
				+ ", salesStageVo=" + salesStageVo + ", customVo=" + customVo
				+ ", taskVoList=" + taskVoList + ", feedbackVoList="
				+ feedbackVoList + "]";
	}
}
