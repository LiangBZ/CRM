package cn.com.noomn.po;

public class StepDetaile {
    private String stepDetaileId;

    private String stepId;

    private String stepDetaileEmployeeId;

    private String stepDetaileState;

    public String getStepDetaileId() {
        return stepDetaileId;
    }

    public void setStepDetaileId(String stepDetaileId) {
        this.stepDetaileId = stepDetaileId == null ? null : stepDetaileId.trim();
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId == null ? null : stepId.trim();
    }

    public String getStepDetaileEmployeeId() {
        return stepDetaileEmployeeId;
    }

    public void setStepDetaileEmployeeId(String stepDetaileEmployeeId) {
        this.stepDetaileEmployeeId = stepDetaileEmployeeId == null ? null : stepDetaileEmployeeId.trim();
    }

    public String getStepDetaileState() {
        return stepDetaileState;
    }

    public void setStepDetaileState(String stepDetaileState) {
        this.stepDetaileState = stepDetaileState == null ? null : stepDetaileState.trim();
    }
}