package com.moha.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: CoreApplcation
 * @Description: moha kindle books core application
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan("com.moha.core.mapper")
public class CoreApplcation {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplcation.class,args);
    }
}
