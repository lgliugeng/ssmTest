package com.springDemo.test;

import com.springDemo.service.JdbcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
        JdbcService jdbc = (JdbcService) applicationContext.getBean("jdbcServiceImpl");
        System.out.println(jdbc.save());
    }
}
