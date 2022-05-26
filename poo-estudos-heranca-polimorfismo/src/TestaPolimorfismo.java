import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.AnalistaProgramador;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Funcionario;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.GerenciadorDeBonificacao;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Gerente;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		Funcionario gerente1 = new Gerente();
		Funcionario analistaProgramador1 = new AnalistaProgramador();
		GerenciadorDeBonificacao gerenciadorDeBonificacao = new GerenciadorDeBonificacao();
		gerente1.setNome("Gabriel");
		gerente1.setCpf("123.456.789-09");
		gerente1.setSalario(4900);
		analistaProgramador1.setNome("Maria");
		analistaProgramador1.setCpf("123.456.789-98");
		analistaProgramador1.setSalario(4000);
		gerente1.apresentarDados();
		analistaProgramador1.apresentarDados();
		gerenciadorDeBonificacao.calcularTotalBonificacoes(analistaProgramador1);
		gerenciadorDeBonificacao.calcularTotalBonificacoes(gerente1);
		System.out.println("Bonificação do Gerente: R$" + gerente1.getBonificacao());
		System.out.println("Bonificação do Analista Programador: R$" + analistaProgramador1.getBonificacao());
		System.out.println("Valor total em bonificações: R$" + gerenciadorDeBonificacao.getTotalBonificacoes());
	}
}
