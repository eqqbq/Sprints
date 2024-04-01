create schema if not exists `Òptica Cul d'Ampolla` default character set utf8;
use `Òptica Cul d'Ampolla`

create table if not exists `Adress`(
`idAddress` int not null auto_increment,
`address_street` varchar(45) not null,
`address_num` VARCHAR(45) NOT NULL,
`address_apt` VARCHAR(45) NULL,
`address_city` VARCHAR(45) NOT NULL,
`address_zip` VARCHAR(5) NOT NULL,
`address_country` VARCHAR(45) NOT NULL,
`address_phone` VARCHAR(12) NOT NULL,
PRIMARY KEY (`address_id`);