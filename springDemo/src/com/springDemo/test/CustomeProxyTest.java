package com.springDemo.test;

import com.springDemo.common.proxy.CustomerProxyFactory;
import com.springDemo.service.ICustomeProxyService;
import com.springDemo.service.Impl.CustomeProxyService;
import org.junit.Test;

public class CustomeProxyTest {

    @Test
    public void test(){
        // 获取代理类
        CustomerProxyFactory customerProxyFactory = new CustomerProxyFactory();
        // 生成代理对象（代理对象必须继承接口，jdk的动态代理是基于接口实现的）
        ICustomeProxyService customeProxyService = (ICustomeProxyService) customerProxyFactory.instanceProxy(new CustomeProxyService());
        // 调用代理对象方法
        customeProxyService.doSomething();
    }
}
