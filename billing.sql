-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2018 at 08:23 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `billing`
--

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `name` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `city` varchar(20) NOT NULL,
  `distt` varchar(20) NOT NULL,
  `state` varchar(20) NOT NULL,
  `pin` int(11) NOT NULL,
  `phno` bigint(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `pan` varchar(20) NOT NULL,
  `gstin` varchar(20) NOT NULL,
  `aadhar` bigint(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`name`, `address`, `city`, `distt`, `state`, `pin`, `phno`, `username`, `password`, `pan`, `gstin`, `aadhar`) VALUES
('abhishek', 'karsog', 'karsog', 'mandi', 'hp', 123456, 9882007727, 'abhi@', '12345', '54321', '12345t', 1234567890),
('G Enterprises', 'karsog distt mandi hp', 'karsog', 'Mandi', 'Himachal', 175011, 9882007727, 'abhishek', 'admin', '123456765432', '23456654', 967202962561),
('kapil', 'sundernagar', 'mandi', 'mandi', 'HP', 9876, 9625119758, 'KAPIL98', '1245', '4321', '1767', 255175555560),
('kapil', 'snr', 'madi', 'mandi', 'hp', 175027, 9625119758, 'kapil@', '12345', '54321', '2112', 255175555560),
('wsdfghbj', 'awsedrftg', 'city', 'distt', 'st', 23456, 1234567, 'usr', '123e12we', 'pan', 'gst', 123456);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `address` varchar(50) NOT NULL,
  `city` varchar(20) NOT NULL,
  `contact` varchar(10) NOT NULL,
  `state` varchar(20) NOT NULL,
  `pincode` int(11) NOT NULL,
  `date` date NOT NULL,
  `gtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `name`, `address`, `city`, `contact`, `state`, `pincode`, `date`, `gtotal`) VALUES
(1, 'kapil', 'snr', 'mandi', '9625119758', 'hp', 175027, '2018-04-03', 0),
(2, 'abhi', 'karsog', 'mandi', '9882007727', 'hp', 1234, '2018-04-24', 0),
(3, 'abhi', 'hf', 'jhg', 'gbfd', 'hngfd', 543, '2018-04-26', 0),
(4, 'arpit', 'snr', 'mandi', '09876543', 'hp', 123654, '2018-04-28', 0),
(5, 'kapil', 'qwertt', 'jhgtfj', 'hg', 'hgt', 54756, '2018-04-26', 0),
(6, 'akshit', 'snr', 'mandi', '546489', 'hp', 45689, '2018-04-30', 0),
(7, 'abhi', 'snr', 'snr', '9826765', 'hp', 12365448, '2018-04-29', 0),
(8, 'hbjngcv', 'xfbcb', 'fzb', '45', 'dgaz', 124343, '2018-04-02', 0),
(9, 'fhd', 'fhdx', 'thgutr', '98765', 'grdf', 344, '2018-04-21', 173),
(10, 'hgfg', 'hfj', 'fga', '5645', 'uitui', 5463, '2018-04-21', 3116);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `customer_id` int(11) NOT NULL,
  `product` varchar(20) NOT NULL,
  `quantity` int(11) NOT NULL,
  `quantity_type` varchar(20) NOT NULL,
  `price` double DEFAULT NULL,
  `tax` int(11) NOT NULL,
  `gst` double NOT NULL,
  `discount` double NOT NULL,
  `total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`customer_id`, `product`, `quantity`, `quantity_type`, `price`, `tax`, `gst`, `discount`, `total`) VALUES
(2, 'copy', 1, '3', 35, 5, 1.75, 5, 34.9125),
(4, 'pen', 7, '87', 100, 18, 126, 76, 198.24),
(4, 'copy', 0, 'PCS.', 0, 18, 0, 0, 0),
(7, 'pen', 0, 'PCS.', 0, 18, 0, 0, 0),
(7, 'copy', 5, 'PCS.', 10, 18, 9, 0, 59),
(8, 'pwn', 4, 'PCS.', 10, 18, 7.199999999999999, 0, 47.2),
(8, 'copy', 29, 'PCS.', 20, 18, 104.39999999999999, 0, 684.4),
(8, 'books', 3, 'PCS.', 100, 18, 54, 0, 354),
(9, 'copy', 3, 'PCS.', 10, 5, 1.5, 0, 31.5),
(9, 'cpy', 3, 'PCS.', 40, 18, 21.599999999999998, 0, 141.6),
(10, 'hj', 4, 'PCS.', 564, 5, 112.80000000000001, 0, 2368.8),
(10, 'jhg', 8, 'PCS.', 89, 5, 35.6, 0, 747.6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
