import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.AnalistaProgramador;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.Gerente;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.IAutenticavel;
import com.gabrielsantos.pooestudosherancapolimorfismo.entidades.SistemaInterno;

public class TestaSistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sis = new SistemaInterno();
		IAutenticavel analistaProgramador = new AnalistaProgramador();
		analistaProgramador.setSenha("123456Gabriel");
		IAutenticavel gerente = new Gerente();
		gerente.setSenha("Olá Mundo!");
		sis.autenticar(analistaProgramador);
		sis.autenticar(gerente);
	}
}
