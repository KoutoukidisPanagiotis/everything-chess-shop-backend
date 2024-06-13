USE `everything-chess-shop`;

INSERT INTO product_category(category_name) VALUES ('Books');
INSERT INTO product_category(category_name) VALUES ('Chess Sets');
INSERT INTO product_category(category_name) VALUES ('Chess Clocks');
INSERT INTO product_category(category_name) VALUES ('Accessories');




INSERT INTO `product` (`sku`, `name`, `description`, `image_url`, `active`, `units_in_stock`, `unit_price`, `category_id`, `date_created`)
VALUES
('BOOK-CHESS-1001', 'Chess Tactics for Beginners', 'A comprehensive guide for beginners to learn chess tactics. This book covers everything from basic strategies to advanced techniques. Enhance your chess skills with this essential guide!', 'assets/images/products/books/book-chess-1001.png', 1, 50, 19.99, 1, NOW()),
('BOOK-CHESS-1002', 'Mastering the Endgame', 'Unlock the secrets of endgame strategies with this in-depth guide. Learn essential endgame principles and techniques to outplay your opponents and secure victory!', 'assets/images/products/books/book-chess-1002.png', 1, 30, 24.99, 1, NOW()),
('BOOK-CHESS-1003', 'Opening Repertoire: Sicilian Defense', 'Build a solid opening repertoire with the Sicilian Defense. This book provides comprehensive coverage of various Sicilian lines, offering insights and strategies to dominate your opponents!', 'assets/images/products/books/book-chess-1003.png', 1, 40, 29.99, 1, NOW()),
('BOOK-CHESS-1004', 'Attack and Win with the King\'s Gambit', 'Unleash devastating attacks with the King\'s Gambit. This book explores the aggressive lines of the King\'s Gambit, providing analysis and tactics to crush your opponents and seize victory!', 'assets/images/products/books/book-chess-1004.png', 1, 20, 34.99, 1, NOW()),
('BOOK-CHESS-1005', 'Strategic Planning in Chess', 'Develop your strategic skills with this comprehensive guide to chess planning. Learn how to formulate long-term plans, assess positions, and execute winning strategies like a grandmaster!', 'assets/images/products/books/book-chess-1005.png', 1, 25, 39.99, 1, NOW()),
('BOOK-CHESS-1006', 'Tactical Patterns Workbook', 'Sharpen your tactical vision with this interactive workbook. Featuring hundreds of tactical puzzles and exercises, this book will improve your tactical awareness and help you win more games!', 'assets/images/products/books/book-chess-1006.png', 1, 60, 44.99, 1, NOW()),
('BOOK-CHESS-1007', 'Endgame Mastery: Rook Endings', 'Master rook endgames with this essential guide. Learn key concepts, maneuvers, and winning techniques to excel in rook endgame positions and secure victory!', 'assets/images/products/books/book-chess-1007.png', 1, 35, 49.99, 1, NOW()),
('BOOK-CHESS-1008', 'The Art of Defense in Chess', 'Learn the art of defense and resilience in chess with this insightful guide. Discover defensive techniques, counterplay strategies, and psychological tactics to turn the tables on your opponents!', 'assets/images/products/books/book-chess-1008.png', 1, 45, 54.99, 1, NOW()),
('BOOK-CHESS-1009', 'Winning with the French Defense', 'Dominate your opponents with the French Defense. This book offers a comprehensive repertoire against 1.e4, providing analysis, strategies, and tactical ideas to win with the French!', 'assets/images/products/books/book-chess-1009.png', 1, 55, 59.99, 1, NOW()),
('BOOK-CHESS-1010', 'Essential Pawn Structures', 'Master pawn structures to gain a strategic edge in your games. This book covers essential pawn formations, their strategic implications, and plans to exploit them for victory!', 'assets/images/products/books/book-chess-1010.png', 1, 65, 64.99, 1, NOW()),
('BOOK-CHESS-1011', 'Theoretical Battles in the Najdorf Variation', 'Navigate the complexities of the Najdorf Variation with this detailed analysis. Explore theoretical battles, key variations, and strategic ideas to excel in this dynamic opening!', 'assets/images/products/books/book-chess-1011.png', 1, 70, 69.99, 1, NOW()),
('BOOK-CHESS-1012', 'Calculation Training Handbook', 'Improve your calculation skills with this comprehensive training handbook. Featuring exercises, puzzles, and techniques, this book will sharpen your tactical vision and calculation accuracy!', 'assets/images/products/books/book-chess-1012.png', 1, 75, 74.99, 1, NOW()),
('BOOK-CHESS-1013', 'Winning with the Caro-Kann Defense', 'Harness the power of the Caro-Kann Defense to outmaneuver your opponents. This book provides a complete repertoire against 1.e4, offering analysis and strategic insights for success!', 'assets/images/products/books/book-chess-1013.png', 1, 80, 79.99, 1, NOW()),
('BOOK-CHESS-1014', 'Endgame Strategies: Queen vs. Minor Pieces', 'Master endgame strategies in queen vs. minor pieces scenarios. Learn winning techniques, maneuvers, and plans to convert your advantage into victory in these complex endgames!', 'assets/images/products/books/book-chess-1014.png', 1, 85, 84.99, 1, NOW()),
('BOOK-CHESS-1015', 'Opening Repertoire: Ruy Lopez', 'Build a strong opening repertoire with the Ruy Lopez. This book covers essential Ruy Lopez variations, providing analysis, strategies, and tactical ideas to dominate your opponents!', 'assets/images/products/books/book-chess-1015.png', 1, 90, 89.99, 1, NOW());




