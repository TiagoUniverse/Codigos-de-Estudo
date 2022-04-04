<?php

/*$numero1 = $_GET['num1'];
$nome = $_GET['nu2']; 
$nome = $_GET['nu3']; 
$nome = $_GET['nu4']; 
$nome = $_GET['nu5'];  
$nome = $_GET['nu6']; 
$nome = $_GET['nu7']; 
$nome = $_GET['nu8']; 
$nome = $_GET['nu9']; 

$nome = $_GET['nu10']; 
$nome = $_GET['num11']; 
$nome = $_GET['num12']; 
$nome = $_GET['num13']; 
$nome = $_GET['num14']; 
$nome = $_GET['num15']; 
*/


$arr[1]= $_GET["num1"]; 
$arr[2]= $_GET["nu2"];
$arr[3]= $_GET["nu3"];
$arr[4]= $_GET["nu4"];
$arr[5]= $_GET["nu5"];
$arr[6]= $_GET["nu6"];
$arr[7]= $_GET["nu7"];
$arr[8]= $_GET["nu8"];
$arr[9]= $_GET["nu9"];
$arr[10]= $_GET["nu10"];
$arr[11]= $_GET["nu11"];
$arr[12]= $_GET["nu12"];
$arr[13]= $_GET["nu13"];
$arr[14]= $_GET["nu14"];
$arr[15]= $_GET["nu15"];

$var = 0;

 echo "Relatório <br><br>";


for($var = 1; $var < 16 ; $var ++){
if ($arr[$var] % 2 == 0){
	echo "Num par <br><br>";
}else{
	echo "Num impar <br><br>";
}

}



 ?>