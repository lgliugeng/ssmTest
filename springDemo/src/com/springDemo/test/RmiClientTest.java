package com.springDemo.test;

import com.springDemo.service.RmiService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiClientTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContextClientRmi.xml"});
        RmiService rmiService = applicationContext.getBean("myRmiClient", RmiService.class);
        System.out.println(rmiService.getAdd(1,2));
    }
}
