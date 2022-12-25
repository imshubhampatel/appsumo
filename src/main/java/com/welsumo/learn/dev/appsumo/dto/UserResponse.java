package com.welsumo.learn.dev.appsumo.dto;

import com.welsumo.learn.dev.appsumo.models.User;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserResponse {

  public Boolean success;
  public List<User> users;
}
