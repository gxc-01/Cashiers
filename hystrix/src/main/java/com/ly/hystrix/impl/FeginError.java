package com.ly.hystrix.impl;

import com.ly.hystrix.entity.Orders;
import com.ly.hystrix.fegin.FeginProviderClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FeginError implements FeginProviderClient {

    public List<String> list=new ArrayList<>();


    @Override
    public List<Orders> selectSome(Integer orderId) {
        return null;
    }

}
