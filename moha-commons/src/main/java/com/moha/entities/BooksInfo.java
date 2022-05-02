package com.moha.entities;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BooksInfo
 * @Description: booksinfo entity
 * @Author: shao1
 * @Version: 1.0
 **/
@Data
@TableName("bs_bookdetail")
public class BooksInfo  implements Serializable {


    @TableId
    @TableField("bookid")
    private String bookid;

    @TableField("categoryid")
    private int categoryID;

    @TableField("isShared")
    private int isShared;
    @TableField("bookurl")
    private String bookURL;
    @TableField("bookImg")
    private String bookIMGURL;

    @TableField(value = "makedate",fill = FieldFill.INSERT)
    private Date makeDate;
    @TableField(value = "modifydate",fill = FieldFill.INSERT_UPDATE)
    private Date modifyDate;

}
