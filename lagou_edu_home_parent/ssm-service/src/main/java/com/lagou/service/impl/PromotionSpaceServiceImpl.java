package com.lagou.service.impl;

import com.lagou.dao.PromotionSpaceMapper;
import com.lagou.domain.PromotionSpace;
import com.lagou.service.PromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:wanglei
 * @create:2022-04-25-10:01
 * @Description:广告位相关API
 */
@Service
public class PromotionSpaceServiceImpl implements PromotionSpaceService {

    @Autowired
    private PromotionSpaceMapper promotionSpaceMapper;
    @Override
    public PromotionSpace findPromotionSpaceById(int id) {
        PromotionSpace promotionSpaceById = promotionSpaceMapper.findPromotionSpaceById(id);
        return promotionSpaceById;
    }
}
