package br.com.gabrielsantos.gerenciador.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olamundo")
public class OlaMundoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		PrintWriter saida = resposta.getWriter();
		saida.println("Olá Mundo!");
	}
}
