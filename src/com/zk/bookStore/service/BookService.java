package com.zk.bookStore.service;

import com.zk.bookStore.dao.BookDao;
import com.zk.bookStore.model.Book;

/**
 * Created by meng on 2017/7/19.
 */
public class BookService {
    BookDao bookDao = new BookDao();
    public void addBook(Book book){
        bookDao.bookAdd(book);
    }
}
