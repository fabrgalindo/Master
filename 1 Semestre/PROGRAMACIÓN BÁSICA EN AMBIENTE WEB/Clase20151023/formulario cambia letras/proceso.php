<html> 
<head> 
<title>Ejemplo de uso de formulario PHP</title> 
</head> 
<body> 
<H1>Fabi&aacute;n Ram&iacute;rez Galindo </H1>

<?php

$texto = $_POST['texto']; 

$cadena = strlen($texto); 
$inicio=0;

 
//echo 'El texto recibido  es: "'.($texto) . '"<br>';
//echo 'El tamano del texto es: '. $cadena . '<br>';

  while ($inicio <= $cadena){
	$letra=substr($texto ,$inicio,1);
	if ($letra == strtolower($letra))
	{
		echo ''. strtoupper($letra) . '';
	}
	else if ($letra == strtoupper($letra))
	{
		echo ''. strtolower($letra) . '';
	}  
	else 
	{
		echo ''. ($letra) . '';
	}
	
	$inicio=$inicio+1;
}

 
?>
<br> 
</body> 
</html> 

