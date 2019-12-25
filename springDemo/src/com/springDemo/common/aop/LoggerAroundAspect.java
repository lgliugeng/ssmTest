package com.springDemo.common.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggerAroundAspect {

    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        System.out.println("log>startAround:" + proceedingJoinPoint.getSignature().getName());
        try {
            result = proceedingJoinPoint.proceed();
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("log>arounding:出现异常" + e.getMessage());
        }
        System.out.println("log>endAround:" + proceedingJoinPoint.getSignature().getName());
        return result;
    }
}
