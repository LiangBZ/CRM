package cn.com.noomn.po;

import java.sql.Timestamp;

public class Task {
    private String taskId;

    private String taskSponsorId;

    private String customId;

    private String taskContent;

    private String taskPhoto;

    private String taskEnclosure;

    private Timestamp taskReportDate;

    private Timestamp taskStartTime;

    private Timestamp taskEndTime;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getTaskSponsorId() {
        return taskSponsorId;
    }

    public void setTaskSponsorId(String taskSponsorId) {
        this.taskSponsorId = taskSponsorId == null ? null : taskSponsorId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
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
}