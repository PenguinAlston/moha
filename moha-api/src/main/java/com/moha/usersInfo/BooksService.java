package com.moha.usersInfo;

import com.moha.entities.BooksInfo;

import java.util.List;

public interface BooksService {
    List<BooksInfo> getAllBooks();

    List<BooksInfo> getAllSharedBooks();

    List<BooksInfo> getAllNotSharedBooks();

    int addBook(BooksInfo book);

    int batchAddBooks(List<BooksInfo> booksInfos);

    BooksInfo changeShareStatus(BooksInfo booksInfo);



}
