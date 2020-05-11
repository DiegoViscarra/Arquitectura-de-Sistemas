package it.xpug.birthday_greetings;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface MessageService {

	void send(Greetings greetings) throws AddressException, MessagingException;

}
