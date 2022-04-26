package com.lagou.service;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAdVo;

public interface PromotionAdService {
    /*
    分页查询所有广告列表
     */
    public PageInfo findAllAdByPage(PromotionAdVo promotionAdVo);
}
