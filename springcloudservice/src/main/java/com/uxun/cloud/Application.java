package com.uxun.cloud;

import com.uxun.cloud.listener.ApplicationEnvironmentPreparedEventListener;
import com.uxun.cloud.listener.ApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by baichun on 2017/8/14.
 */
@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class Application {
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(Application.class);
        app.addListeners(new ApplicationStartedEventListener(),new ApplicationEnvironmentPreparedEventListener());
        app.run(args);

        //SpringApplication.run(Application.class,args);

    }
}
