-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2019 at 09:39 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `busman1`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `uname` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `admin1`
--

CREATE TABLE `admin1` (
  `uname` varchar(20) DEFAULT NULL,
  `pwd` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin1`
--

INSERT INTO `admin1` (`uname`, `pwd`) VALUES
('raw1', 'raw1');

-- --------------------------------------------------------

--
-- Table structure for table `bdeti2`
--

CREATE TABLE `bdeti2` (
  `bid` varchar(255) NOT NULL,
  `arival` varchar(255) DEFAULT NULL,
  `cont` varchar(255) DEFAULT NULL,
  `dfrom` varchar(255) DEFAULT NULL,
  `did` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bdeti2`
--

INSERT INTO `bdeti2` (`bid`, `arival`, `cont`, `dfrom`, `did`, `dname`, `time`) VALUES
('1001', 'baddi', '1234567890', 'chandigarh', '101', 'Ram Ankit', '5.00'),
('1003', 'baddi', '9876789065', 'panchkula', '103', 'Ramu', '9pm'),
('1004', 'baddi', '9871234321', 'mohali', '104', 'Khatam', '9pm');

-- --------------------------------------------------------

--
-- Table structure for table `bdetil`
--

CREATE TABLE `bdetil` (
  `Bid` varchar(20) NOT NULL,
  `Did` varchar(20) NOT NULL,
  `Dname` varchar(20) NOT NULL,
  `Dcontact` varchar(12) NOT NULL,
  `Dfrom` varchar(20) NOT NULL,
  `ArivalAt` varchar(20) NOT NULL,
  `Time` varchar(10) NOT NULL,
  `arival` varchar(255) DEFAULT NULL,
  `cont` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bdetil`
--

INSERT INTO `bdetil` (`Bid`, `Did`, `Dname`, `Dcontact`, `Dfrom`, `ArivalAt`, `Time`, `arival`, `cont`) VALUES
('1001', '101', 'Ramu', '9845621754', 'baddi', 'panchkula', '10pm', NULL, NULL),
('1002', '102', 'Sohan', '9845690004', 'baddi', 'chandigarh', '11pm', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `bid` varchar(255) NOT NULL,
  `arival` varchar(255) DEFAULT NULL,
  `cont` varchar(255) DEFAULT NULL,
  `dfrom` varchar(255) DEFAULT NULL,
  `did` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `dd`
--

CREATE TABLE `dd` (
  `id` varchar(255) NOT NULL,
  `age` varchar(255) DEFAULT NULL,
  `ln` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dd`
--

INSERT INTO `dd` (`id`, `age`, `ln`, `name`, `salary`) VALUES
('101', '21', '0009', 'Ram Ankit', '9000'),
('102', '23', '10103', 'mno', '26000'),
('103', '28', '1234', 'Neeraj', '9000'),
('104', '45', '1234567', 'Vipul', '4500'),
('105', '28', '34343', 'ramu', '4500'),
('106', '28', '1234567', 'Vipul', '5000'),
('110', '23', '34343', 'Khatam Singh', '5000'),
('1121', '28', '55', 'lll', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `id` varchar(255) NOT NULL,
  `age` varchar(255) DEFAULT NULL,
  `ln` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `salary` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`id`, `age`, `ln`, `name`, `salary`) VALUES
('11', '45', '654987', 'hpl', '5455');

-- --------------------------------------------------------

--
-- Table structure for table `faculty1`
--

CREATE TABLE `faculty1` (
  `uid` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `route` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `faculty1`
--

INSERT INTO `faculty1` (`uid`, `email`, `name`, `password`, `route`) VALUES
('1234567', 'a@gmail.com', 'Abhi', 'Abhi', 'MOHALI');

-- --------------------------------------------------------

--
-- Table structure for table `route`
--

CREATE TABLE `route` (
  `rcode` varchar(255) NOT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `dname` varchar(255) DEFAULT NULL,
  `ppoint` varchar(255) DEFAULT NULL,
  `rname` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `route`
--

INSERT INTO `route` (`rcode`, `destination`, `dname`, `ppoint`, `rname`, `time`) VALUES
('CH01', 'baddi', 'Khatam Singh', 'manimajra,housingboard,sec21,sec10', 'Chandigarh', '9'),
('CH02', 'Baddi', 'Sohan Kumar', 'CH Sec-19,Old Panchkula,HMT,Pinjore,Baddi', 'Pinjore', '8:50'),
('MH01', 'Baddi', 'Akhil', 'sec-25,sec-28,sec-44,sec-30', 'Mohali', '10pm');

-- --------------------------------------------------------

--
-- Table structure for table `sign1`
--

CREATE TABLE `sign1` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `r_password` varchar(255) DEFAULT NULL,
  `route` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sign1`
--

INSERT INTO `sign1` (`email`, `name`, `password`, `r_password`, `route`) VALUES
('aaa@gmail.com', 'aaa', 'aaa', 'aaa', 'PINJORE'),
('def@gmail.com', 'def', 'def', 'def', 'MOHALI');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `uid` varchar(255) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `route` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`uid`, `email`, `name`, `password`, `permission`, `route`) VALUES
('1611981352', 'k@gmail.com', 'Karan', 'Karan', 'SUCCESSFULL', 'PINJORE'),
('1611991313', 'rk7944702@gmail.com', 'rohit', 'rohit', 'SUCCESSFULL', 'PINJORE'),
('282', 'p@gmail.com', 'preet', 'preet@123', 'SUCCESSFULL', 'PARWANOO');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bdeti2`
--
ALTER TABLE `bdeti2`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `dd`
--
ALTER TABLE `dd`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `faculty1`
--
ALTER TABLE `faculty1`
  ADD PRIMARY KEY (`uid`);

--
-- Indexes for table `route`
--
ALTER TABLE `route`
  ADD PRIMARY KEY (`rcode`);

--
-- Indexes for table `sign1`
--
ALTER TABLE `sign1`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`uid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
