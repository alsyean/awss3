package com.example.awss3.controller;

import com.example.awss3.util.CoreApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    @GetMapping("/api/v1")
    public CoreApiResponse index(){
        return CoreApiResponse.success("UP");
    }
}