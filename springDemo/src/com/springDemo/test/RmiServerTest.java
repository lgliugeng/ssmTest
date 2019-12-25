package com.springDemo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServerTest {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
    }
}
