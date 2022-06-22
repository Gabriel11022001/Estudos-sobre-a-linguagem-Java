package br.com.gabriel.estudosservlets.models;

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
	static {
		empresas.add(new Empresa(1, "Empresa 1"));
		empresas.add(new Empresa(2, "Empresa 2"));
		empresas.add(new Empresa(3, "Empresa 3"));
		empresas.add(new Empresa(4, "Empresa 4"));
		empresas.add(new Empresa(5, "Empresa 5"));
	}
}
