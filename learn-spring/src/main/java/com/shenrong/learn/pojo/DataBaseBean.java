package com.shenrong.learn.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Deacription:
 * @author: shenrong
 * @Date: Created in 2018/6/11 19:11
 */
@Component
public class DataBaseBean {

    @Value("${jdbc.database.driver}")
    private String driver;

    @Value("${jdbc.database.url}")
    private String url;

    @Value("${jdbc.database.username}")
    private String username;

    @Value("${jdbc.database.password}")
    private String password;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataBaseBean{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
