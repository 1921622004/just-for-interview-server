package com.awesome.justforinterview.controller;

import com.awesome.justforinterview.model.User;
import com.awesome.justforinterview.service.UserService;
import com.awesome.justforinterview.utils.JacksonUtil;
import com.awesome.justforinterview.utils.JwtHelper;
import com.awesome.justforinterview.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
  static final Integer tokenMaxAge = 24 * 3600;

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/detail/{id}")
  public User getUserById(@PathVariable String id) {
    // TODO: 2020/4/20 修复
    return this.userService.getUserById(id);
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public Object login(@RequestBody String requestBody, HttpServletResponse response) {
    String username = JacksonUtil.parseString(requestBody, "username");
    String password = JacksonUtil.parseString(requestBody, "password");
    if (username == null || password == null) {
      return ResponseHelper.fail(0, "missing argument");
    }
    User user = userService.getUserByUsername(username);
    if (user == null) {
      return ResponseHelper.fail(0, "user not found");
    } else {
      System.out.println(user.getId());
      Cookie cookie = new Cookie("jwt-token", JwtHelper.createToken(user.getId()));
      cookie.setMaxAge(tokenMaxAge);
      cookie.setPath("/");
      response.addCookie(cookie);
      return ResponseHelper.success("login success", null);
    }
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public Object register(@RequestBody String requestBody) {
    String username = JacksonUtil.parseString(requestBody, "username");
    String password = JacksonUtil.parseString(requestBody, "password");
    if (username == null || password == null) {
      return ResponseHelper.fail(0, "missing argument");
    } else {
      User exsistUser = userService.getUserByUsername(username);
      if (exsistUser == null) {
        User user = new User();
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setCreateTime(new Date());
        user.setModifyTime(new Date());
        user.setPassword(password);
        user.setUsername(username);
        userService.createUser(user);
        return ResponseHelper.success("register success", null);
      } else {
        return ResponseHelper.fail(0, "user alreay exsist");
      }

    }
  }
}
