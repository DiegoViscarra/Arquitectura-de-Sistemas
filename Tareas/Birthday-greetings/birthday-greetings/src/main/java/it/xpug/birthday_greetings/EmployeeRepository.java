package it.xpug.birthday_greetings;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface EmployeeRepository{

	List<Employee> findEmployeesBirtdays(XDate today) throws IOException, ParseException;

}
