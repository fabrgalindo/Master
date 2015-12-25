<html>
<head>
<title>Ejemplo de if</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body>
<?php
// $nombre= "";
// $nombre= "eva";
$nombre= "UPIICSA";
if ($nombre == ""){
   echo "Tú no tienes definido el nombre";
}
else
if (($nombre=="eva") OR ($nombre=="Eva")) {
   echo "Tu nombre es EVA";
}
else
{
   echo "Tu nombre es " . $nombre; // notar el punto para concatenar

}
?>
</body>
</html>
