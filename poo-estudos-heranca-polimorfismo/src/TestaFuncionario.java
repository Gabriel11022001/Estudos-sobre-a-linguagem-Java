import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Gabriel");
		funcionario1.setCpf("123.456.789-00");
		funcionario1.setSalario(3500);
		funcionario1.apresentarDados();
		System.out.println("Bonificação: R$" + funcionario1.getBonificacao());
	}
}
