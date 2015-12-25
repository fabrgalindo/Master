
<%@ page isErrorPage="true" %> 
<html>
<head>
<title></title>


</head>

<body>
<h1>¿Que crees?</h1>
<br>
<h3>¡Te equivocaste!</h3>
<br>
Tienes la siguiente excepccion: <br>
<%= exception.getClass().getName() %>
<br>
<h4>
<% String miNombre = request.getServerName(); %>
Si no sabes que hacer, b&uacute;scame! : 
</h4><br>


</body>
</html>
