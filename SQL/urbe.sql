-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-03-2022 a las 22:42:15
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `urbe`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `cambiarnota` (IN `pCedula` INT(10), IN `pCodigo` VARCHAR(4), IN `pNota` DECIMAL(5,2))  NO SQL
BEGIN
	DECLARE miidEstudiante int(4);
    DECLARE miidCurso int(4);
    SELECT id INTO miidEstudiante FROM estudiantes WHERE
    cedula = pCedula;
    SELECT id INTO miidCurso FROM cursos WHERE
    codigo = pCodigo;
    IF miidEstudiante IS NOT NULL THEN
    	UPDATE matricula SET nota = pNota 
        WHERE idestudiantes = miidEstudiante 
        AND idcursos = miidCurso;
    	SELECT "exito" AS exito;
    ELSE 
    	SELECT "fallo" AS exito;
    END IF;
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `donante2` (IN `ppeso` DECIMAL(5,2))  BEGIN
   IF pPeso < 50 THEN 
      SELECT 'NO APTO';
   ELSE 
      SELECT 'APTO';
   END IF; 
END$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `inscribir` (IN `pCedula` INT, IN `pIdCursos` INT)  BEGIN
DECLARE miIdEstudiantes INT(10);
   SELECT id INTO miIdEstudiantes FROM estudiantes WHERE cedula=pCedula;
   IF miIdEstudiantes IS NOT NULL THEN
      INSERT INTO matricula (`idestudiantes`, `idcursos`, `nota`)
              VALUES(miIdEstudiantes,pIdCursos,0);
      SELECT 'SI' AS exito;
   ELSE
      SELECT 'NO' AS exito;
   END IF;
END$$

--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `cambiar` (`pfecha` DATE) RETURNS DECIMAL(12,8) BEGIN
	DECLARE variable DECIMAL(12,8);
    
    SELECT valor INTO variable
    	FROM conversion
        WHERE fecha = pfecha;
    IF variable IS NULL THEN
    	SET variable = 0;
    END IF;
    	RETURN variable;
END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `donante` (`pPeso` INT(5.2)) RETURNS VARCHAR(10) CHARSET utf8mb4 BEGIN
   DECLARE mensaje VARCHAR(10);
   IF pPeso < 50 THEN 
      SET mensaje = 'NO APTO';
   ELSE 
      SET mensaje = 'APTO';
   END IF; 
   RETURN mensaje; 
END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `sacar_promedio` (`pIdEstudiante` INT(10)) RETURNS DECIMAL(5,2) NO SQL
BEGIN
	DECLARE promedio decimal(5,2);
	SELECT AVG(nota) INTO promedio FROM matricula WHERE idestudiantes = pIdEstudiante;
    return promedio;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conversion`
--

CREATE TABLE `conversion` (
  `id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `valor` decimal(12,8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `conversion`
--

INSERT INTO `conversion` (`id`, `fecha`, `valor`) VALUES
(1, '2022-03-03', '4.70000000'),
(2, '2022-03-02', '4.80000000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `codigo` varchar(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`id`, `nombre`, `precio`, `codigo`) VALUES
(1, 'CORTE Y COSTURA', '100.00', 'N321'),
(2, 'MANUALIDADES NIVEL BASICO', '75.00', 'N124'),
(3, 'Taller de diseño', '70.00', 'N123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `id` int(11) NOT NULL,
  `cedula` int(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` text NOT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `peso` decimal(5,2) DEFAULT NULL,
  `promedio` decimal(2,1) NOT NULL,
  `deuda` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`id`, `cedula`, `nombre`, `direccion`, `fecha_nacimiento`, `peso`, `promedio`, `deuda`) VALUES
(1, 1234, 'JOSE PEREZ', 'MARACAIBO', '2001-01-01', '110.00', '0.0', 0),
(2, 7890, 'ANA ROJAS', 'CABIMAS', '2006-08-12', '45.00', '0.0', 0),
(3, 6540, 'CARLOS RODRIGUEZ', 'MENE MAUROA', '1995-12-12', '78.00', '0.0', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `id` int(11) NOT NULL,
  `idestudiantes` int(10) NOT NULL,
  `idcursos` int(10) NOT NULL,
  `nota` decimal(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `matricula`
--

INSERT INTO `matricula` (`id`, `idestudiantes`, `idcursos`, `nota`) VALUES
(1, 1, 1, '14.00'),
(3, 2, 2, '17.00'),
(4, 1, 3, '15.20'),
(5, 2, 1, '9.00'),
(6, 2, 3, '3.00'),
(7, 3, 1, '10.00'),
(8, 3, 2, '15.00'),
(9, 3, 3, '14.20'),
(10, 1, 2, '19.20');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `id` int(11) NOT NULL,
  `nombre_articulo` varchar(50) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `costo_divisa` decimal(10,2) DEFAULT NULL,
  `costo_bs` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conversion`
--
ALTER TABLE `conversion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `conversion`
--
ALTER TABLE `conversion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cursos`
--
ALTER TABLE `cursos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `matricula`
--
ALTER TABLE `matricula`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
