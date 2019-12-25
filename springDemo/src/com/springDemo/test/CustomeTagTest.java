package com.springDemo.test;

import com.springDemo.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomeTagTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
        User user = (User) applicationContext.getBean("testBean");
        System.out.println(user.getName() + ":" + user.getEmail());
    }

}
