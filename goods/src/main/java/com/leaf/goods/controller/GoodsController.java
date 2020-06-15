package com.leaf.goods.controller;

import com.leaf.common.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YeYaqiao
 * @email yaqiao.ye@mobilityasia.com.cn
 * @time 2020-06-13 18:52
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("allGoods")
    public Result<Object> allGoods(){
        String str="fuckyou";
        return Result.error();
    }
}
