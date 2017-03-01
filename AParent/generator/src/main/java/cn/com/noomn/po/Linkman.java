package cn.com.noomn.po;

public class Linkman {
    private String linkmanId;

    private String customId;

    private String linkmanName;

    private String linkmanPhone;

    private String linkmanTel;

    private String linkmanPost;

    private String linkmanEmail;

    private String linkmanSex;

    private String linkmanRemark;

    public String getLinkmanId() {
        return linkmanId;
    }

    public void setLinkmanId(String linkmanId) {
        this.linkmanId = linkmanId == null ? null : linkmanId.trim();
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel == null ? null : linkmanTel.trim();
    }

    public String getLinkmanPost() {
        return linkmanPost;
    }

    public void setLinkmanPost(String linkmanPost) {
        this.linkmanPost = linkmanPost == null ? null : linkmanPost.trim();
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    public String getLinkmanSex() {
        return linkmanSex;
    }

    public void setLinkmanSex(String linkmanSex) {
        this.linkmanSex = linkmanSex == null ? null : linkmanSex.trim();
    }

    public String getLinkmanRemark() {
        return linkmanRemark;
    }

    public void setLinkmanRemark(String linkmanRemark) {
        this.linkmanRemark = linkmanRemark == null ? null : linkmanRemark.trim();
    }
}