package com.tianqingxiaozhu.seataorder.controller;

import com.tianqingxiaozhu.seataorder.model.Order;
import com.tianqingxiaozhu.seataorder.service.OrderService;
import com.tianqingxiaozhu.tianqingxiaozhucommon.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawnwang
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public CommonResult<Order> create(String userId, Long productId, Long num){
        return CommonResult.<Order>builder()
                .code("200")
                .message("请求成功")
                .data(orderService.create(userId,productId,num))
                .build();
    }


}
