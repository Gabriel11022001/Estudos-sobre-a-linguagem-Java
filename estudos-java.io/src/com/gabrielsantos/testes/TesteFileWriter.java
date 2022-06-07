package com.gabrielsantos.testes;

import java.io.FileWriter;

public class TesteFileWriter {

	public static void main(String[] args) {
		try {
			 FileWriter fileWriter = new FileWriter("nomes.txt");
			 fileWriter.write("Gabriel Rodrigues dos Santos");
			 fileWriter.write(System.lineSeparator());
			 fileWriter.write("Eduardo Pereira da Silva");
			 fileWriter.write(System.lineSeparator());
			 fileWriter.write("Maria Fernanda da Silva Santos");
			 fileWriter.write(System.lineSeparator());
			 fileWriter.write("Milena Pereira dos Santos");
			 fileWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
