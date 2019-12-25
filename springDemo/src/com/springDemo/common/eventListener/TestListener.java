package com.springDemo.common.eventListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class TestListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof TestEvent) {
            // 监听事件
            TestEvent testEvent = (TestEvent) applicationEvent;
            testEvent.print();
        }
    }
}
