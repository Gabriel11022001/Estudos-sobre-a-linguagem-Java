import java.util.Comparator;

public class ComparadorDePessoas implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa pessoa1, Pessoa pessoa2) {
		if (pessoa1.getAltura() < pessoa2.getAltura()) {
			return 1;
		}
		if (pessoa1.getAltura() > pessoa2.getAltura()) {
			return -1;
		}
		return 0;
	}

}
