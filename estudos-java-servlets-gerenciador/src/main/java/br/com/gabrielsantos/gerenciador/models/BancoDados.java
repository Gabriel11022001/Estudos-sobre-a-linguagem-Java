package br.com.gabrielsantos.gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {

	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public static void adicionar(Empresa empresa) {
		BancoDados.empresas.add(empresa);
	}
	public static List<Empresa> buscarTodas() {
		return BancoDados.empresas;
	}
}
