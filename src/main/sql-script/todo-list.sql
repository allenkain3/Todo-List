CREATE DATABASE  IF NOT EXISTS `todo_directory`;
USE `todo_directory`;

--
-- Table structure for table `todo`
--

DROP TABLE IF EXISTS `todo`;

CREATE TABLE `todo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_date` date DEFAULT NULL,
  `task` varchar(45) DEFAULT NULL,
  `due_date` date DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `todo`
--

INSERT INTO `todo` VALUES 
	(1,'2020/02/25','Group Meeting','2000/02/25','Complete'),
	(2,'2020/02/19','Attending Career Fair','2000/02/20','Complete'),
	(3,'2020/02/17','Practice Presentation Delivery','2020/02/18','Complete'),
	(4,'2020/01/25','Apply For Graduation','2020/01/25','Complete'),
	(5,'2020/02/14','Take Spring/Spring Boot Course','2020/03/1','Complete');