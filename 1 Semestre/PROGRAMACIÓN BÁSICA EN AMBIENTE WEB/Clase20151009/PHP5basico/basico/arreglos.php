<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body>
<h2>
Manejeando un arreglo predefinido<br>
</h2>

<?php

$ciudad = array("París", "Roma", "Sevilla", "Londres");

//contamos el número de elementos de la tabla

$numelentos = count($ciudad);

//imprimimos todos los elementos de la tabla

for ($i=0; $i < $numelentos; $i++)

{

print ("La ciudad $i es $ciudad[$i] <BR>\n");

}

?>
<h2>
Ahora con un segundo arreglo <br>
</h2>

<?php
$miarreglo[0] = 1;

$miarreglo[1] = "hola!!";

$miarreglo[] = 3;

echo $miarreglo[2];  // 3

//imprimimos todos los elementos de la tabla
echo '<br>Imprimiendo todo el arreglo: <br>';
$cuantos = count($miarreglo);
for ($i=0; $i < $cuantos; $i++)
{
print ("El arreglo $i contiene $miarreglo[$i] <BR>\n");
}

?>

</body>
</html>
