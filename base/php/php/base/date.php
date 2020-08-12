<?php
	echo strtotime("2011-12-12 00:00:00");
	$date= date("Y-m-d",strtotime("2011-12-12"));
	echo $date;

	echo '\n';

	/*  $date = '5:00:00';
	$start = "0001-01-01  $date"; 
	$end = "0001-01-01 6:00:00";

	$unixStart = strtotime($start);
	$unixEnd = strtoime($end); */



	$d2 = date('Y-m-d', 1582992001);
	echo $d2;
	
?>
