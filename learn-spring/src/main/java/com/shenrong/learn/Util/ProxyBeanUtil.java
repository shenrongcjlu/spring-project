package com.shenrong.learn.Util;

import com.shenrong.learn.interceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBeanUtil implements InvocationHandler {

    private Object object;

    private Interceptor interceptor;

    public static <T> T getBean(T obj, Interceptor interceptor) {

        ProxyBeanUtil proxyBeanUtil = new ProxyBeanUtil();
        proxyBeanUtil.object = obj;
        proxyBeanUtil.interceptor = interceptor;

        return (T) Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                proxyBeanUtil);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnObj = null;

        interceptor.before(object);

        boolean exceptionFlag = false;

        try {
            returnObj = method.invoke(object, args);
        } catch (Exception e) {
            exceptionFlag = true;
        } finally {
            interceptor.after(object);
        }

        if (exceptionFlag) {
            interceptor.afterThrowing(object);
        } else {
            interceptor.afterReturning(object);
        }
        return returnObj;
    }
}
