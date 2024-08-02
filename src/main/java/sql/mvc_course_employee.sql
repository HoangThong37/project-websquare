-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: mvc_course
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `birth_date` datetime(6) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `team` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','16e25600-e2ad-4c93-8072-b070fdf2becc','Minh2 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 08:59:42.684000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','17a9b05d-62f6-4772-8f94-c1a663c69874','Thi4 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:25.776000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','1f63b602-8188-4f3d-b0f8-15cd66f7c576','Thi8 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:41.942000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','1fcb4a2a-184f-4540-bdad-33ad5b73136c','Thi9 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:46.110000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','24545e21-b9c5-4309-a12c-1ff3b12a8103','Thi7 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:35.969000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','53017d6c-d483-420e-9ca1-df077817e285','MinhMinh4 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 08:59:56.395000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','55b2a419-b7e1-4452-9eb1-e42fbc9f09d4','Thi6 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:32.774000'),(NULL,'Đồng Nai','thinh@gmail.com','male','5a7c90e1-3765-420c-b8ea-6014b8799867','thinh nguyen','0365456877','ACTIVE','team1','2024-07-04 08:39:31.025000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','60f15ce4-6351-4ace-a875-16c3a14713a3','MMMM9 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 09:00:23.434000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','6f574707-8a14-43ae-8584-4ed467b7f8d0','Minh Nguyễn','0365456872','ACTIVE','team1','2024-07-04 08:59:34.521000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','8e314d25-c603-472b-94eb-b65e25252464','MinhMinh3 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 08:59:45.487000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','93665d4a-8a77-4529-a59c-ee885754adbc','M7 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 09:00:16.078000'),('2024-07-09 00:00:00.000000','Nghe An','binh123@gmail.com','male','9c2f858e-fa0e-4374-adaa-41a94c724d68','Nguyen Van Binh2','0365456878','ACTIVE','team1','2024-07-04 08:57:58.136000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','a03d8676-1fd3-43c1-86ea-443988475dc1','Minh1 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 08:59:38.127000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','ba229cdf-eaeb-41b4-9192-42885a0ef165','Thi1 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:14.168000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','ba68e7ff-d2c3-4fed-b7e0-fab2fe24ea5d','6 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 09:00:07.084000'),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','c7a5cee9-077c-4269-9c35-3f9602d63f49','Thi3 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:21.568000'),('2023-12-04 00:00:00.000000','Nghe An','binh123@gmail.com','male','cfa01e9e-bb90-4013-b295-c1db58cfbd26','Nguyen Van Binh1','0365456878','INACTIVE','team1',NULL),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','e0b04c30-4308-48d4-8a3f-de56e8c0070e','MM8 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 09:00:19.807000'),('2024-06-10 00:00:00.000000','HN','nvc@gmail.com','male','e1c7a6ea-9bfe-4a51-b5d9-086b3210778c','Nguyen Van J','1111111111','ACTIVE','team1',NULL),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','e4f82e1c-a916-49eb-80a9-4d8efaed13fa','Thi5 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:29.546000'),('2023-07-09 00:00:00.000000','Thái Nguyên','minhnguyen@gmail.com','male','e96c4a31-60a5-40dc-801f-85468786a2e0','MinhMinh5 Nguyễn','0365456872','ACTIVE','team1','2024-07-04 09:00:02.917000'),('2024-06-10 00:00:00.000000','HN','nvc@gmail.com','male','edbef717-5558-4077-9d4c-8692b0dd3008','Nguyen Van sss','1111111111','ACTIVE','team1',NULL),(NULL,'fdsdffff','hthifbf@dgh','female','ee1567ac-d056-452b-9280-ad3f82525628','dinh nhu vuog','01356454547','INACTIVE','team2',NULL),('2023-07-09 00:00:00.000000','Đồng Nai','thinh1@gmail.com','male','ef21dec5-0c43-4852-8465-e3f5807223ac','Thi2 nguyen','0365456877','ACTIVE','team1','2024-07-04 08:58:17.287000'),('2024-06-10 00:00:00.000000','HN','nvc@gmail.com','male','f1dc324b-fb23-4376-92f1-a730105904a9','Nguyen Van gk','1111111111','ACTIVE','team1',NULL);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-02 15:54:19
