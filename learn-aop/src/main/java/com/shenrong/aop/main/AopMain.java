package com.shenrong.aop.main;

import com.shenrong.aop.AopConfig.AopConfig;
import com.shenrong.aop.pojo.Role;
import com.shenrong.aop.service.RoleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    public static void main(String[] args) {
       // ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Role role = (Role) context.getBean("role");

        RoleService roleService = (RoleService) context.getBean("roleServiceImpl");

        roleService.printRole(role);

    }
}
