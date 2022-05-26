import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.ContaCorrente;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.ContaPoupanca;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Titular;

public class TestaTiposContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente1 = new ContaCorrente(12345, 1234);
		contaCorrente1.setTitular(new Titular("Gabriel", "123.456.789-09", "Analista Programador Jr"));
		contaCorrente1.depositar(3000);
		contaCorrente1.depositar(4000);
		contaCorrente1.depositar(390);
		contaCorrente1.sacar(200);
		contaCorrente1.sacar(2900);
		System.out.println("Saldo da conta corrente 1: R$" + contaCorrente1.getSaldo());
		ContaPoupanca contaPoupanca1 = new ContaPoupanca(45678, 4567);
		Titular titularContaPoupanca1 = new Titular("José", "123.678.987-98", "Analista Programador Jr");
		contaPoupanca1.setTitular(titularContaPoupanca1);
		contaPoupanca1.depositar(1200);
		System.out.println("Saldo da conta poupança 1: R$" + contaPoupanca1.getSaldo());
		contaCorrente1.transferir(contaPoupanca1, 2000);
		System.out.println("Saldo da conta corrente 1: R$" + contaCorrente1.getSaldo());
		System.out.println("Saldo da conta poupança 1: R$" + contaPoupanca1.getSaldo());
	}
}
