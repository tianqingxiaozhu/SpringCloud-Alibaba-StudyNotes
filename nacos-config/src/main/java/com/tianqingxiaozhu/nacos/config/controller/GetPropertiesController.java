package com.tianqingxiaozhu.nacos.config.controller;

import com.tianqingxiaozhu.nacos.config.config.MyBrotherInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("config")
@RestController
@RefreshScope
@Slf4j
public class GetPropertiesController {


    @Value("${tianqing.name}")
    private String tianqingName;

    @Value("${tianqing.age}")
    private String tianqingAge;

    @Value("${tianqing.sex}")
    private String tianqingSex;

    /**
     * 获取配置文件中配置项
     */
    @GetMapping("/tianqing")
    public String tianqing(){
        return "name: " + tianqingName + " age: " + tianqingAge + " sex: " + tianqingSex;
    }

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

    @Value("${mygirl.name}")
    private String girlFriendname;

    @Value("${mygirl.age}")
    private String girlFriendage;

    @Value("${mygirl.sex}")
    private String girlFriendsex;

    /**
     * 获取配置中心配置项
     * @return
     */
    @GetMapping("/mygirlzinfo")
    public String mygirlzinfo(){
        log.info("test");
        return "name: " + girlFriendname + " age: " + girlFriendage + " sex: " + girlFriendsex;
    }

    @Autowired
    private MyBrotherInfo myBrotherInfo;

    /**
     * 获取配置中心配置项后转JavaBean进行获取
     * @return
     */
    @GetMapping("/mybrotherzinfo")
    public String mybrotherzinfo(){
        return "name: " + myBrotherInfo.getName() + " age: " + myBrotherInfo.getAge() + " sex: " + myBrotherInfo.getSex();
    }


}
