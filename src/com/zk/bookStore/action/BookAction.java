package com.zk.bookStore.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zk.bookStore.model.Book;
import com.zk.bookStore.service.BookService;

/**
 * Created by meng on 2017/7/19.
 */
public class BookAction extends ActionSupport {
    private String bname;
    private String[] category;
    private String author;
    private String discount;
    private String price;
    private String amount;
    private String profile;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }



    @Override
    public String execute() throws Exception {
        System.out.println(author);
        //种类进行遍历，取出字符串
        String cate = "";
        for(String c : category){
            cate += c + ",";
        }
        //折扣
        double disc = Double.parseDouble(discount);
        //价格
        double pri = Double.parseDouble(price);
        //数量
        int amou = Integer.parseInt(amount);
        Book book = new Book();
        book.setBname(bname);
        book.setAmount(amou);
        book.setAuthor(author);
        book.setCategory(cate);
        book.setDiscount(disc);
        book.setCategory(cate);
        book.setPrice(pri);
        System.out.println(book);
        BookService bookService = new BookService();
        bookService.addBook(book);
        return SUCCESS;
    }
}
