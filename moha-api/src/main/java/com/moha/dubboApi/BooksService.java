package com.moha.dubboApi;

import com.moha.entities.BooksInfo;

import java.util.List;

public interface BooksService {
    BooksInfo getBookByID(String bookID);

    List<BooksInfo> getBooksByBatchID(List<String> bookIDS);

    List<BooksInfo> getAllSharedBooks();

    List<BooksInfo> getAllNotSharedBooks();

    int addBook(BooksInfo book);

    int batchAddBooks(List<BooksInfo> booksInfos);

    BooksInfo changeShareStatus(BooksInfo booksInfo);



}
