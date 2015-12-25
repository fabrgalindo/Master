<html>
<title>  Uso de funciones  </title>
<body>
<?PHP
 /*
 Un arreglo en PHP puede tener elementos en cualquier posición,
 por lo tanto, se puede cargar un arreglo con posiciones no consecutivas,
 sino en forma totalmente aleatoria.
 Para poder recorrer este tipo de vectores se utilizan las funciones next() y prev().
 */
 // Inicializacion del Vector

     $Nombre[10] = "Marcelo";
     $Nombre[20] = "Alicia";
     $Nombre[15] = "Alejandra";
     $Nombre[35] = "Mario";
     $Nombre[12] = "Alberto";

  // Impresion del vector

  reset($Nombre); // El puntero esta al inicio del vector
  echo ("<H2>" . "Arreglo de Nombres");
  echo ("<H3>" . "<Hr>");
  do
    {
     // Buscar Posicion especificada
     $i = key($Nombre); //  key() acepta como parámetro el arreglo y devuelve la posición

     // Buscar Contenido en esa posicion
     $Valor = current($Nombre);
     echo ("Posición: " . $i . " - ");
     echo ("Contenido: " . $Valor);
     echo ("<Br>");
    }
    while (next($Nombre)); // next() avanza el puntero a la posición siguiente,
         //si se ha llegado al final del vector, esta funcion devuelve false
 ?>

 <?php
  end($Nombre); // El puntero esta al inicio del vector
   echo ("<H2>" . "Arreglo  de Nombres, de manera invertida");
   echo ("<H3>" . "<Hr>");
   do
     {
      // Buscar Posicion especificada
      $i = key($Nombre); //  key() acepta como parámetro el arreglo y devuelve la posición

      // Buscar Contenido en esa posicion
      $Valor = current($Nombre);
      echo ("Posición: " . $i . " - ");
      echo ("Contenido: " . $Valor);
      echo ("<Br>");
     }
     while (prev($Nombre)); // next() avanza el puntero a la posición siguiente,
          //si se ha llegado al final del vector, esta funcion devuelve false

 ?>
</body>
</html>


