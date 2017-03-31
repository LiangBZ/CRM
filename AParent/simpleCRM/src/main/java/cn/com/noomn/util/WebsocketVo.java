package cn.com.noomn.util;

public class WebsocketVo {
	
	private String approverId;
	
	private String senderId;
	
	private String senderName;
	
	private String imgURL;
	
	private String message;
	
	private String URL;

	public String getApproverId() {
		return approverId;
	}

	public void setApproverId(String approverId) {
		this.approverId = approverId;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	
	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	@Override
	public String toString() {
		return "WebsocketVo [approverId=" + approverId + ", senderId="
				+ senderId + ", senderName=" + senderName + ", imgURL="
				+ imgURL + ", message=" + message + ", URL=" + URL + "]";
	}
	
}
