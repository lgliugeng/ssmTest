package com.springDemo.test;

import com.springDemo.beans.DrinkMaker;
import com.springDemo.beans.Source;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SourceTest {


    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"WEB-INF/applicationContext.xml"});
        Source source = (Source) applicationContext.getBean("source");
        System.out.println(source.getType());
        System.out.println(source.getSugar());
        System.out.println(source.getSize());

        DrinkMaker drinkMaker = (DrinkMaker) applicationContext.getBean("drinkMaker");
        System.out.println(drinkMaker.makeDrink());
    }
}
