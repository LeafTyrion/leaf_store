package com.leaf.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YeYaqiao
 * @email yaqiao.ye@mobilityasia.com.cn
 * @time 2020-06-15 14:00
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("allOrder")
    public String allOrder(){
        return "fuck you!";
    }
}
