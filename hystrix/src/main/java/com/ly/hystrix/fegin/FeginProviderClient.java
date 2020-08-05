package com.ly.hystrix.fegin;

import com.ly.hystrix.entity.Orders;
import com.ly.hystrix.impl.FeginError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "provider",fallback = FeginError.class)
public interface FeginProviderClient
{
    @GetMapping("orders/selectAll")
    public List<Orders> selectSome(@RequestParam("orderId")Integer orderId);
}
