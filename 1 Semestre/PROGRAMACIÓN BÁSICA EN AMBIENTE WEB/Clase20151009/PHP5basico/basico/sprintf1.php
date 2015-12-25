<?php
$dinero1 = 68.75;
$dinero2 = 54.35;
$dinero = $dinero1 + $dinero2;
echo $money;  //imprimira "123.1";
$formateado = sprintf("%06.2f", $dinero);
echo $formateado; // imprimira "123.10"
?>