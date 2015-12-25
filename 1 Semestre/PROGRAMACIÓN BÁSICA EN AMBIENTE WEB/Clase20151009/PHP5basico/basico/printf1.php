<?php
$num = 2;
$ubicacion = "calle";
$formato = 'Hay %d arboles en la %s';
printf($formato, $num, $ubicacion);
echo "<br>Con especificadores de string<br>";
$s = 'lapiz';
$t = 'muchos lapices';

printf("[%s]<br>",      $s); // salida de cadena estandard
printf("[%10s]<br>",    $s); // justificacion a la derecha con espacios (se nota solo codigo fuente)
printf("[%-10s]<br>",   $s); // justificacion a la izquierda con espacios (se nota solo codigo fuente)
printf("[%010s]<br>",   $s); // llenado con ceros (tambièn funciona con cadenas)
printf("[%'#10s]<br>",  $s); // uso dell caracer de llenado, definido por el usuario '#'
printf("[%10.10s]<br>", $t); // justificación a la izquierda pero con un corte de 10 characters

?>