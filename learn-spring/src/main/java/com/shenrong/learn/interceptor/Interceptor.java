package com.shenrong.learn.interceptor;

public interface Interceptor {
    void before(Object obj);

    void after(Object obj);

    void afterReturning(Object obj);

    void afterThrowing(Object obj);
}
