package com.awesome.justforinterview.controller;

import com.awesome.justforinterview.model.User;
import com.awesome.justforinterview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService userService;

  @RequestMapping(value = "/detail/{id}")
  public User getUserById(@PathVariable String id) {
    return this.userService.getUserById(id);
  }

  @RequestMapping(value = "/test")
  public String test() {
    return "test";
  }
}
