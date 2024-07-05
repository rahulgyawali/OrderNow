package com.project.microservices.order.service;

import com.project.microservices.order.dto.OrderRequest;
import com.project.microservices.order.model.Order;
import com.project.microservices.order.respository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        order.setPrice(orderRequest.price());
        orderRepository.save(order);
    }
}
