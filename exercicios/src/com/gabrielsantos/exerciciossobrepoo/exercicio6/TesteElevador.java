package com.gabrielsantos.exerciciossobrepoo.exercicio6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.gabrielsantos.exerciciossobrepoo.exercicio4.Pessoa;

public class TesteElevador {

	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
		Elevador elevador = new Elevador(10, 7);
		try {
			elevador.entrarNoElevador(new Pessoa("Gabriel", 1.82, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Maria", 1.72, simpleDateFormat.parse("11-02-2000")));
			elevador.entrarNoElevador(new Pessoa("Gabriel Santos", 1.52, simpleDateFormat.parse("09-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Matheus", 1.72, simpleDateFormat.parse("12-02-2006")));
			elevador.entrarNoElevador(new Pessoa("José", 1.81, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Eduardo", 1.80, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Eduarda", 1.77, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Maria Helena", 1.76, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Mariana", 1.89, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Pedro", 1.82, simpleDateFormat.parse("11-02-2001")));
			elevador.entrarNoElevador(new Pessoa("Gustavo", 1.82, simpleDateFormat.parse("11-02-2001")));
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.subirAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.descerAndar();
			elevador.sairDoElevador("Gabriel");
			elevador.apresentarPessoasNoElevador();
			System.out.println("======================");
			elevador.sairDoElevador("Mariana");
			elevador.apresentarPessoasNoElevador();
		} catch (ParseException e) {
			System.err.println(e.getMessage());
		}
	}
}
