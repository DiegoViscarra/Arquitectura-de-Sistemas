package it.xpug.birthday_greetings;

public class Greetings {
	private Employee employee;
	private String message;
	private String body;
	private String subject;
	public Greetings(Employee employee) {
		this.employee=employee;
		this.body = "Happy Birthday, dear %NAME%!".replace("%NAME%", employee.getFirstName());
		this.subject = "Happy Birthday!";
	}

	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return body;
	}

	public String getMail() {
		message=employee.getEmail();
		return message;
	}


}
