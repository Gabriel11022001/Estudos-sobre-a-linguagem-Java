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
	 * Construtor padrão da classe Pessoa que não recebe parâmetros.
	 */
	public Pessoa() {
		
	}
	/**
	 * Construtor da classe Pessoa que recebe como parâmetro
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
	 * Método que retorna o valor da propriedade nome.
	 * 
	 * @return String
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Método que recebe como parâmetro o nome de uma pessoa
	 * e atribui o valor passado como parâmetro na propriedade nome.
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
	 * Método que ao ser invocado apresenta as informações
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
