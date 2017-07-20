package com.zk.bookStore.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by meng on 2017/7/19.
 */
public class DBUtil {
    private static Connection conn;
    private static String url = "jdbc:mysql://localhost:3306/bookstore";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConn(){
        try {
            conn = DriverManager.getConnection(url,"root","7632023");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
