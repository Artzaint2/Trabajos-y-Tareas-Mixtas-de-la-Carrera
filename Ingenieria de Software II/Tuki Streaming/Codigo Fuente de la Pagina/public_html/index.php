<?php
include("./BDD/db.php");
session_start();
if (!isset($_SESSION['usuario'])) {
    header("Location: ./templates/login.php");
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
    <title>Tuki's Home</title>
    <link rel="icon" href="../assets/css/logo/LOGITO-removebg-preview.png">
    <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="./assets/css/mainStyles/style.css">
    <link rel="stylesheet" href="./assets/css/mainStyles/tablet.css"  media="screen and (min-width: 768px)">
    <link rel="stylesheet" href="./assets/css/mainStyles/desktop.css" media="screen and (min-width:1024px)">

    <!-- icons -->
    <script src="https://kit.fontawesome.com/9f748bd1d7.js" crossorigin="anonymous"></script>
</head>
<body>
    <header class="header">
        <a href="#" class="header__logo"><img src="./assets/css/logo/logo.png" alt=""></a>

        <i class='bx bx-menu header__toggle' id="header-toggle"></i>

        <nav class="nav" id="nav-menu">
            <div class="nav__content bd-grid">
                <a href="#" class="nav__perfil">
                    <div class="nav__img">
                        <img src="./assets/css/logo/logo.png" alt="">
                    </div>
                    
                    <div>
                        <span class="nav__name">TUKI</span>
                        <span class="nav__name">STREAM</span>
                    </div>
                </a>

                <div class="nav__menu">
                    <ul class="nav__list">
                        <li class="nav__item"><a href="./index.php" class="nav__link active">Home</a></li>

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


                        <li class="nav__item"><a href="./templates/aboutUs.php" class="nav__link">Acerca de nosotros</a></li>

                        
                        <li class="nav__item"><a href="./templates/contactUs.php" class="nav__link">Contactanos</a></li>

                        <li class="nav__item"><a href="./templates/login.php" class="nav__link">Iniciar Sesion</a></li>
                        
                        <li class="nav__item dropdown">
                            <a href="#" class="nav__link dropdown__link">Usuario <i class='bx bx-chevron-down dropdown__icon'></i></a>
                                

                            <ul class="dropdown__menu">
                            <li class="nav_item">
                                <?php echo utf8_decode($row['usuario']);
                                ?>
                                <li>
                                    <a href="./templates/salir.php">
                                        <i class="nav__link">Salir</i>
                                    </a>
                                </li>
                            </ul>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <main class="mainPage">
        <div class="container">
            <div class="main__content">

                <div class="opacity--cap"></div>
                <div class="banner"></div>
                
                <div class="description margin">
                    <h2 class="description__title">TUKI STREAMING</h2>
                    <p>Streaming sin límites</p>
                    
                    <div class="botton__container">
                        <a href="#" class="btn-neon">
                            <span id="span1"></span>
                            <span id="span2"></span>
                            <span id="span3"></span>
                            <span id="span4"></span>
                            GET STARTED
                        </a>
                    </div>
                </div>
            </div>

        </div>
    </main>

    <footer class="footer">
        <div class="container">
            <div class="footercontent">
      
                <div class="box">
                    <figure class="FooterLogo">
                    <a href="#">
                      <img class="footer__img" src="./assets/css/logo/logo.png" alt="">
                    </a>
                    </figure>
                </div>
      
                <div class="box">
                  <p>Dirección: M9V8+G7F, Troncal6, Maracaibo 4005, Zulia</p>
                  <p>Contactanos<a href="./templates/contactUs.html"> a través de este enlace</a></p>
                </div>
                <div class="box">
                  <h3>SIGUENOS</h3>
                  <div class="red-social">
                    <a href="" class="fa-brands fa-facebook"></a>
                    <a href="" class="fa fa-instagram"></a>
                    <a href="" class="fa fa-twitter"></a>
                    <a href="" class="fa fa-linkedin"></a>
                  </div>
                </div>
            </div>
      
            <div class="footercontainer-2">
              <small>&copy; 2022 <b>TUKI STREAMING</b> - Todos los Derechos Reservados.</small>
            </div>
        </div>
    </footer>

    <script src="./assets/js/index.js"></script>
</body>
</html>