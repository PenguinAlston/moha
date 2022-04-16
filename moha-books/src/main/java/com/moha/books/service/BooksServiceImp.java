package com.moha.books.service;

import com.moha.books.mapper.BooksMapper;
import com.moha.entities.BooksInfo;
import com.moha.usersInfo.BooksService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: BooksServiceImp
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@Service
@DubboService
public class BooksServiceImp implements BooksService {

    private static final Logger logger = LoggerFactory.getLogger(BooksServiceImp.class);

    @Autowired
    private BooksMapper booksMapper;


    @Override
    public List<BooksInfo> getAllBooks() {
        booksMapper.selectList();
        return null;
    }

    @Override
    public List<BooksInfo> getAllSharedBooks() {
        return null;
    }

    @Override
    public List<BooksInfo> getAllNotSharedBooks() {
        return null;
    }

    @Override
    public int addBook(BooksInfo book) {
        return 0;
    }

    @Override
    public int batchAddBooks(List<BooksInfo> booksInfos) {
        return 0;
    }

    @Override
    public BooksInfo changeShareStatus(BooksInfo booksInfo) {
        return null;
    }
}
