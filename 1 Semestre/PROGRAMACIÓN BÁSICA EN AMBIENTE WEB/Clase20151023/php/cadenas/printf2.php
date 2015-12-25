<html>
<title> Formatos printf </title>
<body>
<?php
            $cadena = "76.9 minutos";
            printf("Resultado en formato binario: ");
            printf("%b", $cadena);
            printf("<Br>");
            printf("Resultado según la tabla ASCII: ");
            printf("%c", $cadena);
            printf("<Br>");
            printf("Resultado en formato decimal: ");
            printf("%d", $cadena);
            printf("<Br>");
            printf("Resultado en formato float: ");
            printf("%f", $cadena);
            printf("<Br>");
            printf("Resultado en formato octal: ");
            printf("%o", $cadena);
            printf("<Br>");
            printf("Resultado en formato string: ");
            printf("%s", $cadena);
            printf("<Br>");
            printf("Resultado en formato hexadecimal (minúscula): ");
            printf("%x", $cadena);
            printf("<Br>");
            printf("Resultado en formato hexadecimal (mayúscula): ");
            printf("%X", $cadena);
?>
</body>
</html>

