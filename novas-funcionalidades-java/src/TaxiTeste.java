
public class TaxiTeste implements Taxi {

	@Override
	public void reservar(String nomePessoa) {
		System.out.println("Nome da pessoa que está reservando o taxi: " + nomePessoa);
	}
}
