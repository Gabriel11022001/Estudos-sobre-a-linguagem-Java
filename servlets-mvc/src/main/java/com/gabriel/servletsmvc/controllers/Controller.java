package com.gabriel.servletsmvc.controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/",
		"/sistema"
})
public class Controller extends HttpServlet {

	public Controller() {
		super();
	}
	@Override
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		if (requisicao.getRequestURI().equals("/servlets-mvc/")) {
			LoginController loginController = new LoginController();
			loginController.redirecionarUsuarioParaTelaDeLogin(requisicao, resposta);
			return;
		}
		if (requisicao.getRequestURI().equals("/servlets-mvc/area-restrita")) {
			AreaRestritaController areaRestritaController = new AreaRestritaController();
			areaRestritaController.redirecionarUsuarioParaTelaDeAreaRestrita(requisicao, resposta);
			return;
		}
		if (requisicao.getRequestURI().equals("/servlets-mvc/logout")) {
			AreaRestritaController areaRestritaController = new AreaRestritaController();
			areaRestritaController.realizarLogout(requisicao, resposta);
			return;
		}
		String action = requisicao.getParameter("action");
		if (action.equals("login")) {
			LoginController loginController = new LoginController();
			loginController.redirecionarUsuarioParaTelaDeLogin(requisicao, resposta);
			return;
		}
		if (action.equals("realizarLogin")) {
			LoginController loginController = new LoginController();
			loginController.realizarLogin(requisicao, resposta);
			return;
		}
	}
}
