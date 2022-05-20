import java.util.Scanner;

public class CriaConta {

	private static void definirPropriedadesDaConta(Conta conta) {
		Scanner entradaUsuario = new Scanner(System.in);
		System.out.println("Informe o nome do titular:");
		conta.titular = entradaUsuario.nextLine();
		System.out.println("Informe o saldo da conta:");
		conta.saldo = entradaUsuario.nextDouble();
		System.out.println("Informe o número da conta:");
		conta.numero = entradaUsuario.nextInt();
		System.out.println("Informe o número da agência:");
		conta.agencia = entradaUsuario.nextInt();
	}
	private static void apresentarValoresDasPropriedadesDaConta(Conta conta) {
		System.out.println("******************************");
		System.out.println("Titular: " + conta.titular);
		System.out.println("Número da conta: " + conta.numero);
		System.out.println("Número da agência: " + conta.agencia);
		System.out.println("Saldo: R$" + conta.saldo);
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
