<html>
<title> Uso de arreglos, con indice caracter  </title>
<body>
<?Php
  // Inicializacion del Vector
  $Ciudad = array("Par" => "Paris",
                            "Lon" => "Londres",
                            "Ate" => "Atenas",
                            "Ber" => "Berlin",
                            "Lim" => "Lima");

  echo "<H2>"."Arreglo de Ciudades";
  echo "<H3>"."<Hr>";
  while (list($i,$Valor)=each($Ciudad))
   {
     echo "Posición: " . $i . " - ";
     echo "Contenido: " . $Valor;
     echo "<Br>";
    }
 ?>
</body>
</html>
