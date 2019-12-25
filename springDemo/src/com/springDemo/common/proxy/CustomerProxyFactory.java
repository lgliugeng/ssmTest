package com.springDemo.common.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
* @Description:    jdk动态代理（基于接口）
* @Author:         liugeng
* @CreateDate:     2019/10/31 10:35
* @UpdateUser:     liugeng
* @UpdateDate:     2019/10/31 10:35
* @UpdateRemark:   修改内容
*/
public class CustomerProxyFactory implements InvocationHandler {

    private Object targetObject;

    // 代理实例
    public Object instanceProxy(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    // 调用目标对象的方法是会执行下面这个方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke方法执行开始");
        Object obj = method.invoke(this.targetObject,args);
        System.out.println("invoke方法执行结束");
        return obj;
    }
}
