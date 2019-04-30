DROP TABLE IF EXISTS author;
CREATE TABLE `author` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL,
`phone` varchar(20) NULL,
`email` varchar(20) NULL,
PRIMARY KEY (`id`)
);
DROP TABLE IF EXISTS book;
CREATE TABLE `book` (
`id` bigint(20) NOT NULL AUTO_INCREMENT,
`name` varchar(20) NULL,
`isbn` varchar(20) NULL,
`author_id` bigint(20) NULL,
PRIMARY KEY (`id`)
);
-- ALTER TABLE `book` ADD CONSTRAINT `fk_author` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`);

insert into author (name,phone,email) values ('NICK','18022222222','nick@112.com');
insert into author (name,phone,email) values ('elaine','17022222222','elaine@112.com');
insert into book (isbn,name,author_id) values ('xxxxx','我的人生',1)