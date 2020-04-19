package com.awesome.justforinterview.service;

import com.awesome.justforinterview.mapper.QuestionMapper;
import com.awesome.justforinterview.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
  @Autowired
  private QuestionMapper questionMapper;

  public Question getQuestionById(int id) {
    return questionMapper.getById(id);
  }

  public Integer createQuestion(Question question) {
    return questionMapper.createQuestion(question);
  }

  public void modifyQuestion(Question question) {
    questionMapper.upateQuestion(question);
  }
}
