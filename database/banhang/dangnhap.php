<?php
include "connect.php";
$email = $_POST['email'];
$pass = $_POST['pass'];

$query = 'SELECT * FROM `user` WHERE `email` = "'.$email.'" AND `pass` = "'.$pass.'"';
$data = mysqli_query($conn, $query);
$result = array();
while ($row = mysqli_fetch_assoc($data)) {
	$result[] = ($row);
}

if (!empty($result)) {
	$arr = [
		'success' => true,
		'message' => "Thanh Cong",
		'result' => $result
	];
}else{
	$arr = [
		'success' => false,
		'message' => "Khong Thanh Cong",
		'result' => $result
	];
}

print_r(json_encode($arr));
?>