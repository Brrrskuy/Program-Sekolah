-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 05, 2021 at 04:44 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.3.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `koneksi`
--

-- --------------------------------------------------------

--
-- Table structure for table `guru`
--

CREATE TABLE `guru` (
  `id` int(10) NOT NULL,
  `nig` int(10) NOT NULL,
  `nama_guru` varchar(20) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `jk` varchar(10) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `lulusan` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `mengajar` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `guru`
--

INSERT INTO `guru` (`id`, `nig`, `nama_guru`, `tempat_lahir`, `tgl_lahir`, `keterangan`, `jk`, `jabatan`, `lulusan`, `status`, `mengajar`) VALUES
(1, 1100020, 'Rini Maharani', 'Bogor', '01-08-1991', 'Sehat', 'Perempuan', 'Guru', 'S1', 'Swasta', 'IPA'),
(2, 1100021, 'Rahman', 'Depok', '04-09-1982', 'Sehat', 'Laki-Laki', 'Guru', 'S2', 'Swasta', 'Matematika'),
(3, 1100022, 'Dwi Juliansyah', 'Tangerang', '12-11-1989', 'Sehat', 'Laki-Laki', 'Guru', 'S1', 'Swasta', 'Fisika'),
(4, 1100023, 'Sri Rahayu', 'Jakarta', '22-01-1979', 'Sehat', 'Perempuan', 'Guru', 'S2', 'Swasta', 'Seni Budaya'),
(5, 1100024, 'Rifqi Rahman', 'Depok', '30-10-1991', 'Sehat', 'Laki-Laki', 'Guru', 'S1', 'Swasta', 'Bahasa Indonesia'),
(6, 1100025, 'Ani', 'Bojong Gede', '28-02-1989', 'Sehat', 'Perempuan', 'Guru', 'S1', 'Swasta', 'Bahasa Inggris'),
(7, 1100026, 'Sri Rahayu', 'Banjarmasin', '21-08-1979', 'Sehat', 'Perempuan', 'Guru', 'S1', 'Swasta', 'PKN'),
(8, 1100027, 'Yusuf', 'Bandung', '08-08-1978', 'Sehat', 'Laki-Laki', 'Guru', 'S1', 'Swasta', 'Agama'),
(9, 1100028, 'Zaki', 'Lewiliang', '10-09-1986', 'Sehat', 'Laki-Laki', 'Guru', 'S1', 'Swasta', 'Penjaskes');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `id` int(10) NOT NULL,
  `kodepel` int(10) NOT NULL,
  `mapel` varchar(20) NOT NULL,
  `kelas` varchar(10) NOT NULL,
  `nig` int(20) NOT NULL,
  `nama_guru` varchar(20) NOT NULL,
  `hari` varchar(20) NOT NULL,
  `jm` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`id`, `kodepel`, `mapel`, `kelas`, `nig`, `nama_guru`, `hari`, `jm`) VALUES
(1, 220, 'IPA', '1A', 1100020, 'Rini Maharani', 'Senin', '08:00-10:00'),
(2, 221, 'Matematika', '1A', 1100021, 'Rahman', 'Senin', '10:30-12:30'),
(3, 222, 'Fisika', '1A', 1100022, 'Dwi Juliansyah', 'Selasa', '08:00-10:00'),
(4, 223, 'Seni Budaya', '1A', 1100023, 'Sri Rahayu', 'Selasa', '10:30-12:30'),
(5, 224, 'Bahasa Indonesia', '1A', 1100024, 'Rifqi Rahman', 'Rabu', '08:00-10:00'),
(6, 225, 'Bahasa Inggris', '1A', 1100025, 'Ani', 'Rabu', '10:30-12:30'),
(7, 226, 'PKN', '1A', 1100026, 'Sri Rahayu', 'Kamis', '08:00-10:00'),
(8, 227, 'Agama', '1A', 1100027, 'Yusuf', 'Kamis', '10:30-12:30'),
(9, 228, 'Penjaskes', '1A', 1100028, 'Zaki', 'Jumat', '08:00-11:00');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `level` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `level`) VALUES
(1, 'admin', '123', 'admin'),
(2, 'guru', '123', 'guru');

-- --------------------------------------------------------

--
-- Table structure for table `nilai`
--

