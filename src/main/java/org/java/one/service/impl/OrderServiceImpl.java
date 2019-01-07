package org.java.one.service.impl;

import org.java.one.mapper.OrderMapper;
import org.java.one.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Map> queryIndentAll() {
        return orderMapper.queryIndentAll();
    }
}
