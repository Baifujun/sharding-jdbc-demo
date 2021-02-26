package com.baixs.shardingjdbcdemo.service;


import com.baixs.shardingjdbcdemo.entity.Order;

public interface IOrderService {

    int add(Order order);

    Order findById(String orderId);
}