INSERT INTO `product` (`sku`, `name`, `description`, `image_url`, `active`, `units_in_stock`, `unit_price`, `category_id`, `date_created`)
VALUES
('CHESSSET-001', 'Staunton Tournament Chess Set', 'Classic Staunton design tournament chess set. Handcrafted with durable materials. Perfect for club and tournament play.', 'assets/images/products/chess_sets/chessset-001.png', 1, 20, 49.99, 2, NOW()),
('CHESSSET-002', 'Wooden Chess Set with Storage', 'Elegant wooden chess set with built-in storage. Features hand-carved pieces and a folding board for convenient storage and transport.', 'assets/images/products/chess_sets/chessset-002.png', 1, 15, 59.99, 2, NOW()),
('CHESSSET-003', 'Marble Chess Set', 'Luxurious marble chess set with intricately carved pieces. Each piece is handcrafted from high-quality marble, adding elegance to your chess games.', 'assets/images/products/chess_sets/chessset-003.png', 1, 10, 99.99, 2, NOW()),
('CHESSSET-004', 'Metallic Chess Set', 'Modern metallic chess set with a futuristic design. Crafted from durable metal alloys, this set adds a contemporary touch to your chess collection.', 'assets/images/products/chess_sets/chessset-004.png', 1, 25, 79.99, 2, NOW()),
('CHESSSET-005', 'Glass Chess Set', 'Sleek glass chess set with transparent pieces. The minimalist design enhances the visual appeal of the set, making it a stylish addition to any room.', 'assets/images/products/chess_sets/chessset-005.png', 1, 12, 69.99, 2, NOW()),
('CHESSSET-006', 'Medieval Chess Set', 'Recreate medieval battles with this themed chess set. Features hand-painted medieval-themed pieces and a board inspired by historical designs.', 'assets/images/products/chess_sets/chessset-006.png', 1, 8, 89.99, 2, NOW()),
('CHESSSET-007', 'Vintage Wooden Chess Set', 'Vintage-style wooden chess set with ornate detailing. Each piece is meticulously crafted to evoke a sense of nostalgia and elegance.', 'assets/images/products/chess_sets/chessset-007.png', 1, 18, 79.99, 2, NOW()),
('CHESSSET-008', 'Travel Magnetic Chess Set', 'Compact travel chess set with magnetic pieces. Ideal for playing on the go, this set ensures that pieces stay in place even during bumpy rides.', 'assets/images/products/chess_sets/chessset-008.png', 1, 30, 29.99, 2, NOW()),
('CHESSSET-009', 'Giant Chess Set', 'Giant-sized outdoor chess set for oversized fun. Perfect for gardens, parks, or large indoor spaces. The durable pieces are weather-resistant for long-lasting enjoyment.', 'assets/images/products/chess_sets/chessset-009.png', 1, 5, 199.99, 2, NOW()),
('CHESSSET-010', 'Japanese Shogi Set', 'Traditional Japanese Shogi set for playing the classic game of Shogi. Features wooden pieces with Japanese characters and a folding board for easy storage.', 'assets/images/products/chess_sets/chessset-010.png', 1, 10, 49.99, 2, NOW()),
('CHESSSET-011', 'Magnetic Travel Chess Set', 'Portable magnetic travel chess set for chess enthusiasts on the move. Compact design with magnetic pieces that stay in place, ensuring hassle-free gameplay.', 'assets/images/products/chess_sets/chessset-011.png', 1, 20, 39.99, 2, NOW()),
('CHESSSET-012', 'Glow-in-the-Dark Chess Set', 'Exciting glow-in-the-dark chess set for nighttime play. Features luminous pieces that glow brightly in the dark, adding a unique twist to your chess games.', 'assets/images/products/chess_sets/chessset-012.png', 1, 15, 79.99, 2, NOW()),
('CHESSSET-013', 'Alice in Wonderland Chess Set', 'Whimsical Alice in Wonderland-themed chess set. Features characters from the beloved tale as chess pieces, adding a touch of fantasy to your games.', 'assets/images/products/chess_sets/chessset-013.png', 1, 7, 69.99, 2, NOW()),
('CHESSSET-014', 'Metal Staunton Chess Set', 'Modern twist on the classic Staunton design with metallic pieces. Sleek and durable, this set is perfect for both casual and competitive play.', 'assets/images/products/chess_sets/chessset-014.png', 1, 22, 89.99, 2, NOW()),
('CHESSSET-015', 'Wooden Magnetic Chess Set', 'Traditional wooden chess set with magnetic pieces for secure gameplay. Compact and lightweight, this set is ideal for travel or playing on smaller surfaces.', 'assets/images/products/chess_sets/chessset-015.png', 1, 25, 49.99, 2, NOW());

