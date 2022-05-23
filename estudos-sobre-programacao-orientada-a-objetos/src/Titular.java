
public class Titular {

	private String nome;
	private String cpf;
	private String profissao;
	
	public Titular() {}
	public Titular(String nome, String cpf, String profissao) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setProfissao(profissao);
	}
	public void apresentarInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("Profissão: " + this.profissao);
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getProfissao() {
		return this.cpf;
	}
}
