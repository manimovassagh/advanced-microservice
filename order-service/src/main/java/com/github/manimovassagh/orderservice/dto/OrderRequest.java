package com.github.manimovassagh.orderservice.dto;


import com.github.manimovassagh.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {


    private List<OrderLineItemsDto> orderLineItemsList;
}
