<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrar empresa</title>
<style type="text/css">
	.resultado {
		color: blue;
	}
</style>
</head>
<body>
	<h1>Cadastrar empresa</h1>
	<form action="/estudos-servlets-gerenciador/empresas/cadastrar" method="post">
		<label for="nome">Nome da empresa</label>
		<br>
		<input type="text" id="nome" name="nome" placeholder="Digite o nome da empresa...">
		<br>
		<button type="submit">
			Salvar
		</button>
	</form>
	<br>
	<h3 class="resultado">
		<%
			String resultadoCadastroEmpresa = (String) request.getAttribute("resultado_cadastrar_empresa");
			out.println(resultadoCadastroEmpresa);
		%>
	</h3>
</body>
</html>