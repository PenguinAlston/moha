package com.moha.users.service;

import com.moha.dubboApi.UsersService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: UsersServiceTest
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootTest
public class UsersServiceTest {

    @Autowired
    private UsersService service;

    @Test
    public void testService(){

        service.getAllUsersInfo().forEach(System.out:: println);

    }

}
