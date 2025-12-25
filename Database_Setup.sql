-- =============================================
-- Database Name : chemistry
-- Project       : Periodic Table Console App
-- Description   : Stores chemical element data
-- Author        : Syed Muhammad
-- Technologies  : MySQL, JDBC, Core Java
-- =============================================

/*
  Periodic Table Management System
  --------------------------------
  This SQL script populates the 'elements' table with all
  118 chemical elements of the periodic table.

  The data is used by a Java console-based application
  that accesses the database using JDBC for searching,
  filtering, and displaying element information.
*/

CREATE DATABASE chemistry;

USE chemistry;

CREATE TABLE elements (
atomic_number INT PRIMARY KEY,
name VARCHAR(50),
symbol VARCHAR(5),
atomic_mass DECIMAL(8,4),
period INT,
group_no INT,
category VARCHAR(30),
state_at_room_temp VARCHAR(20)
);


INSERT INTO elements VALUES
(1,'Hydrogen','H',1.008,1,1,'Nonmetal','Gas'),
(2,'Helium','He',4.0026,1,18,'Noble Gas','Gas'),
(3,'Lithium','Li',6.94,2,1,'Alkali Metal','Solid'),
(4,'Beryllium','Be',9.0122,2,2,'Alkaline Earth Metal','Solid'),
(5,'Boron','B',10.81,2,13,'Metalloid','Solid'),
(6,'Carbon','C',12.011,2,14,'Nonmetal','Solid'),
(7,'Nitrogen','N',14.007,2,15,'Nonmetal','Gas'),
(8,'Oxygen','O',15.999,2,16,'Nonmetal','Gas'),
(9,'Fluorine','F',18.998,2,17,'Halogen','Gas'),
(10,'Neon','Ne',20.180,2,18,'Noble Gas','Gas'),

(11,'Sodium','Na',22.990,3,1,'Alkali Metal','Solid'),
(12,'Magnesium','Mg',24.305,3,2,'Alkaline Earth Metal','Solid'),
(13,'Aluminium','Al',26.982,3,13,'Post-transition Metal','Solid'),
(14,'Silicon','Si',28.085,3,14,'Metalloid','Solid'),
(15,'Phosphorus','P',30.974,3,15,'Nonmetal','Solid'),
(16,'Sulfur','S',32.06,3,16,'Nonmetal','Solid'),
(17,'Chlorine','Cl',35.45,3,17,'Halogen','Gas'),
(18,'Argon','Ar',39.948,3,18,'Noble Gas','Gas'),

(19,'Potassium','K',39.098,4,1,'Alkali Metal','Solid'),
(20,'Calcium','Ca',40.078,4,2,'Alkaline Earth Metal','Solid'),
(21,'Scandium','Sc',44.956,4,3,'Transition Metal','Solid'),
(22,'Titanium','Ti',47.867,4,4,'Transition Metal','Solid'),
(23,'Vanadium','V',50.942,4,5,'Transition Metal','Solid'),
(24,'Chromium','Cr',51.996,4,6,'Transition Metal','Solid'),
(25,'Manganese','Mn',54.938,4,7,'Transition Metal','Solid'),
(26,'Iron','Fe',55.845,4,8,'Transition Metal','Solid'),
(27,'Cobalt','Co',58.933,4,9,'Transition Metal','Solid'),
(28,'Nickel','Ni',58.693,4,10,'Transition Metal','Solid'),
(29,'Copper','Cu',63.546,4,11,'Transition Metal','Solid'),
(30,'Zinc','Zn',65.38,4,12,'Transition Metal','Solid'),
(31,'Gallium','Ga',69.723,4,13,'Post-transition Metal','Solid'),
(32,'Germanium','Ge',72.630,4,14,'Metalloid','Solid'),
(33,'Arsenic','As',74.922,4,15,'Metalloid','Solid'),
(34,'Selenium','Se',78.971,4,16,'Nonmetal','Solid'),
(35,'Bromine','Br',79.904,4,17,'Halogen','Liquid'),
(36,'Krypton','Kr',83.798,4,18,'Noble Gas','Gas'),

(37,'Rubidium','Rb',85.468,5,1,'Alkali Metal','Solid'),
(38,'Strontium','Sr',87.62,5,2,'Alkaline Earth Metal','Solid'),
(39,'Yttrium','Y',88.906,5,3,'Transition Metal','Solid'),
(40,'Zirconium','Zr',91.224,5,4,'Transition Metal','Solid'),
(41,'Niobium','Nb',92.906,5,5,'Transition Metal','Solid'),
(42,'Molybdenum','Mo',95.95,5,6,'Transition Metal','Solid'),
(43,'Technetium','Tc',98,5,7,'Transition Metal','Solid'),
(44,'Ruthenium','Ru',101.07,5,8,'Transition Metal','Solid'),
(45,'Rhodium','Rh',102.91,5,9,'Transition Metal','Solid'),
(46,'Palladium','Pd',106.42,5,10,'Transition Metal','Solid'),
(47,'Silver','Ag',107.87,5,11,'Transition Metal','Solid'),
(48,'Cadmium','Cd',112.41,5,12,'Transition Metal','Solid'),
(49,'Indium','In',114.82,5,13,'Post-transition Metal','Solid'),
(50,'Tin','Sn',118.71,5,14,'Post-transition Metal','Solid'),
(51,'Antimony','Sb',121.76,5,15,'Metalloid','Solid'),
(52,'Tellurium','Te',127.60,5,16,'Metalloid','Solid'),
(53,'Iodine','I',126.90,5,17,'Halogen','Solid'),
(54,'Xenon','Xe',131.29,5,18,'Noble Gas','Gas'),

