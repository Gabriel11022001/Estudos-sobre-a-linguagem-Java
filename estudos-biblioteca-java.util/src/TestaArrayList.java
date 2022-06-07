import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		/**
		 * O método add() me permite adicionar um elemento na lista.
		 */
		lista.add("Gabriel");
		lista.add('G');
		lista.add(12);
		lista.add(3.87);
		lista.add(true);
		lista.add(new Pessoa("Gabriel", 1.82, 87.8));
		/**
		 * O método size() me retorna a quantidade de elementos na lista.
		 */
		int quantidadeElementos = lista.size();
		System.out.println("Quantidade de elementos na lista: " + quantidadeElementos);
		/**
		 * O método get(int indice) me retorna o elemento que estiver
		 * no índice que eu passar como parâmetro.
		 */
		Object elemento = lista.get(2);
		System.out.println(elemento);
		/**
		 * O método remove(int indice) remove o elemento que estiver no índice
		 * que eu passar como parâmetro e me retorna o elemento removido
		 */
		Object elementoRemovido = lista.remove(0);
		System.out.println(elementoRemovido);
		for (Object elementoLista : lista) {
			// A sentença abaixo vai invocar o método toString().
			System.out.println(elementoLista);
		}
		/**
		 * No exemplo abaixo, estou especializando o ArrayList
		 * determinando que essa lista só vai armazenar objetos do tipo Pessoa.
		 */
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("João", 1.76, 88.9));
		pessoas.add(new Pessoa("Carlos", 1.76, 98.7));
		// pessoas.add("Olá Mundo!");
		Pessoa pessoa1 = pessoas.get(0);
		pessoa1.apresentarInformacoes();
		for (Pessoa pessoaArrayList : pessoas) {
			System.out.println("***********************");
			pessoaArrayList.apresentarInformacoes();
			System.out.println("***********************");
		}
	}
}
