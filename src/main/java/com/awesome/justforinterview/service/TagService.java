package com.awesome.justforinterview.service;

import com.awesome.justforinterview.mapper.TagMapper;
import com.awesome.justforinterview.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {
  @Autowired
  private TagMapper tagMapper;

  public Tag getTagByTagCode(String tagCode) {
    return tagMapper.getByTagCode(tagCode);
  }

  public List<Tag> getChildrenTagsByParentCode(String tagCode) {
    return tagMapper.getChildrenByTagCode(tagCode);
  }

  public void createTag(Tag tag) {
    tagMapper.createTag(tag);
  }

  public void modifyTag(Tag tag) {
    tagMapper.modifyTag(tag);
  }

  public List<Tag> getAllParentTag() {
    return tagMapper.getAllParentTag();
  }
}
