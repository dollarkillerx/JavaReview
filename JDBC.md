JDBC Java DataBase Connectivity
===

### 推云拨雾
```
public static void demo1() {
        try {
            // 1. 加载驱动
            // DriverManager.registerDriver(new Driver()); 会导致驱动注册两次
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取链接                  url:jdbc:数据库://地址:端口/数据库名称
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
            // 3. 创建执行SQL语句的对象,并执行SQL
            // 3.1 创建执行SQL对象
            String sql = "select * from user";
            Statement stmt = conn.createStatement();
            // 3.2 执行SQL
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                int uid = resultSet.getInt("uid");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                System.out.println(uid + "    " + username + "   " + password + "   " + name);

            }
            // 4. 释放资源
            resultSet.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
```
### API全知道

#### API-DriverManager 驱动管理类
- 1.注册驱动
  - 实际开发中注册驱动方式
    - `Class.forName("com.mysql.jdbc.Driver")`
- 2.获得链接
  - `Conection getConnection(String url,String username,String password)`
    - url: jdbc:mysql://host:port/db_name  jdbc协议 mysql子协议
#### API-Connection 链接对象
- 创建执行SQL语句的对象
  - Statement createStatement() 执行sql语句 SQL注入漏洞存在
  - PreparedStatement prepareStatement(String sql) 预编译sql语句
  - CallbleStatement prepareCall(String sql) 执行sql中的存储过程
- 事务管理
  - setAutoCommit(bollean autoCommit) 设置事务是否自动提交
  - commit() 事务提交
  - rollback() 回滚

#### API-Statement 执行SQL语句对象
- 执行SQL语句
  - boolean execute(String sql) 执行sql 执行select返回true else return false; 不常用的
  - ResultSet executeQuery(String sql) 执行sql select语句
  - int executeUpdate(String sql) 执行sql中的 insert/update/delete语句
- 执行批处理
  - addBatch(String sql)  添加到批处理当中
  - executeBatch() 执行批处理
  - clearBatch() 清空批处理
  
#### API-ResultSet 结果集对象
- 结果集: select 查询到的结果的封装
- 获取查询到的结果
  - next() 获取到光标 是否有下一个记录
  - 针对不同的数据可以通过getXXX()获取数据 通用方法 getObject()

#### 小结
    ```
    package com.dollarkiller.jdbc.demo1;

    import java.sql.*;

    public class JDBCtest1 {
        public static void getInfo() {
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
                String sql = "SELECT * FROM `goods`";
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    Double price = resultSet.getDouble("price");
                    String desp = resultSet.getString("desp");
                    System.out.println("id: "+id+" name: "+name+" price: "+price+" desp: "+desp);
                }

            } catch (SQLException e){
                e.printStackTrace();

            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }finally {
                if (resultSet != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    resultSet = null;
                }
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    statement = null;
                }
                if (connection!=null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    connection = null;
                }
                
            }
        }

        public static void main(String[] args) {
            getInfo();
        }
    }
    ```

### JDBC CURD
- 增删改查
- 保存
    ```
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 创建链接
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
        // 创建sql对象
        statement = connection.createStatement();
        // 执行sql
        String sql = "INSERT INTO `user`(username,password,name) VALUE('eee','333','大王叫我来巡山')";
        int i = statement.executeUpdate(sql);
        // 处理返回
        if(i>0) {
            System.out.println("保存成功");
        }else{
            System.out.println("保存失败");
        }
    ```
- 删除
    ```
        public static void deleteData() {
            Connection connection = null;
            Statement statement = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
                statement = connection.createStatement();
                String sql = "DELETE FROM goods WHERE id = 1;";
                int i =  statement.executeUpdate(sql);
                if (i>0){
                    System.out.println("delete OK");
                }else {
                    System.out.println("delete No");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    statement = null;
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    connection = null;
                }
            }
        }
    ```
- 修改
    ```
    /**
        * 修改
        */
        public static void editData() {
            Connection connection = null;
            Statement statement = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
                statement = connection.createStatement();
                String sql = "UPDATE goods SET name='橘子手机' WHERE id = 1;";
                int i = statement.executeUpdate(sql);
                if (i>0) {
                    System.out.println("更新成功");
                }else{
                    System.out.println("更新失败");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    ```
