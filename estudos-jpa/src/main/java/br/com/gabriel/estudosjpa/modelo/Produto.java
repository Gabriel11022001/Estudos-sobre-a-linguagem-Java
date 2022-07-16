package br.com.gabriel.estudosjpa.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produto_id")
	private Integer id;
	@Column(name = "produto_nome", length = 255, nullable = false)
	private String nome;
	@Column(name = "produto_descricao", nullable = false)
	private String descricao;
	@Column(name = "produto_quantidade_unidades_em_estoque", nullable = false)
	private Integer quantidadeUnidadesEmEstoque;
	@Column(name = "produto_preco", nullable = false)
	private Double preco;
	@Column(name = "produto_data_cadastro", nullable = false)
	private LocalDate dataCadastro;
	@ManyToOne(optional = false)
	private Categoria categoria;
	
	public LocalDate getDataCadastro() {
		return this.dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Categoria getCategoria() {
		return this.categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQuantidadeUnidadesEmEstoque() {
		return this.quantidadeUnidadesEmEstoque;
	}
	public void setQuantidadeUnidadesEmEstoque(Integer quantidadeUnidadesEmEstoque) {
		this.quantidadeUnidadesEmEstoque = quantidadeUnidadesEmEstoque;
	}
	public Double getPreco() {
		return this.preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
