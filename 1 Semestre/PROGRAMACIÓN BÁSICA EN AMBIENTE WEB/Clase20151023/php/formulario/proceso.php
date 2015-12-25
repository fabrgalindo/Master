<html> 
<head> 
<title>Ejemplo de uso de formulario PHP</title> 
</head> 
<body> 
<H1>Ejemplo de uso de formulario</H1> 

<?php

$texto = $_POST['texto']; 

$tamanio = strlen($texto);   

echo 'El texto recibido es: "'. $texto . '"<br>';
echo 'El tamano del texto es: '. $tamanio . '<br>';

?>
<br> 
</body> 
</html> 
