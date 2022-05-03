package com.moha.dubboApi;

import com.moha.entities.UsersInfo;

public interface CoreUsersServce {
    UsersInfo login(String username,String password);
    UsersInfo register(UsersInfo usersInfo);

}
