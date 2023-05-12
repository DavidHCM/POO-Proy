-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: sql9.freesqldatabase.com    Database: sql9616110
-- ------------------------------------------------------
-- Server version	5.5.62-0ubuntu0.14.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `articulos`
--

DROP TABLE IF EXISTS `articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articulos` (
  `idArticulos` int(11) NOT NULL,
  `nombre_Articulo` varchar(45) NOT NULL,
  `tipo_Articulo` varchar(45) NOT NULL,
  `precio` double(10,2) NOT NULL,
  `fechaExpiracion` date NOT NULL,
  PRIMARY KEY (`idArticulos`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulos`
--

LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
INSERT INTO `articulos` VALUES (0,'manzanas','COMIDA',10.99,'1999-10-10');
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categorias_tabla`
--

DROP TABLE IF EXISTS `categorias_tabla`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categorias_tabla` (
  `idCategoria` int(11) NOT NULL AUTO_INCREMENT,
  `descrip_Categoria` varchar(250) NOT NULL,
  `estado_Categoria` int(1) NOT NULL,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categorias_tabla`
--

LOCK TABLES `categorias_tabla` WRITE;
/*!40000 ALTER TABLE `categorias_tabla` DISABLE KEYS */;
INSERT INTO `categorias_tabla` VALUES (1,'Ropa',1),(2,'Dados',1),(3,'Carros',1),(8,'Shorts',1),(10,'Camisetas',1),(11,'Electronicos',1),(12,'Tenis',1),(13,'Frutas',1),(14,'Verduras',1),(15,'Sueter',1);
/*!40000 ALTER TABLE `categorias_tabla` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_tablas`
--

DROP TABLE IF EXISTS `cliente_tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_tablas` (
  `idClient` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_Client` varchar(30) NOT NULL,
  `apellido_Client` varchar(30) NOT NULL,
  `name_ClientC` varchar(15) NOT NULL,
  `contacto_Client` varchar(15) NOT NULL,
  `direccion_Client` varchar(150) NOT NULL,
  `estado_Client` int(1) NOT NULL,
  PRIMARY KEY (`idClient`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_tablas`
--

LOCK TABLES `cliente_tablas` WRITE;
/*!40000 ALTER TABLE `cliente_tablas` DISABLE KEYS */;
INSERT INTO `cliente_tablas` VALUES (1,'David','Hernandez','7427','3334762488','Periferico sur',1),(6,'Pruebas','Intento ','0','3326154847','ITESO',1);
/*!40000 ALTER TABLE `cliente_tablas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos_tablas`
--

DROP TABLE IF EXISTS `productos_tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos_tablas` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_Producto` varchar(100) NOT NULL,
  `cantidad_Producto` int(11) NOT NULL,
  `precio_Producto` double(10,2) NOT NULL,
  `descripcion_Producto` varchar(200) NOT NULL,
  `IVAporce_Producto` int(2) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `estado_Producto` int(1) NOT NULL,
  PRIMARY KEY (`idProducto`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos_tablas`
--

LOCK TABLES `productos_tablas` WRITE;
/*!40000 ALTER TABLE `productos_tablas` DISABLE KEYS */;
INSERT INTO `productos_tablas` VALUES (1,'mouse logitech',0,500.50,'mouse logitech',16,11,1),(2,'Nike flyease',2,999.99,'tenis blancos nike flyease',0,12,1),(5,'Manzanas',4,20.50,'manzanas rojas',16,13,1),(7,'Zanahoria',22,7.99,'zanahoria naranja',16,14,1),(8,'Teclado Razer',27,1799.99,'teclado negro razer',16,11,1);
/*!40000 ALTER TABLE `productos_tablas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_tablas`
--

DROP TABLE IF EXISTS `usuarios_tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_tablas` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_User` varchar(30) NOT NULL,
  `apellido_User` varchar(30) NOT NULL,
  `name_User` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `contacto_User` varchar(15) NOT NULL,
  `estado_User` int(1) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_tablas`
--

LOCK TABLES `usuarios_tablas` WRITE;
/*!40000 ALTER TABLE `usuarios_tablas` DISABLE KEYS */;
INSERT INTO `usuarios_tablas` VALUES (1,'David','Hernandez','davidhernandez','123456789','3334762487',1),(2,'Test','1','testing','123','0',1),(4,'Carlos','Camachoo','carloscamacho','12345','3316031765',1),(8,'Paco','Andreade','paco','123','3336152648',1);
/*!40000 ALTER TABLE `usuarios_tablas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventasInfor_tablas`
--

DROP TABLE IF EXISTS `ventasInfor_tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventasInfor_tablas` (
  `idInforVentas` int(11) NOT NULL AUTO_INCREMENT,
  `idMainVentas` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `Nombre_Venta` varchar(45) NOT NULL,
  `precio_Unitario` double(10,2) NOT NULL,
  `precio_Subtotal` double(10,2) NOT NULL,
  `precio_IVA` double(10,2) NOT NULL,
  `precio_TotalPagar` double(10,2) NOT NULL,
  `estado_Venta` int(1) NOT NULL,
  PRIMARY KEY (`idInforVentas`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventasInfor_tablas`
--

LOCK TABLES `ventasInfor_tablas` WRITE;
/*!40000 ALTER TABLE `ventasInfor_tablas` DISABLE KEYS */;
INSERT INTO `ventasInfor_tablas` VALUES (1,4,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(2,5,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(3,6,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(4,7,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(5,8,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(6,9,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(7,10,5,10,'Manzanas',20.50,205.00,28.70,233.70,1),(8,11,5,5,'Manzanas',20.50,102.50,14.35,116.85,1),(9,12,5,1,'Manzanas',20.50,20.50,2.87,23.37,1),(10,13,2,3,'Nike flyease',999.99,2999.97,0.00,2999.97,1),(11,14,1,5,'mouse logitech',500.50,2502.50,350.35,2852.85,1),(12,15,7,2,'Zanahoria',7.99,15.98,2.24,18.22,1),(13,16,0,0,'',0.00,0.00,0.00,0.00,1),(14,17,8,1,'Teclado Razer',1799.99,1799.99,252.00,2051.99,1),(15,18,8,4,'Teclado Razer',1799.99,7199.96,1007.99,8207.95,1),(16,19,8,5,'Teclado Razer',1799.99,8999.95,1259.99,10259.94,1),(17,20,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(18,21,8,1,'Teclado Razer',1799.99,1799.99,252.00,2051.99,1),(19,22,8,5,'Teclado Razer',1799.99,8999.95,1259.99,10259.94,1),(20,23,2,2,'Nike flyease',999.99,1999.98,0.00,1999.98,1),(21,23,1,1,'mouse logitech',500.50,500.50,70.07,570.57,1),(22,23,7,1,'Zanahoria',7.99,7.99,1.12,9.11,1),(23,24,1,2,'mouse logitech',500.50,1001.00,140.14,1141.14,1),(24,25,8,2,'Teclado Razer',1799.99,3599.98,504.00,4103.98,1);
/*!40000 ALTER TABLE `ventasInfor_tablas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas_tablas`
--

DROP TABLE IF EXISTS `ventas_tablas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas_tablas` (
  `idMainVentas` int(11) NOT NULL AUTO_INCREMENT,
  `idClient` int(11) NOT NULL,
  `aPagar` double(10,2) NOT NULL,
  `date_Venta` date NOT NULL,
  `estado_Venta` int(1) NOT NULL,
  PRIMARY KEY (`idMainVentas`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas_tablas`
--

LOCK TABLES `ventas_tablas` WRITE;
/*!40000 ALTER TABLE `ventas_tablas` DISABLE KEYS */;
INSERT INTO `ventas_tablas` VALUES (1,7427,2852.85,'2023-05-10',1),(2,7427,570.57,'2023-05-10',1),(3,7427,570.57,'2023-05-10',1),(4,7427,570.57,'2023-05-10',1),(5,7427,570.57,'2023-05-10',1),(6,7427,570.57,'2023-05-10',1),(7,7427,570.57,'2023-05-10',1),(8,7427,570.57,'2023-05-10',1),(9,7427,570.57,'2023-05-10',1),(10,7427,233.70,'2023-05-10',1),(11,7427,116.85,'2023-05-10',1),(12,7427,23.37,'2023-05-10',1),(13,7427,2999.97,'2023-05-10',1),(14,7427,2852.85,'2023-05-10',1),(15,0,18.22,'2023-05-10',1),(16,0,4103.98,'2023-05-10',1),(17,0,2051.99,'2023-05-10',1),(18,0,8207.95,'2023-05-10',1),(19,0,10259.94,'2023-05-10',1),(20,0,570.57,'2023-05-10',1),(21,0,2051.99,'2023-05-10',1),(22,7427,10259.94,'2023-05-10',1),(23,7427,2579.66,'2023-05-10',1),(24,7427,1141.14,'2023-05-10',1),(25,0,4103.98,'2023-05-10',1);
/*!40000 ALTER TABLE `ventas_tablas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-10 22:32:33
