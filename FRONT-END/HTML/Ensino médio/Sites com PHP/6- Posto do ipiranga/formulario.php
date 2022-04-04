<?php

$nome = $_GET['nome']; 
$email = $_GET['email']; 
$sexo = $_GET['sexo']; 
$idade = $_GET['idade']; 
$tel = $_GET['tel']; 
$end = $_GET['end']; 
$comb = $_GET['comb'];
$preco = $_GET['preco'];


   echo "Relatório";

   
   echo "Empresa: $nome <br><br>";
   echo "*Informações da empresa:<br><br><br>";
   echo "Email: $email <br><br>";
   echo "Sexo: $sexo <br><br>";
   echo "Idade: $idade <br><br>";
   echo "Telefone: $tel  <br><br>";
   echo "Endereço: $end <br><br>";


   echo "*Combustível: <br><br><br>";
   echo "Tipo: $comb <br><br>";
   echo "Preço: $preco <br> <br>";

 ?>