package it.xpug.birthday_greetings;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SmtpMailService implements MessageService{

	private String smtpHost;
	private int smtpPort;
	private final String sender = "sender@here.com";
	
	public SmtpMailService(String smtpHost, int smtpPort) {
		this.smtpHost=smtpHost;
		this.smtpPort=smtpPort;
	}

	private Session createMailSession(){
		java.util.Properties props = new java.util.Properties();
		props.put("mail.smtp.host", smtpHost);
		props.put("mail.smtp.port", "" + smtpPort);
		Session session = Session.getInstance(props, null);
		return session;
	}

	public void send(Greetings greetings) throws AddressException, MessagingException {
		sendMessage(greetings);
	}
	

	private void sendMessage(Greetings greetings) throws AddressException, MessagingException {
		Session session = createMailSession();
			Message msg = constructMessage(sender, greetings.getSubject(), greetings.getMessage(), greetings.getMail(), session);
			Transport.send(msg);
	}

	private Message constructMessage(String sender, String subject, String body, String recipient, Session session) throws AddressException, MessagingException{
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(sender));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
		msg.setSubject(subject);
		msg.setText(body);
		return msg;
	}

}
