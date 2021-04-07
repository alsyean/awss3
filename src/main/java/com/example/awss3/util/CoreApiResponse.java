package com.example.awss3.util;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CoreApiResponse<T> {


    private final String status;

    public CoreApiResponse(String status) {

        this.status = status;

    }

    public static <T> CoreApiResponse<T> success(T data) {
        return new CoreApiResponse<>("");
    }

    public static <T> CoreApiResponse<T> success(String status) {
        return new CoreApiResponse<>(status);
    }

    public static <T> CoreApiResponse<T> fail(String code, String status) {
        return new CoreApiResponse<>(status);
    }
}