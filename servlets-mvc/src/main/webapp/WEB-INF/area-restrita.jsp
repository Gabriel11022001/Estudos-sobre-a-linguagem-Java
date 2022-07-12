<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Área restrita</title>
</head>
<body>
	<h1>
		Seja bem vindo <%= request.getSession().getAttribute("usuario_logado") %>
		<a href="/servlets-mvc/logout">Sair</a>
	</h1>
</body>
</html>