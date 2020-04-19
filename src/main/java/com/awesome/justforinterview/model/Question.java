package com.awesome.justforinterview.model;

import java.util.Date;

public class Question {
  private int id;

  private String content;

  private String rawContent;

  private Date createTime;

  private Date modifyTime;

  private int isDel;

  private int collectCount;

  private int tagId;

  private String title;

  private String userId;

  public int getId() {
    return id;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getContent() {
    return content;
  }

  public String getRawContent() {
    return rawContent;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public Date getModifyTime() {
    return modifyTime;
  }

  public int getIsDel() {
    return isDel;
  }

  public int getCollectCount() {
    return collectCount;
  }

  public int getTagId() {
    return tagId;
  }

  public String getTitle() {
    return title;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setRawContent(String rawContent) {
    this.rawContent = rawContent;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }

  public void setIsDel(int isDel) {
    this.isDel = isDel;
  }

  public void setCollectCount(int collectCount) {
    this.collectCount = collectCount;
  }

  public void setTagId(int tagId) {
    this.tagId = tagId;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
