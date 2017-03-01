package cn.com.noomn.po;

public class Userrole {
    private String userroleId;

    private String userroleName;

    private String userroleExplain;

    public String getUserroleId() {
        return userroleId;
    }

    public void setUserroleId(String userroleId) {
        this.userroleId = userroleId == null ? null : userroleId.trim();
    }

    public String getUserroleName() {
        return userroleName;
    }

    public void setUserroleName(String userroleName) {
        this.userroleName = userroleName == null ? null : userroleName.trim();
    }

    public String getUserroleExplain() {
        return userroleExplain;
    }

    public void setUserroleExplain(String userroleExplain) {
        this.userroleExplain = userroleExplain == null ? null : userroleExplain.trim();
    }
}