package com.moha.users;


import com.moha.users.entity.UsersInfo;
import com.moha.users.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName: UsersApplicationTest
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootTest
public class UsersApplicationTest {

    @Autowired
    private UserMapper mapper;


    @Test
    public void testUsers(){

        List<UsersInfo> usersInfos = mapper.selectList(null);
        usersInfos.forEach(System.out:: println);
    }
    @Test
    public void testInsert(){
    }

}
