
public class Stringlowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringservice sservice = new Stringservice();
		sservice.getSout();
		String namelower = sservice.getSout().getName1();
		String nameupper = sservice.getSout().getName2();
		namelower = namelower.toUpperCase();
		nameupper = nameupper.toLowerCase();

		System.out.println("lowercase string to upercase:" + namelower);
		System.out.println("the length of the string=" + namelower.length());
		System.out.println(namelower.substring(1));
		System.out.println("uppercase string to lower case:" + nameupper);
		System.out.println(nameupper.substring(1, 5));
	}
	

	
	

}
