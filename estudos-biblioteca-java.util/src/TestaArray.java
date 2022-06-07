
public class TestaArray {

	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = {"Gabriel", "Matheus", "Maria", "Pedro"};
		idades[0] = 22;
		idades[1] = 23;
		idades[2] = 65;
		idades[3] = 87;
		idades[4] = 98;
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		System.out.println(idades[3]);
		System.out.println(idades[4]);
		System.out.println(idades.length);
		System.out.println(nomes.length);
		System.out.println("************");
		for (int i = 0; i < idades.length; i++) {
			System.out.println("idades [" + i + "] = " + idades[i]);
		}
		System.out.println("************");
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("nomes [" + i + "] = " + nomes[i]);
		}
		System.out.println("************");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("************");
		for (int idade : idades) {
			System.out.println(idade);
		}
	}
}
