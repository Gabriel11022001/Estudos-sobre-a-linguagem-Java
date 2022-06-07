import java.util.ArrayList;
import java.util.List;

public class TesteClasseInteger {

	public static void main(String[] args) {
		Integer idade = 29;
		Integer idade2 = new Integer(22);
		System.out.println(idade);
		System.out.println(idade2);
		List<Integer> idades = new ArrayList<Integer>();
		idades.add(idade);
		idades.add(idade2);
		idades.add(26);
		idades.add(new Integer(76));
		for (Integer idadeLista : idades) {
			System.out.println(idadeLista);
		}
		Integer n1 = 12;
		Integer n2 = 33;
		Integer soma = n1 + n2;
		int mult = n1 * n2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(soma);
		System.out.println(mult);
		String numeroFormatoString = "44";
		Integer numeroFormatoStringConvertidoInteiro = Integer.parseInt(numeroFormatoString);
		System.out.println(numeroFormatoStringConvertidoInteiro);
		int n1Primitivo = n1.byteValue();
		System.out.println(n1Primitivo);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
