package br.com.gabriel.estudosservlets.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/calculadora")
public class CalculadoraServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		if (req.getParameter("primeiroValor").equals("") || req.getParameter("primeiroValor").isEmpty()
				|| req.getParameter("segundoValor").equals("") || req.getParameter("segundoValor").isEmpty()) {
			printWriter.println("Informe os valores para que a operação possa ser executada com sucesso!");
		} else {
			double primeiroValor = Double.parseDouble(req.getParameter("primeiroValor"));
			double segundoValor = Double.parseDouble(req.getParameter("segundoValor"));
			String operacao = req.getParameter("operacao");
			double resultadoOperacao = 0;
			if (operacao.equals("soma")) {
				resultadoOperacao = primeiroValor + segundoValor;
			} else if (operacao.equals("subtração")) {
				resultadoOperacao = primeiroValor - segundoValor;
			} else if (operacao.equals("multiplicação")) {
				resultadoOperacao = primeiroValor * segundoValor;
			} else {
				resultadoOperacao = primeiroValor / segundoValor;
			}
			printWriter.println("O resultado da operação de " + operacao + " entre " + primeiroValor + " e " + segundoValor + " é igual a " + resultadoOperacao);
		}
	}
}
