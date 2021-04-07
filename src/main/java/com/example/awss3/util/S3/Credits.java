package com.example.awss3.util.S3;

import com.amazonaws.auth.*;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class Credits implements AWSCredentialsProvider {


    String AccessKey = getCredentials().getAWSAccessKeyId();
    String SecretKey = getCredentials().getAWSSecretKey();

    @Override
    public AWSCredentials getCredentials() {

        InstanceProfileCredentialsProvider instanceProfileCredentialsProvider = new InstanceProfileCredentialsProvider(false);
        AWSCredentials credentials = instanceProfileCredentialsProvider.getCredentials();

        return credentials;
    }

    @Override
    public void refresh() {

    }

}