- 查询
    ```
    /**
        * 获取所以记录
        */
        public static void getAllData() {
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
                statement = connection.createStatement();
                String sql = "SELECT * FROM goods";
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    System.out.println(name);
                }

            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    resultSet = null;
                }

                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    statement = null;
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    connection = null;
                }
            }
        }

        /**
        * 查询单条记录
        */
        public static void getOneData() {
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javaJDBC","javaJDBC","7jz7bSj6Jkj8jxxj");
                statement = connection.createStatement();
                String sql = "SELECT * FROM goods WHERE id=2";
                resultSet = statement.executeQuery(sql);
                if (resultSet.next()) {
                    System.out.println(resultSet.getString("name"));
                }

            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                if (resultSet != null) {
                    try {
                        resultSet.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    resultSet = null;
                }

                if (statement != null) {
                    try {
                        statement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    statement = null;
                }

                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    connection = null;
                }
                }
            }
    ```
- JDBC的工具类抽取
    ```
    package com.dollarkiller.jdbc.utils;

    import java.io.IOException;
    import java.io.InputStream;
    import java.sql.*;
    import java.util.Properties;

    /**
    * Created with IntelliJ IDEA.
    * User: dollarkiller
    * Date: 19-4-20
    * Time: 下午3:04
    * Description: JDBC 工具类
    */
    public class JDBCUitls {
        private static final String driverClass;
        private static final String url;
        private static final String username;
        private static final String password;
        static {
            // 加载属性文件并解析:
            Properties properties = new Properties();
            // 类加载器获取
            InputStream inStream = JDBCUitls.class.getClassLoader().getResourceAsStream("jdbc.properties");
            try {
                properties.load(inStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        }

        /**
        * 注册驱动
        * @throws ClassNotFoundException
        */
        public static void registerJDBCDrive() throws ClassNotFoundException {
            Class.forName(driverClass);
        }

        /**
        * 获得链接
        * @return
        * @throws SQLException
        */
        public static Connection getConnection() throws SQLException {
            Connection connection = DriverManager.getConnection(url,username,password);
            return connection;
        }


        public static void release(Statement statement,Connection connection) throws SQLException {
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null){
                connection.close();
                connection = null;
            }
        }

        public static void release(ResultSet resultSet,Statement statement,Connection connection) throws SQLException {
            if (resultSet != null) {
                resultSet.close();
                resultSet = null;
            }
            if (statement != null) {
                statement.close();
                statement = null;
            }
            if (connection != null){
                connection.close();
                connection = null;
            }
        }


    }
    ```
jdbc.properties
    ```
    driverClass=com.mysql.jdbc.Driver
    url=jdbc:mysql://127.0.0.1:3306/javaJDBC
    username=javaJDBC
    password=7jz7bSj6Jkj8jxxj
    ```
    - SQL注入漏洞
    ```
        public static boolean login(String username,String password) {
            boolean status = false;
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            try {
                JDBCUitls.registerJDBCDrive();
                connection = JDBCUitls.getConnection();
                statement = connection.createStatement();
                String sql = "SELECT * FROM user WHERE username = '" + username + "' AND password = '" + password + "'";
                resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    status = true;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    JDBCUitls.release(resultSet,statement,connection);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return status;
        }

        public static void main(String[] args) {
    //        if (login("aaa' or '1=1","111 OR id!=0")){
    //            System.out.println("login ok");
    //        }else{
    //            System.out.println("login out");
    //        }

            if (login("aaa' -- ","111 OR id!=0")){
                System.out.println("login ok");
            }else{
                System.out.println("login out");
            }
        }
    ```
- 注入漏洞解决 
  - 预处理对象 PreparedStatement
        ```
        public static boolean loginEx(String username,String password) {
            boolean status = false;
            Connection connection = null;
            PreparedStatement preparedStatement= null;
            ResultSet resultSet = null;
            try {
                JDBCUitls.registerJDBCDrive();
                connection = JDBCUitls.getConnection();
                String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
                // 预处理
                preparedStatement = connection.prepareStatement(sql);
                // 设置参数
                preparedStatement.setString(1,username);
                preparedStatement.setString(2,password);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    status = true;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    JDBCUitls.release(resultSet,preparedStatement,connection);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return status;
        }
        ```
    - PreparedStatement
    ....
### 数据库连接池
> 连接池是创建和管理一个连接的缓冲池的技术，这些连接准备好被任何需要它们的线程使用。
- C3P0 连接池
```
public static void testDemo() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
            comboPooledDataSource.setDriverClass("com.mysql.jdbc.Driver");
            comboPooledDataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/javaJDBC");
            comboPooledDataSource.setUser("javaJDBC");
            comboPooledDataSource.setPassword("7jz7bSj6Jkj8jxxj");
            connection = comboPooledDataSource.getConnection();

            String sql = "SELECT * FROM course";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                JDBCUitls.release(resultSet,preparedStatement,connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
```