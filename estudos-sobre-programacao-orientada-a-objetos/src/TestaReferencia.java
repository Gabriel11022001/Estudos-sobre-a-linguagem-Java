
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
		System.out.println("N�mero da conta: " + primeiraConta.numero);
		System.out.println("N�mero da ag�ncia: " + primeiraConta.agencia);
		System.out.println("Dados da segunda conta:");
		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Saldo: R$" + segundaConta.saldo);
		System.out.println("N�mero da conta: " + segundaConta.numero);
		System.out.println("N�mero da ag�ncia: " + segundaConta.agencia);
		segundaConta.saldo += 300;
		System.out.println("Saldo da primeira conta ap�s adicionar R$300,00 na segunda conta: R$" + primeiraConta.saldo);
		System.out.println("Saldo da segunda conta ap�s a adi��o de R$300,00 na mesma: R$" + primeiraConta.saldo);
		Conta terceiraConta = new Conta();
		terceiraConta.titular = primeiraConta.titular;
		terceiraConta.saldo = primeiraConta.saldo;
		terceiraConta.numero = primeiraConta.numero;
		terceiraConta.agencia = primeiraConta.agencia;
		/**
		 * No exemplo abaixo, como primeiraConta e segundaConta s�o 
		 * refer�ncias que apontam para o mesmo objeto na mem�ria,
		 * a opera��o booleana primeiraConta == segundaConta retornar� true,
		 * pois quando eu utilizo o operador == para comparar duas refer�ncias
		 * eu comparo se ambos apontam para o mesmo endere�o de mem�ria.
		 */
		if (primeiraConta == segundaConta) {
			System.out.println("A primeira e a segunda conta s�o iguais!");
		} else {
			System.out.println("A primeira conta � diferente da segunda conta!");
		}
		/**
		 * No exemplo abaixo a opera��o primeiraConta == terceiraConta
		 * retornar� false pois primeiraConta � uma refer�ncia que aponta para
		 * um endere�o de mem�ria e terceiraConta � uma refer�ncia que aponta
		 * para um endere�o de mem�ria completamente diferente.
		 */
		if (primeiraConta == terceiraConta) {
			System.out.println("A primeira e a terceira conta s�o iguais!");
		} else {
			System.out.println("A primeira conta � diferente da terceira conta!");
		}
	}
}
