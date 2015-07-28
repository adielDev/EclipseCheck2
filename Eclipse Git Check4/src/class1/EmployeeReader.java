package class1;
public class EmployeeReader {
	private static EmployeeReader _instance = null; 
	protected EmployeeReader(){
		
	}
	public static EmployeeReader Instance(){
		if (_instance == null){
			_instance = new EmployeeReader(); 
		}
		return _instance;
		
		
	}	
	
	public void PrintDemo(){
		System.out.println("Hello I am employee Reader");
	}
	
}
