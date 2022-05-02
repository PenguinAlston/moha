package com.moha.core.service;

import com.moha.entities.UsersInfo;

public interface CoreUsersServce {
    UsersInfo login(String username,String password);
    UsersInfo register(UsersInfo usersInfo);

}
