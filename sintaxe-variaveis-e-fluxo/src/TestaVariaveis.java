
public class TestaVariaveis {

	public static void main(String[] args) {
		int idade = 21;
		String nome = "Gabriel Rodrigues dos Santos";
		System.out.println("Meu nome ? " + nome + " e eu tenho " + idade + " anos de idade!");
		double primeiroValor = 0, segundoValor = 0;
		primeiroValor = 12;
		segundoValor = 98.65;
		double soma = somar(primeiroValor, segundoValor);
		System.out.println("A soma entre " + primeiroValor + " e " + segundoValor + " ? igual a " + soma);
		int primeiroValorInteiro = 12;
		int segundoValorInteiro = 21;
		System.out.println("A soma entre " + primeiroValorInteiro + " e " + segundoValorInteiro + " ? igual a " + somarInteiro(primeiroValorInteiro, segundoValorInteiro));
	}
	private static double somar(double primeiroValor, double segundoValor) {
		return primeiroValor + segundoValor;
	}
	private static int somarInteiro(int primeiroValor, int segundoValor) {
		return primeiroValor + segundoValor;
	}
}
