package com.tianqingxiaozhu.nacosuseenvname.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
@RefreshScope
public class GetPropertiesController {

    @Value("${my.name}")
    private String myName;

    @Value("${my.age}")
    private String myAge;

    @Value("${my.sex}")
    private String mySex;

    /**
     * 获取配置中心配置项
     * @return
     */
    @GetMapping("/myinfo")
    public String myinfo(){
        return "name: " + myName + " age: " + myAge + " sex: " + mySex;
    }

}
