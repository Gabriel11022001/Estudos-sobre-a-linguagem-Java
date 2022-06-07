/**
 * Classe que representa uma pessoa.
 * 
 * @author Gabriel Rodrigues dos Santos
 *
 */
public class Pessoa {

	private String nome;
	private double altura;
	private double peso;
	
	/**
	 * Construtor padr�o da classe Pessoa que n�o recebe par�metros.
	 */
	public Pessoa() {
		
	}
	/**
	 * Construtor da classe Pessoa que recebe como par�metro
	 * o nome, a altura e o peso de uma pessoa.
	 * 
	 * @param nome
	 * @param altura
	 * @param peso
	 */
	public Pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	/**
	 * M�todo que retorna o valor da propriedade nome.
	 * 
	 * @return String
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * M�todo que recebe como par�metro o nome de uma pessoa
	 * e atribui o valor passado como par�metro na propriedade nome.
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * M�todo que ao ser invocado apresenta as informa��es
	 * sobre a pessoa.
	 */
	public void apresentarInformacoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Altura: " + this.getAltura() + " metros");
		System.out.println("Peso: " + this.getPeso() + " kg");
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + " | Peso: " + this.peso + "kg | Altura: " + this.altura + " metros"; 
	}
	@Override
	public boolean equals(Object obj) {
		Pessoa pessoaComparar = (Pessoa) obj;
		if (this.getNome().equals(pessoaComparar.getNome()) && this.getAltura() == pessoaComparar.getAltura() && this.getPeso() == pessoaComparar.getPeso()) {
			return true;
		}
		return false;
	}
}
