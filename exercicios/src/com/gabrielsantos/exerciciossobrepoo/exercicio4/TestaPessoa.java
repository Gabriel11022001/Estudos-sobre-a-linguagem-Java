package com.gabrielsantos.exerciciossobrepoo.exercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestaPessoa {

	public static void main(String[] args) {
		try {
			Pessoa pessoa1 = new Pessoa();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
			pessoa1.setNome("Gabriel Rodrigues dos Santos");
			pessoa1.setAltura(1.82);
			Date dataNascimento = simpleDateFormat.parse("2001-02-11");
			pessoa1.setDataNascimento(dataNascimento);
			System.out.println("Nome: " + pessoa1.getNome());
			System.out.println("Altura: " + pessoa1.getAltura());
			System.out.println("Idade: " + pessoa1.calcularIdade());
		} catch (Exception e) {
			System.out.println("Exceção: " + e.getMessage());
		}
	}
}
