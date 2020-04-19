package com.awesome.justforinterview.model;

import java.util.Date;
import java.util.List;

public class Tag {
  private String tagCode;

  private String tagName;

  private String description;

  private Date createTime;

  private Date modifyTime;

  private String parentCode;

  private List<Tag> children;

  public void setTagCode(String tagCode) {
    this.tagCode = tagCode;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public void setModifyTime(Date modifyTime) {
    this.modifyTime = modifyTime;
  }

  public void setParentCode(String parentCode) {
    this.parentCode = parentCode;
  }

  public void setChildren(List<Tag> children) {
    this.children = children;
  }

  public List<Tag> getChildren() {
    return children;
  }

  public String getTagCode() {
    return tagCode;
  }

  public String getTagName() {
    return tagName;
  }

  public String getDescription() {
    return description;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public Date getModifyTime() {
    return modifyTime;
  }

  public String getParentCode() {
    return parentCode;
  }
}
