import java.util.ArrayList;
import java.util.List;

public class TesteStream {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel");
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.stream()
			.filter(n -> n.length() < 7)
			.sorted()
			.forEach(n -> System.out.println(n));
	}
}
