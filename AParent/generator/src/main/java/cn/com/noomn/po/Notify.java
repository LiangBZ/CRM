package cn.com.noomn.po;

import java.sql.Timestamp;

public class Notify {
    private String notifyId;

    private String notifySendId;

    private Timestamp notifyReportDate;

    private String notifyContent;

    private String notifyTitle;

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId == null ? null : notifyId.trim();
    }

    public String getNotifySendId() {
        return notifySendId;
    }

    public void setNotifySendId(String notifySendId) {
        this.notifySendId = notifySendId == null ? null : notifySendId.trim();
    }

    public Timestamp getNotifyReportDate() {
        return notifyReportDate;
    }

    public void setNotifyReportDate(Timestamp notifyReportDate) {
        this.notifyReportDate = notifyReportDate;
    }

    public String getNotifyContent() {
        return notifyContent;
    }

    public void setNotifyContent(String notifyContent) {
        this.notifyContent = notifyContent == null ? null : notifyContent.trim();
    }

    public String getNotifyTitle() {
        return notifyTitle;
    }

    public void setNotifyTitle(String notifyTitle) {
        this.notifyTitle = notifyTitle == null ? null : notifyTitle.trim();
    }
}