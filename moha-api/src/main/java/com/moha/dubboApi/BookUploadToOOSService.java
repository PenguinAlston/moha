package com.moha.dubboApi;

import java.io.File;

public interface BookUploadToOOSService {
    /**
     * 上传至阿里云oos
     * @param filePath
     * @return
     */
    boolean upload(String  filePath);
}
