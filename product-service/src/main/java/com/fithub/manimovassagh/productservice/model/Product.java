package com.fithub.manimovassagh.productservice.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
}
