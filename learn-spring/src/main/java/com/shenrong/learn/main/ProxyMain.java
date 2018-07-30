package com.shenrong.learn.main;

import com.shenrong.learn.Util.ProxyBeanUtil;
import com.shenrong.learn.interceptor.Interceptor;
import com.shenrong.learn.interceptor.RoleInterceptor;
import com.shenrong.learn.pojo.Role;
import com.shenrong.learn.service.RoleService;
import com.shenrong.learn.service.impl.RoleServiceImpl;

public class ProxyMain {
    public static void main(String[] args) {
        Role role = new Role();
        Interceptor interceptor = new RoleInterceptor();
        RoleService roleService = ProxyBeanUtil.getBean(new RoleServiceImpl(), interceptor);

        roleService.printRole(null);
    }
}
