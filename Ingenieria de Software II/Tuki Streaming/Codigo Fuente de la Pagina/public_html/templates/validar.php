<?php

$usuario=$_POST['usuario'];
$contraseña=$_POST['contraseña'];

session_start();


$_SESSION['usuario']=$usuario;

include('../BDD/db.php');

$consulta="SELECT*FROM datos where usuario='$usuario' and contraseña='$contraseña'";


$resultado=mysqli_query($conex, $consulta);

$filas=mysqli_fetch_array($resultado);

if($filas['id_cargo']==1){
    header("location:../templates/adminPanel.php");
}else {
    
}
if($filas['id_cargo']==2){
    header("location:../index.php");

}   else{
        ?>
 echo "<script>
        alert ('Error de Autenticación');
        window.location='login.php';
        </script>
    <?php
    include("login.php");
    
    ?>
  
<?php
}
mysqli_free_result($resultado);
mysqli_close($conex);



