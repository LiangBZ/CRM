package cn.com.noomn.util;

/**
 * 各类信息载体
 */
public final class Infos {
	public Message message;
	public Object obj;
	
	private Infos() {}
	
	public static Infos getInfosInstance() {
		return new Infos();
	}
	
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
