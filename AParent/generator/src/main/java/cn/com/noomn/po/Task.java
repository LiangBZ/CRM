package cn.com.noomn.po;

import java.sql.Timestamp;

public class Task {
    private String taskId;

    private String businessOpportunityIdTask;

    private String sponsorIdTask;

    private String followEmployeeIdTask;

    private String taskContent;

    private Timestamp taskReportDate;

    private Timestamp taskStartTime;

    private Timestamp taskEndTime;

    private Integer taskStop;

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

    public String getFollowEmployeeIdTask() {
        return followEmployeeIdTask;
    }

    public void setFollowEmployeeIdTask(String followEmployeeIdTask) {
        this.followEmployeeIdTask = followEmployeeIdTask == null ? null : followEmployeeIdTask.trim();
    }

    public String getTaskContent() {
        return taskContent;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent == null ? null : taskContent.trim();
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

    public Integer getTaskStop() {
        return taskStop;
    }

    public void setTaskStop(Integer taskStop) {
        this.taskStop = taskStop;
    }
}