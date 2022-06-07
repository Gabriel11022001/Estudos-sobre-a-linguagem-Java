import java.util.ArrayList;
import java.util.List;

public class TestaWrappers {

	public static void main(String[] args) {
		Double doubleWrapper = 4.87;
		Float floatWrapper = 7.87f;
		Integer intWrapper = 23;
		doubleWrapper = Double.valueOf(44.7);
		System.out.println(doubleWrapper);
		System.out.println(floatWrapper);
		System.out.println(intWrapper);
		String doubleString = "33.76";
		Double doubleConvertidoDeString = Double.valueOf(doubleString);
		System.out.println(doubleString);
		System.out.println(doubleConvertidoDeString);
		Boolean verdadeiro = true;
		Boolean falso = false;
		verdadeiro = Boolean.TRUE;
		falso = Boolean.FALSE;
		System.out.println(verdadeiro);
		System.out.println(falso);
		intWrapper++;
		doubleConvertidoDeString++;
		floatWrapper++;
		System.out.println(floatWrapper);
		System.out.println(intWrapper);
		System.out.println(doubleConvertidoDeString);
		Number numero = 12;
		System.out.println(numero);
		numero = 22.6;
		System.out.println(numero);
		numero = 99.3f;
		System.out.println(numero);
		List<Number> numeros = new ArrayList<Number>();
		numeros.add(1);
		numeros.add(44.6);
		numeros.add(33f);
		for (Number num : numeros) {
			System.out.println(num);
		}
	}
}
