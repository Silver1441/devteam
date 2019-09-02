-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: devteam
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `appointments`
--

DROP TABLE IF EXISTS `appointments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointments` (
  `appointment` varchar(45) NOT NULL,
  PRIMARY KEY (`appointment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointments`
--

LOCK TABLES `appointments` WRITE;
/*!40000 ALTER TABLE `appointments` DISABLE KEYS */;
INSERT INTO `appointments` VALUES ('backend_developer'),('delivery_manager'),('designer'),('frontend_developer'),('system_administrator'),('tester');
/*!40000 ALTER TABLE `appointments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competence_grade`
--

DROP TABLE IF EXISTS `competence_grade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `competence_grade` (
  `grade_rank` varchar(20) NOT NULL,
  `priority` int(11) NOT NULL,
  PRIMARY KEY (`grade_rank`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competence_grade`
--

LOCK TABLES `competence_grade` WRITE;
/*!40000 ALTER TABLE `competence_grade` DISABLE KEYS */;
INSERT INTO `competence_grade` VALUES ('D1',1),('D2',2),('D3',3),('D4',4);
/*!40000 ALTER TABLE `competence_grade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `staff_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `patronymic` varchar(20) DEFAULT NULL,
  `surname` varchar(20) NOT NULL,
  `login` varchar(20) NOT NULL,
  `password` int(11) NOT NULL,
  `appointment` varchar(45) NOT NULL,
  `competence_grade_rank` varchar(20) NOT NULL,
  PRIMARY KEY (`staff_id`),
  KEY `fk_employee_appointments1_idx` (`appointment`),
  KEY `fk_employee_competence_grade1_idx` (`competence_grade_rank`),
  CONSTRAINT `fk_employee_appointments1` FOREIGN KEY (`appointment`) REFERENCES `appointments` (`appointment`),
  CONSTRAINT `fk_employee_competence_grade1` FOREIGN KEY (`competence_grade_rank`) REFERENCES `competence_grade` (`grade_rank`)
) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1001,'Петр','Александрович','Деготин','Degot95',2126091,'designer','D2'),(1002,'Василий','Николаевич','Кузнецов','VasiaN',-1584433782,'designer','D3'),(1003,'Оксана','Федоровна','Кулакова','Oksik',76259673,'tester','D1');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `executors_pool`
--

DROP TABLE IF EXISTS `executors_pool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `executors_pool` (
  `staff_id` int(11) NOT NULL,
  `target_id` int(11) NOT NULL,
  PRIMARY KEY (`staff_id`,`target_id`),
  KEY `fk_executors_pool_staff1_idx` (`staff_id`),
  KEY `fk_executors_pool_target1_idx` (`target_id`),
  CONSTRAINT `fk_executors_pool_staff1` FOREIGN KEY (`staff_id`) REFERENCES `employee` (`staff_id`),
  CONSTRAINT `fk_executors_pool_target1` FOREIGN KEY (`target_id`) REFERENCES `project` (`target_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `executors_pool`
--

LOCK TABLES `executors_pool` WRITE;
/*!40000 ALTER TABLE `executors_pool` DISABLE KEYS */;
/*!40000 ALTER TABLE `executors_pool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `target_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(200) NOT NULL,
  `manager` int(11) NOT NULL,
  `date_start` date NOT NULL,
  `date_end` date DEFAULT NULL,
  `project_status` varchar(20) NOT NULL,
  PRIMARY KEY (`target_id`),
  KEY `fk_target_staff1_idx` (`manager`),
  KEY `fk_project_project_status1_idx` (`project_status`),
  CONSTRAINT `fk_project_project_status1` FOREIGN KEY (`project_status`) REFERENCES `project_status` (`status`),
  CONSTRAINT `fk_target_staff1` FOREIGN KEY (`manager`) REFERENCES `employee` (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'test_project1','test_description1',1001,'2019-09-02',NULL,'ONGOING'),(2,'test_project2','test_description2',1002,'2019-09-03',NULL,'ONGOING');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_status`
--

DROP TABLE IF EXISTS `project_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project_status` (
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_status`
--

LOCK TABLES `project_status` WRITE;
/*!40000 ALTER TABLE `project_status` DISABLE KEYS */;
INSERT INTO `project_status` VALUES ('FINISHED'),('ONGOING');
/*!40000 ALTER TABLE `project_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task`
--

DROP TABLE IF EXISTS `task`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task` (
  `task_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(200) NOT NULL,
  `executor` int(11) NOT NULL,
  `task_status` varchar(20) NOT NULL,
  `date_start` date NOT NULL,
  `date_end` date DEFAULT NULL,
  PRIMARY KEY (`task_id`),
  KEY `fk_task_staff1_idx` (`executor`),
  KEY `fk_task_task_status1_idx` (`task_status`),
  CONSTRAINT `fk_task_staff1` FOREIGN KEY (`executor`) REFERENCES `employee` (`staff_id`),
  CONSTRAINT `fk_task_task_status1` FOREIGN KEY (`task_status`) REFERENCES `task_status` (`status`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task`
--

LOCK TABLES `task` WRITE;
/*!40000 ALTER TABLE `task` DISABLE KEYS */;
INSERT INTO `task` VALUES (1,'test','test',1001,'issued','2019-08-13','2019-08-20'),(3,'test_name1','test_description1',1002,'RETURNED','2019-09-02',NULL);
/*!40000 ALTER TABLE `task` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_pool`
--

DROP TABLE IF EXISTS `task_pool`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task_pool` (
  `task_id` int(11) NOT NULL,
  `target_id` int(11) NOT NULL,
  PRIMARY KEY (`task_id`),
  KEY `fk_task_pool_task1_idx` (`task_id`),
  KEY `fk_task_pool_target1_idx` (`target_id`),
  CONSTRAINT `fk_task_pool_target1` FOREIGN KEY (`target_id`) REFERENCES `project` (`target_id`),
  CONSTRAINT `fk_task_pool_task1` FOREIGN KEY (`task_id`) REFERENCES `task` (`task_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_pool`
--

LOCK TABLES `task_pool` WRITE;
/*!40000 ALTER TABLE `task_pool` DISABLE KEYS */;
/*!40000 ALTER TABLE `task_pool` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `task_status`
--

DROP TABLE IF EXISTS `task_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `task_status` (
  `status` varchar(20) NOT NULL,
  PRIMARY KEY (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `task_status`
--

LOCK TABLES `task_status` WRITE;
/*!40000 ALTER TABLE `task_status` DISABLE KEYS */;
INSERT INTO `task_status` VALUES ('DECLINED'),('FINISHED'),('IN_PROGRESS'),('ISSUED'),('RETURNED');
/*!40000 ALTER TABLE `task_status` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-03  3:23:44
