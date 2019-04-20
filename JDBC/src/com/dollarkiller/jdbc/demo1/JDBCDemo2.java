package com.dollarkiller.jdbc.demo1;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * User: dollarkiller
 * Date: 19-4-20
 * Time: 下午2:14
 * Description: No Description
 */
public class JDBCDemo2 {
    /**
     * 保存操作
     */
    public static void saveData() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
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

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if (resultSet != null ){
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (statement !=null ) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection !=null ) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

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


    public static void main(String[] args) {
//        saveData();
//        editData();
//        deleteData();
//        getAllData();
        getOneData();
    }

}
