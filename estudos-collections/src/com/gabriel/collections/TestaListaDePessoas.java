package com.gabriel.collections;

import java.util.ArrayList;
import java.util.List;

public class TestaListaDePessoas {

	public static void main(String[] args) {
		try {
			List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
			List<Telefone> telefonesPrimeiraPessoa = new ArrayList<Telefone>();
			telefonesPrimeiraPessoa.add(new Telefone("(14) 997665544"));
			telefonesPrimeiraPessoa.add(new Telefone("(14) 997612244"));
			List<Telefone> telefonesSegundaPessoa = new ArrayList<Telefone>();
			telefonesSegundaPessoa.add(new Telefone("(14) 9985432345"));
			telefonesSegundaPessoa.add(new Telefone("(14) 998776688"));
			listaPessoas.add(new Pessoa("Gabriel", "123.456.789-99", "456.876.416-98", new Email("gabriel@teste.com"),
					telefonesPrimeiraPessoa));
			listaPessoas.add(new Pessoa("Pedro", "456.987.123-98", "123.567.987.-876", new Email("pedro@teste.com"),
					telefonesSegundaPessoa));
			for (Pessoa pessoa : listaPessoas) {
				System.out.println("======================================================");
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Rg: " + pessoa.getRg());
				System.out.println("Cpf: " + pessoa.getCpf());
				System.out.println("Email: " + pessoa.getEmail().getEmail());
				System.out.println("Telefones:");
				for (Telefone telefone : pessoa.getTelefones()) {
					System.out.println("Número: " + telefone.getNumero());
				}
				System.out.println("======================================================");
			}
			listaPessoas.get(0).adicionarTelefone(new Telefone("(14) 997661234"));
			for (Pessoa pessoa : listaPessoas) {
				System.out.println("======================================================");
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Rg: " + pessoa.getRg());
				System.out.println("Cpf: " + pessoa.getCpf());
				System.out.println("Email: " + pessoa.getEmail().getEmail());
				System.out.println("Telefones:");
				for (Telefone telefone : pessoa.getTelefones()) {
					System.out.println("Número: " + telefone.getNumero());
				}
				System.out.println("======================================================");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
