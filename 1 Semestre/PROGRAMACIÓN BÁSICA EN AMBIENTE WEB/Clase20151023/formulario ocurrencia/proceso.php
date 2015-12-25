<html> 
<head> 
<title>Ejemplo de uso de formulario PHP</title> 
</head> 
<body> 
<H1>Fabi&aacute;n Ram&iacute;rez Galindo </H1>

</br></br>
<H5>Ocurrencia de letras minusculas.</H5>
<?php

$texto = $_POST['texto']; 

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
			echo "<th align=Center>" . $valor . "</th>";
			echo "</tr>";
		}		
	}
	
	/*for($i=1; $i<5; $i++)
	{
		$p=0;
		$noCaracteres=0;
		$cadenaAux=$texto;
		do
		{
			$p = stripos($cadenaAux, $c);

			if($p!=false)
			{	
				$cadenaAux=substr($cadenaAux ,$p+1);
				$noCaracteres++;
			}
		}while ($p!= false); 
		
		echo "<tr>";
		echo "<td align=Center>". chr($c) . "</td>";
		echo "<th align=Center>" . $noCaracteres . "</th>";
		echo "</tr>";
		$c++;
	}*/
	echo "</Table>" ;
?>
<br> 
</body> 
</html> 

