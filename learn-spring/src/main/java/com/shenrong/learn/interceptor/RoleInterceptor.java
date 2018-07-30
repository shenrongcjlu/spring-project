package com.shenrong.learn.interceptor;

public class RoleInterceptor implements Interceptor {
    public void before(Object obj) {
        System.out.println("do before");
    }

    public void after(Object obj) {
        System.out.println("do after");
    }

    public void afterReturning(Object obj) {
        System.out.println("do afterReturning");
    }

    public void afterThrowing(Object obj) {
        System.out.println("do afterThrowing");
    }
}
