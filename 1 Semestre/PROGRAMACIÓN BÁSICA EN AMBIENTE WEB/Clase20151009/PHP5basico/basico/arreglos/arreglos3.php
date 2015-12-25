<html>
<title>  Inicialización de arreglos  </title>
<body>

<?php
// Inicializacion de arreglos


// En este caso se observa que no es necesario colocar el número de índice,
// ya que PHP lo asigna automáticamente para cada valor,
// comenzando siempre desde cero.

    $Pais[] = "Mexico";
    $Pais[] = "Usa";
    $Pais[] = "Canada";
    $Pais[] = "Belice";

  echo ($Pais[0] . "<Br>");
  echo ($Pais[1]."<Br>");
  echo ($Pais[2]."<Br>");
  echo ($Pais[3]."<Br>");


/*
Otra forma de inicializar un vector, es a través del constructor array,
como se muestra en el siguiente ejemplo:
*/



$OtroPais =array("Argentina","Uruguay","Brasil","Chile");

  echo ($OtroPais[0] . "<Br>");
  echo ($OtroPais[1]."<Br>");
  echo ($OtroPais[2]."<Br>");
  echo ($OtroPais[3]."<Br>");


/*
 También  se puede definir un arreglo asociando explícitamente el índice
 a un valor, como se indica a continuación:
*/

    $Frutas = array(0 => "Manzana",
                              1 => "Naranja",
                              2 => "Pera",
                              3 => "Mandarina");
  echo ($Frutas[0] . "<Br>");
  echo ($Frutas[1]."<Br>");
  echo ($Frutas[2]."<Br>");
  echo ($Frutas[3]."<Br>");

?>

</body>



