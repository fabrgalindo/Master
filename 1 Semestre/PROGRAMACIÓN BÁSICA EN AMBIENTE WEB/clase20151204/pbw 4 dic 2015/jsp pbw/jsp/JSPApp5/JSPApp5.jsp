

<%@ page session="false" %>

<html>
<head>
<title>Java Servlet Pages: Demo #5</title>
</head>
<body>
 
<jsp:useBean id="reloj" class="java.util.Date" />

<h1>La hora actual en el servidor es: </h1>
<br>
<ul>
<li>D&iacute;a:	<jsp:getProperty name="reloj" property="date" />
<li>Mes:	<jsp:getProperty name="reloj" property="month" />
<li>A&ntilde;o:	<jsp:getProperty name="reloj" property="year" />
<li>Hora:	<jsp:getProperty name="reloj" property="hours" />
<li>Minutos:	<jsp:getProperty name="reloj" property="minutes" />
</ul>

</body>
</html>
