package com.moha.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;

/**
 * @ClassName: MohaConfigApplication
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootApplication
public class MohaConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MohaConfigApplication.class, args);
        MutablePropertySources propertySources = applicationContext.getEnvironment().getPropertySources();
        propertySources.forEach(System.out::println);

    }
}
