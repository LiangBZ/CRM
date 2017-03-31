package cn.com.noomn.po;

import java.sql.Timestamp;

public class Process {
    private String processId;

    private String processEmployeeId;

    private String processApprover;

    private String processContent;

    private Integer processState;

    private Timestamp processStartTime;

    private Timestamp processEndTime;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public String getProcessEmployeeId() {
        return processEmployeeId;
    }

    public void setProcessEmployeeId(String processEmployeeId) {
        this.processEmployeeId = processEmployeeId == null ? null : processEmployeeId.trim();
    }

    public String getProcessApprover() {
        return processApprover;
    }

    public void setProcessApprover(String processApprover) {
        this.processApprover = processApprover == null ? null : processApprover.trim();
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent == null ? null : processContent.trim();
    }

    public Integer getProcessState() {
        return processState;
    }

    public void setProcessState(Integer processState) {
        this.processState = processState;
    }

    public Timestamp getProcessStartTime() {
        return processStartTime;
    }

    public void setProcessStartTime(Timestamp processStartTime) {
        this.processStartTime = processStartTime;
    }

    public Timestamp getProcessEndTime() {
        return processEndTime;
    }

    public void setProcessEndTime(Timestamp processEndTime) {
        this.processEndTime = processEndTime;
    }
}