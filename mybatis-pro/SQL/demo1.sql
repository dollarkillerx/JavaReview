CREATE TABLE `users_tab`(
    `id` INT UNSIGNED AUTO_INCREMENT,
    `username` VARCHAR(50) NOT NULL DEFAULT '',
    `userpass` VARCHAR(50) NOT NULL DEFAULT '',
    `nickname` VARCHAR(50) NOT NULL DEFAULT '',
    `age` INT UNSIGNED NOT NULL DEFAULT 0,
    `gender` VARCHAR(5) NOT NULL DEFAULT '',
    `phone` VARCHAR(13) NOT NULL DEFAULT '',
    `email` VARCHAR(20) NOT NULL DEFAULT '',
    `createTime` DATETIME,
    `updateTime` DATETIME,
    `lastLogin` DATETIME,
    `userStatus` TINYINT(1) NOT NULL DEFAULT 0 COMMENT '0正常1锁定2删除',
    `remark` VARCHAR(999) NOT NULL DEFAULT '',
    PRIMARY KEY(`id`),
    UNIQUE KEY`username`(`username`),
    KEY`userStatus`(`userStatus`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;