package br.com.gabriel.estudosservlets.servlets;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import br.com.gabriel.estudosservlets.models.BancoDados;
import br.com.gabriel.estudosservlets.models.Empresa;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
		"/empresas/remover",
		"/empresas/remover/efetivar"
})
public class RemoverEmpresaServlet extends HttpServlet {

	public RemoverEmpresaServlet() {
		super();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = req.getRequestURI();
		if (url.equals("/estudos-servlets-gerenciador/empresas/remover")) {
			this.doGet(req, resp);
			return;
		}
		this.doDelete(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String resBuscarEmpresa = "";
		Empresa empresaConsultar = null;
		try {
			if (req.getParameter("id") == null || req.getParameter("id").isEmpty()) {
				throw new RuntimeException("Informe o id da empresa!");
			}
			int idEmpresa = Integer.parseInt(req.getParameter("id"));
			List<Empresa> empresas = BancoDados.buscarTodas();
			if (empresas.size() == 0) {
				resp.sendRedirect("/estudos-servlets-gerenciador/empresas/listar-todas");
				return;
			}
			for (Empresa emp : empresas) {
				if (emp.getId() == idEmpresa) {
					empresaConsultar = emp;
					break;
				}
			}
			if (empresaConsultar == null) {
				resp.sendRedirect("/estudos-servlets-gerenciador/empresas/listar-todas");
				return;
			}
			resBuscarEmpresa = "Empresa encontrada com sucesso!";
		} catch (Exception e) {
			resBuscarEmpresa = e.getMessage();
		}
		if (resBuscarEmpresa.equals("Empresa encontrada com sucesso!")) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("/remover.jsp");
			req.setAttribute("empresa_remover", empresaConsultar);
			requestDispatcher.forward(req, resp);
		} else {
			resp.sendRedirect("/estudos-servlets-gerenciador/empresas/listar-todas");
		}
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int idEmpresa = Integer.parseInt(req.getParameter("id"));
			List<Empresa> empresas = BancoDados.buscarTodas();
			int indiceEmpresa = -1;
			for (int i = 0; i < empresas.size(); i++) {
				if (empresas.get(i).getId() == idEmpresa) {
					indiceEmpresa = i;
					break;
				}
			}
			empresas.remove(indiceEmpresa);
		} catch (Exception e) {
		} finally {
			resp.sendRedirect("/estudos-servlets-gerenciador/empresas/listar-todas");
		}
	}
}
