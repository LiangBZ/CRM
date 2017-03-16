package cn.com.noomn.util;

public class TreeLeaf {
	private String id;
	private String pId;
	private String name;
	private Boolean open;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getOpen() {
		return open;
	}
	public void setOpen(Boolean open) {
		this.open = open;
	}
	@Override
	public String toString() {
		return "TreeLeaf [id=" + id + ", pId=" + pId + ", name=" + name
				+ ", open=" + open + "]";
	}
	
}
