package com..DevCliToolkit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DevCliToolkitApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(DevCliToolkitApplication.class)
        .logStartupInfo(false) // reduce log noise
        .run(args);
  }

}

