<html>
<title>  chr.php  </title>
<body>
<?php
   // La funci�n chr() recibe un valor num�rico y 
   // devuelve el car�cter de la tabla ASCII que le corresponde
   echo "<H3>";
   echo "Imprimir la tabla ASCII desde el c�digo 30 al 222<hr>";
   echo "<Table border=2 align=Center width=100%>";
   $c=33;
   for ($i=1; $i<20; $i++)
    {
     echo "<tr>";
      for ($j=1; $j<=10; $j++)
       {
        echo "<th align=Center>" . $c . "</th>";
        echo "<td align=Center>". chr($c) . "</td>";
        $c++;
       }
     echo "</tr>";
    }
  echo "</Table>" ;
 ?>
</body>
</html> 
