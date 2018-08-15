package com.shenrong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class RoleController {

    @RequestMapping("/getRole")
    @ResponseBody
    public String getRole() {
        return "success";
    }
}
