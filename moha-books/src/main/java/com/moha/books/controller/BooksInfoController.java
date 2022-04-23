package com.moha.books.controller;

import com.moha.entities.BooksInfo;
import com.moha.dubboApi.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @ClassName: BooksInfoController
 * @Description: books controller
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/books")
public class BooksInfoController {

    private static Logger logger = LoggerFactory.getLogger(BooksInfoController.class);

    @Resource
    private BooksService booksService;

    @PostMapping("/allBooks")
    public List<BooksInfo> getBooks(List<String> ids) {
        List<BooksInfo> books = booksService.getBooksByBatchID(ids);
        return books;
    }

    @PostMapping("/bookDetail")
    public BooksInfo getOneBook(@RequestBody  String bookId) {
        logger.info("传入的bookid：{}",bookId);
        BooksInfo booksInfo  =booksService.getBookByID(bookId);
        return booksInfo;
    }

}
