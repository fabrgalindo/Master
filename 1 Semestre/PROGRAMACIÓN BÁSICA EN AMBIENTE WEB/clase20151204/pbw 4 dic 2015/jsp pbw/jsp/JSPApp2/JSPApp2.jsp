
<html>
<head>
<title>Java Servlet Pages: Demo #2</title>
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

<% java.util.Date reloj = new java.util.Date(); %>
<% if (reloj.getHours() < 12) { 	%>
Buenos días!
<% } else if (reloj.getHours() < 17) {  %>
Buenas tardes!
<% } else {   %>
Buenas noches!
<% } %>

</body>
</html>
