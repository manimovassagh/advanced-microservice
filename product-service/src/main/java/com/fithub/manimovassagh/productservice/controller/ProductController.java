package com.fithub.manimovassagh.productservice.controller;


import com.fithub.manimovassagh.productservice.dto.ProductRequest;
import com.fithub.manimovassagh.productservice.model.Product;
import com.fithub.manimovassagh.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);


    }
}