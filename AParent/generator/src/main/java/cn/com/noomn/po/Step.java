package cn.com.noomn.po;

public class Step {
    private String stepId;

    private String stepPreId;

    private String steNextId;

    private String stepEmployeeId;

    private String stepName;

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId == null ? null : stepId.trim();
    }

    public String getStepPreId() {
        return stepPreId;
    }

    public void setStepPreId(String stepPreId) {
        this.stepPreId = stepPreId == null ? null : stepPreId.trim();
    }

    public String getSteNextId() {
        return steNextId;
    }

    public void setSteNextId(String steNextId) {
        this.steNextId = steNextId == null ? null : steNextId.trim();
    }

    public String getStepEmployeeId() {
        return stepEmployeeId;
    }

    public void setStepEmployeeId(String stepEmployeeId) {
        this.stepEmployeeId = stepEmployeeId == null ? null : stepEmployeeId.trim();
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName == null ? null : stepName.trim();
    }
}