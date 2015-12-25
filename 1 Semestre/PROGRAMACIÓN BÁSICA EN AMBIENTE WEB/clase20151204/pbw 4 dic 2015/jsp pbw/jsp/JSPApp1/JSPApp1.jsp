
<html>
<head>
<title>Java Servlet Pages: Demo #1</title>
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
</body>
</html>
