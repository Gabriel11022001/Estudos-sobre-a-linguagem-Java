import java.util.ArrayList;
import java.util.List;

public class TestaLambdas {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Gabriel");
		nomes.add("Maria");
		nomes.add("Pedro");
		nomes.forEach((nome) -> System.out.println(nome));
		System.out.println("================");
		nomes.forEach((nome) -> {
			System.out.println("Nome: " + nome);
		});
		System.out.println("===================================");
		Taxi taxiReservar = new TaxiTeste();
		taxiReservar.reservar("Gabriel");
		Taxi segundoTaxiReservar = (nomePessoa) -> {
			System.out.println("Nome da pessoa: " + nomePessoa);
		};
		segundoTaxiReservar.reservar("Pedro");
		System.out.println("===============================");
		IApresentarDadosLista<Integer> apresentarDadosLista = (itens) -> {
			for (Integer valor : itens) {
				System.out.println(valor);
			}
		};
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(14);
		numeros.add(145);
		numeros.add(125);
		numeros.add(12);
		numeros.add(15);
		apresentarDadosLista.apresentarDadosDaLista(numeros);
		IApresentarInformacoesSobreString apresentarInformacoesSobreString = s -> {
			System.out.println("Valor: " + s);
			System.out.println("Tamanho: " + s.length());
		};
		apresentarInformacoesSobreString.apresentarInformacoes("Gabriel Rodrigues dos Santos");
	}
}
