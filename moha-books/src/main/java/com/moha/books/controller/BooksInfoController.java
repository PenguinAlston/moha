package com.moha.books.controller;

import com.moha.entities.BooksInfo;
import com.moha.dubboApi.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: BooksInfoController
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
public class BooksInfoController {
    private static final Logger logger = LoggerFactory.getLogger(BooksInfoController.class);

    @Resource
    private BooksService booksService;

    public List<BooksInfo> getBooks(List<String> ids){
        List<BooksInfo> books = booksService.getBooksByBatchID(ids);
        return books;
    }


}
