package cn.com.noomn.po;

public class FollowUp {
    private String followUpId;

    private String customId;

    private String followEmployeeId;

    private Boolean isFunctionary;

    public String getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(String followUpId) {
        this.followUpId = followUpId == null ? null : followUpId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getFollowEmployeeId() {
        return followEmployeeId;
    }

    public void setFollowEmployeeId(String followEmployeeId) {
        this.followEmployeeId = followEmployeeId == null ? null : followEmployeeId.trim();
    }

    public Boolean getIsFunctionary() {
        return isFunctionary;
    }

    public void setIsFunctionary(Boolean isFunctionary) {
        this.isFunctionary = isFunctionary;
    }
}