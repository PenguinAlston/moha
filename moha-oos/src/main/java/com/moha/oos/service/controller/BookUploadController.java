package com.moha.oos.service.controller;

import com.moha.dubboApi.BookUploadToOOSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: BookUploadController
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@RestController
public class BookUploadController {

    @Autowired
    private BookUploadToOOSService bookUploadToOOSService;
    @GetMapping("/upload")
    public void upload() {
        String filePath="C:\\Users\\shao1\\Downloads\\牵风记 - 徐怀中.mobi";
        bookUploadToOOSService.upload(filePath);

    }
}
