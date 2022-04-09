package com.moha.users;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: UsersApplication
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan("com.moha.users.mapper")
public class UsersApplication {
    public static void main(String[] args) {
        SpringApplication.run(UsersApplication.class,args);
    }
}
