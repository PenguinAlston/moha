package com.moha.core.controller;

import com.moha.dubboApi.User2BookService;
import com.moha.entities.BooksInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @ClassName: CoreUser2BookController
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/core")
public class CoreUser2BookController {

    @Autowired
    private User2BookService user2BookService;

    @GetMapping("/allbook/{userId}")
    public void getAllBooks(@PathParam("userId") String userId){
        //根据用户id查询出所有的书籍信息 并返回
        List<BooksInfo> books = user2BookService.getUserBooks(userId);


    }
}
