package com.moha.users.servce.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moha.entities.UsersInfo;
import com.moha.users.mapper.UserMapper;
import com.moha.dubboApi.UsersService;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public boolean isExistsUserInfo(String userId) {
        QueryWrapper<UsersInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.exists("userId="+userId);
        boolean b = userMapper.exists(queryWrapper);
        return b;
    }

    @Override
    public UsersInfo getOneUsuerInfo(String userName, String pwd) {
        //从redis中获取信息 若有返回登录成功  否则 去数据库查询 查询后插入redis中 返回查询结果
        Map<String ,String > userInfoMap= new HashMap<>();
        userInfoMap.put("username",userName);
        userInfoMap.put("password",pwd);
        QueryWrapper<UsersInfo> usersInfoQueryWrapper =  new QueryWrapper<>();
        usersInfoQueryWrapper.allEq(userInfoMap);
        UsersInfo usersInfo = userMapper.selectOne(usersInfoQueryWrapper);
        return usersInfo;
    }

    @Override
    public UsersInfo getOneUserInf(UsersInfo u) {
        logger.info("【根据对象获取用户信息】用户名为：{}，手机号：{}，密码为：{}",u.getUserName(),u.getPhone(),u.getPhone());
        QueryWrapper<UsersInfo> usersInfoQueryWrapper =  new QueryWrapper<>();
        usersInfoQueryWrapper.eq("username",u.getUserName()).eq("password",u.getPassWord()).eq("phone",u.getPhone()).eq("kindleEmail",u.getKindleEmail());
        UsersInfo usersInfo = userMapper.selectOne(usersInfoQueryWrapper);
        logger.info("查询完成，返回查询结果对象");
        return usersInfo;
    }


}
