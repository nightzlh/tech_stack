<?php
	// $date= date("Y-m-d",strtotime("2011-12-12"));

	/*  $date = '5:00:00';
	$start = "0001-01-01  $date"; 
	$end = "0001-01-01 6:00:00";

	$unixStart = strtotime($start);
	$unixEnd = strtoime($end); */

	
	$time = strtotime("5:00:00");

	

	$date = date("H:i:s", $time);
	echo $date;
?>
