package com.uxun.cloud.listener;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 上下文创建完成后执行的事件监听器
 * spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的
 * Created by baichun on 2017/8/15.
 */
public class ApplicationPreparedEventListene implements ApplicationListener<ApplicationPreparedEvent>{

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        ConfigurableApplicationContext cac = applicationPreparedEvent.getApplicationContext();
        passContextInfo(cac);

    }

    /**
     * 传递上下文
     * @param cac
     */

    private void passContextInfo(ConfigurableApplicationContext cac) {

    }
}
