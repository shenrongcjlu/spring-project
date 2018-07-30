package com.shenrong.learn.main;

import com.shenrong.learn.config.ApplicaitonConfig;
import com.shenrong.learn.pojo.DataBaseBean;
import com.shenrong.learn.pojo.Role;
import com.shenrong.learn.service.RoleService;
import com.sun.jndi.cosnaming.CNCtx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/6/11 18:58
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = null;
        context = new  ClassPathXmlApplicationContext("application-context.xml");

//        context = new AnnotationConfigApplicationContext(ApplicaitonConfig.class);

        DataBaseBean dataBaseBean = (DataBaseBean) context.getBean("dataBaseBean");

        System.out.println(dataBaseBean);
    }
}
