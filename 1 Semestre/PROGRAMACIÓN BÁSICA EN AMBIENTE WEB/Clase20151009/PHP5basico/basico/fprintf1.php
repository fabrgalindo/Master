<?php
if (!($fp = fopen('moneda.txt', 'w'))) {
    return;
}

$dinero1 = 68.75;
$dinero2 = 54.35;
$dinero = $dinero1 + $dinero2;
// echo $dinero contiene "123.1";
$len = fprintf($fp, '%01.2f', $dinero); // se escribe "123.10" a moneda.txt

// Usando el valor de regreso de fprintf para determinar cuantos bytes se escribieron
echo "Se escribieron $len bytes a moneda.txt";
?>