CREATE TABLE `nilai` (
  `id` int(10) NOT NULL,
  `nis` int(20) NOT NULL,
  `nama_siswa` varchar(20) NOT NULL,
  `kodepel` int(10) NOT NULL,
  `mapel` varchar(20) NOT NULL,
  `tugas` varchar(20) NOT NULL,
  `ulangan` varchar(20) NOT NULL,
  `uts` varchar(20) NOT NULL,
  `uas` varchar(20) NOT NULL,
  `ratarata` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `nilai`
--

INSERT INTO `nilai` (`id`, `nis`, `nama_siswa`, `kodepel`, `mapel`, `tugas`, `ulangan`, `uts`, `uas`, `ratarata`) VALUES
(1, 2021435001, 'Rizky Agus', 223, 'Seni Budaya', '74', '77', '81', '79', '77.75'),
(2, 2021435001, 'Rizky Agus', 222, 'Fisika', '78', '77', '81', '79', '78.75'),
(3, 2021435001, 'Rizky Agus', 221, 'Matematika', '79', '81', '83', '80', '80.75'),
(4, 2021435001, 'Rizky Agus', 224, 'Bahasa Indonesia', '78', '79', '86', '84', '81.75'),
(5, 2021435001, 'Rizky Agus', 226, 'PKN', '82', '80', '86', '85', '83.25'),
(6, 2021435002, 'Anwar Gani', 220, 'IPA', '80', '84', '87', '83', '83.5'),
(7, 2021435001, 'Rizky Agus', 228, 'Penjaskes', '78', '88', '86', '83', '83.75'),
(8, 2021435001, 'Rizky Agus', 220, 'IPA', '81', '84', '87', '85', '84.25'),
(9, 2021435002, 'Anwar Gani', 221, 'Matematika', '87', '82', '85', '84', '84.5'),
(10, 2021435001, 'Rizky Agus', 227, 'Agama', '90', '86', '82', '83', '85.25'),
(11, 2021435001, 'Rizky Agus', 225, 'Bahasa Inggris', '90', '87', '87', '83', '86.75'),
(12, 2021435004, 'Novia Lacuba', 223, 'Seni Budaya', '80', '83', '82', '82', '81.7'),
(13, 2021435003, 'Lisna Wati', 224, 'Bahasa Indonesia', '80', '83', '80', '88', '82.7'),
(14, 2021435005, 'Dwi Cahyani', 224, 'Bahasa Indonesia', '86', '82', '78', '87', '83.2');

-- --------------------------------------------------------

--
-- Table structure for table `presensi`
--

CREATE TABLE `presensi` (
  `id` int(10) NOT NULL,
  `nis` int(20) NOT NULL,
  `nama_siswa` varchar(20) NOT NULL,
  `keterangan` varchar(30) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `presensi`
--

INSERT INTO `presensi` (`id`, `nis`, `nama_siswa`, `keterangan`, `tgl`) VALUES
(1, 2021435001, 'Rizky Agus', 'Hadir', '2021-06-29'),
(2, 2021435002, 'Anwar Gani', 'Hadir', '2021-06-29'),
(3, 2021435003, 'Lisna Wati', 'Hadir', '2021-06-29'),
(4, 2021435004, 'Novia Lacuba', 'Hadir', '2021-06-29'),
(5, 2021435005, 'Dwi Cahyani', 'Hadir', '2021-07-02'),
(6, 2021435001, 'Rizky Agus', 'Hadir', '2021-07-03'),
(7, 2021435002, 'Anwar Gani', 'Hadir', '2021-07-03'),
(8, 2021435002, 'Anwar Gani', 'Hadir', '2021-07-18'),
(9, 2021435001, 'Rizky Agus', 'Hadir', '2021-07-29'),
(10, 2021435002, 'Anwar Gani', 'Hadir', '2021-07-30'),
(11, 2021435003, 'Lisna Wati', 'Hadir', '2021-07-30');

-- --------------------------------------------------------

--
-- Table structure for table `presensi_guru`
--

CREATE TABLE `presensi_guru` (
  `id` int(10) NOT NULL,
  `nig` int(10) NOT NULL,
  `nama_guru` varchar(20) NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `presensi_guru`
--

INSERT INTO `presensi_guru` (`id`, `nig`, `nama_guru`, `keterangan`, `tgl`) VALUES
(1, 1100020, 'Rini Maharani', 'Hadir', '2021-07-02'),
(2, 1100022, 'Dwi Juliansyah', 'Hadir', '2021-07-02'),
(3, 1100021, 'Rahman', 'Hadir', '2021-07-03'),
(4, 1100022, 'Dwi Juliansyah', 'Hadir', '2021-07-03'),
(5, 1100024, 'Rifqi Rahman', 'Hadir', '2021-07-03'),
(6, 1100025, 'Ani', 'Hadir', '2021-07-03');

-- --------------------------------------------------------

--
-- Table structure for table `prestasi`
--

CREATE TABLE `prestasi` (
  `id` int(10) NOT NULL,
  `nis` int(20) NOT NULL,
  `nama_siswa` varchar(20) NOT NULL,
  `prestasi` varchar(30) NOT NULL,
  `keterangan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prestasi`
--

INSERT INTO `prestasi` (`id`, `nis`, `nama_siswa`, `prestasi`, `keterangan`) VALUES
(1, 2021435001, 'Rizky Agus', 'Olympiade Sains', 'Juara 2'),
(2, 2021435003, 'Lisna Wati', 'Olympiade Fisika', 'Juara 3'),
(3, 2021435002, 'Anwar Gani', 'Olympiade Catur', 'Juara 1'),
(4, 2021435004, 'Novia Lacuba', 'Olympiade Tari', 'Juara 2');

-- --------------------------------------------------------

--
-- Table structure for table `siswa`
--

CREATE TABLE `siswa` (
  `no_daftar` int(10) NOT NULL,
  `tgl_daftar` varchar(30) NOT NULL,
  `nis` int(20) NOT NULL,
  `nama_siswa` varchar(30) NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tgl_lahir` varchar(30) NOT NULL,
  `jk` varchar(30) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `kelas` varchar(20) NOT NULL,
  `wali` varchar(30) NOT NULL,
  `alamat` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `siswa`
--

INSERT INTO `siswa` (`no_daftar`, `tgl_daftar`, `nis`, `nama_siswa`, `tempat_lahir`, `tgl_lahir`, `jk`, `agama`, `kelas`, `wali`, `alamat`) VALUES
(1, '06-07-2021', 2021435001, 'Rizky Agus', 'Bogor', '18-08-2015', 'Laki-Laki', 'Islam', '1A', 'Rusdianto', 'Cimanggis'),
(2, '09-07-2021', 2021435002, 'Anwar Gani', 'Bogor', '11-02-2015', 'Laki-Laki', 'Islam', '1A', 'Supardi', 'Bilabong'),
(3, '10-08-2021', 2021435003, 'Lisna Wati', 'Depok', '07-07-2015', 'Perempuan', 'Islam', '1A', 'Fahrul Roji', 'Kemuning'),
(4, '10-08-2021', 2021435004, 'Novia Lacuba', 'Citayam', '12-09-2015', 'Perempuan', 'Islam', '1A', 'Rosman', 'Cluster 3'),
(5, '11-08-2021', 2021435005, 'Dwi Cahyani', 'Cilebut', '19-01-2015', 'Perempuan', 'Islam', '1A', 'Rosidin', 'Jack Vallet');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `guru`
--
ALTER TABLE `guru`
  ADD PRIMARY KEY (`nig`),
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `nig` (`nig`);

--
-- Indexes for table `nilai`
--
ALTER TABLE `nilai`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `presensi`
--
ALTER TABLE `presensi`
  ADD UNIQUE KEY `id` (`id`);

--
-- Indexes for table `presensi_guru`
--
ALTER TABLE `presensi_guru`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prestasi`
--
ALTER TABLE `prestasi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `siswa`
--
ALTER TABLE `siswa`
  ADD PRIMARY KEY (`no_daftar`),
  ADD UNIQUE KEY `no_daftar` (`no_daftar`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_ibfk_1` FOREIGN KEY (`nig`) REFERENCES `guru` (`nig`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `jadwal_ibfk_2` FOREIGN KEY (`id`) REFERENCES `nilai` (`id`) ON UPDATE NO ACTION;

--
-- Constraints for table `presensi_guru`
--
ALTER TABLE `presensi_guru`
  ADD CONSTRAINT `presensi_guru_ibfk_1` FOREIGN KEY (`id`) REFERENCES `guru` (`id`) ON UPDATE NO ACTION;

--
-- Constraints for table `prestasi`
--
ALTER TABLE `prestasi`
  ADD CONSTRAINT `prestasi_ibfk_1` FOREIGN KEY (`id`) REFERENCES `siswa` (`no_daftar`) ON UPDATE NO ACTION;

--
-- Constraints for table `siswa`
--
ALTER TABLE `siswa`
  ADD CONSTRAINT `siswa_ibfk_1` FOREIGN KEY (`no_daftar`) REFERENCES `presensi` (`id`) ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
