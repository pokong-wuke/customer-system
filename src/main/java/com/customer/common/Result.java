package com.customer.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class Result<T> {

    private Boolean success;
    private String message;
    private Integer returnCode;
    private T data;

    public Result() {
        this.success = true;
    }

    public static Result<?> ok() {
        return ok("成功");
    }

    public static Result<?> ok(String message) {
        return Result.builder()
                .success(true)
                .message(message)
                .returnCode(ReturnCode.SUCCESS)
                .build();
    }

    public static <T> Result<?> okData(T data) {
        return Result.builder()
                .success(true)
                .data(data)
                .returnCode(ReturnCode.SUCCESS)
                .build();
    }

    public static Result<?> error(String message) {
        return Result.builder()
                .success(false)
                .message(message)
                .returnCode(ReturnCode.FAILURE)
                .build();
    }

    public static Result<?> refuse(String message) {
        return Result.builder()
                .success(false)
                .message(message)
                .returnCode(ReturnCode.REFUSE)
                .build();
    }
}
