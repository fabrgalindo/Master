<?php
// date_default_timezone_set('America/Los_Angeles');
date_default_timezone_set('America/Mexico_City');
$hoy = getdate();
echo 'Imprimiendo fecha sin formaterar <br>';
print_r($hoy);
echo '<br>';
echo 'Imprimiendo fecha formateada <br>';
$hoy = date("d/m/y h:m:s");
print_r($hoy);
?>