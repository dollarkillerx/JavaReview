重拾MySQL
===
- 安装Mysql
  - `docker pull mysql`
  - `docker run -d --name mysql -e MYSQL_ROOT_PASSWORD=root mysql:5.7.25`

- 常用命令
  - 登录 `mysql -uroot -p`
  - 退出 `exit` or `quit`
  - 获取当前登录用户信息 `SELECT USER()`
  - 获取当前版本 `SELECT VERSION()`
  - 获取当前时间 `SELECT NOW()`
  - 获取当前打开的数据库`SELECT DATABASE()`


- 创建数据库
```
CREATE DATABASE db_name;
```
- 创建数据表
```
CREATE TABLE `tab_name`(
    `id` INT UNSIGNED AUTO_INCREMENT COMMENT "this is id",
    `name` VARCHAR(255) NOT NULL DEFUALT '' COMMENT 'this is name',
    `email` VARCHAR(255) UNIQUE NOT NULL DEFAULT '' ,
    PRIMARY KEY(`id`),
    KEY `email`(`email`)
)ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
```
- 查询
```
SELECT * FROM  tab_name WHERE `id` = 1
```
- 关联查询
```
SELECT a.name,b.name FROM `tab_a` AS a JOIN `tab_b` AS b WHERER a.id = b.id;
```
- Left Join
```
SELECT a.name,b.name FROM `tab_a` AS a LEFT JOIN `tab_b` AS b WHERE a.id = b.id;
if a中的表有些没有和b中的表关联 a中的数据也会全部查询出来 后面跟的是null
```
- Right Join
```
SELECT a.name,b.name FROM `tab_a` AS a RIGHT JOIN `tab_b` AS b WHERE a.id = b.id;
if b中的数据没有和a中的关联 也会全部查询出来 前面跟null
```
- Full Join
全关联
```
SELECT A.NAME,B.NAME FROM TAB_A AS A FILL JOIN TAB_B AS B WHERE A.ID = B. ID
不管a b是否关联都会被查询出来 前后 null
```
这里我想到一道题 求两张表的差集
```
SELECT a.name,b.name FROM tab_a AS a FULL JOIN tab_b AS b WHERE a.name = null OR
a.name = null;
```
- IN操作符
```
SELECT * FROM tab WHERE lastname IN ('Adam','Carter')
```
- LIKE 与 NOT LIKE
```
SELECT * FROM tab WHERE city LIKE 'N%'; N开头
SELECT * FROM tab WHERE city LIKE '%B'; B结尾
SELECT * FROM tab WHERE city LINK '%张%'; 包含张

SELECT * FROM tab WHERE city NOT LINK '%张%'; 不包含张
```
- BETWEEN 取范围
```
SELECT * FROM Persons WHERE TIME
BETWEEN '2017' AND '2018'
取time字段 2017到2018范围的字段
```
- UNION 取多张表相同字段的交集
```
SELECT * FROM tab_name1
UNION
SELECT * FROM tab_name2
默认会去掉重复的

UNION ALL不会去掉重复的
```
- VIEW视图


- 创建数据表
    - `CREATE DATABASE [IF NOT EXISTS] DNNAME`
    - `CREATE DATABASE [IF NOT EXISTS] db_name DEFAULT CHARACTER SET [=] UTF8`
    - 查询 `SHOW CREATE DATABASE db_name`
    - 修改 `ALTER DATABASE db_name DEFAULT CHARACTER SET [=] UTF8`
    - 打开数据库 `USE db_name`
    - 得到当前打开的数据库 `SELECT DATABASE()`
    - 删除 `DROP DATABASE db_name`  `DROP DATABSE [IF EXISTS] dn_name`
    ```
    CREATE TABLE IF NOT EXISTS user(
        `id` INT UNSIGNED AOTO_INCREMENT,
        `username` VARCHAR(32) NOT NULL DEFAULT '' COMMENT 'USERNAME',
        `password` CHAR(32) NOT NULL DEFAULT '',
        `sex` ENUM('男','女','保密'),
        PRIMARY KEY(`id`),
        UNIQUE KEY `username`(`username`)
    )ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=UTF8;
    ```
    -  查看
       -  `SHOW CREATE TABLE tab_name`
       -  `SHOW TABLES`
       -  `DESC tab_name`
    -  删除
       -  `DROP TABLE [IF EXISTS] tab_name`
    -  完整性约束条件
       -  unsigned 无符号
       -  zerof 0填充
       -  NOT NULL 非空
       -  默认值 DEFAULT 0
       -  PRIMARY KEY 主键
       -  UNIQUE KEY 唯一性
       -  auto_increment 自动增长 
       -  FOREIGN KEY 外键约束
