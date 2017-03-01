package cn.com.noomn.po;

import java.sql.Timestamp;

public class NotifyEmployee {
    private String notifyEmployeeId;

    private String notifyId;

    private String employeeId;

    private Timestamp replyDate;

    private String replyContent;

    public String getNotifyEmployeeId() {
        return notifyEmployeeId;
    }

    public void setNotifyEmployeeId(String notifyEmployeeId) {
        this.notifyEmployeeId = notifyEmployeeId == null ? null : notifyEmployeeId.trim();
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId == null ? null : notifyId.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Timestamp getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Timestamp replyDate) {
        this.replyDate = replyDate;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}