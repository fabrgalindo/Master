<html>
<title>  strpos.php  </title>
<body>
<?php
/*
 * strpos()evuelve la posición que se encuentra en una cadena fuente
 *  una cadena clave. 
 *  La sintaxis es la siguiente:
 *  $Pos = strpos(cadenaFuente, cadenaClave, comienzo);
 *  cadenaFuente: Es la cadena que será recorrida.
 *  cadenaClave: Es la cadena buscada.
 *  comienzo: Es opcional, y determina de que posición comenzará a explorar. 
 *    Si se ignora, comienza desde el principio, posición cero. 
 */
   echo "<h3>";
   $cadena = "En un ecosistema conviven diversos tipos de organismos";
   $clave = "eco";
   echo "Cadena Original: " . $cadena;
   echo "<br><br>";
   echo "Clave buscada: " . $clave;
   echo "<br><br>";
   $p = strpos($cadena, $clave);
   if ($p!="")
    {
     echo "La clave se encuentra en la posición: $p" ;
    }
    else
    {
     echo "No existe la clave en la cadena fuente";
    }
?>
</body>
</html> 