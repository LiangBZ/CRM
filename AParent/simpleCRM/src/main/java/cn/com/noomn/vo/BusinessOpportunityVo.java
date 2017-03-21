package cn.com.noomn.vo;

import cn.com.noomn.po.BusinessOpportunity;

public class BusinessOpportunityVo extends BusinessOpportunity {
	
	//产品
	private ProductVo productVo;
	
	//销售阶段
	private SalesStageVo salesStageVo;
	
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
	@Override
	public String toString() {
		return "BusinessOpportunityVo [productVo=" + productVo
				+ ", salesStageVo=" + salesStageVo + "]";
	}
}
