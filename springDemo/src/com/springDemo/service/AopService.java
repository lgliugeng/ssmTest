package com.springDemo.service;

import org.springframework.stereotype.Component;

@Component
public class AopService {

    public void doSomething() throws Exception{
        System.out.println("doSomething");
        /*if (1 == 1){
            throw new Exception("抛出异常");
        }*/
    }
}
