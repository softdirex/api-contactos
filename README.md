# Api-contactos
Api con crud de contactos desarrollada con ● Java/Spring ● JPA ● Base de datos MySQL y Derby

## Recomendaciones generales

1. Tener instalado el plugin Spring Tools 4 en Eclipse
2.	En el desarrollo de esta prueba se trabajó con el IDE Eclipse versión 2018-09 (4.9.0)
3.	Se debe tener instalada la CLI de angular para las pruebas del front-end
4.	Verifique la correcta configuración de los puertos
5.	Para abrir el proyecto de java, seleccione la carpeta ws-contactos en su workspace.
6.	Crear una cuenta de usuario en su base de datos MySql con el nombre: contactos_user y la clave qwerty123 asignándole los permisos necesarios para guardar y modificar valores en la base de datos
7.	Importar la base de datos contactos_db con el script sql del item [Base de datos](https://github.com/softdirex/api-contactos#base-de-datos)


## Descarga e importación en Eclipse

- Descarga desde este repositorio como archivo zip

- Abra eclipse y en el menú superior seleccione Abrir proyecto desde archivo… 

- Seleccione dentro del directorio del proyecto descargado la carpeta ws-contactos y haga clic en Finalizar

## Base de datos
- Debe cerciorarse de que la base de datos MySql está levantada en el puerto 3306 asigbe un usuario con el nombre: `contactos_user` y la clave: `qwerty123`

- Importe la base de datos con el siguiente sql de prueba:
```
-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 20-12-2018 a las 01:55:56
-- Versión del servidor: 5.7.21
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `contactos_db`
--
CREATE DATABASE IF NOT EXISTS `contactos_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `contactos_db`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contacto`
--

DROP TABLE IF EXISTS `contacto`;
CREATE TABLE IF NOT EXISTS `contacto` (
  `email` varchar(225) COLLATE utf8_spanish_ci NOT NULL,
  `name` varchar(225) COLLATE utf8_spanish_ci NOT NULL,
  `phone` varchar(225) COLLATE utf8_spanish_ci NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `contacto`
--

INSERT INTO `contacto` (`email`, `name`, `phone`, `id`) VALUES
('user@gmail.com', 'user', '+5690909090', 1),
('admin@gmail.com', 'admin', '+56989898989', 2),
('test@gmail.com', 'test', '+56970707070', 3),
('jorge@gmail.com', 'jorge', '+56950505050', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(5);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
```



## Run configurations
-	En la pestaña `Spring Boot`,asígnele un nuevo nombre a la configuración,(Ejemplo: `ws-contactos - WsContactosApplication`)  seleccione el proyecto `ws-contactos`, seleccione como Main Class a la clase `com.test.contactos.WsContactosApplication` y si el perfil está en blanco asígnele el valor: `uat`.

- Ejecute el proyecto presionando el botón `Run`.
