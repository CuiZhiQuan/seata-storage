package com.seata.storage.service;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:56
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
public interface StorageService {

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    void decrease(Long productId, Integer count);
}
