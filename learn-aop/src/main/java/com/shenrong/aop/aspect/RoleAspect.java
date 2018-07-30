package com.shenrong.aop.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {

    @Before("execution(* com.shenrong.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void before() {
        System.out.println("do before");
    }

    @After("execution(* com.shenrong.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void after() {
        System.out.println("do after");
    }

    @AfterReturning("execution(* com.shenrong.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterReturning() {
        System.out.println("do afterReturning");
    }

    @AfterThrowing("execution(* com.shenrong.aop.service.impl.RoleServiceImpl.printRole(..))")
    public void afterThrowing() {
        System.out.println("do afterThrowing");
    }

}
