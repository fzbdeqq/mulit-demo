package com.snail.multi.application;

import com.snail.multi.library.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: SnailBBB
 * @Description:
 * @Date 2020/9/16 8:53
 */
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private MyService myService;

    @GetMapping("/")
    public String home(){
        log.info("test library");
        return myService.message();
    }
}
