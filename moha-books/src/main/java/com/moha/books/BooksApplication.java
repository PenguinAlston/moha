package com.moha.books;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: BooksApplication
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan("com.moha.books.mapper")
public class BooksApplication {
    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class,args);
    }
}
