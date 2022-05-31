
public class Conta {

	private double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor <= 0) {
			throw new RuntimeException("Não é possível sacar um valor menor ou igual a R$0,00!");
		}
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException();
		}
		this.saldo -= valor;
	}
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new RuntimeException("Não é possível depositar um valor menor ou igual a R$0,00!");
		}
		this.saldo += valor;
	}
	public void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		if (valor > this.saldo) {
			throw new SaldoInsuficienteException();
		}
		if (valor <= 0) {
			throw new RuntimeException("Não é possível transferir um valor menor ou igual a R$0,00!");
		}
		this.sacar(valor);
		contaDestino.depositar(valor);
		System.out.println("Transferencia de R$" + valor + " realizado com sucesso!");
	}
}
