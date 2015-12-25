<html> 
<head> 
<title>Conteo de palabras</title> 
</head> 
<body> 
<H1>Fabi&aacute;n Ram&iacute;rez Galindo </H1>

<?php

$texto = $_POST['texto']; 


$clave=" ";
$totalPalabras=0;
$cadenaAux = $texto;
$p=0;
$cadenaAux = str_replace(chr(13),chr(32),$cadenaAux);
$cadenaAux = str_replace("\n",chr(32),$cadenaAux);
$cadenaAux = trim($cadenaAux, " ");//Elimina espacios en blanco al principio y al final
$longitud = strlen($cadenaAux); 
if($longitud>0)
{
	$totalPalabras=1;
	
	do
	{
		$p = stripos($cadenaAux, $clave);

		if($p!=0)
		{	
			$cadenaAux=substr($cadenaAux ,$p+1);
			$cadenaAux = trim($cadenaAux, " ");
			$totalPalabras++;
		}

	}while ($p!= false); 
}
	echo 'El n&uacute;mero de palabras son: '. $totalPalabras . '<br>';
	

	$strArray = count_chars($texto,0);
$c=97;

	echo "<Table border=2 align=Center width=50%>";
	echo "<tr>";
	echo "<th align=Center>Letra</td>";
	echo "<th align=Center>No. de Ocurrencias</th>";
	echo "</tr>";

	foreach ($strArray as $key=>$valor)
	{
		if($key>96 && $key<123)
		{
			echo "<tr>";
			echo "<td align=Center>". chr($key) . "</td>";
			echo "<td align=Center>" . $valor . "</td>";
			echo "</tr>";
		}		
	}
	echo "</Table>" ;
	echo '<br>';
	echo "<Table border=2 align=Center width=50%>";
	echo "<tr>";
	echo "<th align=Center>No.caracteres</td>";
	echo "<th align=Center>No. palabras</th>";
	echo "<th align=Center>Palabras</th>";
	echo "</tr>";
	$arregloPalabras= str_word_count($texto,1);
	for($i=1;$i<16;$i++)
	{
		$cadenaAux ="&nbsp;";
		$noPalabras=0;
		foreach ($arregloPalabras as $contenido) 
		{
			if(strlen($contenido)==$i)
			{
				$cadenaAux =$cadenaAux.$contenido. " ";
				$noPalabras++;
			}
		}
		echo "<tr>";
		echo "<td align=Center>". $i . "</td>";
		echo "<td align=Center>" . $noPalabras . "</td>";
		echo "<td align=Center>" . $cadenaAux . "</td>";
		echo "</tr>";
		
	}
	echo "</Table>" ;
?>
<br> 
</body> 
</html> 

