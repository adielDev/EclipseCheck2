package class1;

import java.util.HashMap;
import java.util.Scanner;


public  class EmployeeConsoleReader {
	
	private static HashMap<Integer, String> _employeesClassNames = null; 
	
	
	
	private EmployeeConsoleReader(){
		
		
	}
	public static void InitEmployeeClasses(){
		if (_employeesClassNames == null){
			_employeesClassNames = new  HashMap<Integer, String>();
			_employeesClassNames.put(1, OfficeEmployee.class.getName());
			_employeesClassNames.put(2, TrainerEmployee.class.getName());
			
		}
	}
	public static Employee ReadEmployee() throws Exception{
		InitEmployeeClasses();
		Employee retVal = null; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee type");
		int empType = scanner.nextInt(); 
		/*
		switch (empType){
		case 1:
			
			retVal = new OfficeEmployee(); 
			break;
		case 2:
			retVal = new TrainerEmployee(); 
			break;
		}
		*/
		
		Class employeeClass = Class.forName(_employeesClassNames.get(empType));
		retVal = (Employee)employeeClass.newInstance();
		retVal.ReadConsole(scanner);
		scanner.close();
		return retVal;
		
	
	}
	
}
