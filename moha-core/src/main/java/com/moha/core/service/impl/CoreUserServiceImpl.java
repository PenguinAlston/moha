package com.moha.core.service.impl;

import com.moha.core.service.CoreUsersServce;
import com.moha.dubboApi.UsersService;
import com.moha.entities.UsersInfo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @ClassName: CoreUserService
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@Service
public class CoreUserServiceImpl implements CoreUsersServce {

    @DubboReference
    private UsersService usersService;


    @Override
    public UsersInfo login(String username, String password) {

        UsersInfo usersInfo= usersService.getOneUsuerInfo(username,password);

        return usersInfo;
    }

    @Override
    public UsersInfo register(UsersInfo usersInfo) {
        Integer userCount = usersService.insert(usersInfo);
        UsersInfo oneUserInf = null;
        if(userCount>0){
             oneUserInf = usersService.getOneUserInf(usersInfo);
        }

        return oneUserInf;
    }
}
