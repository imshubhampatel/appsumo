package com.welsumo.learn.dev.appsumo.repository;

import com.welsumo.learn.dev.appsumo.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {}
