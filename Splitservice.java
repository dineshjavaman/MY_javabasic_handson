import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Splitservice {

	public List<String> Names() {
		String name = "dinesh,ganesh,selva";
		String[] asplit = name.split(",");
		List<String> alsplit =Arrays.asList(asplit);
		return alsplit;
	}
}
