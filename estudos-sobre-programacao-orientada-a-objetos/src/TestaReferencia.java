
public class TestaReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setAgencia(12345);
		primeiraConta.setNumero(1223);
		primeiraConta.setTitular(new Titular());
		primeiraConta.getTitular().setNome("Gabriel");
		primeiraConta.getTitular().setCpf("123.456.789-00");
		primeiraConta.getTitular().setProfissao("Analista Programador Júnior");
		primeiraConta.depositar(300000);
		Conta segundaConta = primeiraConta;
		System.out.println("Dados da primeira conta:");
		System.out.println("Dados do titular:");
		primeiraConta.getTitular().apresentarInformacoes();
		System.out.println("Saldo: R$" + primeiraConta.getSaldo());
		System.out.println("Número da conta: " + primeiraConta.getNumero());
		System.out.println("Número da agência: " + primeiraConta.getAgencia());
		System.out.println("Dados da segunda conta:");
		System.out.println("Dados do titular:");
		segundaConta.getTitular().apresentarInformacoes();
		System.out.println("Saldo: R$" + segundaConta.getSaldo());
		System.out.println("Número da conta: " + segundaConta.getNumero());
		System.out.println("Número da agência: " + segundaConta.getAgencia());
		segundaConta.depositar(300);
		System.out.println("Saldo da primeira conta após adicionar R$300,00 na segunda conta: R$" + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta após a adição de R$300,00 na mesma: R$" + primeiraConta.getSaldo());
		Conta terceiraConta = new Conta();
		terceiraConta.setTitular(primeiraConta.getTitular());
		terceiraConta.setNumero(primeiraConta.getNumero());
		terceiraConta.setAgencia(primeiraConta.getAgencia());
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
