package com.moha.oos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @ClassName: MohaOOSApplication
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MohaOOSApplication {
    public static void main(String[] args) {
        SpringApplication.run(MohaOOSApplication.class,args);
    }
}
