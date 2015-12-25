

<%@ page session="false" %>
<%@ page errorPage="JSPApp4Basurero.jsp" %>

<html>
<head>
<title>Java Servlet Pages: Demo #4</title>
</head>
<body>

<h1>
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

<!-- cualquier condicion de error que se pueda generar -->
<%
	if (System.currentTimeMillis() > 0) {
		throw new Exception("oops");
	} // fin if
%>

</body>
</html>
