package com.springDemo.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAroundAnnoAspect {

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

    @Around("aopServicePointcut()")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        System.out.println("log>annotation>startAround:" + proceedingJoinPoint.getSignature().getName());
        try {
            result = proceedingJoinPoint.proceed();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("log>annotation>arounding:出现异常" + e.getMessage());
        }
        System.out.println("log>annotation>endAround:" + proceedingJoinPoint.getSignature().getName());
        return result;
    }
}
