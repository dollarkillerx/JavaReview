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
