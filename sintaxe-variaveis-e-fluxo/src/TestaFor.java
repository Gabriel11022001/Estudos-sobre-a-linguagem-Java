
public class TestaFor {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("=================");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
		/**
		 * N�o ser� poss�vel apresentar o valor da vari�vel i
		 * fora do la�o pois a mesma s� foi declarada no la�o
		 * for.
		 */
		//System.out.println(i);
	}
}
