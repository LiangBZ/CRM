package cn.com.noomn.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Process {
    private String processId;

    private String processEmployeeId;

    private String customId;

    private String processTempletId;

    private String stepDetaileId;

    private Timestamp processDate;

    private String processContent;

    private Timestamp processStartTime;

    private Timestamp processEndTime;

    private BigDecimal processMoney;

    private String processState;

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

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getProcessTempletId() {
        return processTempletId;
    }

    public void setProcessTempletId(String processTempletId) {
        this.processTempletId = processTempletId == null ? null : processTempletId.trim();
    }

    public String getStepDetaileId() {
        return stepDetaileId;
    }

    public void setStepDetaileId(String stepDetaileId) {
        this.stepDetaileId = stepDetaileId == null ? null : stepDetaileId.trim();
    }

    public Timestamp getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Timestamp processDate) {
        this.processDate = processDate;
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent == null ? null : processContent.trim();
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

    public BigDecimal getProcessMoney() {
        return processMoney;
    }

    public void setProcessMoney(BigDecimal processMoney) {
        this.processMoney = processMoney;
    }

    public String getProcessState() {
        return processState;
    }

    public void setProcessState(String processState) {
        this.processState = processState == null ? null : processState.trim();
    }
}