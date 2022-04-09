package com.moha.users.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @ClassName: ExcelListener
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
public class ExcelListener extends AnalysisEventListener<Map<Integer,String>> {
    @Override
    public void invoke(Map<Integer, String> integerStringMap, AnalysisContext analysisContext) {

    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) { 
    }
}
