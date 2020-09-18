package com.snail.multi.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/16 8:44
 */
@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {
    @Autowired
    ServiceProperties serviceProperties;

    public String message(){
        return serviceProperties.getMessage();
    }
}
