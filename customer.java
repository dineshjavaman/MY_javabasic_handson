package hi;

import java.util.ArrayList;

public class customer {
	public static void main (String[] args) {
	
		service call =new service();
	call.getmobilelist();
	
	ArrayList<String> moblies =call.getmobilelist();
	moblies.size();
	
	int number=moblies.size();
	System.out.println("numberof mobile we have:"+number);
	
	
	
	}

}
