<?php
	$pattern = '(((([(0-9)|(a-z)|(A-Z)|一|二|三|四|五|六|七|八|九|零|壹|贰|叁|肆|伍|陆|柒|捌|玖]+)(幢|栋|寓|号|号楼|楼|座|排|弄|棟|幅|坐|座|期|撞|区|懂|室|～|#|-|－|—|/ |/|_)){1,2})(([(0-9)|(a-z)|(A-Z)|一|二|三|四|五|六|七|八|九|零|壹|贰|叁|肆|伍|陆|柒|捌|玖]+)?))';


	$addr = "壹品君园10栋";

	$pattern2 = "((0|1|2|3|4|5|6|7|8|9|壹)+)";
	preg_match($pattern2, $addr, $matches, PREG_OFFSET_CAPTURE);
	print_r($matches);
	


	echo $addr . "\n";
	$ret = preg_match($pattern, $addr, $matches, PREG_OFFSET_CAPTURE);
	print_r($matches);

	echo substr($addr, 0, 3) . "\n";
	echo substr($addr, 0, 5) . "\n";
	

	echo $matches[0][0] . "\n";
	
	
	
?>
