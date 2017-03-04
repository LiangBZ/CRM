package cn.com.noomn.po;

public class Custom {
    private String customId;

    private String customRankId;

    private String customStateId;

    private String departmentId;

    private String customName;

    private String customAddress;

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getCustomRankId() {
        return customRankId;
    }

    public void setCustomRankId(String customRankId) {
        this.customRankId = customRankId == null ? null : customRankId.trim();
    }

    public String getCustomStateId() {
        return customStateId;
    }

    public void setCustomStateId(String customStateId) {
        this.customStateId = customStateId == null ? null : customStateId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    public String getCustomAddress() {
        return customAddress;
    }

    public void setCustomAddress(String customAddress) {
        this.customAddress = customAddress == null ? null : customAddress.trim();
    }
}