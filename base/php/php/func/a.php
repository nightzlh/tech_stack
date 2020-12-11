<?php
	$pattern = '/(\d|一|二|三|四|五|六|七|八|九|零|壹|贰|叁|肆|伍|陆|柒|捌|玖)+(室|号)?$/';
	$addrList = [
		//['东裕新村31幢210室', 1],
		['浙江省宁波市慈溪市石桥头北路56号56一', 1],
		['建业街建业街198号紫水晶', 0]
		//['建业街建业街198号紫水晶号', 1]

	];
	$ret = preg_match($pattern, $addrList[0][0], $matches, PREG_OFFSET_CAPTURE);
	echo $addrList[0][0] . "\n";
	echo $ret . "\n";
	print_r($matches);

	
	$ret = preg_match($pattern, $addrList[1][0], $matches, PREG_OFFSET_CAPTURE);
	echo $addrList[1][0] . "\n";
	echo $ret . "\n";
	print_r($matches);
	
?>
