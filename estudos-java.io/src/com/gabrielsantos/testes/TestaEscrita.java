package com.gabrielsantos.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {

	public static void main(String[] args) {
		try {
			OutputStream fas = new FileOutputStream("nomes.txt");
			Writer writer = new OutputStreamWriter(fas);
			BufferedWriter bfBufferedWriter = new BufferedWriter(writer);
			// Escrevendo no arquivo
			bfBufferedWriter.write("Gabriel Rodrigues dos Santos");
			bfBufferedWriter.newLine();
			bfBufferedWriter.write("Gustavo Pereira da Silva");
			bfBufferedWriter.newLine();
			bfBufferedWriter.write("Maria Eduarda da Silva");
			bfBufferedWriter.close();
		} catch (Exception e) {
			System.out.println("Ocorreu o seguinte erro: " + e.getMessage());
		}
	}
}
