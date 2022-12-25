package com.welsumo.learn.dev.appsumo.repository;

import com.welsumo.learn.dev.appsumo.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {}
