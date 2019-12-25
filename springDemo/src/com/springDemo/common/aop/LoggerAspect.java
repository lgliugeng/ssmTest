package com.springDemo.common.aop;

import org.aspectj.lang.JoinPoint;

/**
* @Description:    通过xml配置切面
* @Author:         liugeng
* @CreateDate:     2019/10/29 14:40
* @UpdateUser:     liugeng
* @UpdateDate:     2019/10/29 14:40
* @UpdateRemark:   修改内容
*/
public class LoggerAspect {

    /**
    * 方法说明   切面执行方法的前置通知方法
    * @方法名    logBefore
    * @参数      [joinPoint]
    * @返回值    void
    * @异常      
    * @创建时间  2019/10/29 14:38
    * @创建人    liugeng
    */
    public void logBefore(JoinPoint joinPoint){
        System.out.println("log>start:" + joinPoint.getSignature().getName());
    }

    /**
    * 方法说明   切面执行方法的后置通知方法
    * @方法名    logAfter
    * @参数      [joinPoint]
    * @返回值    void
    * @异常      
    * @创建时间  2019/10/29 14:39
    * @创建人    liugeng
    */
    public void logAfter(JoinPoint joinPoint){
        System.out.println("log>end:" + joinPoint.getSignature().getName());
    }

    /**
    * 方法说明   切面执行方法的后置返回通知方法
    * @方法名    logReturn
    * @参数      [joinPoint]
    * @返回值    void
    * @异常      
    * @创建时间  2019/10/29 14:39
    * @创建人    liugeng
    */
    public void logReturn(JoinPoint joinPoint){
        System.out.println("log>return:" + joinPoint.getSignature().getName());
    }

    /**
    * 方法说明   切面执行方法的异常通知方法
    * @方法名    logThrow
    * @参数      [joinPoint]
    * @返回值    void
    * @异常      
    * @创建时间  2019/10/29 14:39
    * @创建人    liugeng
    */
    public void logThrow(JoinPoint joinPoint){
        System.out.println("log>throw:" + joinPoint.getSignature().getName());
    }

}
