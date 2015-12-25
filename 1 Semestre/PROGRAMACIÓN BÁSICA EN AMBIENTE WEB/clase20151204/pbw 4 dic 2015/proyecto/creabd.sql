drop database proyectopbw;
create database proyectopbw;
GRANT ALL ON proyectopbw.* TO invitado@localhost IDENTIFIED BY 'invitado';

CREATE TABLE `proyectopbw`.`login` (
`user` VARCHAR( 10 ) NOT NULL ,
`password` VARCHAR( 10 ) NOT NULL ,
`name` VARCHAR( 20 ) NOT NULL ,
PRIMARY KEY ( `user` )
) ENGINE = InnoDB;
INSERT INTO `proyectopbw`.`login` (`user`, `password`, `name`)
VALUES ('abueno', 'abueno', 'Abel Bueno');

