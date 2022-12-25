package com.welsumo.learn.dev.appsumo.services;

import com.welsumo.learn.dev.appsumo.dto.UserRequest;
import com.welsumo.learn.dev.appsumo.models.User;
import com.welsumo.learn.dev.appsumo.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User createUser(UserRequest userRequest) {
    User user = User
      .builder()
      .userName(userRequest.getUserName())
      .userAge(userRequest.getUserAge())
      .about(userRequest.getAbout())
      .active(true)
      .build();

    userRepository.save(user);
    System.out.println(user);
    return user;
  }

  public List<User> getAllUsers() {
    List<User> users = userRepository.findAll();
    return users.stream().map(this::mapToUserResponse).toList();
  }

  private User mapToUserResponse(User user) {
    return User
      .builder()
      .id(user.getId())
      .userName(user.getUserName())
      .userAge(user.getUserAge())
      .about(user.getAbout())
      .build();
  }
}
