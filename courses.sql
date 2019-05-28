-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2019 at 06:10 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

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
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `id` int(11) NOT NULL,
  `ivertinimas` int(11) DEFAULT NULL,
  `komentaras` varchar(255) DEFAULT NULL,
  `fk_course` int(11) DEFAULT NULL,
  `fk_naudotojas_paraso_komentara` int(11) DEFAULT NULL,
  `fk_recipe` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `aprasymas` varchar(255) DEFAULT NULL,
  `ivertinimas` int(11) DEFAULT NULL,
  `pavadinimas` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `aprasymas`, `ivertinimas`, `pavadinimas`) VALUES
(0, 'Geras kursas naujokams.', 3, 'Pradedantysis.'),
(1, 'Geras kursas naujokams.', 3, 'Pradedantysis.'),
(2, 'Blogas kursas naujokams.', 2, 'Pradedantysis.');

-- --------------------------------------------------------

--
-- Table structure for table `course_recipe`
--

CREATE TABLE `course_recipe` (
  `course_id` int(11) NOT NULL,
  `recipe_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `course_user`
--

CREATE TABLE `course_user` (
  `course_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `dish`
--

CREATE TABLE `dish` (
  `id` int(11) NOT NULL,
  `ivertinimas` double NOT NULL,
  `patiekalo_informacija` varchar(255) DEFAULT NULL,
  `fk_recipe` int(11) DEFAULT NULL,
  `fk_user` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `recipe`
--

CREATE TABLE `recipe` (
  `id` int(11) NOT NULL,
  `aprasymas` varchar(255) DEFAULT NULL,
  `busena` int(11) DEFAULT NULL,
  `max_patirties_tasku` int(11) DEFAULT NULL,
  `pavadinimas` varchar(255) DEFAULT NULL,
  `sudetingumas` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `busena` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `patirties_taskai` int(11) DEFAULT NULL,
  `slaptazodis` varchar(255) DEFAULT NULL,
  `vardas` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKnxrxd5jbfp3csfichricup1sn` (`fk_course`),
  ADD KEY `FK68acds8st112s2uoylw2katf1` (`fk_naudotojas_paraso_komentara`),
  ADD KEY `FKfbas7eml2ir8r524pgtmp3g9n` (`fk_recipe`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `course_recipe`
--
ALTER TABLE `course_recipe`
  ADD KEY `FKfylffpsua44wsau9g9vusk3c1` (`recipe_id`),
  ADD KEY `FKevhkr6as82kjt1eo1kyvqrnll` (`course_id`);

--
-- Indexes for table `course_user`
--
ALTER TABLE `course_user`
  ADD KEY `FK2e2vx1koh906052eej4244e0v` (`user_id`),
  ADD KEY `FKm2sw6qb4f42s0be8drns7d71r` (`course_id`);

--
-- Indexes for table `dish`
--
ALTER TABLE `dish`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKoxd4yhuj14ksi22sva9n6u0bg` (`fk_recipe`),
  ADD KEY `FKkrht0vi76n906d3oq04d2grou` (`fk_user`);

--
-- Indexes for table `recipe`
--
ALTER TABLE `recipe`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
