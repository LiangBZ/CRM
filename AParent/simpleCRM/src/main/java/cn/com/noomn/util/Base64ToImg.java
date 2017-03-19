package cn.com.noomn.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Base64ToImg {
	@SuppressWarnings("restriction")
	public static void generateImage(String imgStr, String path) {
		sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
		OutputStream out = null;
		byte[] b;		
		try{
			b = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {
					b[i] += 256;
				}
			}
			out = new FileOutputStream(path);	
			out.write(b);
			out.flush();
		}catch(Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if(out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e);
			}
		}
	}
	
}
