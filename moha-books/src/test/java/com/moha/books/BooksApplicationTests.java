package com.moha.books;

import com.moha.dubboApi.BooksService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: BooksApplicationTests
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootTest
public class BooksApplicationTests {
    @Autowired
    private BooksService booksService;

    @Test
    void testSelectTest(){
        List<String> ids= Arrays.asList("1","2");
       booksService.getBooksByBatchID(ids).forEach(System.out::println);
    }
}
