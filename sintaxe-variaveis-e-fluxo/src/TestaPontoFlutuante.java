
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		double salario;
		salario = 3500.50;
		double idade = 21;
		System.out.println("Meu sal?rio ?: R$" + salario);
		System.out.println("Minha idade ?: " + idade + " anos de idade");
		double divisao = 34.87 / 2;
		System.out.println(divisao);
		int outraDivisao = 5 / 2;
		/**
		 * No exemplo abaixo, como estou dividindo 5(inteiro) por 2(inteiro)
		 * o valor da opera??o ser? 2, pois 5 / 2 = 2.5 mas como estou dividindo um
		 * n?mero inteiro por outro n?mero inteiro, o valor 0.5 ser? desconsiderado e
		 * ser? pego somente o valor inteiro do resultado da opera??o.
		 */
		System.out.println(outraDivisao);
		/**
		 * No exemplo abaixo o valor ser? 2.5, pois estou dividindo 5(inteiro) por 2.0(double)
		 * e quando eu divido um inteiro por um double o resultado sempre ser? um valor do
		 * tipo double.
		 */
		System.out.println(5 / 2.0);
	}
}
