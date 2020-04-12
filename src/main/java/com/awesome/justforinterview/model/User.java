package com.awesome.justforinterview.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
  private String id;

  private String username;

  private String password;

  private Date createTime;

  private Date modifyTime;

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
  public Date getCreateTime() {
    return createTime;
  }

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "zh", timezone = "GMT+8")
  public Date getModifyTime() {
    return modifyTime;
  }

  public String getId() {
    return id;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }

  public void setId(String id) {
    this.id = id;
  }
}
