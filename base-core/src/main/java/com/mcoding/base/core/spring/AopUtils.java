package com.mcoding.base.core.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author wzt on 2020/4/3.
 * @version 1.0
 */
public class AopUtils {

    public static Method getCurrentMethod(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        return methodSignature.getMethod();
    }

}
