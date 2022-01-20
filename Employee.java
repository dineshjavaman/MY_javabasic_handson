import java.util.ArrayList;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Edetails empd=new  Edetails ();
	      
		 ArrayList<Employeeinfo> empinfos =empd.getinfo();
		
		 Employeeinfo employeeinfo=empinfos.get(0);
		 employeeinfo.getName();
		 String name=employeeinfo.getName();
		 name=empd.getinfo().get(0).getName();
		
		 System.out.println("The name of the employee takes four staps to print :"+name);
		
	}
}
