CREATE USER IF NOT EXISTS 'everythingchess'@'localhost' IDENTIFIED BY 'everythingchess';
GRANT ALL PRIVILEGES ON `everything-chess-shop`.* TO 'everythingchess'@'localhost';
FLUSH PRIVILEGES;
