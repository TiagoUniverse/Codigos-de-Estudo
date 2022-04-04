<?php

$numero1 = $_GET['numero1']; 
$numero2 = $_GET['numero2']; 
$numero3 = $_GET['numero3']; 
$numero4 = $_GET['numero4']; 
$numero5 = $_GET['numero5']; 

$valor = 0;

 if ($numero1 >100 && $numero1 < 200) {
 	# code...
 //echo "PAPI";

 $valor = $valor + 1;;
 //echo "$valor";
 	}

if ($numero2 >100 && $numero2 < 200) {
 	# code...
 //echo "PAPI";

 $valor = $valor + 1;;
 //echo "$valor";
 	}

if ($numero3 >100 && $numero3 < 200) {
 	# code...

 $valor = $valor + 1;;
// echo "$valor";
 	}

if ($numero4 >100 && $numero4 < 200) {
 	# code...
 
 $valor = $valor + 1;;
 //echo "$valor";
 	}

if ($numero5 >100 && $numero5 < 200) {
 	# code...
 

 $valor = $valor + 1;;
 //echo "$valor";
 	}


if ($valor >= 1) {
	# code...
	echo "Essa análise possui $valor número(s) entre 100 e 200";	
}else {
	# code...
  echo "Poxa, que triste nega!";
  echo "Sem valores entre 100 e 200";
}


 ?>