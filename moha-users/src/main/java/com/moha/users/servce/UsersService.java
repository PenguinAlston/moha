package com.moha.users.servce;

import com.moha.users.entity.UsersInfo;

import java.util.List;

/**
 * @ClassName: UsersService
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
public interface UsersService {

    //
    List<UsersInfo> getAllUsersInfo();

    Integer insert(UsersInfo usersInfo);



}
