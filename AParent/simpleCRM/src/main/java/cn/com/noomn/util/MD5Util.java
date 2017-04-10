package cn.com.noomn.util;

import java.security.MessageDigest;

public final class MD5Util {
	
	private MD5Util() {}
	
	public static final String EncoderByMd5(String str){
        //加密后的字符串
		String newstr = null;
		try {
			//确定计算方法
			MessageDigest md5=MessageDigest.getInstance("MD5");
			sun.misc.BASE64Encoder base64en = new sun.misc.BASE64Encoder();
			newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
        return newstr;
    }
	
	public static final boolean checkpassword(String newpasswd,String oldpasswd){
        if(EncoderByMd5(newpasswd).equals(oldpasswd))
            return true;
        else
            return false;
    }
	
	public static void main(String[] args){
		String encoderByMd5 = MD5Util.EncoderByMd5("123456");
		System.out.println(encoderByMd5);
		boolean checkpassword = MD5Util.checkpassword("123456", encoderByMd5);
		System.out.println(checkpassword);
	}
}
