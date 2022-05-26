import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Funcionario;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setNome("Gabriel");
		gerente.setCpf("123.456.789-99");
		gerente.setSalario(10000);
		gerente.apresentarDados();
		System.out.println("Bonificação: R$" + gerente.getBonificacao());
	}
}
