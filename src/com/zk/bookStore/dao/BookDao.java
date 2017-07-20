package com.zk.bookStore.dao;

import com.zk.bookStore.model.Book;
import com.zk.bookStore.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by meng on 2017/7/19.
 */
public class BookDao {
    public void bookAdd(Book book){
        String sql = "INSERT INTO book(bname,category,auther,discount,price,amount,profile) VALUE (?,?,?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = DBUtil.getConn();
            ps = conn.prepareStatement(sql);
            System.out.println(book.getAuthor());
            ps.setString(1,book.getBname());
            ps.setString(2,book.getCategory());
            ps.setString(3,book.getAuthor());
            ps.setDouble(4,book.getDiscount());
            ps.setDouble(5,book.getPrice());
            ps.setInt(6,book.getAmount());
            ps.setString(7,book.getProfile());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (ps != null || conn != null){
                try {
                    ps.close();
                    ps = null;
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
