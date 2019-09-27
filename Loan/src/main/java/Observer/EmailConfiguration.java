package Observer;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailConfiguration {
	
	final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	
	public void sendEmail(String email, String customerName) {
    Properties props = System.getProperties();
    props.setProperty("mail.smtp.host","smtp.gmail.com");
    props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
    props.setProperty("mail.smtp.socketFactory.fallback", "false");
    props.setProperty("mail.smtp.port", "465");
    props.setProperty("mail.smtp.ssl.enable", "true");
    props.put("mail.smtp.auth", "true");
    props.put("mail.debug", "true");
    props.put("mail.store.protocol", "pop3");
    props.put("mail.transport.protocol", "smtp");
    final String username = "failte2307@gmail.com";//
    final String password = "failte12345";
    try {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
            	System.out.println("Test");
                return new PasswordAuthentication(username, password);
            }
        });

        Message msg = new MimeMessage(session);

        try {
			InternetAddress sender = new InternetAddress("failte2307@gmail.com", "Goliath");
			msg.setFrom(sender);
        } catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        
        InternetAddress[] addresses = InternetAddress.parse(email); 
        msg.addRecipients(RecipientType.TO, addresses);
        msg.setSubject("Golaith National Bank - Unusal Activity"); 
        msg.setText("Hi, " + customerName + "Test"); 
        msg.setSentDate(new Date());
        
        Transport.send(msg);
        System.out.println("Message sent.");
    } catch (MessagingException e) {
        System.out.println("Error, cause: " + e);
    }
}

}