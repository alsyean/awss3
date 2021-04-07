package com.example.awss3.util.response;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResult {


    private boolean isSuccess;
    private int code;
    private String msg;

}
