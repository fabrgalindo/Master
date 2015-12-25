<html>
<title>  strcmp.php  </title>
<body>
<?php
/*
 * Compara dos string (cadenas).
 * Ejemplo: 
 *   strcmp(<string1>,<string2>)
 *   Regresa cero si las dos cadenas son exactamente iguales.
 *   Regresa mayor a cero si <string1> es mayor alfabéticamente.
 *   Regresa menor a cero en caso contrario
 */
   $cadena1="lopez";
   $cadena2="cervantes";
   if (strcmp($cadena1,$cadena2)>0)
   {
     echo $cadena1." es mayor alfabéticamente que ".$cadena2."<br><br>";
   }
 ?>
 <?php
 /*
  * De igual forma es permitido utilizar el operador ==
  */
   if ($cadena1=="lopez")
   {
      echo 'La variable $cadena1 almacena la cadena lopez';
   }
 ?>
</body>
</html>