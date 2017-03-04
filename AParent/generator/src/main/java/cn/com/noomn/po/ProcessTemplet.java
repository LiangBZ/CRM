package cn.com.noomn.po;

public class ProcessTemplet {
    private String processTempletId;

    private String templetTypeId;

    private String stepId;

    private Short stepNumber;

    private String processTempletTitle;

    public String getProcessTempletId() {
        return processTempletId;
    }

    public void setProcessTempletId(String processTempletId) {
        this.processTempletId = processTempletId == null ? null : processTempletId.trim();
    }

    public String getTempletTypeId() {
        return templetTypeId;
    }

    public void setTempletTypeId(String templetTypeId) {
        this.templetTypeId = templetTypeId == null ? null : templetTypeId.trim();
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId == null ? null : stepId.trim();
    }

    public Short getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(Short stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getProcessTempletTitle() {
        return processTempletTitle;
    }

    public void setProcessTempletTitle(String processTempletTitle) {
        this.processTempletTitle = processTempletTitle == null ? null : processTempletTitle.trim();
    }
}