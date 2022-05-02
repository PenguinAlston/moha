package com.moha.dubboApi;

import com.moha.entities.UsersInfo;

import java.util.List;

public interface UsersService {

    /**
     * 获取全部用户信息
     * @return
     */
    List<UsersInfo> getAllUsersInfo();

    /**
     * 添加用户
     * @param usersInfo
     * @return
     */
    Integer insert(UsersInfo usersInfo);

    boolean isExistsUserInfo(String userId);

    UsersInfo getOneUsuerInfo(String userName,String pwd);

    UsersInfo getOneUserInf(UsersInfo u);

}
