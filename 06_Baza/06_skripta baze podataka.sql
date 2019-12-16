CREATE DATABASE  IF NOT EXISTS `projectplaner` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `projectplaner`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: projectplaner
-- ------------------------------------------------------
-- Server version	5.5.50

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`Username`),
  CONSTRAINT `FK_Nalog_Admin` FOREIGN KEY (`Username`) REFERENCES `nalog` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aktivnost`
--

DROP TABLE IF EXISTS `aktivnost`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aktivnost` (
  `IdAktivnosti` int(11) NOT NULL AUTO_INCREMENT,
  `NazivAktivnosti` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `IdCjeline` int(11) NOT NULL,
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`IdAktivnosti`),
  KEY `FK_Cjelina_Aktivnost` (`IdCjeline`,`Username`),
  CONSTRAINT `FK_Cjelina_Aktivnost` FOREIGN KEY (`IdCjeline`, `Username`) REFERENCES `cjelina` (`IdCjeline`, `Username`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aktivnost`
--

LOCK TABLES `aktivnost` WRITE;
/*!40000 ALTER TABLE `aktivnost` DISABLE KEYS */;
INSERT INTO `aktivnost` VALUES (7,'Aktivnost1',1,'MilanMarkovic'),(8,'Aktivnost2',1,'MilanMarkovic'),(9,'Aktivnost3',1,'MilanMarkovic'),(10,'Aktivnost4',2,'SlavkoSladojevic'),(11,'Aktivnost5',2,'SlavkoSladojevic'),(12,'Aktivnost4',2,'NikolaNikolic'),(13,'Aktivnost5',2,'NikolaNikolic'),(14,'Aktivnost1',3,'SlavkoSladojevic'),(15,'Aktivnost2',4,'NikolaNikolic'),(16,'Aktivnost1',5,'NikolaNikolic'),(96,'Aktivnost1',6,'JankoJankovic'),(97,'Aktivnost2',6,'JankoJankovic'),(98,'Aktivnost3',6,'JankoJankovic'),(99,'Aktivnost1',6,'MarkoMarkovic'),(100,'Aktivnost2',6,'MarkoMarkovic'),(101,'Aktivnost3',6,'MarkoMarkovic'),(102,'Aktivnost1',6,'MilanMarkovic'),(103,'Aktivnost2',6,'MilanMarkovic'),(104,'Aktivnost3',6,'MilanMarkovic'),(105,'Aktivnost1',6,'NikolaNikolic'),(106,'Aktivnost2',6,'NikolaNikolic'),(107,'Aktivnost3',6,'NikolaNikolic'),(108,'Aktivnost1',6,'SlavkoSladojevic'),(109,'Aktivnost2',6,'SlavkoSladojevic'),(110,'Aktivnost3',6,'SlavkoSladojevic'),(111,'Aktivnost1',7,'JankoJankovic'),(112,'Aktivnost2',7,'JankoJankovic'),(113,'Aktivnost3',7,'JankoJankovic'),(114,'Aktivnost4',7,'JankoJankovic'),(115,'Aktivnost5',7,'JankoJankovic'),(116,'Aktivnost6',7,'JankoJankovic'),(117,'Aktivnost7',7,'JankoJankovic'),(118,'Aktivnost8',7,'JankoJankovic'),(119,'Aktivnost9',7,'JankoJankovic'),(120,'Aktivnost1',7,'MarkoMarkovic'),(121,'Aktivnost2',7,'MarkoMarkovic'),(122,'Aktivnost3',7,'MarkoMarkovic'),(123,'Aktivnost4',7,'MarkoMarkovic'),(124,'Aktivnost5',7,'MarkoMarkovic'),(125,'Aktivnost6',7,'MarkoMarkovic'),(126,'Aktivnost7',7,'MarkoMarkovic'),(127,'Aktivnost8',7,'MarkoMarkovic'),(128,'Aktivnost9',7,'MarkoMarkovic'),(129,'Aktivnost1',7,'MilanMarkovic'),(130,'Aktivnost2',7,'MilanMarkovic'),(131,'Aktivnost3',7,'MilanMarkovic'),(132,'Aktivnost4',7,'MilanMarkovic'),(133,'Aktivnost5',7,'MilanMarkovic'),(134,'Aktivnost6',7,'MilanMarkovic'),(135,'Aktivnost7',7,'MilanMarkovic'),(136,'Aktivnost8',7,'MilanMarkovic'),(137,'Aktivnost9',7,'MilanMarkovic'),(138,'Aktivnost1',7,'NikolaNikolic'),(139,'Aktivnost2',7,'NikolaNikolic'),(140,'Aktivnost3',7,'NikolaNikolic'),(141,'Aktivnost4',7,'NikolaNikolic'),(142,'Aktivnost5',7,'NikolaNikolic'),(143,'Aktivnost6',7,'NikolaNikolic'),(144,'Aktivnost7',7,'NikolaNikolic'),(145,'Aktivnost8',7,'NikolaNikolic'),(146,'Aktivnost9',7,'NikolaNikolic'),(147,'Aktivnost1',7,'SlavkoSladojevic'),(148,'Aktivnost2',7,'SlavkoSladojevic'),(149,'Aktivnost3',7,'SlavkoSladojevic'),(150,'Aktivnost4',7,'SlavkoSladojevic'),(151,'Aktivnost5',7,'SlavkoSladojevic'),(152,'Aktivnost6',7,'SlavkoSladojevic'),(153,'Aktivnost7',7,'SlavkoSladojevic'),(154,'Aktivnost8',7,'SlavkoSladojevic'),(155,'Aktivnost9',7,'SlavkoSladojevic');
/*!40000 ALTER TABLE `aktivnost` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cjelina`
--

DROP TABLE IF EXISTS `cjelina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cjelina` (
  `IdCjeline` int(11) NOT NULL,
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Naziv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `IdNadcjeline` int(11) DEFAULT NULL,
  `IdProjekta` int(11) NOT NULL,
  `VremenskiRok` date NOT NULL,
  `BrojRadnihCasova` int(11) NOT NULL,
  `BrojOdradjenihCasova` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`IdCjeline`,`Username`),
  KEY `FK_Projekat_Cjelina` (`IdProjekta`),
  KEY `FK_Cjelina_Cjelina` (`IdNadcjeline`),
  CONSTRAINT `FK_Cjelina_Cjelina` FOREIGN KEY (`IdNadcjeline`) REFERENCES `cjelina` (`IdCjeline`) ON DELETE CASCADE,
  CONSTRAINT `FK_Projekat_Cjelina` FOREIGN KEY (`IdProjekta`) REFERENCES `projekat` (`IdProjekta`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cjelina`
--

LOCK TABLES `cjelina` WRITE;
/*!40000 ALTER TABLE `cjelina` DISABLE KEYS */;
INSERT INTO `cjelina` VALUES (1,'JankoJankovic','Podcjelina1',NULL,1,'2018-02-02',50,0),(1,'MarkoMarkovic','Podcjelina1',NULL,1,'2018-02-02',50,0),(1,'MilanMarkovic','Podcjelina1',NULL,1,'2018-02-02',50,0),(2,'NikolaNikolic','Podcjelina1.1',1,1,'2018-02-16',25,12),(2,'SlavkoSladojevic','Podcjelina1.1',1,1,'2018-02-16',25,12),(3,'SlavkoSladojevic','Podcjelina2',NULL,1,'2018-05-05',250,0),(4,'NikolaNikolic','Podcjelina1.1.1',2,1,'2018-05-05',250,0),(5,'NikolaNikolic','Podcjelina1',4,1,'2018-06-06',300,12),(6,'JankoJankovic','Podcjelina1',NULL,4,'2019-04-11',600,0),(6,'MarkoMarkovic','Podcjelina1',NULL,4,'2019-04-11',600,0),(6,'MilanMarkovic','Podcjelina1',NULL,4,'2019-04-11',600,0),(6,'NikolaNikolic','Podcjelina1',NULL,4,'2019-04-11',600,0),(6,'SlavkoSladojevic','Podcjelina1',NULL,4,'2019-04-11',600,0),(7,'JankoJankovic','Podcjelina123',NULL,5,'2019-03-20',1000,0),(7,'MarkoMarkovic','Podcjelina123',NULL,5,'2019-03-20',1000,0),(7,'MilanMarkovic','Podcjelina123',NULL,5,'2019-03-20',1000,0),(7,'NikolaNikolic','Podcjelina123',NULL,5,'2019-03-20',1000,0),(7,'SlavkoSladojevic','Podcjelina123',NULL,5,'2019-03-20',1000,0);
/*!40000 ALTER TABLE `cjelina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nadzor`
--

DROP TABLE IF EXISTS `nadzor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nadzor` (
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`Username`),
  CONSTRAINT `FK_Nalog_Nadzor` FOREIGN KEY (`Username`) REFERENCES `nalog` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nadzor`
--

LOCK TABLES `nadzor` WRITE;
/*!40000 ALTER TABLE `nadzor` DISABLE KEYS */;
INSERT INTO `nadzor` VALUES ('MarkoMarkovic'),('MiroslavMandic'),('SlobodanTepsic');
/*!40000 ALTER TABLE `nadzor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nalog`
--

DROP TABLE IF EXISTS `nalog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nalog` (
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Password` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Ime` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Prezime` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `Aktivan` tinyint(1) NOT NULL DEFAULT '1',
  `RadnoMjesto` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nalog`
--

LOCK TABLES `nalog` WRITE;
/*!40000 ALTER TABLE `nalog` DISABLE KEYS */;
INSERT INTO `nalog` VALUES ('JankoJankovic','11111','Janko','Jankovic',1,'programer'),('MarkoMarkovic','11111','Marko','Markovic',1,'programer'),('MilanMarkovic','11111','Milan','Markovic',1,'Menadzer'),('MiroslavMandic','11111','Mandic','Miroslav',1,'programer'),('NikolaNikolic','11111','Nikola','Nikolic',1,'radnik'),('SlavkoSladojevic','11111','Sladojevic','Slavko',1,'programer'),('SlobodanTepsic','11111','Tepsic','Slobodan',1,'programer'),('admin','admin','Milos','Milosevic',1,'admin');
/*!40000 ALTER TABLE `nalog` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger nalog_novi after insert
on nalog
for each row
begin
	insert into radnik
	set username = new.username;
  
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `poruka`
--

DROP TABLE IF EXISTS `poruka`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `poruka` (
  `IdPoruke` int(11) NOT NULL AUTO_INCREMENT,
  `TekstPoruke` text COLLATE utf8_unicode_ci NOT NULL,
  `IdAktivnosti` int(11) NOT NULL,
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `Procitana` tinyint(1) NOT NULL DEFAULT '0',
  `PoslaoSef` tinyint(1) NOT NULL,
  PRIMARY KEY (`IdPoruke`),
  KEY `FK_Aktivnost_Poruka` (`IdAktivnosti`),
  KEY `FK_Aktivnost_Radnik` (`Username`),
  CONSTRAINT `FK_Aktivnost_Poruka` FOREIGN KEY (`IdAktivnosti`) REFERENCES `aktivnost` (`IdAktivnosti`) ON DELETE CASCADE,
  CONSTRAINT `FK_Aktivnost_Radnik` FOREIGN KEY (`Username`) REFERENCES `radnik` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `poruka`
--

LOCK TABLES `poruka` WRITE;
/*!40000 ALTER TABLE `poruka` DISABLE KEYS */;
INSERT INTO `poruka` VALUES (1,'Broj radnih sati: 12               Poruka: Radio sam 12 sati na aktivnosti 1.',16,'NikolaNikolic',1,0),(2,'Broj radnih sati: 8               Poruka: Radio sam 8 sati na aktivnosti 5.',13,'NikolaNikolic',1,0),(7,'Broj radnih sati: 4               Poruka: 88',13,'NikolaNikolic',1,0),(11,'Vaš izvještaj za aktivnost Aktivnost5 nije prihvaćen. ',13,'NikolaNikolic',0,1),(12,'Vaš izvještaj za aktivnost Aktivnost5 nije prihvaćen. ',13,'NikolaNikolic',0,1),(13,'Broj radnih sati: 22               Poruka: Radio sam 22 sata.',7,'MilanMarkovic',0,0);
/*!40000 ALTER TABLE `poruka` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prihod`
--

DROP TABLE IF EXISTS `prihod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prihod` (
  `IdPrihoda` int(11) NOT NULL AUTO_INCREMENT,
  `IdProjekta` int(11) NOT NULL,
  `Naziv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Opis` text COLLATE utf8_unicode_ci NOT NULL,
  `Iznos` double NOT NULL,
  `DatumKreiranja` date NOT NULL,
  PRIMARY KEY (`IdPrihoda`),
  KEY `FK_Projekat_Prihod` (`IdProjekta`),
  CONSTRAINT `FK_Projekat_Prihod` FOREIGN KEY (`IdProjekta`) REFERENCES `projekat` (`IdProjekta`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prihod`
--

LOCK TABLES `prihod` WRITE;
/*!40000 ALTER TABLE `prihod` DISABLE KEYS */;
INSERT INTO `prihod` VALUES (1,1,'Prihod1','Ovo je opis prihoda 1.',100,'2017-02-01'),(2,1,'Prihod2','Opis prihoda 2.',50,'2017-02-01'),(4,4,'Prihod1','prihoooooood1',100,'2017-02-01');
/*!40000 ALTER TABLE `prihod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projekat`
--

DROP TABLE IF EXISTS `projekat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projekat` (
  `IdProjekta` int(11) NOT NULL AUTO_INCREMENT,
  `NazivProjekta` text COLLATE utf8_unicode_ci NOT NULL,
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `UsernameSef` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `UsernameNadzor` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `Opis` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`IdProjekta`),
  KEY `FK_Admin_Projekat` (`Username`),
  KEY `FK_Sef_Projekat` (`UsernameSef`),
  KEY `FK_Nadzor_Projekat` (`UsernameNadzor`),
  CONSTRAINT `FK_Admin_Projekat` FOREIGN KEY (`Username`) REFERENCES `admin` (`Username`),
  CONSTRAINT `FK_Nadzor_Projekat` FOREIGN KEY (`UsernameNadzor`) REFERENCES `nadzor` (`Username`),
  CONSTRAINT `FK_Sef_Projekat` FOREIGN KEY (`UsernameSef`) REFERENCES `sef` (`Username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projekat`
--

LOCK TABLES `projekat` WRITE;
/*!40000 ALTER TABLE `projekat` DISABLE KEYS */;
INSERT INTO `projekat` VALUES (1,'Test projekat','admin','JankoJankovic','MarkoMarkovic','Ovo je opis testnog projekta.'),(4,'Test projekat2','admin','MiroslavMandic','SlobodanTepsic','Opis test Projekta 2'),(5,'Test projekat3','admin','MiroslavMandic','SlobodanTepsic','Opis test projekta 3.');
/*!40000 ALTER TABLE `projekat` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 trigger projekat_novi before insert
on projekat
for each row
begin
	if new.UsernameSef not in(select s.username from sef s) then
	insert into sef
    set username = new.UsernameSef;
    end if;
    if new.UsernameNadzor not in (select n.username from nadzor n) then
	insert into nadzor
    set username = new.usernameNadzor;
    end if;
  
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `radnik`
--

DROP TABLE IF EXISTS `radnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `radnik` (
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`Username`),
  CONSTRAINT `FK_Nalog_Radnik` FOREIGN KEY (`Username`) REFERENCES `nalog` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `radnik`
--

LOCK TABLES `radnik` WRITE;
/*!40000 ALTER TABLE `radnik` DISABLE KEYS */;
INSERT INTO `radnik` VALUES ('JankoJankovic'),('MarkoMarkovic'),('MilanMarkovic'),('MiroslavMandic'),('NikolaNikolic'),('SlavkoSladojevic'),('SlobodanTepsic');
/*!40000 ALTER TABLE `radnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rashod`
--

DROP TABLE IF EXISTS `rashod`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rashod` (
  `IdRashoda` int(11) NOT NULL AUTO_INCREMENT,
  `IdProjekta` int(11) NOT NULL,
  `Naziv` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Opis` text COLLATE utf8_unicode_ci NOT NULL,
  `Iznos` double NOT NULL,
  `DatumKreiranja` date NOT NULL,
  PRIMARY KEY (`IdRashoda`),
  KEY `FK_Projekat_Rashod` (`IdProjekta`),
  CONSTRAINT `FK_Projekat_Rashod` FOREIGN KEY (`IdProjekta`) REFERENCES `projekat` (`IdProjekta`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rashod`
--

LOCK TABLES `rashod` WRITE;
/*!40000 ALTER TABLE `rashod` DISABLE KEYS */;
INSERT INTO `rashod` VALUES (1,1,'Rashod1','Kafica',2,'2017-02-01'),(2,1,'Kafica i sokić','Kafica i sokić',5,'2017-02-01'),(4,4,'Rashod1','Rashod1',10,'2017-02-01');
/*!40000 ALTER TABLE `rashod` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sef`
--

DROP TABLE IF EXISTS `sef`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sef` (
  `Username` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`Username`),
  CONSTRAINT `FK_Nalog_Sef` FOREIGN KEY (`Username`) REFERENCES `nalog` (`Username`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sef`
--

LOCK TABLES `sef` WRITE;
/*!40000 ALTER TABLE `sef` DISABLE KEYS */;
INSERT INTO `sef` VALUES ('JankoJankovic'),('MiroslavMandic'),('SlobodanTepsic');
/*!40000 ALTER TABLE `sef` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'projectplaner'
--

--
-- Dumping routines for database 'projectplaner'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-02 17:43:01

create user  'student'@'localhost' identified by 'student';
grant all on projectplaner.* to 'student'@'localhost' identified by 'student';
flush privileges;
