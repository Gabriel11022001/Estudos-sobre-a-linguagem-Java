package com.gabrielsantos.exerciciossobrepoo.exercicio22;

public class TestaData {

	public static void main(String[] args) {
		try {
			Data data1 = new Data(2, 12, 2022);
			data1.apresentarData();
			// Data data2 = new Data(31, 2, 2001);
			Data data2 = new Data(29, 2, 2001);
			data2.apresentarData();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
