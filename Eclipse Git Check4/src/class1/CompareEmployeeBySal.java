package class1;


public class CompareEmployeeBySal implements ICompareEmployee {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.GetSal()-e2.GetSal();
	}

}
