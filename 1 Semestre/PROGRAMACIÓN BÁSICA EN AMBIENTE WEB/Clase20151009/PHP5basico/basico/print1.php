<HTML>
 <HEAD>
   <TITLE>Conversi�n autom�tica de tipos</TITLE>
 </HEAD>
 <BODY>
   <CENTER>
     <H2>Conversi�n de tipos autom�tica</H2>
   <?php
        date_default_timezone_set('America/Mexico_City');
   ?>
   <?php

 print (
        date( "M d, Y H:i:s",
               time()
            )
      )
;

   ?>
   <br>
   <br>
   <?php
   echo "Ahora la instrucci�n en una sola linea <br>";
   print( date("M d, Y H:i:s", time()) );
   ?>
   </CENTER>
 </BODY>
</HTML>