INSERT INTO `product` (`sku`, `name`, `description`, `image_url`, `active`, `units_in_stock`, `unit_price`, `category_id`, `date_created`)
VALUES
('CLOCK-001', 'Digital Chess Clock', 'Digital chess clock with customizable settings. Features LCD display, easy-to-use buttons, and durable construction. Perfect for tournament and casual play.', 'assets/images/products/chess_clocks/clock-001.png', 1, 30, 39.99, 3, NOW()),
('CLOCK-002', 'Analog Chess Clock', 'Classic analog chess clock with traditional wind-up mechanism. Sturdy construction and precise timing make it ideal for serious chess players and enthusiasts.', 'assets/images/products/chess_clocks/clock-002.png', 1, 20, 49.99, 3, NOW()),
('CLOCK-003', 'DGT North American Chess Clock', 'Official DGT North American chess clock with simple operation and reliable performance. Designed for tournament use and approved by FIDE.', 'assets/images/products/chess_clocks/clock-003.png', 1, 15, 69.99, 3, NOW()),
('CLOCK-004', 'Mechanical Chess Clock', 'Mechanical chess clock with classic lever operation. Solid construction and precise timing ensure fair gameplay for both players.', 'assets/images/products/chess_clocks/clock-004.png', 1, 25, 59.99, 3, NOW()),
('CLOCK-005', 'Digital Chess Timer', 'Compact digital chess timer with intuitive controls. Features countdown and count-up modes, making it suitable for blitz, rapid, and classical games.', 'assets/images/products/chess_clocks/clock-005.png', 1, 35, 29.99, 3, NOW()),
('CLOCK-006', 'Fischer Chess Clock', 'Replica of the iconic Fischer chess clock used in historic tournaments. Features the signature design and precise timing that made it legendary.', 'assets/images/products/chess_clocks/clock-006.png', 1, 10, 99.99, 3, NOW()),
('CLOCK-007', 'DGT 3000 Chess Clock', 'Advanced DGT 3000 chess clock with innovative features. Offers multiple timing modes, pre-programmed settings, and USB connectivity for firmware updates.', 'assets/images/products/chess_clocks/clock-007.png', 1, 5, 149.99, 3, NOW()),
('CLOCK-008', 'Pocket Chess Clock', 'Compact pocket-sized chess clock for portable gameplay. Features a sturdy case and reliable timing mechanism, making it ideal for travel and outdoor play.', 'assets/images/products/chess_clocks/clock-008.png', 1, 40, 19.99, 3, NOW()),
('CLOCK-009', 'Chess Timer and Alarm Clock', 'Dual-function chess timer and alarm clock for versatile use. Keep track of game time and use it as a regular alarm clock for everyday use.', 'assets/images/products/chess_clocks/clock-009.png', 1, 18, 34.99, 3, NOW()),
('CLOCK-010', 'Digital Game Clock', 'Sleek digital game clock with modern design. Features touch-sensitive buttons and adjustable time controls, making it easy to set up for various games.', 'assets/images/products/chess_clocks/clock-010.png', 1, 22, 54.99, 3, NOW()),
('CLOCK-011', 'Quartz Chess Clock', 'Precise quartz chess clock with silent operation. Enjoy uninterrupted gameplay with no ticking sound, perfect for focused concentration during matches.', 'assets/images/products/chess_clocks/clock-011.png', 1, 8, 44.99, 3, NOW()),
('CLOCK-012', 'Chess Timer with Delay', 'Chess timer with delay feature for adding extra thinking time during critical moments. Customize delay settings to suit your playing style and preferences.', 'assets/images/products/chess_clocks/clock-012.png', 1, 12, 64.99, 3, NOW()),
('CLOCK-013', 'Professional Chess Clock', 'Professional-grade chess clock designed for serious players and tournaments. Offers precise timing, durable construction, and easy-to-read displays for hassle-free gameplay.', 'assets/images/products/chess_clocks/clock-013.png', 1, 7, 79.99, 3, NOW()),
('CLOCK-014', 'Chess Timer with Bonus', 'Chess timer with bonus time feature for rewarding aggressive play. Gain additional time for making certain moves, adding excitement and strategy to your games.', 'assets/images/products/chess_clocks/clock-014.png', 1, 15, 74.99, 3, NOW()),
('CLOCK-015', 'Chess Clock and Scorekeeper', 'Combination chess clock and scorekeeper for comprehensive game management. Keep track of time and scores with ease, enhancing the overall gaming experience.', 'assets/images/products/chess_clocks/clock-015.png', 1, 20, 89.99, 3, NOW());

