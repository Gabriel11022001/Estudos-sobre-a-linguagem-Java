
public class TestaReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 12345;
		primeiraConta.saldo = 3400;
		primeiraConta.numero = 1223;
		primeiraConta.titular = "Gabriel Rodrigues dos Santos";
		Conta segundaConta = primeiraConta;
		System.out.println("Dados da primeira conta:");
		System.out.println("Titular: " + primeiraConta.titular);
		System.out.println("Saldo: R$" + primeiraConta.saldo);
		System.out.println("Número da conta: " + primeiraConta.numero);
		System.out.println("Número da agência: " + primeiraConta.agencia);
		System.out.println("Dados da segunda conta:");
		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Saldo: R$" + segundaConta.saldo);
		System.out.println("Número da conta: " + segundaConta.numero);
		System.out.println("Número da agência: " + segundaConta.agencia);
		segundaConta.saldo += 300;
		System.out.println("Saldo da primeira conta após adicionar R$300,00 na segunda conta: R$" + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta após a adição de R$300,00 na mesma: R$" + primeiraConta.saldo);
		Conta terceiraConta = new Conta();
		terceiraConta.titular = primeiraConta.titular;
		terceiraConta.saldo = primeiraConta.saldo;
		terceiraConta.numero = primeiraConta.numero;
		terceiraConta.agencia = primeiraConta.agencia;
		/**
		 * No exemplo abaixo, como primeiraConta e segundaConta são 
		 * referências que apontam para o mesmo objeto na memória,
		 * a operação booleana primeiraConta == segundaConta retornará true,
		 * pois quando eu utilizo o operador == para comparar duas referências
		 * eu comparo se ambos apontam para o mesmo endereço de memória.
		 */
		if (primeiraConta == segundaConta) {
			System.out.println("A primeira e a segunda conta são iguais!");
		} else {
			System.out.println("A primeira conta é diferente da segunda conta!");
		}
		/**
		 * No exemplo abaixo a operação primeiraConta == terceiraConta
		 * retornará false pois primeiraConta é uma referência que aponta para
		 * um endereço de memória e terceiraConta é uma referência que aponta
		 * para um endereço de memória completamente diferente.
		 */
		if (primeiraConta == terceiraConta) {
			System.out.println("A primeira e a terceira conta são iguais!");
		} else {
			System.out.println("A primeira conta é diferente da terceira conta!");
		}
	}
}
