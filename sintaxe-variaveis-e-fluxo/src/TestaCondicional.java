
public class TestaCondicional {

	public static void main(String[] args) {
		int idade = 21;
		if (idade < 0) {
			System.out.println("N?o existe a possibilidade de voc? ter uma idade negativa!");
		} else if (idade >= 18) {
			System.out.println("Voc? tem " + idade + " anos de idade, voc? ? de maior!");
		} else {
			System.out.println("Voc? tem " + idade + " anos de idade, voc? ? de menor!");
		}
	}
}
