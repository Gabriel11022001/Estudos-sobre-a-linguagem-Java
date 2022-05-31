
public class TestePilhaExecucao {

	private static void metodo1() {
		System.out.println("Entrando no método 1!");
		try {
			int a = 1, b = 0;
			int div = a / b;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("Não é possível realizar divisão po 0!");
		}
		metodo2();
		System.out.println("Saindo do método 1!");
	}
	private static void metodo2() {
		System.out.println("Entrando no método 2!");
		int[] vetor = new int[10];
		for (int cont = 0; cont <= 10; cont++) {
			vetor[cont] = cont;
			System.out.println(vetor[cont]);
		}
		System.out.println("Saindo do método 2!");
	}
	private static void metodo3() throws SegundaException {
		// Conta conta = null;
		// if (conta == null) {
			// throw new NullPointerException("NullPointerException");
		// }
		// throw new MinhaException("Testado a minha exceção!");
		throw new SegundaException("Testando uma exceção checada!");
	}
	private static void metodo4() throws SegundaException {
		System.out.println("Entrando no método 4!");
		metodo3();
		System.out.println("Saindo do método 4!");
	}
	public static void main(String[] args) {
		System.out.println("Início do main!");
		try {
			// metodo1();	
			metodo4();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Você ultrapassou o tamanho limite do array!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Fim do main!");
	}
}
