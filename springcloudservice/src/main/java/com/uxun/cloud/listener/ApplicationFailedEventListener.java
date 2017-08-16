package com.uxun.cloud.listener;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * spring boot启动异常时执行事件
 * Created by baichun on 2017/8/15.
 */
public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent>{

    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        Throwable throwable = applicationFailedEvent.getException();
        handleThrowable(throwable);

    }

    /**
     * 处理异常
     * @param throwable
     */
    private void handleThrowable(Throwable throwable) {

    }
}
