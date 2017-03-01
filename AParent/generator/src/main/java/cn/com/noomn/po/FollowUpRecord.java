package cn.com.noomn.po;

import java.sql.Timestamp;

public class FollowUpRecord {
    private String followUpRecordId;

    private String businessOpportunityId;

    private Timestamp followUpRecordDate;

    private String followUpRecordContent;

    public String getFollowUpRecordId() {
        return followUpRecordId;
    }

    public void setFollowUpRecordId(String followUpRecordId) {
        this.followUpRecordId = followUpRecordId == null ? null : followUpRecordId.trim();
    }

    public String getBusinessOpportunityId() {
        return businessOpportunityId;
    }

    public void setBusinessOpportunityId(String businessOpportunityId) {
        this.businessOpportunityId = businessOpportunityId == null ? null : businessOpportunityId.trim();
    }

    public Timestamp getFollowUpRecordDate() {
        return followUpRecordDate;
    }

    public void setFollowUpRecordDate(Timestamp followUpRecordDate) {
        this.followUpRecordDate = followUpRecordDate;
    }

    public String getFollowUpRecordContent() {
        return followUpRecordContent;
    }

    public void setFollowUpRecordContent(String followUpRecordContent) {
        this.followUpRecordContent = followUpRecordContent == null ? null : followUpRecordContent.trim();
    }
}