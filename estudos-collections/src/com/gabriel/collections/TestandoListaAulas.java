package com.gabriel.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListaAulas {

	public static void main(String[] args) {
		List<Aula> aulas = new ArrayList<Aula>();
		aulas.add(new Aula("aula1", 20));
		aulas.add(new Aula("aula2", 30));
		aulas.add(new Aula("aula3", 20));
		for (Aula aula : aulas) {
			System.out.println(aula.toString());
		}
		Collections.sort(aulas);
		System.out.println("===================================================");
		aulas.forEach((aula) -> {
			System.out.println(aula.toString());
		});
	}
}
