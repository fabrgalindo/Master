<html>
<title>  NumberFormat.php  </title>
<body>
<?php
   /*
    * 
    * number_format(variable Numerica, 
    * Cantidad De Decimales, 
    * “Separador de decimales”, 
    * “Separador de Miles”) ;
    */
   echo "<H3>";
   $valor = 8546921546.4875;
   echo "El valor corresponde a: ";
   echo number_format($valor,2,".",",");
?>
</body>
</html>