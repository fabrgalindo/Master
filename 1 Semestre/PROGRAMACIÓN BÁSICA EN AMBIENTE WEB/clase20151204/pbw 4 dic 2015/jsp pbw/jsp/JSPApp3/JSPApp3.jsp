

<%@ page language="java" contentType="text/html" %>

<html>
<head>
<title>Java Servlet Pages: Demo #3</title>
</head>
<body>
<h1>

<!--	Ejemplos de scriptlets			-->

<%
	if (request.getParameter("nombre") == null) {
		out.println("Hola, Mundo");
	} else {
		out.println("Hola, "+request.getParameter("nombre"));
	}
%>
</h1>
<hr>

<!-- mezcla de html, HTML4.0 y JSP 		-->
<font face="Arial" color="blue" size="3">
Hoy es: <%= new java.util.Date().toString() %><br>
</font>

</body>
</html>
