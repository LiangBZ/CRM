package cn.com.noomn.po;

public class TempletType {
    private String templetTypeId;

    private String templetTypeName;

    public String getTempletTypeId() {
        return templetTypeId;
    }

    public void setTempletTypeId(String templetTypeId) {
        this.templetTypeId = templetTypeId == null ? null : templetTypeId.trim();
    }

    public String getTempletTypeName() {
        return templetTypeName;
    }

    public void setTempletTypeName(String templetTypeName) {
        this.templetTypeName = templetTypeName == null ? null : templetTypeName.trim();
    }
}