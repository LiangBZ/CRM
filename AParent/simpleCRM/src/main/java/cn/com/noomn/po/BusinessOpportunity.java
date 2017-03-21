package cn.com.noomn.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class BusinessOpportunity {
    private String businessOpportunityId;

    private String customId;

    private String salesStageId;

    private String productId;

    private BigDecimal preSalesAmount;

    private Timestamp preDealTime;

    private BigDecimal cost;

    private String remark;

    private BigDecimal realWages;

    public String getBusinessOpportunityId() {
        return businessOpportunityId;
    }

    public void setBusinessOpportunityId(String businessOpportunityId) {
        this.businessOpportunityId = businessOpportunityId == null ? null : businessOpportunityId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getSalesStageId() {
        return salesStageId;
    }

    public void setSalesStageId(String salesStageId) {
        this.salesStageId = salesStageId == null ? null : salesStageId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public BigDecimal getPreSalesAmount() {
        return preSalesAmount;
    }

    public void setPreSalesAmount(BigDecimal preSalesAmount) {
        this.preSalesAmount = preSalesAmount;
    }

    public Timestamp getPreDealTime() {
        return preDealTime;
    }

    public void setPreDealTime(Timestamp preDealTime) {
        this.preDealTime = preDealTime;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getRealWages() {
        return realWages;
    }

    public void setRealWages(BigDecimal realWages) {
        this.realWages = realWages;
    }
}