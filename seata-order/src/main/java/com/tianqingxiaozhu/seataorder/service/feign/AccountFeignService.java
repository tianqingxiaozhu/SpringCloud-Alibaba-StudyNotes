package com.tianqingxiaozhu.seataorder.service.feign;

import com.tianqingxiaozhu.tianqingxiaozhucommon.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shawnwang
 */
@SuppressWarnings("rawtypes")
@FeignClient(value = "seata-account")
public interface AccountFeignService {
    /**
     * 扣减余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/account/deduct")
    CommonResult deduct(@RequestParam(value = "userId") String userId, @RequestParam(value = "money") Long money);
}

