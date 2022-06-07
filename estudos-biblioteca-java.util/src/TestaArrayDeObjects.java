
public class TestaArrayDeObjects {
	
	public static void main(String[] args) {
		Object[] objetos = new Object[3];
		objetos[0] = new Pessoa("Gabriel", 1.87, 87.0);
		objetos[1] = "Adicionando uma String!";
		objetos[2] = 19;
		System.out.println(objetos[0]);
		System.out.println(objetos[1]);
		System.out.println(objetos[2]);
	}
}
