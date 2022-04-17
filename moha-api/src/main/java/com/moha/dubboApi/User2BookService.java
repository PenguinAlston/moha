package com.moha.dubboApi;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moha.entities.BooksInfo;
import com.moha.entities.User2Books;

import java.util.List;

public interface User2BookService extends IService<User2Books> {

    List<BooksInfo> getUserBooks(String userId);

    List<BooksInfo> getUserSharedBooks(String userId);

    List<BooksInfo> getUserUnsharedBooks(String userId);

    int addBooks(String userId,List<BooksInfo> booksInfos);

    List<String> getAllBookID(String userId);
}
