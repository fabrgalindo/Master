 <?php
 /* bucle while */
  echo '<br>Ejemplo21 <br>';
  $i = 1;
  while ($i <= 10) {
      print $i++;  /* el valor impreso sería;a
                      $i antes del incremento
                      (post-incremento) */
     print " ";
  }
  print"<br>";

  /* ejemplo 2 */
  echo '<br>Ejemplo 2 <br>';
  $i = 1;
  while ($i <= 10):
      print $i;
      $i++;
       print " ";
  endwhile;
  print "<br>";
?>