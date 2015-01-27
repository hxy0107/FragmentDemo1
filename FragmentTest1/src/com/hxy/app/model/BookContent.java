package com.hxy.app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/1/26.
 */
public class BookContent {
    //定义Book类
    public static class Book{
        public Integer id;
        public String title;
        public String detail;
        public Book(Integer id,String title,String detail){
            this.id=id;
            this.title=title;
            this.detail=detail;
        }
        public String toString(){
            return this.title;
        }
    }
    //构造添加内容
    public static List<Book> bookList=new ArrayList<Book>();
    public static Map<Integer,Book> bookMap=new HashMap<Integer, Book>();
    private static void addBook(Book book){
        bookList.add(book);
        bookMap.put(book.id,book);
    }
    //使用添加函数
    static{
        addBook(new Book(1,"C primer","最畅销的c书，最畅销的c书，最畅销的c书，最畅销的c书，最畅销的c书"));
        addBook(new Book(2,"C++ primer","最爱C++，最爱C++，最爱C++，最爱C++，最爱C++，最爱C++，最爱C++"));
        addBook(new Book(3,"Thinking in java","读书百遍其义自现，读书百遍其义自现，读书百遍其义自现，读书百遍其义自现"));
    }
}
