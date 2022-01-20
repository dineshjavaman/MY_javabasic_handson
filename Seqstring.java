
public class Seqstring {

	public static void main (String[]args) {
	String lname="abc";
	
	for(int i = 0; i<lname.length();i++) {
		for(int j=i+1; j <=lname.length();j++) {
			System.out.println(lname.substring(i,j));
		
	}
	}

}}