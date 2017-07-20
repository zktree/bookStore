package com.zk.bookStore.model;

/**
 * Created by meng on 2017/7/19.
 */
public class Book {
    private int bid;
    private String bname;
    private String category;
    private String author;
    private double discount;
    private double price;
    private int amount;
    private String profile;

    public Book() {
    }

    public Book(int bid, String bname, String category, String author, double discount, double price, int amount, String profile) {
        this.bid = bid;
        this.bname = bname;
        this.category = category;
        this.author = author;
        this.discount = discount;
        this.price = price;
        this.amount = amount;
        this.profile = profile;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
