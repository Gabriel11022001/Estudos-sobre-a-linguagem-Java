
public class TestaArrayDePessoas {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[5];
		pessoas[0] = new Pessoa("Gabriel", 1.87, 87.7);
		pessoas[1] = new Pessoa("Pedro", 1.82, 81.7);
		pessoas[2] = new Pessoa("Gustavo", 1.80, 80.7);
		pessoas[3] = new Pessoa("Eduardo", 1.76, 76.3);
		Pessoa pessoaTeste = new Pessoa("Eduarda", 1.76, 86.0);
		pessoas[4] = pessoaTeste;
		pessoas[4].setNome("Eduarda pereira");
		System.out.println(pessoas[4].getNome());
		System.out.println(pessoaTeste.getNome());
		pessoaTeste.setNome("Eduarda");
		System.out.println(pessoas[4].getNome());
		System.out.println(pessoaTeste.getNome());
		for (Pessoa pessoa : pessoas) {
			System.out.println("**********************");
			pessoa.apresentarInformacoes();
			System.out.println("**********************");
		}
	}
}
