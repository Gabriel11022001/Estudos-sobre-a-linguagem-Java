package com.gabrielsantos.exerciciossobrepoo.exercicio26;

public class Cocker extends Cachorro {

	private boolean precisaDeTosa;
	
	public Cocker(String tipo, String cor, String nome, String raca, boolean precisaDeTosa) {
		super(tipo, cor, nome, raca);
		this.setPrecisaDeTosa(precisaDeTosa);
	}
	public boolean isPrecisaDeTosa() {
		return this.precisaDeTosa;
	}
	public void setPrecisaDeTosa(boolean precisaDeTosa) {
		this.precisaDeTosa = precisaDeTosa;
	}
	@Override
	public String toString() {
		return super.toString() + " | Precisa de tosa?: " + this.isPrecisaDeTosa();
	}
}
