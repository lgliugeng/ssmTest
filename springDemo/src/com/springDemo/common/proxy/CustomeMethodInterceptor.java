package com.springDemo.common.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
* @Description:    CGLIB动态代理调用（基于类）
* @Author:         liugeng
* @CreateDate:     2019/10/31 15:56
* @UpdateUser:     liugeng
* @UpdateDate:     2019/10/31 15:56
* @UpdateRemark:   修改内容
*/
public class CustomeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        /*CGLIB动态代理前置事件*/
        System.out.println("CGLIB_proxy:start");
        /*CGLIB动态代理覆盖调用被代理的方法*/
        methodProxy.invokeSuper(o,objects);
        /*CGLIB动态代理后置事件*/
        System.out.println("CGLIB_proxy:end");
        return null;
    }
}
