package com.moha.users.servce.imp;

import com.moha.entities.UsersInfo;
import com.moha.users.mapper.UserMapper;
import com.moha.usersInfo.UsersService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: UsersServiceImp
 * @Description: 用户服务
 * @Author: shao1
 * @Version: 1.0
 **/
@Service
@DubboService
public class UsersServiceImp implements UsersService {

    private Logger logger = LoggerFactory.getLogger(UsersServiceImp.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UsersInfo> getAllUsersInfo() {
        logger.info("开始获取全部信息");
        List<UsersInfo> usersInfos =userMapper.selectList(null);
        return usersInfos;
    }

    @Override
    public Integer insert(UsersInfo usersInfo) {
        int result =userMapper.insert(usersInfo);
        return result;
    }
}
