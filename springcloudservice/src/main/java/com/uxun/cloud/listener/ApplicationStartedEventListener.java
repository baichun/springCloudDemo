package com.uxun.cloud.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * spring boot 启动监听类
 * spring boot启动开始时执行的事件
 * Created by baichun on 2017/8/15.
 */
public class ApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        //通过监听器可以获取SpringApplication对象
        SpringApplication app = applicationStartedEvent.getSpringApplication();
        app.setShowBanner(false);// 不显示banner信息
        //

    }
}
