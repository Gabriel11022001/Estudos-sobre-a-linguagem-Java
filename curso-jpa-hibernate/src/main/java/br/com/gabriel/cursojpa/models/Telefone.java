package br.com.gabriel.cursojpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_telefones")
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "telefone_id", nullable = false)
	private Integer id;
	@Column(name = "telefone_numero", nullable = false)
	private String numero;
	@ManyToOne
	private Aluno aluno;
	
	public Telefone() {}
	public Telefone(Integer id, String numero, Aluno aluno) {
		this.id = id;
		this.numero = numero;
		this.aluno = aluno;
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Aluno getAluno() {
		return this.aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
