package br.com.gabriel.estudosservlets.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.com.gabriel.estudosservlets.models.BancoDados;
import br.com.gabriel.estudosservlets.models.Empresa;

@WebServlet(urlPatterns = "/empresas/cadastrar")
public class NovaEmpresaServlet extends HttpServlet {
	
    public NovaEmpresaServlet() {
        super();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String resultadoCadastro = "";
    	try {
    		int id = 0;
    		if (BancoDados.buscarTodas().size() == 0) {
    			id = 1;
    		} else {
    			Empresa ultima = BancoDados.buscarTodas().get(BancoDados.buscarTodas().size() - 1);
    			id = ultima.getId() + 1;
    		}
    		Empresa empresa = new Empresa(id, req.getParameter("nome"));
    		BancoDados.adicionar(empresa);
    		resultadoCadastro = "Empresa de nome " + empresa.getNome() + " cadastrada com sucesso!";
    		BancoDados.buscarTodas().forEach((emp) -> {
    			System.out.println("Id: " + emp.getId());
    			System.out.println("Nome: " + emp.getNome());
    		});
    	} catch (Exception e) {
			resultadoCadastro = e.getMessage();
		}
    	// PrintWriter printWriter = resp.getWriter();
		// printWriter.println(resultadoCadastro);
		// printWriter.flush();
    	req.setAttribute("resultado_cadastrar_empresa", resultadoCadastro);
    	RequestDispatcher rd = req.getRequestDispatcher("/cadastrar-empresa-jsp.jsp");
    	rd.forward(req, resp);
    }
}
