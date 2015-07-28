package class1;

import java.util.Scanner;


public class HelloWorld {
	public static void Sort(Employee []empArray,ICompareEmployee compareEmployee){
		for (int i=0;i<empArray.length;i++){
			for (int j = i+1 ;j<empArray.length;j++){
				if (compareEmployee.compare(empArray[i],empArray[j])>0){
					//Swap
					Employee tmp = empArray[i];
					empArray[i]= empArray[j]; 
					empArray[j] = tmp; 
				}
			}
		}
	}
	//Duplicate code. 
	/*
	public static void SortSal(Employee []empArray){
		for (int i=0;i<empArray.length;i++){
			for (int j = i+1 ;j<empArray.length;j++){
				if (empArray[i].GetSal()>empArray[j].GetSal()){
					Employee tmp = empArray[i];
					empArray[i]= empArray[j]; 
					empArray[j] = tmp; 
				}
			}
		}
	}*/
	
	public static void PrintEmpArray(Employee[] empArray){
		for (int i=0;i<empArray.length;i++){
			System.out.println(empArray[i].getName());
		}
		
	}
	public static void main(String[] argv){
		Employee []empArray = new Employee[4];
		for (int i=0;i<4;i++){
			try{
				empArray[i] = EmployeeConsoleReader.ReadEmployee();
				
			}
			catch (Exception ex){
				
			}
		}
		
		//Read Employee 
		/*
		int empType;
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0;i<4;i++){
			System.out.println("Enter employee type");
			empType = scanner.nextInt(); 
			switch (empType){
			case 1:
				//
				System.out.println("Enter employee rank ");
				int rank = scanner.nextInt();
				empArray[i] = new OfficeEmployee(rank);
				System.out.println("Enter employee name");
				String officeName = scanner.nextLine();
				empArray[i].setName(officeName);
				break;
			case 2:
				int hours;
				System.out.println("Enter employee hours");
				hours = scanner.nextInt();
				int hourlySal;
				System.out.println("Enter employee hourly sal");
				hourlySal = scanner.nextInt();
				empArray[i] = new TrainerEmployee(hours,hourlySal);
				System.out.println("Enter employee name");
				String trainerName = scanner.nextLine();
				empArray[i].setName(trainerName );
				break;
			}
		
				
		}*/
	}
	public static void Part1(){
		System.out.println("Hello World");
		Employee []empArray = new Employee[4]; 
		empArray[0] = new OfficeEmployee(2); 
		empArray[0].setName("Avraham");
		empArray[1] = new TrainerEmployee(200,150);
		empArray[1].setName("Yitzhak");
		empArray[2] = new OfficeEmployee(5); 
		empArray[2].setName("Yaakov");
		empArray[3] = new OfficeEmployee(7); 
		empArray[3].setName("Yoseph");
		
		Sort(empArray,new CompareEmployeeByName());
		
		PrintEmpArray(empArray);
		System.out.println("-------------------");
		Sort(empArray,new CompareEmployeeBySal());
		PrintEmpArray(empArray);
	}
}
