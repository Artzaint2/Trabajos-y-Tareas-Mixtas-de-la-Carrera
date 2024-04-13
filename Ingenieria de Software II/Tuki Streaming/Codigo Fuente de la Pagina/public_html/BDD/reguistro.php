<?php

include("db.php");

if(isset($_POST['registre'])){ 
    
    if(strlen($_POST['nombre'])>= 1 && strlen($_POST['contraseña'])>= 1 ) {
        $name = trim($_POST['nombre']);
        $contraseña = trim($_POST['contraseña']);
        
        $email = trim($_POST['email']);
        $cargo = 2;
        $consulta = "INSERT INTO datos(usuario, contraseña,Email,id_cargo) VALUES ('$name','$contraseña','$email', '$cargo')";
        $resultado = mysqli_query($conex,$consulta);
        if($resultado){
            ?>
            <?php
            include("../templates/create.php");
            ?>
             echo "<script>
        alert ('Te registraste correctamente');
        window.location='../templates/create.php';
        </script>
            <?php
            
        } else{
            ?>
            echo "<script>
        alert ('ocurrio un error');
        window.location='../templates/create.php';
        </script>
            <?php

        }
    } else {
        ?>
        echo "<script>
        alert ('Rellene los campos');
        window.location='../templates/create.php';
        </script>
        <?php
    }
}

?>