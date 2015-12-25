<html> 
<head> 
<title>Ejemplo de PHP</title> 
</head> 
<body> 
<H1>Ejemplo de procesado de formularios</H1> 
El nombre que ha introducido por POST es: 
<?php 
	echo $_POST['nombre'],"con apellido: ",$_POST['apellidos'] 
?>
</body> 
</html> 
