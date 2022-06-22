<%@page import="java.util.ArrayList"%>
<%@page import="br.com.gabriel.estudosservlets.models.Empresa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página com listagem das empresas</title>
</head>
<body>
	<%
		// List<Empresa> empresasTeste = new ArrayList<>();
		// empresasTeste.add(new Empresa(1, "Empresa 1"));
		// empresasTeste.add(new Empresa(2, "Empresa 2"));
		// empresasTeste.add(new Empresa(3, "Empresa 3"));
		// empresasTeste.add(new Empresa(4, "Empresa 4"));
		// empresasTeste.add(new Empresa(5, "Empresa 5"));
		String mensagem = (String) request.getAttribute("mensagem_consultar_empresas");
		if (!mensagem.equals("Existe empresas cadastradas no banco de dados!")) { %>
			<h3><% out.println(mensagem); %></h3>	
		<%
		}
	%>
	<ul>
		<%
			if (mensagem.equals("Existe empresas cadastradas no banco de dados!")) {
				List<Empresa> empresas = (List<Empresa>) request.getAttribute("empresas");
				for (Empresa empresa : empresas) { %>
					<li><% out.println(empresa.getNome()); %> | <a href="/estudos-servlets-gerenciador/empresas/remover?id=<%= empresa.getId() %>">Remover</a></li>	
				<%
				}
			}
		%>
	</ul>
</body>
</html>