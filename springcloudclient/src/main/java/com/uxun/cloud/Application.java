package com.uxun.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by baichun on 2017/8/14.
 */
@SpringBootApplication
@RestController
public class Application  {

    @Value("${name:World!}")
    String bar;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!";
    }
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
