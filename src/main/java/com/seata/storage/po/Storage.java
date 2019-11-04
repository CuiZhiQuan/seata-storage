package com.seata.storage.po;

import lombok.Data;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:54
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@Data
public class Storage {

    private Long id;

    /**产品id*/
    private Long productId;

    /**总库存*/
    private Integer total;

    /**已用库存*/
    private Integer used;

    /**剩余库存*/
    private Integer residue;
}
