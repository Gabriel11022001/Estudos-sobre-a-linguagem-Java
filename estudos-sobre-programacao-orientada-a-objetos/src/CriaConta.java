import java.util.Scanner;

public class CriaConta {

	private static void definirPropriedadesDaConta(Conta conta) {
		Scanner entradaUsuario = new Scanner(System.in);
		conta.setTitular(new Titular());
		System.out.println("Informe o nome do titular:");
		conta.getTitular().setNome(entradaUsuario.next());
		System.out.println("Informe o n�mero da conta:");
		conta.setNumero(entradaUsuario.nextInt());
		System.out.println("Informe o n�mero da ag�ncia:");
		conta.setAgencia(entradaUsuario.nextInt());
		System.out.println("Quanto voc� gostaria de depositar?:");
		conta.depositar(entradaUsuario.nextDouble());
	}
	private static void apresentarValoresDasPropriedadesDaConta(Conta conta) {
		System.out.println("******************************");
		System.out.println("Titular: " + conta.getTitular().getNome());
		System.out.println("N�mero da conta: " + conta.getNumero());
		System.out.println("N�mero da ag�ncia: " + conta.getAgencia());
		System.out.println("Saldo: R$" + conta.getSaldo());
	}
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		for (int contador = 0; contador < 3; contador++) {
			if (contador == 0) {
				definirPropriedadesDaConta(conta1);
			} else if (contador == 1) {
				definirPropriedadesDaConta(conta2);
			} else {
				definirPropriedadesDaConta(conta3);
			}
		}
		apresentarValoresDasPropriedadesDaConta(conta1);
		apresentarValoresDasPropriedadesDaConta(conta2);
		apresentarValoresDasPropriedadesDaConta(conta3);
	}
}
