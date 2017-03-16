package cn.com.noomn.po;

import java.sql.Timestamp;

public class Task {
    private String taskId;

    private String businessOpportunityIdTask;

    private String sponsorIdTask;

    private String receiveIdTask;

    private String customIdTask;

    private String taskContent;

    private String taskPhoto;

    private String taskEnclosure;

    private Timestamp taskReportDate;

    private Timestamp taskStartTime;

    private Timestamp taskEndTime;

    private Integer taskIsoutside;

    private String taskFeedback;

    private Integer taskCompletionStatus;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getBusinessOpportunityIdTask() {
        return businessOpportunityIdTask;
    }

    public void setBusinessOpportunityIdTask(String businessOpportunityIdTask) {
        this.businessOpportunityIdTask = businessOpportunityIdTask == null ? null : businessOpportunityIdTask.trim();
    }

    public String getSponsorIdTask() {
        return sponsorIdTask;
    }

    public void setSponsorIdTask(String sponsorIdTask) {
        this.sponsorIdTask = sponsorIdTask == null ? null : sponsorIdTask.trim();
    }

    public String getReceiveIdTask() {
        return receiveIdTask;
    }

    public void setReceiveIdTask(String receiveIdTask) {
        this.receiveIdTask = receiveIdTask == null ? null : receiveIdTask.trim();
    }

    public String getCustomIdTask() {
        return customIdTask;
    }

    public void setCustomIdTask(String customIdTask) {
        this.customIdTask = customIdTask == null ? null : customIdTask.trim();
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
    }

    public String getTaskPhoto() {
        return taskPhoto;
    }

    public void setTaskPhoto(String taskPhoto) {
        this.taskPhoto = taskPhoto == null ? null : taskPhoto.trim();
    }

    public String getTaskEnclosure() {
        return taskEnclosure;
    }

    public void setTaskEnclosure(String taskEnclosure) {
        this.taskEnclosure = taskEnclosure == null ? null : taskEnclosure.trim();
    }

    public Timestamp getTaskReportDate() {
        return taskReportDate;
    }

    public void setTaskReportDate(Timestamp taskReportDate) {
        this.taskReportDate = taskReportDate;
    }

    public Timestamp getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Timestamp taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public Timestamp getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(Timestamp taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public Integer getTaskIsoutside() {
        return taskIsoutside;
    }

    public void setTaskIsoutside(Integer taskIsoutside) {
        this.taskIsoutside = taskIsoutside;
    }

    public String getTaskFeedback() {
        return taskFeedback;
    }

    public void setTaskFeedback(String taskFeedback) {
        this.taskFeedback = taskFeedback == null ? null : taskFeedback.trim();
    }

    public Integer getTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    public void setTaskCompletionStatus(Integer taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
    }
}