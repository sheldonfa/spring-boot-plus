package io.geekidea.springbootplus.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Addo.Zhang
 * @date 2018/8/3
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseWrapper<T> {
    private int code;
    private String msg;
    private T data;

    public static <T> ResponseWrapper<T> success(T data) {
        return ResponseWrapper.<T>builder()
                .data(data)
                .build();
    }

    public static <T> ResponseWrapper<T> success(int code, T data) {
        return ResponseWrapper.<T>builder()
                .code(code)
                .data(data)
                .build();
    }

    public static <T> ResponseWrapper<T> fail(int code, String message) {
        return fail(code, message, null);
    }

    public static <T> ResponseWrapper<T> fail(int code, String message, T data) {
        return ResponseWrapper.<T>builder()
                .code(code)
                .msg(message)
                .data(data)
                .build();
    }
}
