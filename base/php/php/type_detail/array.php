<?php

function example_1() {
	$arr = [];
	// throw error
	// var_dump($arr['a']['b']);
}

function example_2() {
	$arr = [];
	$arr['a']['b'] = 5;
	echo $arr['a']['b'];	// print 5
}

function example_3() {
	$arr = [];
	if(empty($arr['a']['b'])) {
		echo "is empty";		// enter this branch
	} else {
		echo "is not empty";
	}

}

// example_3();

function example_4(){
	$arr = [];
	$type = gettype($arr['a']['b']); 	// thow error
	echo $type;
}

example_4();


function example_5() {
	$arr = [];
	if(is_null($arr['a']['b'])){ 	// throw error
		echo "is_null";
	}else {
		echo "is not null";
	}
	
}

//example_5();

function example_6() {
	$arr = [];
	if(is_null($arr['a'])) { // throw error
		echo "is_null";
	} else{
		echo "is not null";
	}
}

example_6();

?>
