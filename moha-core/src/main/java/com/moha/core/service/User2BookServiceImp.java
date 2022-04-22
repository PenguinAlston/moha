package com.moha.core.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moha.core.mapper.User2BookMapper;
import com.moha.dubboApi.BooksService;
import com.moha.dubboApi.User2BookService;
import com.moha.dubboApi.UsersService;
import com.moha.entities.BooksInfo;
import com.moha.entities.User2Books;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: User2BookServiceImp
 * @Description: user2book service 
 * @Author: shao1
 * @Version: 1.0
 **/
@Service
public class User2BookServiceImp extends ServiceImpl<User2BookMapper,User2Books> implements User2BookService {

    private static final Logger logger = LoggerFactory.getLogger(User2BookServiceImp.class);

    @Resource
    private User2BookMapper user2BookMapper;

    @DubboReference
    private BooksService booksService;

    @DubboReference
    private UsersService usersService;


    @Override
    public List<BooksInfo> getUserBooks(String userId) {
        /**
         * 1、根据userid获取所有bookid
         * 2、根据bookid获取所有的书籍 返回给数据
         */
        logger.info("用户：{} 开始查看所有书籍信息",userId);
        QueryWrapper<User2Books> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userid",userId);
        List<User2Books> user2Books = user2BookMapper.selectList(queryWrapper);
        List<String> booksId= new ArrayList<>();
        user2Books.forEach((u)-> booksId.add(u.getBookId()));
        List<BooksInfo> books = booksService.getBooksByBatchID(booksId);
        return books;
    }

    @Override
    public List<BooksInfo> getUserSharedBooks(String userId) {
        return null;
    }

    @Override
    public List<BooksInfo> getUserUnsharedBooks(String userId) {
        return null;
    }

    @Override
    public int addBooks(String userId, List<BooksInfo> booksInfos) {
        //1、判断用户信息是否存在
        int result=-1;
        boolean b = usersService.isExistsUserInfo(userId);
        if(b){
            logger.info("该用户信息不存在");
            return  result;
        }
        //添加user2books信息 bookinfo转换为表 user2Books信息
        List<User2Books> u2books=new ArrayList<>();
       ;
        u2books.add( new User2Books("",""));
        booksInfos.forEach((book)-> u2books.add(new User2Books(userId,book.getBookid())));





        return 0;
    }

    @Override
    public List<String> getAllBookID(String userId) {
        return null;
    }
}
