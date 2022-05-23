
public class TestaReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setAgencia(12345);
		primeiraConta.setNumero(1223);
		primeiraConta.setTitular(new Titular());
		primeiraConta.getTitular().setNome("Gabriel");
		primeiraConta.getTitular().setCpf("123.456.789-00");
		primeiraConta.getTitular().setProfissao("Analista Programador J�nior");
		primeiraConta.depositar(300000);
		Conta segundaConta = primeiraConta;
		System.out.println("Dados da primeira conta:");
		System.out.println("Dados do titular:");
		primeiraConta.getTitular().apresentarInformacoes();
		System.out.println("Saldo: R$" + primeiraConta.getSaldo());
		System.out.println("N�mero da conta: " + primeiraConta.getNumero());
		System.out.println("N�mero da ag�ncia: " + primeiraConta.getAgencia());
		System.out.println("Dados da segunda conta:");
		System.out.println("Dados do titular:");
		segundaConta.getTitular().apresentarInformacoes();
		System.out.println("Saldo: R$" + segundaConta.getSaldo());
		System.out.println("N�mero da conta: " + segundaConta.getNumero());
		System.out.println("N�mero da ag�ncia: " + segundaConta.getAgencia());
		segundaConta.depositar(300);
		System.out.println("Saldo da primeira conta ap�s adicionar R$300,00 na segunda conta: R$" + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta ap�s a adi��o de R$300,00 na mesma: R$" + primeiraConta.getSaldo());
		Conta terceiraConta = new Conta();
		terceiraConta.setTitular(primeiraConta.getTitular());
		terceiraConta.setNumero(primeiraConta.getNumero());
		terceiraConta.setAgencia(primeiraConta.getAgencia());
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
