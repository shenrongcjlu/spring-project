package com.shenrong.learn.factory;

import com.shenrong.learn.Util.ProxyBeanUtil;
import com.shenrong.learn.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyBeanFactory {
    public static <T> T getInstance(T obj, Interceptor interceptor) {
        return ProxyBeanUtil.getBean(obj, interceptor);
    }
}
