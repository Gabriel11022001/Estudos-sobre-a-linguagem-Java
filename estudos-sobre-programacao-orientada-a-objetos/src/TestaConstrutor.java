
public class TestaConstrutor {

	public static void main(String[] args) {
		Conta conta = new Conta(66789, 4456);
		conta.setTitular(new Titular("Gabriel", "123.456.789-00", "Analista Programador J�nior"));
		conta.depositar(3000);
		conta.depositar(200);
		conta.depositar(145);
		conta.depositar(200);
		System.out.println("N�mero da conta: " + conta.getNumero());
		System.out.println("N�mero da ag�ncia: " + conta.getAgencia());
		System.out.println("Nome do titular: " + conta.getTitular().getNome());
		System.out.println("Cpf do titular: " + conta.getTitular().getCpf());
		System.out.println("Profiss�o do titular: " + conta.getTitular().getProfissao());
		System.out.println("Saldo da conta: R$" + conta.getSaldo());
	}
}
