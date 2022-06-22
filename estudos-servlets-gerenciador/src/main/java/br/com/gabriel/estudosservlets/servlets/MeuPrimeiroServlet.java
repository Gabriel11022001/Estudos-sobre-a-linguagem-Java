package br.com.gabriel.estudosservlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/meuprimeiroservlet")
public class MeuPrimeiroServlet extends HttpServlet {

	public MeuPrimeiroServlet() {
		super();
	}
	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		PrintWriter printWriter = resposta.getWriter();
		String nome = requisicao.getParameter("nome");
		int idade = Integer.parseInt(requisicao.getParameter("idade"));
		printWriter.println("Nome: " + nome);
		printWriter.println("Idade: " + idade);
		printWriter.flush();
	}
}
