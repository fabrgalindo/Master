<?php
 /* ejemplo 1 */
echo "ejemplo1 <br>";
 for ($i = 1; $i <= 10; $i++) {
     print $i;
     print "   ";
 }
 print "<br>";

 /* ejemplo 2 */
 print "<br>";
 echo "ejemplo2 <br>";
 for ($i = 1; ;$i++) {
     if ($i > 10) {
         break;
     }
     print $i;
     print "   ";
 }

 /* ejemplo 3 */
 print "<br>";
 echo "ejemplo3 <br>";
 $i = 1;
 for (;;) {
     if ($i > 10) {
         break;
     }
     print $i;
     $i++;
     print "   ";
 }

 /* ejemplo 4 */
 print "<br>";
 echo "ejemplo4 (muy compacto)<br>";
 for ($i = 1; $i <= 10; print $i,print "<br>", $i++) ;
?>