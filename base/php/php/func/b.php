<?php
	$pattern = '/(幢|栋|公寓|号)[a-z|0-9]?(\d|[一二三四五六七八九零壹贰叁肆伍陆柒捌玖])+(室|号)?$/';
	$addrList = [
		['东裕新村31幢210室', 1],
		['银亿海悦花苑13栋407', 1],
		['龙湖冠寓(宁波ONE宁南路店)679', 0],
		['中河假日公寓a101', 1],
		['银杏四季9号801', 1],
		['水岸心境十四幢一零贰', 1],
		['浙江省宁波市慈溪市石桥头北路56号56', 1],
		['建业街建业街198号紫水晶', 0]

	];
	foreach($addrList as $addr){
		$ret = preg_match($pattern, $addr[0], $matches, PREG_OFFSET_CAPTURE);
		if($ret !== $addr[1]) {
			echo $addr[0] . " check error \n";
			print_r($matches);
		}	
	}
	
?>
