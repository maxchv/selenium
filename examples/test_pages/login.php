<?php

$user = $_POST['username'];
$pass = $_POST['password'];

if($user == "admin" && $pass == "qwerty") {
	echo "<h1>Wlcome Admin</h1>";
} else {
	header("Location: index.html");
}