
public class TestaStatic {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		System.out.println(Conta.getQuantidadeContasCriadas());
	}
}
