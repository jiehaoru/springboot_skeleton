package com.jhr.dao;

import com.jhr.dao.po.Book;


import java.util.List;
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    Book selectByPrimaryKey(Integer bookId);

    List<Book> selectAll();

    int updateByPrimaryKey(Book record);


}