package com.moha.users.servce.imp;

import com.alibaba.excel.EasyExcelFactory;
import com.moha.users.listener.ExcelListener;
import com.moha.users.servce.ParseExcel;

/**
 * @ClassName: ParseExcelImp
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
public class ParseExcelImp  implements ParseExcel {


    @Override
    public void parseSheet() {
        String filePath="C:\\Users\\shao1\\Desktop\\ZT_11112222_01.xlsx";
        EasyExcelFactory.read(filePath, new ExcelListener() ).sheet("0").autoTrim(false).doRead();



    }
}
