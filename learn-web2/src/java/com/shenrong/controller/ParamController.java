package com.shenrong.controller;

import com.shenrong.pojo.UserPojo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/params")
public class ParamController {

    @RequestMapping("/commonParams")
    @ResponseBody
    public String commonParams(String roleName, String note) {

        return "{'roleName':" + roleName + ",'note':" + note + "}";
    }

    @RequestMapping("/commonParamPojo")
    @ResponseBody
    public String commonParamPojo(UserPojo userPojo) {
        System.out.println(userPojo.toString());
        return null;
    }

    @RequestMapping("/getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable Long id) {
        System.out.println(id);
        return null;
    }
}
