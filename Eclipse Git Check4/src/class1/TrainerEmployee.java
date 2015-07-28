package class1;

import java.util.Scanner;


public class TrainerEmployee extends Employee {

	int _hours,_hourlySal;
	public TrainerEmployee(){
		
	}
	public TrainerEmployee(int hours,int hourlySal){
		_hours = hours; 
		_hourlySal = hourlySal;
	}
	@Override
	public int GetSal() {
		// TODO Auto-generated method stub
		return _hours * _hourlySal; 
	}
	@Override 
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		//Read the hours and _hourlySal
		System.out.println("Enter employee hours");
		_hours = scanner.nextInt();
		System.out.println("Enter employee hourly sal");
		_hourlySal = scanner.nextInt();
	}
}
