package com.shenrong.aop.service.impl;

import com.shenrong.aop.pojo.Role;
import com.shenrong.aop.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    public void printRole(Role role) {
        System.out.println(role);
    }

    public void printRole() {

    }
}
