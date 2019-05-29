-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2019 at 07:32 AM
-- Server version: 10.1.40-MariaDB
-- PHP Version: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `courses`
--

-- --------------------------------------------------------

--
-- Table structure for table `recipe`
--

CREATE TABLE `recipe` (
  `id` int(11) NOT NULL,
  `aprasymas` varchar(255) DEFAULT NULL,
  `busena` int(11) DEFAULT NULL,
  `max_patirties_tasku` int(11) DEFAULT NULL,
  `patvirtintas` bit(1) NOT NULL,
  `pavadinimas` varchar(255) DEFAULT NULL,
  `sudetingumas` int(11) DEFAULT NULL,
  `fk_course_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `recipe`
--

INSERT INTO `recipe` (`id`, `aprasymas`, `busena`, `max_patirties_tasku`, `patvirtintas`, `pavadinimas`, `sudetingumas`, `fk_course_id`) VALUES
(1, 'Duonike', 2, 10, b'1', 'Duona su cesnakiniu', 4, 1),
(2, 'Gardu', 2, 10, b'1', 'Tiesiog ryziai', 2, 1),
(3, 'sdfsd', 0, 5, b'0', 'MAKEERA', 3, 0),
(23, 'FUN', 0, 0, b'0', 'SMAGU', 0, NULL),
(24, 'lengi', 0, 0, b'0', 'OPA', 0, NULL),
(25, 'px', 0, 0, b'0', 'Lengvi Pinigeliai', 0, 26);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `recipe`
--
ALTER TABLE `recipe`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKif5usgyxl51od3k5c4y2gw53v` (`fk_course_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
