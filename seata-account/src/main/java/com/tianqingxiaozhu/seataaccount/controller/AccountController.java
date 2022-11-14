package com.tianqingxiaozhu.seataaccount.controller;

import com.tianqingxiaozhu.seataaccount.model.Account;
import com.tianqingxiaozhu.seataaccount.service.AccountService;
import com.tianqingxiaozhu.tianqingxiaozhucommon.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawnwang
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/getByUserId")
    public CommonResult<Account> getByUserId(String userId){
        return CommonResult.<Account>builder()
                .code("200")
                .message("请求成功")
                .data(accountService.getByUserId(userId))
                .build();
    }


    /**
     * 扣余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/deduct")
    public CommonResult deduct(String userId,Long money) throws InterruptedException {
//        Thread.sleep(2000);

        // 扣钱
        accountService.deduct(userId,money);

        return CommonResult.builder()
                .code("200")
                .message("请求成功")
                .build();
    }

}

