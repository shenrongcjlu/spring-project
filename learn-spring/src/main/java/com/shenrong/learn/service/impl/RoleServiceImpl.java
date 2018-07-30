package com.shenrong.learn.service.impl;

import com.shenrong.learn.pojo.Role;
import com.shenrong.learn.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/6/11 18:51
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    Role role;

    public void printRole() {
        System.out.println("service prints" + role);
    }

    public void printRole(Role role) {
        System.out.println(role.toString());
    }
}
