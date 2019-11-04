package com.seata.storage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author cuizhiquan
 * @Description
 * @date 2019/11/1 22:55
 * @Copyright (c) 2017, DaChen All Rights Reserved.
 */
@Mapper
public interface StorageMapper {


    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @Update({
            "update storage set used = used + #{count},residue = residue - #{count} where product_id = #{productId}"
    })
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
