// GOODS
CREATE TABLE IF NOT EXISTS `goods`(
    `id` INT UNSIGNED AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '商品名称',
    `price` FLOAT(5,2) NOT NULL DEFAULT 0 COMMENT 'goods price',
    `desp` VARCHAR(30) NOT NULL DEFAULT '' COMMENT 'goods desp',
    PRIMARY KEY (`id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;

INSERT `goods`(`name`,`price`,`desp`) VALUES
('手机',2000.0,'黑色容量32G'),
('冰箱',1500.0,'樱色对开门'),
('洗衣机',3000.0,'滚筒'),
('空调',4000,'变频');

// sourse
CREATE TABLE IF NOT EXISTS `course`(
    `id` INT UNSIGNED AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL DEFAULT '',
    `category` VARCHAR(20) NOT NULL DEFAULT '',
    `desp` VARCHAR(20) NOT NULL DEFAULT '',
    `createTime` INT NOT NULL ,
    PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;

INSERT `course`(`name`,`category`,`desp`,`createTime`) VALUES
('JAVA零基础','Java','java基础语法',1555751347),
('Java Web','Java','java基础语法',1555751347),
('前段小白','前端','HTML/CSS',1555751347);