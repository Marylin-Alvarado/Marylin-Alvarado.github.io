-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 13-08-2022 a las 22:42:56
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `app_citas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pastel_interes`
--

DROP TABLE IF EXISTS `pastel_interes`;
CREATE TABLE IF NOT EXISTS `pastel_interes` (
  `id_pastel` int(3) NOT NULL,
  `nom_pastel` varchar(20) NOT NULL,
  PRIMARY KEY (`id_pastel`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pastel_interes`
--

INSERT INTO `pastel_interes` (`id_pastel`, `nom_pastel`) VALUES
(1, 'Tortas'),
(2, 'Postres'),
(3, 'Galletas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tip_usu`
--

DROP TABLE IF EXISTS `tip_usu`;
CREATE TABLE IF NOT EXISTS `tip_usu` (
  `id_tip_usu` int(11) NOT NULL,
  `nom_tip_usu` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tip_usu`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tip_usu`
--

INSERT INTO `tip_usu` (`id_tip_usu`, `nom_tip_usu`) VALUES
(1, 'Premium'),
(2, 'Estandar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `id_tip_usu` int(11) NOT NULL,
  `interes` int(3) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_tip_usu` (`id_tip_usu`),
  KEY `interes` (`interes`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