(55,'Cesium','Cs',132.91,6,1,'Alkali Metal','Solid'),
(56,'Barium','Ba',137.33,6,2,'Alkaline Earth Metal','Solid'),

(57,'Lanthanum','La',138.91,6,NULL,'Lanthanide','Solid'),
(58,'Cerium','Ce',140.12,6,NULL,'Lanthanide','Solid'),
(59,'Praseodymium','Pr',140.91,6,NULL,'Lanthanide','Solid'),
(60,'Neodymium','Nd',144.24,6,NULL,'Lanthanide','Solid'),
(61,'Promethium','Pm',145,6,NULL,'Lanthanide','Solid'),
(62,'Samarium','Sm',150.36,6,NULL,'Lanthanide','Solid'),
(63,'Europium','Eu',151.96,6,NULL,'Lanthanide','Solid'),
(64,'Gadolinium','Gd',157.25,6,NULL,'Lanthanide','Solid'),
(65,'Terbium','Tb',158.93,6,NULL,'Lanthanide','Solid'),
(66,'Dysprosium','Dy',162.50,6,NULL,'Lanthanide','Solid'),
(67,'Holmium','Ho',164.93,6,NULL,'Lanthanide','Solid'),
(68,'Erbium','Er',167.26,6,NULL,'Lanthanide','Solid'),
(69,'Thulium','Tm',168.93,6,NULL,'Lanthanide','Solid'),
(70,'Ytterbium','Yb',173.05,6,NULL,'Lanthanide','Solid'),
(71,'Lutetium','Lu',174.97,6,3,'Lanthanide','Solid'),

(72,'Hafnium','Hf',178.49,6,4,'Transition Metal','Solid'),
(73,'Tantalum','Ta',180.95,6,5,'Transition Metal','Solid'),
(74,'Tungsten','W',183.84,6,6,'Transition Metal','Solid'),
(75,'Rhenium','Re',186.21,6,7,'Transition Metal','Solid'),
(76,'Osmium','Os',190.23,6,8,'Transition Metal','Solid'),
(77,'Iridium','Ir',192.22,6,9,'Transition Metal','Solid'),
(78,'Platinum','Pt',195.08,6,10,'Transition Metal','Solid'),
(79,'Gold','Au',196.97,6,11,'Transition Metal','Solid'),
(80,'Mercury','Hg',200.59,6,12,'Transition Metal','Liquid'),
(81,'Thallium','Tl',204.38,6,13,'Post-transition Metal','Solid'),
(82,'Lead','Pb',207.2,6,14,'Post-transition Metal','Solid'),
(83,'Bismuth','Bi',208.98,6,15,'Post-transition Metal','Solid'),
(84,'Polonium','Po',209,6,16,'Metalloid','Solid'),
(85,'Astatine','At',210,6,17,'Halogen','Solid'),
(86,'Radon','Rn',222,6,18,'Noble Gas','Gas'),

(87,'Francium','Fr',223,7,1,'Alkali Metal','Solid'),
(88,'Radium','Ra',226,7,2,'Alkaline Earth Metal','Solid'),

(89,'Actinium','Ac',227,7,NULL,'Actinide','Solid'),
(90,'Thorium','Th',232.04,7,NULL,'Actinide','Solid'),
(91,'Protactinium','Pa',231.04,7,NULL,'Actinide','Solid'),
(92,'Uranium','U',238.03,7,NULL,'Actinide','Solid'),
(93,'Neptunium','Np',237,7,NULL,'Actinide','Solid'),
(94,'Plutonium','Pu',244,7,NULL,'Actinide','Solid'),
(95,'Americium','Am',243,7,NULL,'Actinide','Solid'),
(96,'Curium','Cm',247,7,NULL,'Actinide','Solid'),
(97,'Berkelium','Bk',247,7,NULL,'Actinide','Solid'),
(98,'Californium','Cf',251,7,NULL,'Actinide','Solid'),
(99,'Einsteinium','Es',252,7,NULL,'Actinide','Solid'),
(100,'Fermium','Fm',257,7,NULL,'Actinide','Solid'),
(101,'Mendelevium','Md',258,7,NULL,'Actinide','Solid'),
(102,'Nobelium','No',259,7,NULL,'Actinide','Solid'),
(103,'Lawrencium','Lr',266,7,3,'Actinide','Solid'),

(104,'Rutherfordium','Rf',267,7,4,'Transition Metal','Solid'),
(105,'Dubnium','Db',268,7,5,'Transition Metal','Solid'),
(106,'Seaborgium','Sg',269,7,6,'Transition Metal','Solid'),
(107,'Bohrium','Bh',270,7,7,'Transition Metal','Solid'),
(108,'Hassium','Hs',277,7,8,'Transition Metal','Solid'),
(109,'Meitnerium','Mt',278,7,9,'Transition Metal','Solid'),
(110,'Darmstadtium','Ds',281,7,10,'Transition Metal','Solid'),
(111,'Roentgenium','Rg',282,7,11,'Transition Metal','Solid'),
(112,'Copernicium','Cn',285,7,12,'Transition Metal','Solid'),
(113,'Nihonium','Nh',286,7,13,'Post-transition Metal','Solid'),
(114,'Flerovium','Fl',289,7,14,'Post-transition Metal','Solid'),
(115,'Moscovium','Mc',290,7,15,'Post-transition Metal','Solid'),
(116,'Livermorium','Lv',293,7,16,'Post-transition Metal','Solid'),
(117,'Tennessine','Ts',294,7,17,'Halogen','Solid'),
(118,'Oganesson','Og',294,7,18,'Noble Gas','Gas');
show databases;


