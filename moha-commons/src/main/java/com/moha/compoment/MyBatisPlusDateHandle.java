package com.moha.compoment;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.ComponentScan;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @ClassName: MyBatisPlusHandle
 * @Description: 自动填充，修改时间
 * @Author: shao1
 * @Version: 1.0
 **/
@ComponentScan
public class MyBatisPlusDateHandle implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        /*this.setFieldValByName("modifyDate",new Date(),metaObject);
        this.setFieldValByName("makeDate",new Date(),metaObject);*/
        this.strictInsertFill(metaObject,"makeDate",()-> LocalDateTime.now(),LocalDateTime.class);
        this.strictInsertFill(metaObject,"modifyDate",()-> LocalDateTime.now(),LocalDateTime.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
//        this.setFieldValByName("modifyDate",new Date(),metaObject);
        this.strictUpdateFill(metaObject,"modifyDate",()-> LocalDateTime.now(),LocalDateTime.class);
    }
}
