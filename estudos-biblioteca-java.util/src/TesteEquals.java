import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteEquals {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa1 = new Pessoa("Gabriel", 1.80, 87);
		Pessoa pessoa2 = new Pessoa("Matheus", 1.87, 87.8);
		Pessoa pessoa3 = new Pessoa("Gabriel", 1.80, 87);
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		if (pessoas.contains(pessoa1)) {
			System.out.println("Possui pessoa: " + pessoas.get(0));
		}
		System.out.println(pessoa1.equals(pessoa3));
		pessoas.remove(0);
		Pessoa pe = pessoas.get(0);
		pe.apresentarInformacoes();
		List<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel");
		nomes.add("José");
		nomes.add("Maria");
		nomes.add("Gustavo");
		String primeiroNome = nomes.get(0);
		System.out.println("Primeiro nome: " + primeiroNome);
		for (String nomeLista : nomes) {
			System.out.println(nomeLista);
		}
		Integer[] idades = new Integer[5];
		idades[0] = 22;
		idades[1] = 23;
		idades[2] = 24;
		idades[3] = 25;
		idades[4] = 26;
		List<Integer> idadesLista = Arrays.asList(idades);
		for (Integer idade : idadesLista) {
			System.out.println(idade);
		}
	}
}
