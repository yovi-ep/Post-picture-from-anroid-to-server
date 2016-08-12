<?php

if(isset($_POST['name']) && isset($_POST['image'])){
	$name = $_POST["name"];
	$image = $_POST["image"];
	
	$decodedImage = base64_decode("$image");
	file_put_contents("pictures/".$nama.".JPG", $decodedImage);
}
?>
