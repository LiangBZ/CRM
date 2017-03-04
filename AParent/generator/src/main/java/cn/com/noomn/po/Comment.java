package cn.com.noomn.po;

import java.sql.Timestamp;

public class Comment {
    private String commentId;

    private String reportId;

    private String beencommentEmployeeId;

    private String commentContent;

    private Timestamp commentDate;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    public String getBeencommentEmployeeId() {
        return beencommentEmployeeId;
    }

    public void setBeencommentEmployeeId(String beencommentEmployeeId) {
        this.beencommentEmployeeId = beencommentEmployeeId == null ? null : beencommentEmployeeId.trim();
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Timestamp getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Timestamp commentDate) {
        this.commentDate = commentDate;
    }
}