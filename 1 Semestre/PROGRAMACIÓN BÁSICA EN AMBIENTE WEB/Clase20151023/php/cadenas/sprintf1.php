<html>
<title> sprintf1.php </title>
<body>
<?php
            $cadena = "76.9 minutos";
            // Transformacion a binario
            $variable = sprintf("binario:%b<Br>",$cadena);
            // Transformaci�n a caracter
            $variable .= sprintf("caracter:%c<Br>", $cadena);
            // Transformaci�n a decimal
            $variable .= sprintf("decimal:%d<Br>", $cadena);
            // Transformaci�n a float
            $variable .= sprintf("flotante:%f<Br>", $cadena);
            // Transformaci�n a octal: ");
            $variable .= sprintf("octal:%o<Br>", $cadena);
            // Transformaci�n a string
            $variable .= sprintf("string:%s<Br>", $cadena);
            // Transformaci�n a hexadecimal (min�scula)
            $variable .= sprintf("hexadecimal:%x<Br>", $cadena);
            // Transformaci�n a hexadecimal (may�scula)
            $variable .= sprintf("hexadecimal(mayuscula):%X<Br>", $cadena);
            echo $variable;
?>
</body>
</html>
