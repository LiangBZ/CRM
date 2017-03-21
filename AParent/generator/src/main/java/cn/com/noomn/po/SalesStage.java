package cn.com.noomn.po;

public class SalesStage {
    private String salesStageId;

    private String salesStageName;

    private Integer rateOfProgress;

    public String getSalesStageId() {
        return salesStageId;
    }

    public void setSalesStageId(String salesStageId) {
        this.salesStageId = salesStageId == null ? null : salesStageId.trim();
    }

    public String getSalesStageName() {
        return salesStageName;
    }

    public void setSalesStageName(String salesStageName) {
        this.salesStageName = salesStageName == null ? null : salesStageName.trim();
    }

    public Integer getRateOfProgress() {
        return rateOfProgress;
    }

    public void setRateOfProgress(Integer rateOfProgress) {
        this.rateOfProgress = rateOfProgress;
    }
}