INSERT INTO `product` (`sku`, `name`, `description`, `image_url`, `active`, `units_in_stock`, `unit_price`, `category_id`, `date_created`)
VALUES
('ACCESSORY-001', 'Chess Bag with Shoulder Strap', 'Durable chess bag with adjustable shoulder strap for easy transport. Features multiple compartments to store chess pieces, boards, and accessories.', 'assets/images/products/accessories/accessory-001.png', 1, 30, 24.99, 4, NOW()),
('ACCESSORY-002', 'Chess Scorebook', 'Keep track of your games with this handy chess scorebook. Features space to record moves, results, and notes for future reference.', 'assets/images/products/accessories/accessory-002.png', 1, 50, 9.99, 4, NOW()),
('ACCESSORY-003', 'Chess Piece Storage Box', 'Organize and protect your chess pieces with this wooden storage box. Features felt-lined compartments to keep pieces safe and secure during storage and transport.', 'assets/images/products/accessories/accessory-003.png', 1, 20, 19.99, 4, NOW()),
('ACCESSORY-004', 'Chess Clock Bag', 'Protect your chess clock during travel with this padded bag. Designed to fit most standard-sized chess clocks, it provides cushioning and protection against bumps and scratches.', 'assets/images/products/accessories/accessory-004.png', 1, 15, 14.99, 4, NOW()),
('ACCESSORY-005', 'Chess-themed T-shirt', 'Show off your love for chess with this stylish chess-themed T-shirt. Made from soft and comfortable fabric, it features a unique chess-inspired design.', 'assets/images/products/accessories/accessory-005.png', 1, 50, 19.99, 4, NOW()),
('ACCESSORY-006', 'Chess Keychain', 'Carry your passion for chess everywhere with this chess keychain. Made from durable metal, it features a miniature chess piece design that adds a touch of elegance to your keys.', 'assets/images/products/accessories/accessory-006.png', 1, 100, 4.99, 4, NOW()),
('ACCESSORY-007', 'Chess Notepad', 'Stay organized with this chess-themed notepad. Perfect for jotting down game ideas, opening strategies, or keeping track of chess-related tasks.', 'assets/images/products/accessories/accessory-007.png', 1, 80, 7.99, 4, NOW()),
('ACCESSORY-008', 'Chess-themed Mug', 'Start your day with a cup of coffee in this chess-themed mug. Features a chessboard design and chess pieces pattern, making it the perfect gift for chess enthusiasts.', 'assets/images/products/accessories/accessory-008.png', 1, 60, 12.99, 4, NOW()),
('ACCESSORY-009', 'Chess Cap', 'Protect yourself from the sun while showcasing your passion for chess with this stylish chess cap. Features an embroidered chess piece design and adjustable strap for a comfortable fit.', 'assets/images/products/accessories/accessory-009.png', 1, 40, 14.99, 4, NOW()),
('ACCESSORY-010', 'Chess Puzzle Book', 'Challenge yourself with this collection of chess puzzles and brain teasers. Featuring a variety of difficulty levels, it\'s perfect for players looking to improve their tactical skills.', 'assets/images/products/accessories/accessory-010.png', 1, 25, 17.99, 4, NOW()),
('ACCESSORY-011', 'Chess-themed Phone Case', 'Protect your phone with this stylish chess-themed phone case. Made from durable materials, it features a chessboard design that adds a touch of sophistication to your device.', 'assets/images/products/accessories/accessory-011.png', 1, 30, 9.99, 4, NOW()),
('ACCESSORY-012', 'Chess Magnet Set', 'Decorate your fridge or magnetic board with this set of chess magnets. Each magnet features a miniature chess piece design, adding a fun and stylish touch to any magnetic surface.', 'assets/images/products/accessories/accessory-012.png', 1, 70, 6.99, 4, NOW()),
('ACCESSORY-013', 'Chess-themed Socks', 'Step up your sock game with these chess-themed socks. Made from soft and stretchy fabric, they feature a fun chessboard design that adds personality to your outfit.', 'assets/images/products/accessories/accessory-013.png', 1, 45, 8.99, 4, NOW()),
('ACCESSORY-014', 'Chess Bookmark', 'Mark your place in your favorite chess books with this elegant chess bookmark. Made from metal alloy, it features a chess piece design that adds a touch of sophistication to your reading.', 'assets/images/products/accessories/accessory-014.png', 1, 90, 3.99, 4, NOW()),
('ACCESSORY-015', 'Chess-themed Wall Clock', 'Add a touch of elegance to your home or office with this chess-themed wall clock. Features a chessboard design and chess pieces as hour markers, making it a stylish decor piece for any chess enthusiast.', 'assets/images/products/accessories/accessory-015.png', 1, 35, 29.99, 4, NOW());


INSERT INTO `role` (`role_name`) VALUES ('ADMIN'), ('CUSTOMER');

INSERT INTO `user` (`first_name`, `last_name`, `email`, `password`, `phone_number`, `role_id`)
VALUES
 ('Admin', 'Admin', 'admin@admin.com', '$2a$10$8R.Zuszyyx7Q1IVhFlYpMOVD5eIgJC7umt9AW6Vd8h9hK01TiP7IC', 6980000000, 1),
 ('Customer', 'Customer', 'customer@customer.com', '$2a$10$XRCxZ92axjpXU5ujbGc8vuG/LPvUk3m.1PTUWbXDR2GT4mLE.zj2a', 6980000001, 2);




