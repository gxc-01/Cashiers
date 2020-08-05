package com.ly.fegin.controller;

import com.ly.fegin.entity.Users;
import com.ly.fegin.fegin.FeginProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fegin")
public class FeginController
{
    @Autowired
    private FeginProviderClient feginProviderClient;

    @GetMapping("/selectAll")
    public List<Users> selectAll()
    {
        return feginProviderClient.selectAll();
    }
}
