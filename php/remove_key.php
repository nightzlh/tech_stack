<?php

$map=['1'=>"aaa", '5'=>"bbb"];

print_r($map);

unset($map['5']);

print_r($map);


$map2 = [
	'1' => ['a'=>111, 'b'=>222],
	'5' => ['c'=>333, 'd'=>666]
];

echo count($map2);


if(empty($map['8']['c'])) {
	echo "c is empty";
}

$arr = [[],[]];

if(empty($arr)){
	echo "arr is empty";
}else {
	echo "arr is not empty";
}

?>
