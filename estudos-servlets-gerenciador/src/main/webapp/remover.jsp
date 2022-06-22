<%@page import="br.com.gabriel.estudosservlets.models.Empresa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remover empresa</title>
</head>
<body>
	<%
		Empresa empresaRemover = (Empresa) request.getAttribute("empresa_remover");
	%>
	<h3>Gostaria mesmo de remover a empresa <%= empresaRemover.getNome() %> do seu banco de dados?</h3>
	<a href="/estudos-servlets-gerenciador/empresas/remover/efetivar?id=<%= empresaRemover.getId() %>" style="color: red;">Sim</a>
	<a href="/estudos-servlets-gerenciador/empresas/listar-todas" style="color: green;">Não, quero voltar para a listagem de empresas</a>
</body>
</html>