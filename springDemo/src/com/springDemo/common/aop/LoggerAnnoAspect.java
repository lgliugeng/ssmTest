package com.springDemo.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAnnoAspect {

    /**
    * 方法说明   定义切点
    * @方法名    aopServicePointcut
    * @参数      []
    * @返回值    void
    * @异常      
    * @创建时间  2019/10/29 15:59
    * @创建人    liugeng
    */
    @Pointcut("execution(* com.springDemo.service.AopService.*(..))")
    public void aopServicePointcut(){}

    @Before("aopServicePointcut()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("log>annotation>start:" + joinPoint.getSignature().getName());
    }

    @After("aopServicePointcut()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("log>annotation>end:" + joinPoint.getSignature().getName());
    }

    @AfterReturning("aopServicePointcut()")
    public void logReturn(JoinPoint joinPoint){
        System.out.println("log>annotation>return:" + joinPoint.getSignature().getName());
    }

    @AfterThrowing("aopServicePointcut()")
    public void logThrow(JoinPoint joinPoint){
        System.out.println("log>annotation>throw:" + joinPoint.getSignature().getName());
    }
}
