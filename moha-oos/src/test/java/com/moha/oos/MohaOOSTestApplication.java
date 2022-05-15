package com.moha.oos;

import com.moha.dubboApi.BookUploadToOOSService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: MohaOOSTestApplication
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@SpringBootTest
public class MohaOOSTestApplication {

    @Autowired
    private BookUploadToOOSService  bookUploadToOOSService;

    @Test
    void  testUpload(){
        String filePath="C:\\Users\\shao1\\Downloads\\牵风记 - 徐怀中.mobi";
        bookUploadToOOSService.upload(filePath);
    }
}
