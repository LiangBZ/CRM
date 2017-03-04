package cn.com.noomn.po;

public class UserroleAuthority {
    private String userroleAuthorityId;

    private String userroleId;

    private String authorityId;

    public String getUserroleAuthorityId() {
        return userroleAuthorityId;
    }

    public void setUserroleAuthorityId(String userroleAuthorityId) {
        this.userroleAuthorityId = userroleAuthorityId == null ? null : userroleAuthorityId.trim();
    }

    public String getUserroleId() {
        return userroleId;
    }

    public void setUserroleId(String userroleId) {
        this.userroleId = userroleId == null ? null : userroleId.trim();
    }

    public String getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(String authorityId) {
        this.authorityId = authorityId == null ? null : authorityId.trim();
    }
}