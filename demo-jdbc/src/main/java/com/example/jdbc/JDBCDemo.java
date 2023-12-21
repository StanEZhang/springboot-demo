package com.example.jdbc;

import java.sql.*;

/**
 * @project: springboot-demo
 * @className: JDBCDemo
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-19
 */
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);
        // 3.定义sql
        String sql = "update person set name = '张三' where id = 1";
        // 4.获取执行sql的对象Statement
        Statement stmt = conn.createStatement();
        // 5.执行sql
        int count = stmt.executeUpdate(sql);
        // 6.处理结果
        System.out.println(count);
        // 7.释放资源
        stmt.close();
        conn.close();
    }
}
