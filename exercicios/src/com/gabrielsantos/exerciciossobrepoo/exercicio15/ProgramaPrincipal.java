package com.gabrielsantos.exerciciossobrepoo.exercicio15;

import java.util.List;
import java.util.Scanner;

import com.gabrielsantos.exerciciossobrepoo.exercicio15.entidades.Categoria;
import com.gabrielsantos.exerciciossobrepoo.exercicio15.tabelas.TabelaCategorias;

public class ProgramaPrincipal {

	public static void menu() {
		System.out.println("********* Menu *********");
		System.out.println("1 - Cadastrar categoria de produto.");
		System.out.println("2 - Deletar categoria de produto.");
		System.out.println("3 - Listar todas as categorias.");
		System.out.println("4 - Buscar uma categoria pelo id.");
		System.out.println("5 - Cadastrar produto.");
		System.out.println("6 - Deletar produto.");
		System.out.println("7 - Listar todos os produtos.");
		System.out.println("8 - Buscar um produto pelo id.");
	}
	public static void cadastrarCategoriaDeProduto(Scanner entrada, TabelaCategorias tabelaCategorias) {
		Categoria categoria = new Categoria();
		boolean informouDescricaoCategoriaValida = false;
		while (informouDescricaoCategoriaValida == false) {
			System.out.println("Informe a descrição da categoria:");
			informouDescricaoCategoriaValida = categoria.setDescricao(entrada.next());
			if (informouDescricaoCategoriaValida == false) {
				System.out.println("Informe corretamente a descrição da categoria!");
			}
		}
		tabelaCategorias.cadastrar(categoria);
	}
	public static void deletarCategoriaDeProduto(Scanner entrada, TabelaCategorias tabelaCategorias) {
		if (tabelaCategorias.buscarTodos() != null) {
			
		}
	}
	public static void listarTodasAsCategorias(TabelaCategorias tabelaCategorias) {
		List<Categoria> categorias = null;
		categorias = tabelaCategorias.buscarTodos();
		if (categorias == null) {
			return;
		}
		for (Categoria cat : categorias) {
			System.out.println("-----------------------------------------");
			System.out.println("Id da categoria: " + cat.getId());
			System.out.println("Descrição da categoria: " + cat.getDescricao());
			System.out.println("-----------------------------------------");
		}
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0, opcaoDeContinuar = 0;
		TabelaCategorias tabelaCategorias = new TabelaCategorias();
		while (opcao > 8 || opcao < 1) {
			if (opcao == -999) {
				System.out.println("Encerrando o programa!");
				break;
			}
			menu();
			System.out.println("Informe uma das opções do menu:");
			opcao = entrada.nextInt();
			if (opcao < 1 || opcao > 8) {
				System.out.println("============================================");
				System.out.println("OPÇÃO INVÁLIDA, INFORME UMA OPÇÃO VÁLIDA!");
				System.out.println("============================================");
				continue;
			}
			switch (opcao) {
			case 1:
				cadastrarCategoriaDeProduto(entrada, tabelaCategorias);
				break;
			case 2:
				deletarCategoriaDeProduto(entrada, tabelaCategorias);
				break;
			case 3:
				listarTodasAsCategorias(tabelaCategorias);
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			default:
				break;
			}
			opcaoDeContinuar = 0;
			while (opcaoDeContinuar != 1 && opcaoDeContinuar != 2) {
				System.out.println("Gostaria de realizar mais alguma operação? Digite 1 para SIM ou 2 para NÃO:");
				opcaoDeContinuar = entrada.nextInt();
				if (opcaoDeContinuar != 1 && opcaoDeContinuar != 2) {
					System.out.println("Informe uma opção válida -> 1 para SIM ou 2 para NÃO!");
				} else if (opcaoDeContinuar == 1) {
					opcao = 0;
				} else {
					opcao = -999;
				}
			}
		}
	}
}
