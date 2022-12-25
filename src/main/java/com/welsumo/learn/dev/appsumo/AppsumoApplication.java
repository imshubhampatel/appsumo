package com.welsumo.learn.dev.appsumo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppsumoApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppsumoApplication.class, args);
    System.out.println(
      "########################################################### SpringBoot Intialized #############################################################"
    );
  }
}
