package com.github.manimovassagh.orderservice.service;


import com.github.manimovassagh.orderservice.dto.OrderLineItemsDto;
import com.github.manimovassagh.orderservice.dto.OrderRequest;
import com.github.manimovassagh.orderservice.model.Order;
import com.github.manimovassagh.orderservice.model.OrderLineItems;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {


    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRequest.getOrderLineItemsList().stream().map(orderLineItemsDto -> {
            mapToDto(orderLineItemsDto);
        })

    }

    private void mapToDto(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItems orderLineItems = new OrderLineItems();
        orderLineItems.setPrice(orderLineItemsDto.getPrice());
        orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
        orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
    }

}
