package com.lagou.controller;

import com.github.pagehelper.PageInfo;
import com.lagou.domain.PromotionAdVo;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wanglei
 * @create:2022-04-25-10:29
 * @Description:广告相关操作
 */
@RestController
@RequestMapping("/PromotionAd")
public class PromotionAdController {
    @Autowired
    private PromotionAdService promotionAdService;
    /*
    进行分页查询
     */
    @RequestMapping("/findAllPromotionAdByPage")
    public ResponseResult findAllAdByPage(PromotionAdVo promotionAdVo){
        PageInfo allAdByPage = promotionAdService.findAllAdByPage(promotionAdVo);
        ResponseResult responseResult = new ResponseResult(true, 200, "响应成功", allAdByPage);
        return responseResult;
    }
}
