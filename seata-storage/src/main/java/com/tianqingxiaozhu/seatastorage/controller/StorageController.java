package com.tianqingxiaozhu.seatastorage.controller;


import com.tianqingxiaozhu.seatastorage.model.Storage;
import com.tianqingxiaozhu.seatastorage.service.StorageService;
import com.tianqingxiaozhu.tianqingxiaozhucommon.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/{id}")
    public CommonResult<Storage> getById(@PathVariable(value = "id") Long id){

        return CommonResult.<Storage>builder()
                .code("200")
                .message("请求成功")
                .data(storageService.getById(id))
                .build();
    }

    /**
     * 扣减库存
     * @param id 商品ID
     * @param num 扣减的数量
     * @return
     */
    @PostMapping("/deduct")
    public CommonResult deduct(Long id,Long num) {
        //执行扣减库存
        storageService.deduct(id,num);
        
        return CommonResult.builder()
                .code("200")
                .message("请求成功")
                .build();
    }
}
