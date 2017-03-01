package cn.com.noomn.po;

public class CustomState {
    private String customStateId;

    private String customStateName;

    public String getCustomStateId() {
        return customStateId;
    }

    public void setCustomStateId(String customStateId) {
        this.customStateId = customStateId == null ? null : customStateId.trim();
    }

    public String getCustomStateName() {
        return customStateName;
    }

    public void setCustomStateName(String customStateName) {
        this.customStateName = customStateName == null ? null : customStateName.trim();
    }
}