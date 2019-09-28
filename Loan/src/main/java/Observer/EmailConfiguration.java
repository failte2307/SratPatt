package Observer;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
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
	final String username = "failte2307@gmail.com";
	final String password = "failte12345";
	
	public void sendEmail(String customerName, double amount, Date transactionDate, Timestamp transactionTime) {
	Properties props = System.getProperties();
	props = configureProperties();	
    try {
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {;
                return new PasswordAuthentication(username, password);
            }
        });
        Message msg = new MimeMessage(session);  
        configureMessage(msg,"Mark");
        Transport.send(msg);
        System.out.println("Message sent.");
    } catch (MessagingException e) {
        System.out.println("Error, cause: " + e);
    }
}
	
	public Properties configureProperties() {
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
		  return props;
	}
	
	public void configureMessage(Message msg, String customerName ) {
		try {
		InternetAddress sender = new InternetAddress("failte2307@gmail.com", "Goliath National Bank");
		msg.setFrom(sender);
        InternetAddress[] addresses = InternetAddress.parse("shaunalily9@gmail.com"); 
        msg.addRecipients(RecipientType.TO, addresses);
        msg.setSubject("Golaith National Bank - Unusal Activity"); 
        msg.setText("Hi, " + customerName + "Test"); 
        msg.setSentDate(new Date()); 
		}
		catch (MessagingException e) {
	        System.out.println("Error, cause: " + e);
	    } catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
