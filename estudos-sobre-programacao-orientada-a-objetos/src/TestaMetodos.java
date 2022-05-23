
public class TestaMetodos {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		primeiraConta.setTitular(new Titular());
		primeiraConta.getTitular().setNome("Gabriel");
		primeiraConta.getTitular().setCpf("123.456.789-00");
		primeiraConta.getTitular().setProfissao("Analista Programador Júnior");
		primeiraConta.setNumero(12345);
		primeiraConta.setAgencia(1234);
		segundaConta.setTitular(new Titular());
		segundaConta.getTitular().setNome("Gustavo");
		segundaConta.getTitular().setCpf("134.234.567-99");
		segundaConta.getTitular().setProfissao("Analista de dados Júnior");
		segundaConta.setNumero(56789);
		segundaConta.setAgencia(3456);
		primeiraConta.depositar(20000);
		segundaConta.depositar(-12);
		segundaConta.depositar(10000);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: R$" + segundaConta.getSaldo());
		primeiraConta.sacar(300);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.getSaldo());
		segundaConta.sacar(720);
		System.out.println("Saldo da segunda conta: R$" + segundaConta.getSaldo());
		primeiraConta.sacar(100000000);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.getSaldo());
		segundaConta.sacar(-1222);
		System.out.println("Saldo da segunda conta: R$" + segundaConta.getSaldo());
		primeiraConta.transferir(segundaConta, 1000);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: R$" + segundaConta.getSaldo());
		primeiraConta.transferir(segundaConta, 2000);
		System.out.println("Saldo da primeira conta: R$" + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta: R$" + segundaConta.getSaldo());
	}
}
