
CREATE TABLE users (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    age  number       NOT NULL
);

INSERT INTO users (name, age)
VALUES ('kaspar', 15);