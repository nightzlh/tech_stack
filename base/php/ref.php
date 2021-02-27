<?php
function foo(&$var)
{
    $var++;
}
function &bar(&$bVar)
{
     return $bVar;
}
$a = 6;
foo(bar($a));
echo $a;
?>
