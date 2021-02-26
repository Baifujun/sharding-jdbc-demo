package com.baixs.shardingjdbcdemo.controller;

import com.baixs.shardingjdbcdemo.entity.Order;
import com.baixs.shardingjdbcdemo.service.IOrderService;
import com.baixs.shardingjdbcdemo.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired private IOrderService orderService;

    @RequestMapping("/add")
    public Order add(){
        Order order = new Order();
        order.setMemberId(IdWorker.getLongId());
        order.setOrderAmount("50.0");
        order.setOrderCode("1212");
        //order.setOrderId(IdWorker.getLongId());
        order.setStatus("1");
        order.setCreateTime(new Date());
        orderService.add(order);
        return order;
    }

    @RequestMapping("/findById")
    public Order findById(String orderId){
        return orderService.findById(orderId);
    }
}
