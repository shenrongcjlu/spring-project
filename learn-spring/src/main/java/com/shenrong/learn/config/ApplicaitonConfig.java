package com.shenrong.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.xml.ws.WebEndpoint;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/6/11 18:57
 */
@ComponentScan(basePackages = {"com.shenrong.learn.pojo","com.shenrong.learn.service"})
@PropertySource("classpath:jdbc.properties")
public class ApplicaitonConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return  new PropertySourcesPlaceholderConfigurer();
    }
}
