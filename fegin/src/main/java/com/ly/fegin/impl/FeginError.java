package com.ly.fegin.impl;

import com.ly.fegin.entity.Users;
import com.ly.fegin.fegin.FeginProviderClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeginError implements FeginProviderClient {
    @Override
    public List<Users> selectAll() {
        return null;
    }
}
