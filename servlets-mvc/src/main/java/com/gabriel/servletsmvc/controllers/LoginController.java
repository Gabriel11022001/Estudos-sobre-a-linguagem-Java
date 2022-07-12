package com.gabriel.servletsmvc.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.gabriel.servletsmvc.models.Conexao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController {

	public void redirecionarUsuarioParaTelaDeLogin(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		RequestDispatcher despachadorDeRequisicao = requisicao.getRequestDispatcher("/WEB-INF/login.jsp");
		despachadorDeRequisicao.forward(requisicao, resposta);
	}
	public void redirecionarUsuarioParaTelaRegistro(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		RequestDispatcher despachadorDeRequisicao = requisicao.getRequestDispatcher("");
		despachadorDeRequisicao.forward(requisicao, resposta);
	}
	public void realizarLogin(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String mensagem = "";
		try {
			String email = requisicao.getParameter("email");
			String senha = requisicao.getParameter("senha");
			if (email.isEmpty() || senha.isEmpty()) {
				mensagem = "Informe o seu e-mail e sua senha!";
			} else {
				Connection conexao = Conexao.getConexao();
				String query = "SELECT * FROM tbl_usuarios WHERE usuario_email = ? AND usuario_senha = md5(?);";
				PreparedStatement stmt = conexao.prepareStatement(query);
				stmt.setString(1, email);
				stmt.setString(2, senha);
				ResultSet rs = stmt.executeQuery();
				if (rs.next() == false) {
					mensagem = "E-mail ou senha inválidos!";
				} else {
					mensagem = "Login efetivado com sucesso!";
					HttpSession sessao = requisicao.getSession();
					sessao.setAttribute("usuario_logado", rs.getString("usuario_nome"));
					resposta.sendRedirect("/servlets-mvc/area-restrita");
				}
			}
		} catch (Exception e) {
			mensagem = e.getMessage();
		}
		if (!mensagem.equals("Login efetivado com sucesso!")) {
			HttpSession sessao = requisicao.getSession();
			sessao.setAttribute("mensagem", mensagem);
			resposta.sendRedirect("/servlets-mvc/");
		}
	}
}
