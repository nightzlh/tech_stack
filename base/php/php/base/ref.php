<?php
	function update(&$arr) {
		foreach($arr as &$a) {
			++$a;	
		}
	}
	$arr = [1, 2, 3];
	print_r($arr);
	update($arr);
	print_r($arr);
?>
