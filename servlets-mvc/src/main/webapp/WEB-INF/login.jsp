<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema - Login</title>
</head>
<body>
	<%
		HttpSession sessao = request.getSession();
		String mensagem = (String) sessao.getAttribute("mensagem");
		if (mensagem != null) {
			if (!mensagem.equals("Login efetivado com sucesso!")) { %>
				<h2 style="color: red;">
					<%= mensagem %>
				</h2>	
			<%
			}
			sessao.removeAttribute("mensagem");
		}
	%>
	<h1>Login</h1>
	<form action="/servlets-mvc/login?action=realizarLogin" method="post">
		<label for="email">E-mail</label>
		<br>
		<input type="email" id="email" name="email" placeholder="Digite o seu e-mail...">
		<br>
		<label for="senha">Senha</label>
		<br>
		<input type="password" id="senha" name="senha" placeholder="Digite sua senha...">
		<br>
		<button type="submit">Enviar</button>
	</form>
</body>
</html>