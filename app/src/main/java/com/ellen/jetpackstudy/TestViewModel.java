package com.ellen.jetpackstudy;

import com.ellen.jetpackstudy.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class TestViewModel {

    public List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();
        for(int i=0;i<100;i++){
            Book book = new Book();
            book.setImageUrl(String.valueOf(i));
            book.setTitle("标题:"+i);
            book.setContent("内容:"+i);
            bookList.add(book);
        }
        return bookList;
    }
}
