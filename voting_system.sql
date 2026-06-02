-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2026 at 03:39 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `voting_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `candidates`
--

DROP TABLE IF EXISTS `candidates`;
CREATE TABLE `candidates` (
  `id` int(11) NOT NULL,
  `position` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `votes` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `candidates`
--

INSERT INTO `candidates` (`id`, `position`, `name`, `votes`) VALUES
(1, 'President', 'Alice', 0),
(3, 'Vice President', 'Carol', 0),
(4, 'Vice President', 'David', 0),
(5, 'Secretary', 'Emma', 0),
(6, 'Secretary', 'Frank', 0),
(7, 'Treasurer', 'Grace', 0),
(8, 'Treasurer', 'Henry', 0),
(9, 'President', 'Kloyd', 0),
(16, 'Auditor', 'Mia', 0),
(19, 'PIO', 'Marc', 0),
(20, 'Auditor', 'Alexis', 0),
(21, 'PIO', 'Nouie', 0);

-- --------------------------------------------------------

--
-- Table structure for table `voters`
--

DROP TABLE IF EXISTS `voters`;
CREATE TABLE `voters` (
  `id` int(11) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `voter_id` varchar(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `age` int(11) NOT NULL DEFAULT 0,
  `sex` varchar(10) DEFAULT '',
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `voters`
--

INSERT INTO `voters` (`id`, `full_name`, `voter_id`, `username`, `password`, `age`, `sex`, `created_at`) VALUES
(1, 'Sample User', '2026-0001', 'Sample User', '1234', 18, 'Male', '2026-05-22 08:18:37'),
(2, '123', '123', '123', '123', 21, 'Male', '2026-05-22 08:21:30'),
(3, 'Kloyd', '321', 'Kloyd', '123', 21, 'Male', '2026-05-22 08:46:47'),
(4, 'qwe', 'qwe', 'qwe', '123', 21, 'Male', '2026-05-23 12:27:37'),
(5, 'John', '011805', 'John', '011805', 21, 'Male', '2026-05-23 12:29:37'),
(6, '345', '345', '345', '345', 18, 'Male', '2026-05-23 12:36:19');

-- --------------------------------------------------------

--
-- Table structure for table `votes`
--

DROP TABLE IF EXISTS `votes`;
CREATE TABLE `votes` (
  `id` int(11) NOT NULL,
  `voter_name` varchar(100) NOT NULL,
  `president_vote` varchar(100) NOT NULL,
  `vp_vote` varchar(100) NOT NULL,
  `secretary_vote` varchar(100) NOT NULL,
  `treasurer_vote` varchar(100) NOT NULL,
  `auditor_vote` varchar(100) NOT NULL,
  `pio_vote` varchar(100) NOT NULL,
  `voted_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `votes`
--

INSERT INTO `votes` (`id`, `voter_name`, `president_vote`, `vp_vote`, `secretary_vote`, `treasurer_vote`, `auditor_vote`, `pio_vote`, `voted_at`) VALUES
(2, '[value-2]', '[value-3]', '[value-4]', '[value-5]', '[value-6]', '', '', '0000-00-00 00:00:00'),
(3, '[value-2]', '[value-3]', '[value-4]', '[value-5]', '[value-6]', '', '', '0000-00-00 00:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `candidates`
--
ALTER TABLE `candidates`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uq_candidate` (`position`,`name`);

--
-- Indexes for table `voters`
--
ALTER TABLE `voters`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `voter_id` (`voter_id`);

--
-- Indexes for table `votes`
--
ALTER TABLE `votes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `candidates`
--
ALTER TABLE `candidates`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `voters`
--
ALTER TABLE `voters`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `votes`
--
ALTER TABLE `votes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
