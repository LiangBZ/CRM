package cn.com.noomn.po;

import java.sql.Timestamp;

public class Feedback {
    private String feedbackId;

    private String taskId;

    private String followEmployeeIdFeedback;

    private String feedbackDetail;

    private Timestamp feedbackTime;

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId == null ? null : feedbackId.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getFollowEmployeeIdFeedback() {
        return followEmployeeIdFeedback;
    }

    public void setFollowEmployeeIdFeedback(String followEmployeeIdFeedback) {
        this.followEmployeeIdFeedback = followEmployeeIdFeedback == null ? null : followEmployeeIdFeedback.trim();
    }

    public String getFeedbackDetail() {
        return feedbackDetail;
    }

    public void setFeedbackDetail(String feedbackDetail) {
        this.feedbackDetail = feedbackDetail == null ? null : feedbackDetail.trim();
    }

    public Timestamp getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Timestamp feedbackTime) {
        this.feedbackTime = feedbackTime;
    }
}