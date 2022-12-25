package com.welsumo.learn.dev.appsumo.controllers;

import com.welsumo.learn.dev.appsumo.dto.UserRequest;
import com.welsumo.learn.dev.appsumo.dto.UserResponse;
import com.welsumo.learn.dev.appsumo.models.User;
import com.welsumo.learn.dev.appsumo.services.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

  @Autowired
  UserService userService;

  @GetMapping("/")
  public String helloWorld() {
    return "Spring boot is up on Port 8080";
  }

  @PostMapping("/create-user")
  @ResponseStatus(HttpStatus.CREATED)
  public User createUser(@RequestBody UserRequest userRequest) {
    User user = userService.createUser(userRequest);
    return user;
  }

  @GetMapping("/getusers")
  @ResponseStatus(HttpStatus.OK)
  public UserResponse getUserList() {
    List<User> users = userService.getAllUsers();
    UserResponse usersResponse = new UserResponse(true, users);
    return usersResponse;
  }
}
