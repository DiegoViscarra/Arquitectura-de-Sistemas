package it.xpug.birthday_greetings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FileEmployeeRepository implements EmployeeRepository{

	private String fileName;
	public FileEmployeeRepository(String fileName) {
		this.fileName=fileName;
	}
	/*
	public void algo() {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String str = "";
		str = in.readLine(); // skip header
		while ((str = in.readLine()) != null) {
			String[] employeeData = str.split(", ");
			Employee employee = new Employee(employeeData[1], employeeData[0], employeeData[2], employeeData[3]);
			if (employee.isBirthday(xDate)) {
				String recipient = employee.getEmail();
				String body = "Happy Birthday, dear %NAME%".replace("%NAME%", employee.getFirstName());
				String subject = "Happy Birthday!";
				sendMessage(smtpHost, smtpPort, "sender@here.com", subject, body, recipient);
			}
		}
	}*/

	public List<Employee> findEmployeesBirtdays(XDate today) throws IOException, ParseException {
		List<Employee> employees = getAllEmployees();
		return filterEmployeesWhoseBirthdayIs(today, employees);
	}

	private List<Employee> filterEmployeesWhoseBirthdayIs(XDate today, List<Employee> employees) {
		List<Employee> employeesWithBirthdayToday = new ArrayList<Employee>();

		for (Employee employee : employees) {
			if (employee.isBirthday(today)) {
				employeesWithBirthdayToday.add(employee);
			}
		}
		return employeesWithBirthdayToday;
	}

	private List<Employee> getAllEmployees() throws IOException, ParseException {
		List<Employee> employees = new ArrayList<Employee>();
		BufferedReader employeesFileReader = createEmployeesFileReader();

		String employeeRecord = employeesFileReader.readLine();
		while ((employeeRecord = employeesFileReader.readLine()) != null) {
			Employee employee = extractEmployeeFrom(employeeRecord);
			employees.add(employee);
		}
		employeesFileReader.close();
		return employees;
	}

	private BufferedReader createEmployeesFileReader() throws FileNotFoundException{
		FileReader fileReader;
			fileReader = new FileReader(this.fileName);
		return new BufferedReader(fileReader);
	}

	private Employee extractEmployeeFrom(String str) throws ParseException{
			String[] employeeData = str.split(", ");
			Employee employee = new Employee(employeeData[1], employeeData[0],
					employeeData[2], employeeData[3]);
			return employee;
		}

}
