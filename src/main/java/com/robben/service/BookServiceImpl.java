package com.robben.service;

import com.robben.dao.BookMapper;
import com.robben.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }
    //业务层调DAO层，故组合DAO层

    private BookMapper bookMapper;

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
