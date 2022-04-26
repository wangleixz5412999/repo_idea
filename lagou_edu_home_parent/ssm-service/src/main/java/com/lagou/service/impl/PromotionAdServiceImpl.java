package com.lagou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lagou.dao.PromotionAdMapper;
import com.lagou.domain.PromotionAd;
import com.lagou.domain.PromotionAdVo;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-25-10:21
 * @Description:广告相关API
 */
@Service
public class PromotionAdServiceImpl implements PromotionAdService {
    @Autowired
    private PromotionAdMapper promotionAdMapper;
    @Override
    public PageInfo findAllAdByPage(PromotionAdVo promotionAdVo) {
        PageHelper.startPage(promotionAdVo.getCurrentPage(),promotionAdVo.getPageSize());
        List<PromotionAd> allAdByPage = promotionAdMapper.findAllAdByPage();
        PageInfo<PromotionAd> adPageInfo = new PageInfo<>(allAdByPage);
        return adPageInfo;
    }
}
