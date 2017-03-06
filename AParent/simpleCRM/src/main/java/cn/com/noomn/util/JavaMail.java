package cn.com.noomn.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {

	public static Infos sendEmail(String receiveEmail, String title, String mess) {
		Properties prop = new Properties();
		prop.setProperty("mail.smtp.host", "smtp.qq.com");
		prop.setProperty("mail.smtp.port", "587");
		prop.setProperty("mail.smtp.auth", "true");

		Authenticator auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("1175194928", "rqrlotwogjfcgeei");
			}
		};
		
		Session session = Session.getInstance(prop, auth);

		Infos info = Infos.getInfosInstance();
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("1175194928@qq.com"));
			message.setRecipients(RecipientType.TO, receiveEmail);
			message.setSubject(title);
			message.setContent(mess, "text/html;charset=utf-8");

			Transport.send(message);
			
		} catch (Exception e) {
			info.message = Message.ERROR;
			info.obj = "发送失败";
			return info;
		}
		
		info.message = Message.SUCCESS;
		info.obj = "发送成功";
		return info;
	}
	
}
