package br.com.gabriel.estudosservlets.servlets;

import java.awt.Menu;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(urlPatterns = "/empresas/listar-todas")
public class ListarEmpresasServlet extends HttpServlet {

	public ListarEmpresasServlet() {
		super();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String resultado = "";
		List<Empresa> empresas = null;
		try {
			empresas = BancoDados.buscarTodas();
			if (empresas.size() == 0) {
				throw new RuntimeException("Ainda não existe empresas cadastradas no banco de dados!");
			}
			resultado = "Existe empresas cadastradas no banco de dados!";
		} catch (Exception e) {
			resultado = e.getMessage();
		}
		// PrintWriter printWriter = resp.getWriter();
		RequestDispatcher rd = req.getRequestDispatcher("/listar-empresas.jsp");
		if (!resultado.equals("Existe empresas cadastradas no banco de dados!")) {
			// printWriter.println(resultado);
			req.setAttribute("mensagem_consultar_empresas", resultado);
		} else {
			req.setAttribute("mensagem_consultar_empresas", resultado);
			req.setAttribute("empresas", empresas);
			// printWriter.println(apresentacao);
		}
		// printWriter.flush();
		rd.forward(req, resp);
	}
}
