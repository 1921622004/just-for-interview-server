package com.awesome.justforinterview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.awesome.justforinterview.mapper")
@SpringBootApplication
public class JustForInterviewApplication {

  public static void main(String[] args) {
    SpringApplication.run(JustForInterviewApplication.class, args);
  }

}
