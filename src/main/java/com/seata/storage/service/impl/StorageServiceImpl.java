package com.seata.storage.service.impl;

import com.seata.storage.mapper.StorageMapper;
import com.seata.storage.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:57
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("------->扣减库存结束");
    }
}
