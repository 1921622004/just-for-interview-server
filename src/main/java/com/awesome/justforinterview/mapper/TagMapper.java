package com.awesome.justforinterview.mapper;

import com.awesome.justforinterview.model.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TagMapper {
  Tag getByTagCode(String tagCode);

  List<Tag> getChildrenByTagCode(String tagCode);

  void createTag(Tag tag);

  void modifyTag(Tag tag);
}
