package com.gabrielsantos.apiprodutos.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import com.gabrielsantos.apiprodutos.servicos.CategoriaServico;
import com.gabrielsantos.apiprodutos.utilitarios.ConteudoResposta;
import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/categorias",
		"/categorias/buscar",
		"/categorias/buscar-pela-descricao"
})
public class CategoriaController extends HttpServlet {
	
	private CategoriaServico categoriaServico;
	
	public CategoriaController() {
		super();
		this.categoriaServico = new CategoriaServico();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String urlRequisicao = req.getRequestURI();
		if (urlRequisicao.equals("/apiprodutos/categorias")) {
			this.buscarTodasAsCategorias(req, resp);
			return;
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	private void buscarTodasAsCategorias(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	private void buscarCategoriaPeloId(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	private void buscarCategoriaPelaDescricao(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
