
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
		 * Não será possível apresentar o valor da variável i
		 * fora do laço pois a mesma só foi declarada no laço
		 * for.
		 */
		//System.out.println(i);
	}
}
