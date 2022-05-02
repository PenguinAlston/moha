package com.moha.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: UsersInfo
 * @Description: usersInfo entity
 * @Author: shao1
 * @Version: 1.0
 **/
@Data
@TableName("user_info")
public class UsersInfo implements Serializable {
    @TableId
    private Long id;
    @TableField("username")
    private String userName;
    @TableField("password")
    private String passWord;
    private String email;
    private String phone;
    private String kindleEmail;
    private Date createDate;
    private Date modifyDate;

}
