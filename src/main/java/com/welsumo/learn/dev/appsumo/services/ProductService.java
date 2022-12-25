package com.welsumo.learn.dev.appsumo.services;

import com.welsumo.learn.dev.appsumo.dto.ProductRequest;
import com.welsumo.learn.dev.appsumo.models.Product;
import com.welsumo.learn.dev.appsumo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

  @Autowired
  private ProductRepository productRepository;

  public Product createProduct(ProductRequest productRequest) {
    Product product = Product
      .builder()
      .productType(productRequest.getProductType())
      .productName(productRequest.getProductName())
      .productPrice(productRequest.getProductPrice())
      .productQuality(productRequest.getProductQuality())
      .productRating(productRequest.getProductRating())
      .productStock(productRequest.getProductStock())
      .productBrand(productRequest.getProductBrand())
      .build();
    productRepository.save(product);
    return product;
  }
}
