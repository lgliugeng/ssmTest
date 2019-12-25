package com.springDemo.test;

import com.springDemo.service.AopService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopServiceTest {

    @Test
    public void test()throws Exception{
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
        AopService aopService = (AopService) applicationContext.getBean("aopService");
        aopService.doSomething();
    }
}