-  操作
   -  插入
      -  `INSERT [INTO] tab_name(id,user,password) VALUES(1,WANG,122332213)`
      -  插入有value 和values 批量插入和单次插入
   -  查询
      - `SELECT * FROM tab_name WHERE 条件` 
-  类型
   -  TEXT不能有默认值,检索不存在大小写转换 
   -  枚举 编号开始为1 只能选1个 `sex` ENUM("男","女","保密") 插入 INSERT tab_name(`sex`) VALUE(1') 
   -  集合 可以选多个 a SET('a','b','c','d') 插入 INSERT tab_name(`a`) VALUE('a,c,d')
   -  复合主键
      ```
      CREATE TABLE test(
         id INT UNSIGNED AUTO_INCREMENT,
         courseId INT UNSIGNEQ,
         PRIMARY KEY(id,courseId)
      )
      ```

#### 表结构相关操作
- 添加字段 `ALTER TABLE tab_name ADD 字段名称 字段属性 [约束] [FIRST|AFTER字段名称]`
- 删除字段 `ALTER TABLE tab-name DROP 字段名称`
- 添加默认值 `ALTER TABLE tab_name ALTER 字段名称 SET DEFAULT ...`
- 删除默认值 `ALTER TABLE tab_name ALTER 字段名称 DROP DEFAULT`
- MODIFY和CHANGE关键字的使用
  - 修改字段类型 完整性约束条件
    - `ALTER TABLE tab-name MODIFY 字段名称 字段类型[字段属性]`
    - `ALTER TABLE tab-name CHANGE  原字段名称 新字段名称 字段类型[字段属性]`
- CURD
  - INSERT
    - `INSERT [INFO] tab-name() {VALUE|VALUES}(VALUE...)`
  - UPDATE
    - `UPDATE tab-name SET 字段名称=值,...`
  - DELETE
    - `DELETE FROM tab_name`
  - SELECT
    - `SELECT * FROM tab_name`

- 我的大SELECT
   ```
   SELECT ..,.. FROM tab_name
   [WHERE]
   [GROUP BY {col_name|posistion} HAVING 二次筛选]
   [ORDER BY {col_name|posistion|} [ASC|DESC]]
   [LIMIT]
   ```
   - 检测值在一个范围 BETWEEN AND
     - `SELECT id,username,age,sex FROM user1 WHERE age BETWEEN 18 AND 30;`
     - 不在某个范围 NOT BETWEEN AND
   - 指定集合
     - [NOT] IN (value,...)
   - 分组
     - `SELECT * FROM tab_name GROUP BY(\`sex\`)` 通过sex字段对数据进行分组
     - 通过Having子句对结果二次分组
     - `SELECT * FROM tab-name GROUP BY(\`sex\`) HAVING (`age`>15)`
   - ORDER BY 随机获取数据
     - `SELECT id,username.age FROM user1 ORDER BY RAND()`
 - 多表联查
   - 笛卡尔积 `SELSECT a.id,b.name FROM a,b`
   - 外链接 
   - 内链接 `SELECT a.id,b.name FROM a JOIN b ON a.id = b.id`
 - 外键约束
   - `[CONSTRAINT 外键名称] FOREIGN KEY(字段名称)REFERENCES 主表(字段名称)`
 - 子查询的使用
   - `SELECT name FROM tab_name WHERE col_name=(SELECT ...)`
      ```
      SELECT id FROM emp
      WHERE depId IN (SELECT id FROM dep)
      ```
   - `SELECT * FROM emp WHERE EXISTS (SELECT depName FROM dep WHERE id = 10)`
   - 带有ANY、SOME、ALL关键字的子查询
 - 自身链接查询 重要 (无限极分类)
   ```
   SELECT s.id,s.cateName AS sCateName,p.cateName AS pCateName
   FROM cate AS s
   LEFT JOIN cate AS p
   ```