package com.awesome.justforinterview.service;

import com.awesome.justforinterview.mapper.UserMapper;
import com.awesome.justforinterview.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  @Autowired
  private UserMapper userMapper;

  public User getUserById(String id) {
    return userMapper.getById(id);
  }

  public User getUserByUsername(String username) {
    return userMapper.getByUsername(username);
  }

  public void createUser(User user) {
    userMapper.createUser(user);
  }
}
