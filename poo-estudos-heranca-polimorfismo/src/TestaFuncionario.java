import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.AnalistaProgramador;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario1 = new AnalistaProgramador();
		funcionario1.setNome("Gabriel");
		funcionario1.setCpf("123.456.789-00");
		funcionario1.setSalario(3500);
		funcionario1.apresentarDados();
		System.out.println("Bonifica��o: R$" + funcionario1.getBonificacao());
		// Funcionario funcionario2 = new Funcionario();
		/**
		 * No exemplo acima eu n�o consegui instanciar um objeto do tipo Funcionario
		 * pois a classe Funcionario � uma classe abstrata, agora eu s� posso instanciar
		 * objetos de classes que herdem da classe Funcionario, isso se elas forem classes
		 * concretas.
		 */
	}
}
