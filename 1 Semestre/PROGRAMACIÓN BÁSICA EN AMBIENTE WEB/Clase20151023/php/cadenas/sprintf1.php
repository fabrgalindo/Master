<html>
<title> sprintf1.php </title>
<body>
<?php
            $cadena = "76.9 minutos";
            // Transformacion a binario
            $variable = sprintf("binario:%b<Br>",$cadena);
            // Transformación a caracter
            $variable .= sprintf("caracter:%c<Br>", $cadena);
            // Transformación a decimal
            $variable .= sprintf("decimal:%d<Br>", $cadena);
            // Transformación a float
            $variable .= sprintf("flotante:%f<Br>", $cadena);
            // Transformación a octal: ");
            $variable .= sprintf("octal:%o<Br>", $cadena);
            // Transformación a string
            $variable .= sprintf("string:%s<Br>", $cadena);
            // Transformación a hexadecimal (minúscula)
            $variable .= sprintf("hexadecimal:%x<Br>", $cadena);
            // Transformación a hexadecimal (mayúscula)
            $variable .= sprintf("hexadecimal(mayuscula):%X<Br>", $cadena);
            echo $variable;
?>
</body>
</html>
