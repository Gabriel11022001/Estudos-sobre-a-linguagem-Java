
public class TestaLacosEncadeados {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		while (x <= 10) {
			while (y <= 10) {
				System.out.println(x + " X " + y + " = " + (x * y));
				y++;
			}
			y = 0;
			x = x + 1;
			System.out.println("====================");
		}
		int contador = 1;
		int aux = 0;
		int aux2 = 0;
		while (contador <= 10) {
			aux = contador;
			while (aux2 < aux) {
				System.out.print("*");
				aux2++;
			}
			System.out.println();
			aux2 = 0;
			contador++;
		}
	}
}
