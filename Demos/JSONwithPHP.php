<?php
$json = '{"Item1":"Hello",
        "Item2":["Hello","Namaste"],
        "Item3":{"I1":"World !"}}';

$obj = json_decode($json);
print"{$obj->Item1}"."World<br />";
print"{$obj->Item2[1]} &nbsp:{$obj->Item3->I1}"; // Picking from array "mamease" and Item object vaue l1

/*
$obj->Item2[0]="Bonjour";
print"<br />";
print "{$obj->Item2[0]}" . " " . "{$obj->Item3->I1}";
*/

?>