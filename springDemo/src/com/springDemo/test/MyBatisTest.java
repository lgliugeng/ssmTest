package com.springDemo.test;

import com.springDemo.service.IMyBatisService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
        IMyBatisService iMyBatisService = (IMyBatisService) applicationContext.getBean("MyBatisServiceImpl");
        //iMyBatisService.selectTrace();
        iMyBatisService.selectTrace2();
    }
}
