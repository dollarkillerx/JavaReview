package com.dollarkiller.jdbc.demo1;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午1:01
 * Description: No Description
 */
public class JDBCDemo1 {

    public static void demo1() {
        try {
            // 1. 加载驱动
//            DriverManager.registerDriver(new Driver()); 会导致驱动注册两次
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
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        demo1();
    }

}

