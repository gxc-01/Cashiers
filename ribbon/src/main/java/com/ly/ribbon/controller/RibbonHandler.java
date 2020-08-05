package com.ly.ribbon.controller;

import com.ly.ribbon.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/ribbon")
public class RibbonHandler
{
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/selectAll")
    public List<Users> selectAll(){
        return restTemplate.getForEntity("http://provider/users/selectAll",List.class).getBody();
    }
}
