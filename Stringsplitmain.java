import java.util.ArrayList;
import java.util.List;

public class Stringsplitmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Splitservice splits = new Splitservice();

		List<String> list = splits.Names();

		String nl = list.get(0);

		System.out.println(nl);

	}

}
