package com.tianqingxiaozhu.seataorder.service;

import com.tianqingxiaozhu.seataorder.model.Order;

/**
 * @author shawnwang
 */
public interface OrderService {

    /**
     * 创建订单
     * @param userId
     * @param productId
     * @param num
     * @return
     */
    Order create(String userId, Long productId, Long num);
}
