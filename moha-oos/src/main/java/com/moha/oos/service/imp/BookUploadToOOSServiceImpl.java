package com.moha.oos.service.imp;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.PutObjectRequest;
import com.moha.dubboApi.BookUploadToOOSService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @ClassName: BookUploadToOOSServiceImpl
 * @Description: TODO
 * @Author: shao1
 * @Version: 1.0
 **/
@Service
public class BookUploadToOOSServiceImpl  implements BookUploadToOOSService {

    private static final Logger logger  = LoggerFactory.getLogger(BookUploadToOOSServiceImpl.class);

    @Value("${aliyun.oos.endpoint}")
    private String endPoint;
    @Value("${aliyun.oos.accessKey}")
    private String accessKey;
    @Value("${aliyun.oos.accessSecreat}")
    private String accessSecreat;
    @Value("${aliyun.oos.bucketname}")
    private String bucketName;

    @Override
    public boolean upload(String  filePath) {

        //创建oos实例
        // 创建OSSClient实例。
        String oosPath="books/";
        File file = new File (filePath);
        if(!file.exists()){
            logger.info("文件不存在");
        }
        String fileName=oosPath+file.getName();
        OSS ossClient = new OSSClientBuilder().build(endPoint, accessKey, accessSecreat);
        try {
            // 创建PutObjectRequest对象。
            PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, fileName, new File(filePath));
            // 如果需要上传时设置存储类型和访问权限，请参考以下示例代码。
            // ObjectMetadata metadata = new ObjectMetadata();
            // metadata.setHeader(OSSHeaders.OSS_STORAGE_CLASS, StorageClass.Standard.toString());
            // metadata.setObjectAcl(CannedAccessControlList.Private);
            // putObjectRequest.setMetadata(metadata);

            // 上传文件。
            ossClient.putObject(putObjectRequest);
        } catch (OSSException oe) {
            System.out.println("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            System.out.println("Error Message:" + oe.getErrorMessage());
            System.out.println("Error Code:" + oe.getErrorCode());
            System.out.println("Request ID:" + oe.getRequestId());
            System.out.println("Host ID:" + oe.getHostId());
        } catch (ClientException ce) {
            System.out.println("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message:" + ce.getMessage());
        } finally {
            if (ossClient != null) {
                ossClient.shutdown();
            }
        }

        return false;
    }
}
