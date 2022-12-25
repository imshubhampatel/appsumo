package com.welsumo.learn.dev.appsumo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {

  @Id
  public String id;

  public String userName;
  public int userAge;
  public boolean active;
  public String about;
}
