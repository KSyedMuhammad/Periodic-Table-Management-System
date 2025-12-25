-- =============================================
-- Table Name : users
-- Purpose    : Stores application user details
--              for signup and login functionality
-- =============================================
-- This database supports authentication and periodic table data management

CREATE TABLE users (
id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(50) UNIQUE NOT NULL,
password VARCHAR(100) NOT NULL,
role VARCHAR(20) DEFAULT 'USER'
);