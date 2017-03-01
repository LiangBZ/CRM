package cn.com.noomn.po;

public class CustomRank {
    private String customRankId;

    private String customRankName;

    public String getCustomRankId() {
        return customRankId;
    }

    public void setCustomRankId(String customRankId) {
        this.customRankId = customRankId == null ? null : customRankId.trim();
    }

    public String getCustomRankName() {
        return customRankName;
    }

    public void setCustomRankName(String customRankName) {
        this.customRankName = customRankName == null ? null : customRankName.trim();
    }
}