package com.welsumo.learn.dev.appsumo.controllers;

import com.welsumo.learn.dev.appsumo.dto.ProductRequest;
import com.welsumo.learn.dev.appsumo.models.Product;
import com.welsumo.learn.dev.appsumo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

  @Autowired
  ProductService productService;

  @PostMapping("/create")
  @ResponseStatus(HttpStatus.CREATED)
  public Product createProduct(@RequestBody ProductRequest productRequest) {
    // productRequest.setProductType("Desktop");
    // productRequest.setProductBrand("Oppo");
    // System.out.println(productRequest);
    return productService.createProduct(productRequest);
  }
}
