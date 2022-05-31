
public class TestaConta {

	public static void main(String[] args) {
		Conta contaTeste = new Conta();
		Conta contaDestino = new Conta();
		try {
			// contaTeste.depositar(0);
			contaTeste.depositar(200);
			contaTeste.depositar(4000);
			// contaTeste.sacar(0);
			// contaTeste.sacar(-199);
			// contaTeste.sacar(50000);
			contaTeste.sacar(300);
			contaDestino.depositar(4000);
			contaTeste.transferir(200, contaDestino);
			// contaTeste.transferir(900000, contaDestino);
			// contaTeste.transferir(0, contaDestino);
			// contaTeste.transferir(-99, contaDestino);
			contaDestino.transferir(400, contaTeste);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalizando o programa!");
		}
	}
}
