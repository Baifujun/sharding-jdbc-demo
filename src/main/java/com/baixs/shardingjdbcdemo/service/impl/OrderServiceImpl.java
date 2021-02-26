package com.baixs.shardingjdbcdemo.service.impl;

import com.baixs.shardingjdbcdemo.entity.Order;
import com.baixs.shardingjdbcdemo.mapper.OrderMapper;
import com.baixs.shardingjdbcdemo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired private OrderMapper orderMapper;

    @Override
    public int add(Order order) {
        return orderMapper.insertSelective(order);
    }

    @Override
    public Order findById(String orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }
}
