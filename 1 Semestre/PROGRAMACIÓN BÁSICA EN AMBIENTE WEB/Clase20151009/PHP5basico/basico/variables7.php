<HTML>
 <HEAD>
   <TITLE>Casting de tipos</TITLE>
 </HEAD>
 <BODY>
   <CENTER>
     <H2>Conversión de tipos por <I>casting</I></H2>
     <?php
       $cadena="3.1416 es el valor de Pi";
       echo "El valor de \$cadena es: <B> $cadena </B><BR><BR>";
       $aux=(integer)$cadena;
       echo "El resultado de convertirla en entero es: $aux <BR>";
       $aux=(double)$cadena;
       echo "El resultado de convertirla en doble es: $aux <BR>";
     ?>
   </CENTER>
 </BODY>
</HTML>
