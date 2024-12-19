package com.example.base.file;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.auth.BasicCOSCredentials;
import com.qcloud.cos.http.HttpProtocol;
import com.qcloud.cos.region.Region;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cos文件配置
 */
@Configuration
public class CosConfig {

    @Value("${cos.secret-id}")
    private String secretId;

    @Value("${cos.secret-key}")
    private String secretKey;

    @Value("${cos.region}")
    private String region;

    @Value("${cos.bucket-name}")
    private String bucketName;

    @Bean
    public COSClient cosClient() {
        ClientConfig clientConfig = new ClientConfig(new Region(region));
        clientConfig.setHttpProtocol(HttpProtocol.https);
        return new COSClient(new BasicCOSCredentials(secretId, secretKey), clientConfig);
    }

    @Bean
    public String getBucketName() {
        return bucketName;
    }

}
