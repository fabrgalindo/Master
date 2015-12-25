<html> 
<head> 
<title>Conteo de palabras</title> 
</head> 
<body> 
<H1>Fabi&aacute;n Ram&iacute;rez Galindo </H1>

<?php

$texto = $_POST['texto']; 

$longitud = strlen($texto); 
 $clave=" ";
$totalPalabras=0;
$cadenaAux = $texto;
$p=0;

if($longitud>0)
{
	$totalPalabras=1;
	$cadenaAux = str_replace(chr(13),chr(32),$cadenaAux);
	$cadenaAux = str_replace("\n",chr(32),$cadenaAux);
	$cadenaAux = trim($cadenaAux, " ");//Elimina espacios en blanco al principio y al final
	
	do
	{
		$p = stripos($cadenaAux, $clave);

		//echo stripos($cadenaAux, $clave);
		if($p!=0)
		{	
			$cadenaAux=substr($cadenaAux ,$p+1);
			$cadenaAux = trim($cadenaAux, " ");
			//echo 'El cadenaAux en el if: "'.($cadenaAux) . '"<br>';
			$totalPalabras++;
		}

	}while ($p!= false); 
}
	echo 'El n&uacute;mero de palabras son: '. $totalPalabras . '<br>';
?>
<br> 
</body> 
</html> 

