package com.springDemo.test;

import com.springDemo.common.proxy.CustomeMethodInterceptor;
import com.springDemo.service.AopService;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

public class CustomeCglibProxyTest {

    @Test
    public void test(){
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(AopService.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new CustomeMethodInterceptor());
        // 创建代理对象
        AopService aopService = (AopService) enhancer.create();
        // 通过代理对象调用目标方法
        try {
            aopService.doSomething();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
