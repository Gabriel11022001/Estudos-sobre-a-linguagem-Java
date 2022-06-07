package com.gabrielsantos.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("teste.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String linha= bufferedReader.readLine();
			// System.out.println(linha);
			while (linha != null) {
				System.out.println(linha);
				linha = bufferedReader.readLine();
			}
			bufferedReader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
