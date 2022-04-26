package com.lagou.controller;

import com.lagou.domain.PromotionSpace;
import com.lagou.domain.ResponseResult;
import com.lagou.service.PromotionSpaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:wanglei
 * @create:2022-04-25-10:03
 * @Description:广告位相关API
 */
@RestController
@RequestMapping("/PromotionSpace")
public class PromotionSpaceController {
    @Autowired
    private PromotionSpaceService promotionSpaceService;

    @RequestMapping("/findPromotionSpaceById")
    public ResponseResult findPromotionSpaceById(@RequestParam int id){
        PromotionSpace promotionSpaceById = promotionSpaceService.findPromotionSpaceById(id);
        ResponseResult responseResult = new ResponseResult(true, 200, "响应成功", promotionSpaceById);
        return responseResult;
    }
}
