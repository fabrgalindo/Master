<HTML>
 <HEAD>
   <TITLE>Conversión automática de tipos</TITLE>
 </HEAD>
 <BODY>
   <CENTER>
     <H2>Conversión de tipos automática</H2>
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
   echo "Ahora la instrucción en una sola linea <br>";
   print( date("M d, Y H:i:s", time()) );
   ?>
   </CENTER>
 </BODY>
</HTML>
