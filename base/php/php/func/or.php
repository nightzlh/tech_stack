<?php
	//$pattern = '/(\d|一二三四五六七八九零壹贰叁肆伍陆柒捌玖)+(室|号)?$/'; // error use
	$pattern = '/(\d|三|四|五|六|七|八|九|叁|肆|伍|陆|柒|捌|玖|零贰)+(室|号)?$/';
	$addrList = [
		['建业街建业街198号紫水晶', 0],
		['水岸心境十四幢一零贰', 1]

	];
	foreach($addrList as $addr){
		$ret = preg_match($pattern, $addr[0], $matches, PREG_OFFSET_CAPTURE);
		if($ret !== $addr[1]) {
			echo $addr[0] . " check error \n";
			print_r($matches);
		}	
	}
	
?>
