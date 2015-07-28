package class1;

import java.util.Scanner;


public class OfficeEmployee extends Employee {
	private int _rank;
	public OfficeEmployee(){
		
	}
	public int GetSal(){
		return 5000+1000*_rank; 
	}
	 
	public OfficeEmployee(int rank){
		setRank(rank);
	}
	public void setRank(int rank){
		_rank = rank; 
	}
	@Override 
	public void ReadConsole(Scanner scanner){
		super.ReadConsole(scanner);
		System.out.println("Enter employee rank ");
		_rank = scanner.nextInt();
	}
	
}
