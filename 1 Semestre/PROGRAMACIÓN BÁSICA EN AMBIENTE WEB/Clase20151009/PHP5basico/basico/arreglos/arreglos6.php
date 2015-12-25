<Html>
<Title>  Uso de list y each  </Title>
<Body>
<?Php
  // Inicializacion del Arreglo

     $Nombre[100] = "Javier";
     $Nombre[200] = "Cintia";
     $Nombre[150] = "Ricardo";
     $Nombre[350] = "Raúl";
     $Nombre[120] = "Guillermo";

  // Impresion del vector

  reset($Nombre);

  echo "<H2>"."Arreglo de Nombres";
  echo "<H3>"."<Hr>";
  while (list($i,$Valor)=each($Nombre))
   {
     echo "Indice: " . $i . " - ";
     echo "Nombre: " . $Valor;
     echo "<Br>";
    }
 ?>
</Body>
</Html>

