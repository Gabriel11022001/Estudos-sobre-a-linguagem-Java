package br.com.gabrielsantos.gerenciador.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import br.com.gabrielsantos.gerenciador.models.BancoDados;
import br.com.gabrielsantos.gerenciador.models.Empresa;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/cadastrarEmpresa")
public class CadastrarEmpresaServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		// System.out.println("Acessei o servlet de cadastro de empresas!");
		Empresa empresa = new Empresa();
		empresa.setNome(requisicao.getParameter("nome_empresa"));
		empresa.setCnpj(requisicao.getParameter("cnpj_empresa"));
		BancoDados.adicionar(empresa);
		PrintWriter saida = resposta.getWriter();
		String resp = "Empresa de nome " + empresa.getNome() + " e cnpj " + empresa.getCnpj()+ " cadastrada com sucesso!";
		saida.write(resp);
	}
}
