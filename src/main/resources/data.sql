INSERT INTO author (name) VALUES ('Author 1');
INSERT INTO author (name) VALUES ('Author 2');
INSERT INTO author (name) VALUES ('Author 3');
INSERT INTO author (name) VALUES ('Author 4');
INSERT INTO author (name) VALUES ('Author 5');
INSERT INTO author (name) VALUES ('Author 6');
INSERT INTO author (name) VALUES ('Author 7');
INSERT INTO author (name) VALUES ('Author 8');
INSERT INTO author (name) VALUES ('Author 9');
INSERT INTO author (name) VALUES ('Author 10');

INSERT INTO category (name) VALUES ('Fiction');
INSERT INTO category (name) VALUES ('Science Fiction');
INSERT INTO category (name) VALUES ('Fantasy');
INSERT INTO category (name) VALUES ('Non-fiction');
INSERT INTO category (name) VALUES ('Mystery');
INSERT INTO category (name) VALUES ('Romance');
INSERT INTO category (name) VALUES ('Thriller');
INSERT INTO category (name) VALUES ('Horror');
INSERT INTO category (name) VALUES ('Biography');
INSERT INTO category (name) VALUES ('History');

INSERT INTO publisher (name, street, city, state, zip_code) VALUES ('Publisher 1', '123 Main St', 'CityA', 'ST', '12345');
INSERT INTO publisher (name, street, city, state, zip_code) VALUES ('Publisher 2', '456 Elm St', 'CityB', 'ST', '23456');
INSERT INTO publisher (name, street, city, state, zip_code) VALUES ('Publisher 3', '789 Oak St', 'CityC', 'ST', '34567');
INSERT INTO publisher (name, street, city, state, zip_code) VALUES ('Publisher 4', '101 Pine St', 'CityD', 'ST', '45678');
INSERT INTO publisher (name, street, city, state, zip_code) VALUES ('Publisher 5', '202 Maple St', 'CityE', 'ST', '56789');

INSERT INTO book (title, publication_year, isbn, category_id, publisher_id) VALUES ('Book 1', 2001, '1234567890123', 1, 1);
INSERT INTO book (title, publication_year, isbn, category_id, publisher_id) VALUES ('Book 2', 2002, '1234567890124', 2, 2);
INSERT INTO book (title, publication_year, isbn, category_id, publisher_id) VALUES ('Book 3', 2003, '1234567890125', 3, 3);
INSERT INTO book (title, publication_year, isbn, category_id, publisher_id) VALUES ('Book 4', 2004, '1234567890126', 4, 4);
INSERT INTO book (title, publication_year, isbn, category_id, publisher_id) VALUES ('Book 5', 2005, '1234567890127', 5, 5);

INSERT INTO book_author (book_id, author_id) VALUES (1, 1);
INSERT INTO book_author (book_id, author_id) VALUES (2, 2);
INSERT INTO book_author (book_id, author_id) VALUES (3, 3);
INSERT INTO book_author (book_id, author_id) VALUES (4, 4);
INSERT INTO book_author (book_id, author_id) VALUES (5, 5);
