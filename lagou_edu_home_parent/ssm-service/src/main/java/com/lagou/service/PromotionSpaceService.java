package com.lagou.service;

import com.lagou.domain.PromotionSpace;

public interface PromotionSpaceService {
    /*
    根据id查询广告位信息
     */
    PromotionSpace findPromotionSpaceById(int id);
}
