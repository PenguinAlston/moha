package com.moha.config;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: MohaConfigApplicationTest
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootTest
public class MohaConfigApplicationTest {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    public void getPass(){

        String address = encryptor.encrypt("root");
        String password = encryptor.encrypt("130510");
        System.out.println("address地址未："+address);
        System.out.println("password地址未："+password);

    }

}
