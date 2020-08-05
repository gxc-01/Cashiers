package com.ly.fegin.fegin;

import com.ly.fegin.entity.Users;
import com.ly.fegin.impl.FeginError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "provider",fallback = FeginError.class)
public interface FeginProviderClient
{
    @GetMapping("/orders/selectAll")
    public List<Users> selectAll();
}
