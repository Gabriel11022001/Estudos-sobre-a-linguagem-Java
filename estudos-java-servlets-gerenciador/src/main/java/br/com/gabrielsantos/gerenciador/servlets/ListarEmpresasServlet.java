package br.com.gabrielsantos.gerenciador.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.gabrielsantos.gerenciador.models.BancoDados;
import br.com.gabrielsantos.gerenciador.models.Empresa;

@WebServlet(urlPatterns = "/listar")
public class ListarEmpresasServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		List<Empresa> empresas = BancoDados.buscarTodas();
		PrintWriter saida = resposta.getWriter();
		String resp = "<html><head>"
				+ "<title>Listar as empresas</title>"
				+ "</head>"
				+ "<body>"
				+ "<ul>";
		for (int cont = 0; cont < empresas.size(); cont++) {
			String li = "<li>" + empresas.get(cont).getNome() + "</li>";
			resp = resp + li;
		}
		resp = resp + "</ul>"
				+ "</body>"
				+ "</html>";
		saida.write(resp);
	}
}
