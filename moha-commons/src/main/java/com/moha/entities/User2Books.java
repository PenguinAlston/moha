package com.moha.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: User2Books
 * @Description: user 2 book entity
 * @Author: shao1
 * @Version: 1.0
 **/
@Data
@TableName("bs_user2book")
public class User2Books implements Serializable {

    @TableId(type=IdType.ASSIGN_UUID)
    private String idno;
    @TableField(value = "userid")
    private String userId;
    @TableField(value = "bookid")
    private String bookId;

    public User2Books(String userId, String bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }
}
