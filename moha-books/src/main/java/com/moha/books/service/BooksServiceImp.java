package com.moha.books.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moha.books.mapper.BooksMapper;
import com.moha.entities.BooksInfo;
import com.moha.dubboApi.BooksService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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

    @Resource
    private BooksMapper booksMapper;


    @Override
    public BooksInfo getBookByID(String bookID) {
        BooksInfo booksInfo = booksMapper.selectById(bookID);
        return booksInfo;
    }

    /**
     * 根据书籍id获书籍信息
     * @param bookIDS
     * @return
     */
    @Override
    public List<BooksInfo> getBooksByBatchID(List<String> bookIDS) {
        List<BooksInfo> booksInfos = booksMapper.selectBatchIds(bookIDS);
        return booksInfos;
    }

    /**
     *  获取全部已经共享的书籍
     * isShared:0 表示该书籍已经共享
     * @return
     */
    @Override
    public List<BooksInfo> getAllSharedBooks() {
        QueryWrapper<BooksInfo> sharedBooksWrapper = new QueryWrapper<>();
        sharedBooksWrapper.eq("isShared",0);
        List<BooksInfo> booksInfoList = booksMapper.selectList(sharedBooksWrapper);
        return booksInfoList;
    }

    /**
     * 获取全部未共享的书籍
     * isShared:1 未共享
     * @return
     */
    @Override
    public List<BooksInfo> getAllNotSharedBooks() {
        QueryWrapper<BooksInfo> sharedBooksWrapper = new QueryWrapper<>();
        sharedBooksWrapper.eq("isShared",1);
        List<BooksInfo> booksInfoList = booksMapper.selectList(sharedBooksWrapper);
        return booksInfoList;
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
