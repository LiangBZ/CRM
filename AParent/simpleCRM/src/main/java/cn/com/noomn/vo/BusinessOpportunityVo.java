package cn.com.noomn.vo;

import cn.com.noomn.po.BusinessOpportunity;

public class BusinessOpportunityVo extends BusinessOpportunity {
	
	//产品
	private ProductVo productVo;
	
	//销售阶段
	private SalesStageVo salesStageVo;
	
	//客户
	private CustomVo customVo;
	
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
	@Override
	public String toString() {
		return "BusinessOpportunityVo [productVo=" + productVo
				+ ", salesStageVo=" + salesStageVo + ", customVo=" + customVo
				+ "]";
	}
}
