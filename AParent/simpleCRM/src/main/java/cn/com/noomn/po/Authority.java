package cn.com.noomn.po;

public class Authority {
    private String authorityId;

    private String authorityName;

    private String authorityExplain;

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }

    public String getAuthorityExplain() {
        return authorityExplain;
    }

    public void setAuthorityExplain(String authorityExplain) {
        this.authorityExplain = authorityExplain == null ? null : authorityExplain.trim();
    }

    
}