package com.awesome.justforinterview.controller;

import com.awesome.justforinterview.model.Question;
import com.awesome.justforinterview.service.QuestionService;
import com.awesome.justforinterview.service.UserService;
import com.awesome.justforinterview.utils.JacksonUtil;
import com.awesome.justforinterview.utils.JwtHelper;
import com.awesome.justforinterview.utils.ResponseHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/question")
public class QuestionController {
  @Autowired
  private QuestionService questionService;

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/detail/${id}")
  public Question getQuestionDetail(@PathVariable Integer id) {
    return this.questionService.getQuestionById(id);
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Object createQuestion(@RequestBody String requestBody, @RequestHeader("jwt-token") String token) {
    String userId = JwtHelper.getUserIdByToken(token);
    if (userId == null) {
      return ResponseHelper.fail(403, "can't find user");
    }
    String content = JacksonUtil.parseString(requestBody, "content");
    String rawContent = JacksonUtil.parseString(requestBody, "rawContent");
    String title = JacksonUtil.parseString(requestBody, "title");
    Integer tagId = JacksonUtil.parseInteger(requestBody, "tagId");
    Question question = new Question();
    question.setContent(content);
    question.setRawContent(rawContent);
    Date nowDate = new Date();
    question.setCreateTime(nowDate);
    question.setModifyTime(nowDate);
    question.setTagId(tagId);
    question.setTitle(title);
    question.setUserId(userId);
    Integer id = questionService.createQuestion(question);
    return ResponseHelper.success("create success", id);
  }
}
