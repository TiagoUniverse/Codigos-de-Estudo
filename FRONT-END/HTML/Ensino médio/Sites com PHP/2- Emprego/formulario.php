<?php

$nome = $_GET['nome']; 
$sexo = $_GET['sexo']; 
$idade = $_GET['idade']; 


if($sexo == "f" || $sexo == "F"){

	if($idade < 25){
		echo "Bem vindo à empresa. ";
	}
	if ($idade < 15) {
		echo "Tem certeza? Não parece certo...";
	}{

	}
} else{
	echo "Lamento, não é o perfil que procuramos.";
}
?>