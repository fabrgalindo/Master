<?php
echo "Hola Mundo <br>";

echo "Este texto se extiende
por varias lineas. Los saltos de linea
tambien se envian <br>";

echo "Para escapar caracteres, se debe indicar \"de esta forma\".<br>";

// Se pueden usar variables dentro de una sentencia echo
$saludo = "que tal";
$despedida = "hasta luego";

echo "hola, $saludo <br>"; // hola, que tal

// Tambien se pueden usar arrays
$cadena = array("valor" => "saludo desde un array");

echo "Esto es un {$cadena['valor']} <br>"; // Esto es un saludo desde un array

// Si se emplean comillas simples, se muestra el nombre de la variable, no su valor
echo 'hola, $saludo <br>'; // hola, $saludo

// Si no se anade ningun caracter, tambien es posible emplear echo para mostrar el valor de las variables
echo $saludo;            // que tal
echo $saludo,$despedida;  // que tal hasta luego

// El uso de echo con multiples parametros es igual que realizar una concatenacion
echo 'Esta ', 'cadena ', 'esta ', 'construida ', 'con muchos parametros. <br>', chr(13);
echo 'Esta ' . 'cadena ' . 'esta ' . 'construida ' . 'empleando concatenacion.' . "\n";


?>