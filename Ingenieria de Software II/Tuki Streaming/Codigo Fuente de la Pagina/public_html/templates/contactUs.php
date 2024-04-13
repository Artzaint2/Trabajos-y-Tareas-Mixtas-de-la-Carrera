<?php

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tuki Streaming | Contact Us</title>
    
    <link rel="icon" href="../assets/css/logo/LOGITO-removebg-preview.png">
    <link rel="stylesheet" href="../assets/css/mainStyles/style.css">
    <link rel="stylesheet" href="../assets/css/mainStyles/tablet.css" media="screen and (min-width: 768px)">
    <link rel="stylesheet" href="../assets/css/mainStyles/desktop.css" media="screen and (min-width:1024px)">
    
    <link rel="stylesheet" href="../assets/css/contactUsStyles/contactUs.css">
    <!-- icons -->
    <link href='https://cdn.jsdelivr.net/npm/boxicons@2.0.5/css/boxicons.min.css' rel='stylesheet'>
    <script src="https://kit.fontawesome.com/9f748bd1d7.js" crossorigin="anonymous"></script>
</head>
<body>
    <header class="header">
        <a href="#" class="header__logo"><img src="../assets/css/logo/logo.png" alt=""></a>

        <i class='bx bx-menu header__toggle' id="header-toggle"></i>

        <nav class="nav" id="nav-menu">
            <div class="nav__content bd-grid">
                <a href="#" class="nav__perfil">
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

    <main class="mainContact">
        <div class="container">
            <div class="mainContact__content mainContact__content--grid ">

                <div class="contactInfo">
                    <h2>Contact Us</h2>
                    <p>Si posee algún inconveniente con la página web y sus funciones. Comuniquese al número de teléfono dictado en la parte inferior de este mensaje y reportarlo a nuestro equipo de Soporte Tecnico, el cual le contestara en menos de 24h y con mucha dedicación solventaremos dicho problema lo más pronto posible.</p>
                    <p>¿Desea trabajar en Tuki Streaming? ¡Envia tu CV a nuestro correo electronico!</p>

                    <div class="contactInfo__socialmedia">
                        <section class="contactInfo__socialmedia--flex">
                            <a href="#" class="fa-solid fa-phone"></a>
                            <div>
                                <p>Llamadas al:</p>
                                <span>+58 414 656 8168</span>
                            </div>
                        </section>
                        <section class="contactInfo__socialmedia--flex">
                            <a href="#" class="fa-solid fa-envelope"></a>
                            <div>
                                <p>Correo Electronico</p>
                                <span>tuki.streaming2022@gmail.com</span>
                            </div>
                        </section>

                        <hr>
                        <section class="contactInfo__socialmedia--flex">
                            <h5>Más información en: </h5>
                            <a href="#" class="fa-brands fa-facebook"></a>
                            <a href="#" class="fa-brands fa-twitter"></a>
                            <a href="#" class="fa-brands fa-instagram"></a>
                        </section>

                    </div>
                </div>
    
                <div class="googleMaps">
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3920.5265053817875!2d-71.63652584931786!3d10.693813063599142!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e899ecd22a1b721%3A0xd2cfab5751fcd5cc!2sUniversidad%20Privada%20Dr.%20Rafael%20Belloso%20Chac%C3%ADn!5e0!3m2!1ses!2sve!4v1658496369660!5m2!1ses!2sve" width="280" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
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
                      <img class="footer__img" src="../assets/css/logo/logo.png" alt="">
                    </a>
                    </figure>
                </div>
      
                <div class="box">
                    <p>Dirección: M9V8+G7F, Troncal6, Maracaibo 4005, Zulia</p>
                    <p>Contactanos<a href="./contactUs.html"> a través de este enlace</a></p>
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

    <script src="../assets/js/index.js"></script>
</body>
</html>