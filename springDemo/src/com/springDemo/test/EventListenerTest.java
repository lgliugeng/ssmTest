package com.springDemo.test;

import com.springDemo.common.eventListener.TestEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventListenerTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
        TestEvent testEvent = new TestEvent("Hello","这是一个事件");
        applicationContext.publishEvent(testEvent);
    }
}
