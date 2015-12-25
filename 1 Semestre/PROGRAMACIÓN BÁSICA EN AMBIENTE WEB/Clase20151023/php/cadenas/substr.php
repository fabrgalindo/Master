<html>
<title>  subsrt.php  </title>
<body>
<?php
/*
 * Sintaxis:
 * substr(cadenaOriginal, lugarInicial, cantidadDeCaracteres) 
 * cadenaOriginal:  Es la cadena de donde se extraerá el texto.
 * lugarInicial:  Representa la posición desde donde se comenzarán a extraer el texto.
 * CantidadDeCaracteres: Indica cuantos caracteres se extraerán. (Opcional).
 */
   echo "<H3>";
   $cadena = "Alicia Martinez";
   echo "Cadena Original: " . $cadena;
   echo "<Br>";
   echo "Tres primeros caracteres: ";
   echo substr($cadena,0,3);
   echo "<Br>";
   echo "Seis caracteres a partir del octavo: ";
   echo substr($cadena,7,6);
   echo "<Br>";
   echo "Cuatros caracteres comenzando desde el último: ";
   echo substr($cadena,-4);
?>
</body>
</html> 

