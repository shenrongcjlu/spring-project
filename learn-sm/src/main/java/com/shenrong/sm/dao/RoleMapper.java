package com.shenrong.sm.dao;

import com.shenrong.sm.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    void insertRole(Role role);

    void updateRole(Role role);

    void getRole(Long id);

    void deleteRole(Long id);
}
