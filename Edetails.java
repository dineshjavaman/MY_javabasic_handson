import java.util.ArrayList;

public class Edetails {
	public  ArrayList<Employeeinfo> getinfo() {
		 Employeeinfo ed = new  Employeeinfo();
		ed.setName("Dinesh");
		ed.setAge(23);
		ed.setSalary(30000);
		ed.setEid(5562);
		
	
		Employeeinfo ed1 = new Employeeinfo();
		ed1.setName("Dinesh");
		ed1.setAge(23);
		ed1.setSalary(30000);
		ed1.setEid(5562);
		
	
	ArrayList<Employeeinfo> einfo=new ArrayList<Employeeinfo>();
	einfo.add(ed);
	einfo.add(ed1);
	return einfo;
}
}
