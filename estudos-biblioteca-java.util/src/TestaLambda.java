import java.util.ArrayList;
import java.util.List;

public class TestaLambda {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(44);
		numeros.add(34);
		numeros.add(55);
		numeros.forEach((num) -> System.out.println(num));
	}
}
