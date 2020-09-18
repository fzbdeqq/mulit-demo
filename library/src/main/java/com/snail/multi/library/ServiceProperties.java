package com.snail.multi.library;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/16 8:45
 */
@Component
@ConfigurationProperties("service")
public class ServiceProperties {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
