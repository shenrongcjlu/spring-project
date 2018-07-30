package com.shenrong.sm.main;

import com.shenrong.sm.dao.RoleMapper;
import com.shenrong.sm.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        RoleMapper roleMapper = context.getBean(RoleMapper.class);
        Role role = new Role();
        role.setRoleName("shenrong");
        role.setNote("111");
        roleMapper.insertRole(role);
    }
}
