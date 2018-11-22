-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 09 Février 2017 à 22:27
-- Version du serveur :  5.7.9
-- Version de PHP :  7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `g_vol`
--

-- --------------------------------------------------------

--
-- Structure de la table `aeroport`
--

DROP TABLE IF EXISTS `aeroport`;
CREATE TABLE IF NOT EXISTS `aeroport` (
  `nomAeroport` varchar(254) DEFAULT NULL,
  `idAeroport` varchar(10) NOT NULL,
  PRIMARY KEY (`idAeroport`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `aeroport`
--

INSERT INTO `aeroport` (`nomAeroport`, `idAeroport`) VALUES
('Charid El Idrissi', ' AHU'),
('ElMaasira', 'AGA'),
('Mohammed 5', 'CMN');

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `CIN` varchar(254) NOT NULL,
  `idComp` int(11) DEFAULT NULL,
  `prenomClient` varchar(254) DEFAULT NULL,
  `adresseClient` varchar(254) DEFAULT NULL,
  `telClient` bigint(20) DEFAULT NULL,
  `numFaxClient` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`CIN`),
  KEY `FK_association2` (`idComp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `compagnieaierienne`
--

DROP TABLE IF EXISTS `compagnieaierienne`;
CREATE TABLE IF NOT EXISTS `compagnieaierienne` (
  `idComp` int(11) NOT NULL,
  `nomCompAirien` varchar(254) DEFAULT NULL,
  PRIMARY KEY (`idComp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `dessert`
--

DROP TABLE IF EXISTS `dessert`;
CREATE TABLE IF NOT EXISTS `dessert` (
  `idVille` int(11) NOT NULL,
  `idAeroport` varchar(11) NOT NULL,
  PRIMARY KEY (`idVille`,`idAeroport`),
  KEY `FK_dessert` (`idAeroport`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `dessert`
--

INSERT INTO `dessert` (`idVille`, `idAeroport`) VALUES
(1, 'CMN');

-- --------------------------------------------------------

--
-- Structure de la table `passager`
--

DROP TABLE IF EXISTS `passager`;
CREATE TABLE IF NOT EXISTS `passager` (
  `nomPassager` varchar(254) DEFAULT NULL,
  `prenomPassager` varchar(254) DEFAULT NULL,
  `idPassager` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`idPassager`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `passager`
--

INSERT INTO `passager` (`nomPassager`, `prenomPassager`, `idPassager`) VALUES
('lmkmlkml', 'mlkmlkmlkml', 1);

-- --------------------------------------------------------

--
-- Structure de la table `proposevolcomplet`
--

DROP TABLE IF EXISTS `proposevolcomplet`;
CREATE TABLE IF NOT EXISTS `proposevolcomplet` (
  `idComp` int(11) NOT NULL,
  `numeroVol` int(11) NOT NULL,
  PRIMARY KEY (`idComp`,`numeroVol`),
  KEY `FK_proposevolcomplet` (`numeroVol`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE IF NOT EXISTS `reservation` (
  `numeroReservation` int(11) NOT NULL AUTO_INCREMENT,
  `CIN` varchar(254) NOT NULL,
  `idPassager` int(11) NOT NULL,
  `numeroVol` int(11) NOT NULL,
  `dateReservation` datetime DEFAULT NULL,
  `Confirme` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`numeroReservation`),
  KEY `FK_concerne` (`idPassager`),
  KEY `FK_effectuer` (`CIN`),
  KEY `FK_reservationVol` (`numeroVol`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `reservation`
--

INSERT INTO `reservation` (`numeroReservation`, `CIN`, `idPassager`, `numeroVol`, `dateReservation`, `Confirme`) VALUES
(2, '8', 1, 4, '2017-02-09 20:33:01', 1);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `Nom` varchar(256) NOT NULL,
  `Prenom` varchar(256) NOT NULL,
  `Pseudo` varchar(256) NOT NULL,
  `Password` varchar(256) NOT NULL,
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Type` varchar(256) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `users`
--

INSERT INTO `users` (`Nom`, `Prenom`, `Pseudo`, `Password`, `ID`, `Type`) VALUES
('Hamidine', 'Ayoub', 'Blank_rox', '3a41a6ed1495e6616673524a12c12d0e', 1, 'Admin'),
('', '', 'client', '25f9e794323b453885f5181f1b624d0b', 4, 'Comp'),
(':kmlkm', 'lklkmlkml', 'jljkljklj', '202cb962ac59075b964b07152d234b70', 7, 'Admin'),
('klhjjkl', 'mlkmlklk', 'ayoub', '25f9e794323b453885f5181f1b624d0b', 8, 'Client');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

DROP TABLE IF EXISTS `ville`;
CREATE TABLE IF NOT EXISTS `ville` (
  `idVille` int(11) NOT NULL AUTO_INCREMENT,
  `nomVille` varchar(254) DEFAULT NULL,
  `codePostale` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`idVille`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`idVille`, `nomVille`, `codePostale`) VALUES
(1, 'Casablanca', '29000'),
(8, 'Al Hoceima', '28510'),
(7, 'Agadir', '26310');

-- --------------------------------------------------------

--
-- Structure de la table `vol`
--

DROP TABLE IF EXISTS `vol`;
CREATE TABLE IF NOT EXISTS `vol` (
  `numeroVol` int(11) NOT NULL,
  `idVol` int(11) NOT NULL,
  `datedepart` datetime DEFAULT NULL,
  `datearive` datetime DEFAULT NULL,
  `idAeroport` int(11) NOT NULL,
  `Aer_idAeroport` int(11) NOT NULL,
  `idComp` int(11) NOT NULL,
  PRIMARY KEY (`numeroVol`,`idVol`),
  KEY `FK_association11` (`Aer_idAeroport`),
  KEY `FK_association12` (`idAeroport`),
  KEY `FK_proposevol` (`idComp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `volcomplet`
--

DROP TABLE IF EXISTS `volcomplet`;
CREATE TABLE IF NOT EXISTS `volcomplet` (
  `numeroVol` int(11) NOT NULL AUTO_INCREMENT,
  `nbVol` int(11) DEFAULT NULL,
  `DateDepart` date NOT NULL,
  `DateDarrive` date NOT NULL,
  `AeroportDepart` varchar(10) NOT NULL,
  `AeroportDarriv` varchar(10) NOT NULL,
  `Statut` tinyint(1) NOT NULL DEFAULT '1',
  `heuredepart` varchar(50) NOT NULL,
  `heuredarrive` varchar(50) NOT NULL,
  PRIMARY KEY (`numeroVol`),
  KEY `fkeyarivaero` (`AeroportDarriv`),
  KEY `AeroportDepart` (`AeroportDepart`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `volcomplet`
--

INSERT INTO `volcomplet` (`numeroVol`, `nbVol`, `DateDepart`, `DateDarrive`, `AeroportDepart`, `AeroportDarriv`, `Statut`, `heuredepart`, `heuredarrive`) VALUES
(5, 3, '2017-02-17', '2017-02-17', 'AGA', 'CMN', 1, 'Thu Jan 01 22:11:00 WET 1970', 'Thu Jan 01 13:31:00 WET 1970'),
(6, 1, '2017-02-24', '2017-02-24', ' AHU', 'CMN', 1, 'Thu Jan 01 22:11:00 WET 1970', 'Thu Jan 01 13:31:00 WET 1970');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
