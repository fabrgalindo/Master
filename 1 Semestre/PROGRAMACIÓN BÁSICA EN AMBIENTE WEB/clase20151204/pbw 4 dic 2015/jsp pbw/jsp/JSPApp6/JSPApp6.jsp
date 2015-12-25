

<%@ page session="false" %>
<%@ page language="java" %>
<%@ page contentType="text/html" %>

<html>
<head>
<title>Java Servlet Pages: Demo #6</title>
</head>
<body>

<h2>Recibimos información HTTP como sigue:</h2>
<hr>

<ul>
<li>Método HTTP:	<%= request.getMethod() %>
<li>URI Procedencia:	<%= request.getRequestURI() %>
<li>Protocolo:		<%= request.getProtocol() %>
<li>Ruta:		<%= request.getServletPath() %>
<li>Query:		<%= request.getQueryString() %>
<li>Servidor:		<%= request.getServerName() %>
<li>Puerto:		<%= request.getServerPort() %>
<li>Direcci&oacute;n:	<%= request.getRemoteAddr() %>
<li>Host:		<%= request.getRemoteHost() %>
<li>Navegador:		<%= request.getHeader("User-Agent") %>
</ul>

</body>
</html>
