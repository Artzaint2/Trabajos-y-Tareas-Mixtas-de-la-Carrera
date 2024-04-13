<?php
if(isset($_POST['registre'])){
    if(!empty($_POST['nombre']) && !empty($_POST['email']) && !empty($_POST['contraseña'])){
        $nombre=$_POST['nombre'];
        $email=$_POST['email'];
        $pass=$_POST['contraseña'];
        $asunto = "bienbenido a tuki";
        $header = "From: tuki.streaming2022@gmail.com" . "\r\n";
        $header.="Reply-to: tuki.streaming2022@gmail.com" . "\r\n";
        $header.="Tuki:Bienbenido a tuki". "\r\n" . "la pagina de tuki te da la bienvenida";
        $mail= @mail($email,$asunto,$header);
        if ($mail){
             
        }
    }
}

?>
