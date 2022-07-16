package br.com.gabriel.cursojpa.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aluno_id", nullable = false)
	private Integer id;
	@Column(name = "aluno_nome", nullable = false)
	private String nome;
	@Column(name = "aluno_ra", nullable = false)
	private String ra;
	@Column(name = "aluno_data_nascimento", nullable = false)
	private LocalDate dataNascimento;
	@Column(name = "aluno_email", nullable = false)
	private String email;
	@Column(name = "aluno_esta_matriculado", nullable = false)
	private Boolean matriculado;
	
	public Aluno() {}
	public Aluno(Integer id, String nome, String ra, LocalDate dataNascimento, String email, Boolean matriculado) {
		this.id = id;
		this.nome = nome;
		this.ra = ra;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.matriculado = matriculado;
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
	public String getRa() {
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getMatriculado() {
		return this.matriculado;
	}
	public void setMatriculado(Boolean matriculado) {
		this.matriculado = matriculado;
	}
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " | Ra " + this.getRa();
	}
}
