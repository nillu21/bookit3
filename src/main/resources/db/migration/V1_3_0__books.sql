CREATE TABLE books (
    id   long         NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title varchar(255) NOT NULL,
    author varchar(255) not null,
    isbn varchar(255) default false
);

insert into books(title, author, ISBN) values ('java', 'Carl Carl', 'EE123456');
insert into books(title, author, ISBN) values ('java2', 'Carl4 Carl4', 'EE12345678');
insert into books(title, author, ISBN) values ('java3', 'Carl5 Carl5', 'EE12345678');
