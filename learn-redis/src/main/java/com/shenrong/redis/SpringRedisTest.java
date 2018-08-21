package com.shenrong.redis;

import com.shenrong.po.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class SpringRedisTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appliaciton-context.xml");
        RedisTemplate redisTemplate = (RedisTemplate) context.getBean("redisTemplate");

        Role role = new Role();
        role.setId(12L);
        role.setRoleName("shrong");
        role.setNote("man");

        redisTemplate.opsForValue().set("role1", role);

        Role role1 = (Role) redisTemplate.opsForValue().get("role1");
        System.out.println(role1);
    }
}
