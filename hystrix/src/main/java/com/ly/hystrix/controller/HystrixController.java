package com.ly.hystrix.controller;

import com.ly.hystrix.entity.Orders;
import com.ly.hystrix.fegin.FeginProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hystrix")
public class HystrixController
{
    @Autowired
    private FeginProviderClient feginProviderClient;


//    @RequestMapping("/selectOne")
//    public Object selectOne(@RequestBody FoodDto foodDto){
//        System.out.println(foodDto.getId());
//        return 1;
//    }

    @ResponseBody
    @RequestMapping("/selectSome")
    public List<Orders> selectSome(@RequestParam("orderId")Integer orderId){
        System.out.println("--------------"+orderId);
        return feginProviderClient.selectSome(orderId);
    }


}
