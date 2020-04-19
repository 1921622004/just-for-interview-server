package com.awesome.justforinterview.mapper;

import com.awesome.justforinterview.model.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface QuestionMapper {
  Question getById (int id);

  Integer createQuestion (Question question);

  void upateQuestion (Question question);
}
