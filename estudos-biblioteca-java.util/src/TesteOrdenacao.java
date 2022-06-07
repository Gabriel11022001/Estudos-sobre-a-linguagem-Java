import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriel", 1.87, 87.40);
		Pessoa p2 = new Pessoa("Mateus", 1.90, 87.40);
		Pessoa p3 = new Pessoa("Maria", 1.55, 57);
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		System.out.println("***********************************************************************");
		Comparator<Pessoa> comparadorDePessoas = new ComparadorDePessoas();
		pessoas.sort(comparadorDePessoas);
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}
}
