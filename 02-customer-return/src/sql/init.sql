
DROP  TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(30) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into `user` (`email`,`name`) values  ( 'nick@qq.com', 'nick');
insert into `user` (`email`,`name`) values  ( 'elaine@qq.com', 'elaine');

