<?php
include("../BDD/db.php");
session_start();
if (isset($_SESSION['usuario'])) {
    header("Location:");
}

?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tuki's Login</title>

    <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="../assets/css/loginStyles/login.css">
    <link rel="stylesheet" href="../assets/css/mainStyles/style.css">
    <link rel="stylesheet" href="../assets/css/mainStyles/tablet.css"  media="screen and (min-width: 768px)">
    <link rel="stylesheet" href="../assets/css/mainStyles/desktop.css" media="screen and (min-width:1024px)">

</head>
<body>

    <header class="header">
        <a href="#" class="header__logo"><img src="../assets/css/logo/logo.png" alt=""></a>

        <i class='bx bx-menu header__toggle' id="header-toggle"></i>

        <nav class="nav" id="nav-menu">
            <div class="nav__content bd-grid">
                <a href="" class="nav__perfil">
                    <div class="nav__img">
                        <img src="../assets/css/logo/logo.png" alt="">
                    </div>
                    
                    <div>
                        <span class="nav__name">TUKI</span>
                        <span class="nav__name">STREAM</span>
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

    <main class="mainLogin">
        <section class="registro form-register" id="login">
            <form action="/templates/validar.php" method="post">
                <h1 class="form__title">Iniciar sesión</h1>
                <input class="controls form__input" type="text" placeholder="Ingrese nombre" name="usuario">
                <input class="controls form__input" type="password" placeholder="Ingresar contraseña" name="contraseña">
                <input class="botons form__button" type="submit" value="Ingresar">
                <p class="form__text"><a href="/templates/create.php" id="linkCreateAccount">No tengo cuenta?</a></p>
            </form>
        </section>
            
        <section class="registro form--hidden" id="createAccount">
            <form action="/newTukiStreaming/BDD/reguistro.php"class="form-register" method="post" id="createAccount">
                <h1 class="form__title">Registro</h1>
                <input class="regis form__input" type="text" name="nombre" placeholder="Nombre Completo">
                <input class="regis form__input" type="email" name="email" placeholder="Ingrese su correo aqui">
                <input class="regis form__input" type="password" name="contraseña" placeholder="Ingresar contraseña">
                <input class="regis form__input" type="password" name="contraseña" placeholder=" Confirmar contraseña">
                <input class="boton-regis form__button" class="regis" type="submit" name="registre">
                <p class="form__text"><a href="#"  id="linkLogin">Acceder</a></p>
            </form>
        </section>    
    </main>

    <script src="../assets/js/index.js"></script>
    <!-- <script src="../assets/js/login.js"></script> -->
</body>
</html>