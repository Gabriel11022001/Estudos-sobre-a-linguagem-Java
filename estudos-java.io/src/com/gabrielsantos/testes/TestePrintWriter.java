package com.gabrielsantos.testes;

import java.io.PrintWriter;

public class TestePrintWriter {

	public static void main(String[] args) {
		try {
			String separador = System.lineSeparator();
			PrintWriter printWriter = new PrintWriter("nomes.txt");
			printWriter.write("Gabriel");
			printWriter.write(separador);
			printWriter.write("Matheus");
			printWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
