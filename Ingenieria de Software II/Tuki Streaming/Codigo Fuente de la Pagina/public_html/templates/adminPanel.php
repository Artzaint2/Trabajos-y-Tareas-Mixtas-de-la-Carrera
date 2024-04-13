<?php
include("../BDD/db.php");
session_start();
if (!isset($_SESSION['usuario'])) {
    header("Location: index.php");
}

$iduser = $_SESSION['usuario'];

$sql = "SELECT ID, usuario FROM datos WHERE usuario ='$iduser'";
$resultado = $conex->query($sql);
$row = $resultado->fetch_assoc();

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tuki Streaming | Admin Panel</title>
    <link rel="icon" href="../assets/css/logo/LOGITO-removebg-preview.png">
    
    <link rel="stylesheet" href="../assets/css/mainStyles/style.css">
    <link rel="stylesheet" href="../assets/css/mainStyles/tablet.css"  media="screen and (min-width: 768px)">
    <link rel="stylesheet" href="../assets/css/mainStyles/desktop.css" media="screen and (min-width:1024px)">
    <link rel="stylesheet" href="../assets/css/loginStyles/login.css">

    <link rel="stylesheet" href="../assets/css/mainStyles/table.css">
    <!-- icons -->
    <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
    <script src="https://kit.fontawesome.com/9f748bd1d7.js" crossorigin="anonymous"></script>
</head>
<body>

    <header class="header">
        <a href="#" class="header__logo"><img src="../assets/css/logo/logo.png" alt=""></a>

        <i class="bx bx-menu header__toggle" id="header-toggle"></i>

        <nav class="nav" id="nav-menu">
            <div class="nav__content bd-grid">
                <a href="#" class="nav__perfil">
                    <div class="nav__img">
                        <img src="../assets/css/logo/logo.png" alt="">
                    </div>
                    
                    <div>
                        <span class="nav__name">TUKI'S</span>
                        <span class="nav__name">Admin Panel</span>
                    </div>
                </a>

                <div class="nav__menu">
                    <ul class="nav__list">
                        <li class="nav__item"><a href="../index.php" class="nav__link active">Home</a></li>

                        <li class="nav__item dropdown">
                            <a href="#" class="nav__link dropdown__link">Canales Premium <i class='bx bx-chevron-down dropdown__icon'></i></a>
                                

                            <ul class="dropdown__menu">
                                <li class="dropdown__item"><a href="https://www.netflix.com/ve/" class="nav__link">Netflix</a></li>
                                <li class="dropdown__item"><a href="https://www.disneyplus.com/es-ve" class="nav__link">Disney +</a></li>
                                <li class="dropdown__item"><a href="https://play.hbomax.com/" class="nav__link">HBO MAX</a></li>
                            </ul>
                        </li>

                        <li class="nav__item dropdown">
                            <a href="#" class="nav__link dropdown__link">Canales Gratuitos <i class='bx bx-chevron-down dropdown__icon'></i></a>
                                

                            <ul class="dropdown__menu">
                                <li class="dropdown__item"><a href="https://www.youtube.com/" class="nav__link">YouTube</a></li>
                                <li class="dropdown__item"><a href="https://www.twitch.tv/" class="nav__link">Twitch</a></li>
                            </ul>
                        </li>


                        <li class="nav__item"><a href="./aboutUs.php" class="nav__link">Acerca de Nosotros</a></li>

                        <li class="nav__item"><a href="./contactUs.php" class="nav__link">Contactanos!</a></li>
                        
                        <li class="nav__item"><a href="./login.php" class="nav__link">Iniciar Sesion</a></li>

                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <main>
        <div class="container">
            <div class="main__content">
                <table class="table">

                    <thead>
                        <tr>
                            <th>Usuario</th>
                            <th>Email</th>
                            <th>contraseña</th>
                            <th>Cargo</th>
                            <th>Modificar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>

                    <tbody>
                          <?php 
                          $query = "SELECT * FROM datos";
                          $resul_datos = mysqli_query($conex,$query);
                          
                          while ($row = mysqli_fetch_array($resul_datos)){?>
                          <tr>
                              <td><?php echo $row['usuario']?></td>
                              <td><?php echo $row['Email']?></td>
                              <td><?php echo $row['contraseña']?></td>
                              <td><?php echo $row['id_cargo']?></td>
                              <td>
                                  <a href="edit.php?id=<?php echo $row['ID']?>">
                                      Editar
                                  </a>
                              </td>
                              <td>
                                  <a href="delete.php?id=<?php echo $row['ID']?>">
                                      eliminar
                                  </a>
                              </td>
                          </tr>
                          <?php }?>
                    </tbody>

                  </table>
            </div>
        </div>
    </main>

    <script src="../assets/js/index.js"></script>
</body>
</html>