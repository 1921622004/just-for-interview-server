package com.awesome.justforinterview.model;

import java.util.Date;
import java.util.List;

public class Question {
  private int id;

  private String content;

  private String rawContent;

  private Date createTime;

  private Date modifyTime;

  private int isDel;

  private int collectCount;

  private String parentTagCode;

  private String title;

  private String userId;

  private String tagCodes;

  public String getTagCodes() {
    return tagCodes;
  }

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

  public String getParentTagCode() {
    return parentTagCode;
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

  public void setParentTagCode(String parentTagCode) {
    this.parentTagCode = parentTagCode;
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

  public void setTitle(String title) {
    this.title = title;
  }

  public void setTagCodes(String tagCodes) {
    this.tagCodes = tagCodes;
  }

}
