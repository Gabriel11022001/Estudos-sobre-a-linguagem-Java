package com.gabrielsantos.exerciciossobrepoo.exercicio17;

public class AssistenteAdministrativo extends Assistente {

	private String turno;
	private double adicionalNoturno;
	
	public AssistenteAdministrativo(
			String nome,
			double salario,
			int numeroMatricula,
			String turno) throws Exception {
		super(nome, salario, numeroMatricula);
		this.setTurno(turno);
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}
	public void setAdicionalNoturno(double adicionalNoturno) throws Exception {
		if (adicionalNoturno <= 0) {
			throw new Exception("O adicional noturno deve ser maior que R$0,00!");
		}
		if (!this.getTurno().toLowerCase().equals("noturno")) {
			throw new Exception("Esse funcionário não pode possuir adicional noturno pois não trabalha nesse turno!");
		}
		this.adicionalNoturno = adicionalNoturno;
		super.setSalario(adicionalNoturno + super.getSalarioFixo());
	}
	@Override
	public void apresentarDados() {
		System.out.println("********************************************");
		System.out.println("Apresentando os dados do assistente administrativo:");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Salário: R$" + this.getSalario());
		System.out.println("Número de matrícula: " + super.getNumeroMatricula());
		System.out.println("Turno: " + this.getTurno());
		if (this.getTurno().toLowerCase().equals("noturno")) {
			System.out.println("Adicional noturno: R$" + this.getAdicionalNoturno());
		}
		System.out.println("********************************************");
	}
}
