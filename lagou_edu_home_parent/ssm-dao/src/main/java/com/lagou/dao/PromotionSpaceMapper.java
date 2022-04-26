package com.lagou.dao;

import com.lagou.domain.PromotionSpace;


/*
广告位的操作
 */
public interface PromotionSpaceMapper {
    /*
    根据id查询广告位信息
     */
    PromotionSpace findPromotionSpaceById(int id);
}
