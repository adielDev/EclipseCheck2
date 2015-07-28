package class1;

import java.util.Scanner;


abstract public class Employee {
	private String _name;
	
	public String getName(){
		return _name; 
	}
	public void setName(String name){
		_name = name; 
	}
	abstract public int GetSal(); 
	
	public void ReadConsole(Scanner scanner){
		System.out.println("Enter employee name");
		_name = scanner.nextLine(); 
	}
	
}
