package com.tianqingxiaozhu.seataorder.service.impl;

import com.tianqingxiaozhu.seataorder.dao.OrderRepository;
import com.tianqingxiaozhu.seataorder.model.Order;
import com.tianqingxiaozhu.seataorder.model.Storage;
import com.tianqingxiaozhu.seataorder.service.OrderService;
import com.tianqingxiaozhu.seataorder.service.feign.AccountFeignService;
import com.tianqingxiaozhu.seataorder.service.feign.StorageFeignService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author shawnwang
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AccountFeignService accountFeignService;

    @Autowired
    private StorageFeignService storageFeignService;

    /**
     * 下订单的业务接口，其中完成了扣减库存-》扣减余额-》创建订单的流程
     * 使用@GlobalTransactional这个注解开启一个全局的分布式事务
     * @param userId  用于唯一Id
     * @param productId  商品Id
     * @param num  购买数量
     */
    @GlobalTransactional
    @Override
    public Order create(String userId, Long productId, Long num) {

        //todo 模拟下业务逻辑，细致的逻辑自己完善
        //1. 扣减库存
        log.info("扣减库存开始..............");
        storageFeignService.deduct(productId,num);
        log.info("扣减库存结束..............");

        //2. 扣余额
        log.info("扣减余额开始..............");
        Storage storage = storageFeignService.getById(productId).getData();
        accountFeignService.deduct(userId,storage.getPrice()*num);
        log.info("扣减余额结束..............");

        //3. 创建订单
        log.info("创建订单开始..............");
        Order order = Order.builder()
                .userId(userId)
                .productId(productId)
                .num(num)
                .status(2)
                .createTime(new Date())
                .build();
        Order save = orderRepository.save(order);
        return save;
    }
}
