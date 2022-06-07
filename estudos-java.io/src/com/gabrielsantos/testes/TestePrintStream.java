package com.gabrielsantos.testes;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestePrintStream {

	public static void main(String[] args) {
		Scanner entradaUsuario = new Scanner(System.in);
		List<String> nomes = new ArrayList<String>();
		try {
			PrintStream printStream = new PrintStream("nomes.txt");
			// printStream.println("Gabriel");
			// printStream.println("Maria");
			// printStream.println("Eduarda");
			// printStream.close();
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um nome:");
				nomes.add(entradaUsuario.next());
			}
			for (int i = 0; i < nomes.size(); i++) {
				printStream.println(nomes.get(i));
			}
			System.out.println("Nomas escritos no arquivo com sucesso!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
