package com.example.sample01.infrastructure.exception;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 4:09 下午 2022/3/26
 */
public class ElasticsearchException extends RuntimeException {
    public ElasticsearchException() {
    }

    public ElasticsearchException(String message) {
        super(message);
    }

    public ElasticsearchException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElasticsearchException(Throwable cause) {
        super(cause);
    }

    public ElasticsearchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
