import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorStrings {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.add("Ana");
		Collections.sort(nomes);
		System.out.println(nomes);
		nomes.forEach((nome) -> {
			System.out.println(nome);
		});
	}
}
