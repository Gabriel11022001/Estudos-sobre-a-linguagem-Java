
public class TestaLacoWhile {

	public static void main(String[] args) {
		int i = 0;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Valor de i = " + i);
		i--;
		System.out.println("Valor de i = " + i);
		System.out.println("=========================");
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		System.out.println("Valor de i = " + i);
		i++;
		System.out.println("Valor de i = " + i);
	}
}
