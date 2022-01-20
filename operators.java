
public class operators {

	public static void main(String[] args) {
		int e = 2, a = 4;
		int f = 3, c = 5;
		int  g = 4, d = 15;
		int h = 4, b = 20;
		add (e,f);
		add (g,h);
		add (a,b);
		sub (d,c);

//		x = e + f;
//		System.out.println(x);
//		x = g + h;
//		System.out.println(x);
//		x = a + b;
//		System.out.println(x);
//		x = c + d;
//		System.out.println(x);

	}

	private static void add(int x, int y) {
		int output = x + y;
		System.out.println(output);
	}
	private static void sub(int x, int y) {
		int output = x - y;
		System.out.println(output);
	}
}
