package cn.com.noomn.vo;

import java.util.ArrayList;
import java.util.List;

import cn.com.noomn.po.Authority;

public class AuthorityVo extends Authority {
	private boolean isFatherNode = false;
	private String fatherNodeId;
	private List<AuthorityVo> AuthorityVoList = new ArrayList<AuthorityVo>();

	public String getFatherNodeId() {
		return fatherNodeId;
	}

	public void setFatherNodeId(String fatherNodeId) {
		this.fatherNodeId = fatherNodeId;
	}

	public boolean isFatherNode() {
		return isFatherNode;
	}

	public void setFatherNode(boolean isFatherNode) {
		this.isFatherNode = isFatherNode;
	}

	public List<AuthorityVo> getAuthorityVoList() {
		return AuthorityVoList;
	}

	public void setAuthorityVoList(List<AuthorityVo> authorityVoList) {
		AuthorityVoList = authorityVoList;
	}

	@Override
	public String toString() {
		if(isFatherNode==true) {
			return	
					"AuthorityVo ["
					+ "authorityId=" + getAuthorityId() 
					+ ", authorityExplain=" + getAuthorityExplain()
					+ ", fatherNodeId=" + fatherNodeId
					+ ", isFatherNode=" + isFatherNode 
					+ ", AuthorityVoList=" + AuthorityVoList 
					+ "]";
		}else {
			return "AuthorityVo ["
					+ "authorityId=" + getAuthorityId()
					+ ", authorityName=" + getAuthorityName()
					+ ", authorityExplain=" + getAuthorityExplain() 
					+ ", fatherNodeId=" + getFatherNodeId() 
					+ ", isFatherNode=" + isFatherNode()
					+ "]";
		}
	}

}
