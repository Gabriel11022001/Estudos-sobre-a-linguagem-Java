package com.gabriel.servletsmvc.controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AreaRestritaController {

	public void redirecionarUsuarioParaTelaDeAreaRestrita(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String usuarioLogado = (String) requisicao.getSession().getAttribute("usuario_logado");
		if (usuarioLogado == null) {
			resposta.sendRedirect("/servlets-mvc/");
		} else {
			RequestDispatcher despachadorDeRequisicoes = requisicao.getRequestDispatcher("/WEB-INF/area-restrita.jsp");
			despachadorDeRequisicoes.forward(requisicao, resposta);	
		}
	}
	public void realizarLogout(HttpServletRequest requisicao, HttpServletResponse resposta) throws IOException {
		String usuarioLogado = (String) requisicao.getSession().getAttribute("usuario_logado");
		if (usuarioLogado != null) {
			HttpSession sessao = requisicao.getSession();
			sessao.removeAttribute("usuario_logado");
		}
		resposta.sendRedirect("/servlets-mvc/");
	}
}
