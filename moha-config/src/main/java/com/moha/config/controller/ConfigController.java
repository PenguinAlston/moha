package com.moha.config.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
@RefreshScope
public class ConfigController {
    private static final Logger logger = LoggerFactory.getLogger(ConfigController.class);


    @Value("${all.tom:}")
    private String version;
    @GetMapping("/config")
    public String getConfig(){
        logger.info("开始获取参数");
      //  logger.info(SpringCont);
       String reult=version;
        return reult;
    }

}
