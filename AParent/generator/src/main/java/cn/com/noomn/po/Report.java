package cn.com.noomn.po;

import java.sql.Timestamp;

public class Report {
    private String reportId;

    private String reportEmployeeId;

    private Timestamp reportDate;

    private String reportContent;

    private String reportPhoto;

    private String reportEnclosure;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    public String getReportEmployeeId() {
        return reportEmployeeId;
    }

    public void setReportEmployeeId(String reportEmployeeId) {
        this.reportEmployeeId = reportEmployeeId == null ? null : reportEmployeeId.trim();
    }

    public Timestamp getReportDate() {
        return reportDate;
    }

    public void setReportDate(Timestamp reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent == null ? null : reportContent.trim();
    }

    public String getReportPhoto() {
        return reportPhoto;
    }

    public void setReportPhoto(String reportPhoto) {
        this.reportPhoto = reportPhoto == null ? null : reportPhoto.trim();
    }

    public String getReportEnclosure() {
        return reportEnclosure;
    }

    public void setReportEnclosure(String reportEnclosure) {
        this.reportEnclosure = reportEnclosure == null ? null : reportEnclosure.trim();
    }
}