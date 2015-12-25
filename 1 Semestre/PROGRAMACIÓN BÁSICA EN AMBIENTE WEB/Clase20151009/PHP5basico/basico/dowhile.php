<?php
$i = 3;
$factor = 2;
$acum = 1;
do {

     $acum *= $factor;
     print $acum;
     print "<br>";
     $i--;
 } while($i > 0);
 echo "Valor final de acum es $acum";
?>