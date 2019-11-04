package com.seata.storage.controller;

import com.seata.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:53
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @RequestMapping("decrease")
    public String decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageService.decrease(productId,count);
        return "Decrease storage success";
    }
}
