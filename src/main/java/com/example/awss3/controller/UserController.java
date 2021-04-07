package com.example.awss3.controller;

import com.example.awss3.util.S3.Credits;
import com.example.awss3.util.S3.S3Uploader;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final S3Uploader s3Uploader;

    private final Credits credenitals;

    @PostMapping("/upload")
    public String upload(@RequestParam("data") MultipartFile multipartFile) throws IOException {

        System.out.println("Controller multipartFile : " + multipartFile);

        return s3Uploader.upload(multipartFile, "spring-boot-s3/test");
    }

    @GetMapping("/buckets")
    public List bucketList() {

        List buckets =  s3Uploader.getBucketList();

        return buckets;
    }

    @GetMapping("/bucket")
    public void createBucket() {
        // log statement


        System.out.println("AccessKey : " + credenitals.getCredentials().getAWSSecretKey());
        System.out.println("Secret : " + credenitals.getCredentials().getAWSSecretKey());

        s3Uploader.creatBucket("piddole");

    }

    @GetMapping("/object")
    public String objectList() {

        return s3Uploader.getObjectList("abee-photozone");

    }

}
