
public class TestePilhaExecucao {

	private static void metodo1() {
		System.out.println("Entrando no m�todo 1!");
		try {
			int a = 1, b = 0;
			int div = a / b;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("N�o � poss�vel realizar divis�o po 0!");
		}
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
		try {
			metodo1();	
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Voc� ultrapassou o tamanho limite do array!");
		}
		System.out.println("Fim do main!");
	}
}
