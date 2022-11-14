package com.tianqingxiaozhu.seataorder.service.feign;

import com.tianqingxiaozhu.seataorder.model.Storage;
import com.tianqingxiaozhu.tianqingxiaozhucommon.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shawnwang
 */
@SuppressWarnings("rawtypes")
@FeignClient(value = "seata-storage")
public interface StorageFeignService {

    /**
     * 扣减库存
     * @param id
     * @param num
     * @return
     */
    @PostMapping("/storage/deduct")
    CommonResult deduct(@RequestParam("id") Long id, @RequestParam("num") Long num);

    /**
     * 获取库存的详细信息
     * @param id
     * @return
     */
    @GetMapping("/storage/{id}")
    CommonResult<Storage> getById(@PathVariable(value = "id") Long id);
}
