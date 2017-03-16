package cn.com.noomn.po;

import java.sql.Timestamp;

public class Process {
    private String processId;

    private String taskIdProcess;

    private String processEmployeeId;

    private String processApprover;

    private Timestamp processDate;

    private String processTitle;

    private String processContent;

    private Integer processState;

    private Timestamp processApprovalDeadline;

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    public String getTaskIdProcess() {
        return taskIdProcess;
    }

    public void setTaskIdProcess(String taskIdProcess) {
        this.taskIdProcess = taskIdProcess == null ? null : taskIdProcess.trim();
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

    public Timestamp getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Timestamp processDate) {
        this.processDate = processDate;
    }

    public String getProcessTitle() {
        return processTitle;
    }

    public void setProcessTitle(String processTitle) {
        this.processTitle = processTitle == null ? null : processTitle.trim();
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

    public Timestamp getProcessApprovalDeadline() {
        return processApprovalDeadline;
    }

    public void setProcessApprovalDeadline(Timestamp processApprovalDeadline) {
        this.processApprovalDeadline = processApprovalDeadline;
    }
}