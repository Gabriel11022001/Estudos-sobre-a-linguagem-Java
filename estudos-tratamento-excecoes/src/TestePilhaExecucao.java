
public class TestePilhaExecucao {

	private static void metodo1() {
		System.out.println("Entrando no m�todo 1!");
		int a = 1, b = 0;
		// int div = a / b;
		// System.out.println(div);
		metodo2();
		System.out.println("Saindo do m�todo 1!");
	}
	private static void metodo2() {
		System.out.println("Entrando no m�todo 2!");
		int[] vetor = new int[10];
		for (int cont = 0; cont <= 10; cont++) {
			vetor[cont] = cont;
			System.out.println(vetor[cont]);
		}
		System.out.println("Saindo do m�todo 2!");
	}
	public static void main(String[] args) {
		System.out.println("In�cio do main!");
		metodo1();
		System.out.println("Fim do main!");
	}
}
