<?php
echo '<b>Utilizando list-each con while </b><br>';
$arr = array("uno", "dos", "tres");
reset ($arr);
while (list(, $contenido) = each ($arr)) {
   echo "Valor: $contenido<br>\n";
}

echo '<b><br>Utilizando foreach </b><br>';
foreach ($arr as $contenido) {
   echo "Valor: $contenido<br>\n";
}
?>
