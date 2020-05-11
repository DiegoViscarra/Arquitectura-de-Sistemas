package it.xpug.birthday_greetings;

import java.io.*;
import java.text.ParseException;

import javax.mail.*;
import javax.mail.internet.*;

public class Main {

	public static void main(String[] args) throws javax.mail.internet.ParseException, MessagingException, IOException, ParseException{
		EmployeeRepository repository = new FileEmployeeRepository("employee_data.txt");
		MessageService emailService = new SmtpMailService("localhost", 25);
		BirthdayService service = new BirthdayService(repository, emailService);
		service.sendGreetings(new XDate("2008/10/08"));
		
		/*
		BirthdayService service = new BirthdayService();
		service.sendGreetings("employee_data.txt", new XDate(), "localhost", 25);*/
	}

}
