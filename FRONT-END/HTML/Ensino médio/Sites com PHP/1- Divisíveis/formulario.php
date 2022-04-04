<?php

$numero = $_GET['numero1']; 

echo "Relatório do número $numero";

if($numero % 2 == 0){
  echo "É divisível por 2";

}else{
	echo "Não é divisível por 2";
}


if($numero % 3 == 0){
  echo "É divisível por 3";

}else{
	echo "Não é divisível por 3";
}

if($numero % 5 == 0){
  echo "É divisível por 5";

}else{

	echo "Não é divisível por 5";
}



 ?>